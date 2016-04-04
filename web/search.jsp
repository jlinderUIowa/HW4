
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="hw5style.css">
        <title>Search Athletes</title>
    </head>

    <% String table = (String) request.getAttribute("table");%>

    <body>

        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">

                <h1>Search Athletes</h1>

                <form name="searchForm" action="search" method="get">

                    <input type="text" name="searchVal" value="" />

                    <br>

                    <input type="submit" name="submit" value="Search" />

                </form>

            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
