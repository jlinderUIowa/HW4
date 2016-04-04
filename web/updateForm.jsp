<%@page import="model.Pros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Pros pro = (Pros) request.getAttribute("pro");%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="hw5style.css" />
        <title>Update An Athlete</title>
    </head>
    <body>

        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">

                <h1>Update An Athlete Record</h1>

                <form name ="updateForm" action="updateAthlete" method="get"> 

                    <table class="update"
                           <tr>
                            <td class="right">Athlete ID:</td>
                            <td><input type="text" name="id" value="<%= pro.getAthleteID()%>" readonly/></td>
                        </tr>

                        <tr>
                            <td class="right">Athlete Name:</td>
                            <td><input type="text" name="name" value="<%= pro.getName()%>" /></td>
                        </tr>

                        <tr>
                            <td class="right">Sport:</td>
                            <td><input type="text" name="sport" value="<%= pro.getSport()%>" /></td>
                        </tr>

                        <tr>
                            <td class="right">League:</td>
                            <td><input type="text" name="league" value="<%= pro.getLeague()%>" /></td>
                        </tr>

                        <tr>
                            <td class="right">Team:</td>
                            <td><input type="text" name="team" value="<%= pro.getTeam()%>" /></td>
                        </tr>

                        <tr>
                            <td class="right">Year Graduated:</td>
                            <td><input type="text" name="yeargraduated" value="<%= pro.getYearGraduated()%>" /></td>
                        </tr>
                    </table>

                    
                    <input type="reset" name="reset" value="Clear" />
                    <input type="submit" name="submit" value="Update" />
                    
                </form>

                <br>  
            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>
    </body>
</html>
