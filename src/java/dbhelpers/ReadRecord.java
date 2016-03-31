package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pros;


public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Pros pro = new Pros();
    private int athleteID;
    
    
    public ReadRecord (int athleteID) {
    
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
    
    this.athleteID = athleteID;
    
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void doRead() {
    
       
        try {
            //set up a string to hold query
            String query = "SELECT * FROM formerhawkeyepros WHERE athleteID = ?";
           
            //create a preparedstatement using our query string
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the preparedstatement
            ps.setInt(1, athleteID);
            
            //execute the query
            this.results = ps.executeQuery();
            this.results.next();
            
            pro.setAthleteID(this.results.getInt("athleteID"));
            pro.setName(this.results.getString("name"));
            pro.setSport(this.results.getString("sport"));
            pro.setLeague(this.results.getString("league"));
            pro.setTeam(this.results.getString("team"));
            pro.setYearGraduated(this.results.getInt("yearGraduated"));
        
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    public Pros getPro() {
        
        return this.pro;
    }
}
