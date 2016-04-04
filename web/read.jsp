
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Former Hawkeye Pros</title>
        <link rel="stylesheet" type="text/css" href="hw5style.css">
    </head>

    <% String table = (String) request.getAttribute("table");%>

    <body>

        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">

                <h1>Former Hawkeye - Current Professional Athlete Database</h1>

                <table style="width:100%">
                    <tr>
                        <th>Athlete ID</th>
                        <th>Name</th>
                        <th>Sport</th>		
                        <th>League</th>
                        <th>Team</th>
                        <th>Year Graduated</th>
                    </tr>
                    <%= table%>
                </table>

                <br><br>

                

            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
