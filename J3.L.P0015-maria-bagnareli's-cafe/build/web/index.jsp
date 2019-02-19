<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Digital News</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./public/css/style.css" />
    </head>
    <body>
        <div class="wrap-all">
            <%@include file="/components/header.jsp" %>
            <!--Content-->
            <div class="wrap-content">
                <div class="container flex">
                    <div class="left">
                    </div>
                    <%@include file="/components/right.jsp" %>
                </div>
            </div>
            <!--Footer-->
            <footer class="footer">
            </footer>
        </div>
    </body>
</html>