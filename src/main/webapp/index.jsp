<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<html>

<head>
    <title>index</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(function(){
            $.get("${pageContext.request.contextPath}/dept/queryAll",function (res) {
               $.each(res,function (idx,prov) {
                   $("#d1").append(prov.id+"---"+prov.name+"---"+prov.count+"<br>");
               });
            },"JSON");

        });

    </script>
</head>
<body>
<h1>部门表</h1>
<div id="d1"></div>

</body>
</html>