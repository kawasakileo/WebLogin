<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("id");
int n = Integer.parseInt(id);
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjetoLogin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
Statement stat = conn.createStatement();
stat.executeUpdate("delete from pessoa where id = '"+n+"'");
response.sendRedirect("CadastroDeletado.jsp");
%>