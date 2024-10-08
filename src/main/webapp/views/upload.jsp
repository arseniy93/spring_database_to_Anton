<%--
  Created by IntelliJ IDEA.
  User: arsen
  Date: 08.10.2024
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Upload a file please</title>
</head>
<body>
<h1>Please upload a file</h1>
<form method="post" action="${pageContext.request.contextPath}/uploadFile" enctype="multipart/form-data">
    <input type="text" name="name"/>
    <input type="file" name="file"/>
    <input type="submit"/>
</form>
</body>
</html>
