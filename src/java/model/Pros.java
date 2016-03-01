
package model;



public class Pros {
   
    private int athleteID;
    private String name;
    private String sport;
    private String league;
    private String team;
    private int yearGraduated;

    public Pros() {
        this.athleteID = 0;
        this.name = "";
        this.sport = "";
        this.league = "";
        this.team = "";
        this.yearGraduated = 0;
    }
    
    public Pros(int athleteID, String name, String sport, String league, String team, int yearGraduated) {
        this.athleteID = athleteID;
        this.name = name;
        this.sport = sport;
        this.league = league;
        this.team = team;
        this.yearGraduated = yearGraduated;
    }

    public int getAthleteID() {
        return athleteID;
    }

    public void setAthleteID(int athleteID) {
        this.athleteID = athleteID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getYearGraduated() {
        return yearGraduated;
    }

    public void setYearGraduated(int yearGraduated) {
        this.yearGraduated = yearGraduated;
    }

    @Override
    public String toString() {
        return "Pros{" + "athleteID=" + athleteID + ", name=" + name + ", sport=" + sport + ", league=" + league + ", team=" + team + ", yearGraduated=" + yearGraduated + '}';
    }
    
    
    
}
