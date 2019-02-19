<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./public/css/style.css" />
        <link rel="stylesheet" type="text/css" href="./public/css/about-page.css" />
        <title>About my Cakes</title>
    </head>
    <body>
        <div class="wrap-all mb-5">
            <%@include file="/components/header.jsp" %>
            <!--Content-->
            <div class="wrap-content">
                <div class="container flex">
                    <div class="left">
                        <div class="px-3">
                            <p class="pt-5 mt-0 text-6">About my Cakes</p>                   
                            <img class="image-about ml-3 mb-3" src="./public/image/5.jpg">
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.
                                Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non habent claritatem insitam; est usus legentis in iis qui facit eorum claritatem. Investigationes demonstraverunt lectores legere me lius quod ii legunt saepius. Claritas est etiam processus dynamicus, qui sequitur mutationem consuetudium lectorum. Mirum est notare quam littera gothica, quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc nobis videntur parum clari, fiant sollemnes in futurum. </p>

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
