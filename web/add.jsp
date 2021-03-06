<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Athlete</title>
        <link rel="stylesheet" type="text/css" href="hw5style.css" />
    </head>
    <body>

        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">

                <h1>Add A New Athlete</h1>

                <form name ="addForm" action="addAthlete" method="get">

                    <label>Athlete Name:</label>
                    <input type="text" name="name" value="" />
                    <br>
                    <label>Sport:</label>
                    <input type="text" name="sport" value="" />
                    <br>
                    <label>League:</label>
                    <input type="text" name="league" value="" />
                    <br>
                    <label>Team:</label>
                    <input type="text" name="team" value="" />
                    <br>
                    <label>Year Graduated:</label>
                    <input type="text" name="yearGraduated" value="" />
                    <br>
                    <input type="submit" name="submit" value="Submit" />

                </form>
                   

            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>
    </body>
</html>
