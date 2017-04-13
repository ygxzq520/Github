<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'calculate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


<script language="javascript">
function Add(){
targetForm = document.forms[0];
targetForm.action = "Calculate!Add";
}
</script>
  </head>
  
  <body>
   <s:form action="Calculate">
   		数字一：<s:textfield name="number1"/>   		
   		数字二：<s:textfield name="number2"/>
   		<s:submit value="+" onclick="Add();"/>
   		<s:submit value="-"/>
   </s:form>  
  </body>
</html>
