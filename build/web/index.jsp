<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<html>
<head>
<title>index</title>
</head>
<body>
  <h1>Index</h1>
  <%
    String id = request.getAttribute("id").toString();
    String name = request.getAttribute("name").toString();
    String verified_email = request.getAttribute("verified_email").toString();
    String given_name = request.getAttribute("given_name").toString();
    String family_name = request.getAttribute("family_name").toString();
    String picture = request.getAttribute("picture").toString();  
    String email = request.getAttribute("email").toString();
    out.print("Id: " + id);
    out.print("<br/>Name: " + name);
    out.print("<br/>verified_email " + verified_email);
    out.print("<br/>given_name " + given_name);
    out.print("<br/>family_name " + family_name);
    out.print("<br/>picture " + picture);
    out.print("<br/>Email: " + email);
  %>
</body>
</html>