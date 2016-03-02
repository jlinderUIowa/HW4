
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



public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery() {
        
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
        
        try {
            String query = "Select * from formerhawkeyepros";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLTable(){
        
        String table = "";
        
        table += "<table border=1>";
        
        try {
            while(this.results.next()){
                
                Pros pro = new Pros();
                pro.setAthleteID(this.results.getInt("athleteID"));
                pro.setName(this.results.getString("name"));
                pro.setSport(this.results.getString("sport"));
                pro.setLeague(this.results.getString("league"));
                pro.setTeam(this.results.getString("team"));
                pro.setYearGraduated(this.results.getInt("yearGraduated"));
                
                table += "<tr>";
                
                table += "<td>";
                table += pro.getAthleteID();
                table += "</td>";
                
                table += "<td>";
                table += pro.getName();
                table += "</td>";
                
                table += "<td>";
                table += pro.getSport();
                table += "</td>";
                
                table += "<td>";
                table += pro.getLeague();
                table += "</td>";
                
                table += "<td>";
                table += pro.getTeam();
                table += "</td>";
                
                table += "<td>";
                table += pro.getYearGraduated();
                table += "</td>";
                
                table += "</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        table += "</table>";
        
            return table;
        
        
    }
    
    
}
