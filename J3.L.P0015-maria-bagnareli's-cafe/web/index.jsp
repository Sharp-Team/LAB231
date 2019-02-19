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
        <link rel="stylesheet" type="text/css" href="./public/css/home-page.css" />
    </head>
    <body>
        <div class="wrap-all mb-5">
            <%@include file="/components/header.jsp" %>
            <!--Content-->
            <div class="wrap-content">
                <div class="container flex">
                    <div class="left">
                        <div class="px-3">
                            <div class="split-bottom flex pt-5 pb-5">
                                <img class="image-top" src="./public/image/2.jpg">
                                <div class="content">
                                    <p class="text-5 my-0">Maria's Cosy Cafe</p>
                                    <p class="font-sans mt-1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                                        Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica</p>
                                </div>
                            </div>
                            <div class="split-bottom pt-6 flex pb-5">
                                <div class="mr-3">
                                    <img class="image-bottom" src="./public/image/3.jpg">
                                    <div class="content">
                                        <p class="text-5 my-0">Maria's Cosy Cafe</p>
                                        <p class="font-sans mt-1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                                            Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica</p>
                                    </div>
                                </div>
                                <div>
                                    <img class="image-bottom" src="./public/image/4.jpg">
                                    <div class="content">
                                        <p class="text-5 my-0">Maria's Cosy Cafe</p>
                                        <p class="font-sans mt-1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                                            Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica</p>
                                    </div>
                                </div>
                            </div>
                            <div class="split-bottom pb-5">
                                <p class="text-5">Visit my cafe</p>
                                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
                                <p>Gammel Torv, Copenhagen</p>
                                <p>Phone: 12 1234 1234</p>
                            </div>
                            <div class="mt-6">
                                <p>Kind regards</p>
                                <p class="text-5">Visit my cafe</p>
                            </div>
                        </div>
                    </div>
                    <%@include file="/components/right.jsp" %>
                </div>
            </div>
            <hr>
            <!--Footer-->
            <footer class="footer">
                <%@include file="/components/footer.jsp" %>
            </footer>
        </div>
    </body>
</html>