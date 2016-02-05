<%@page import="java.util.Date"%>
<%@page import="com.classes.UserAccount"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<h3>Welcome,
<s:property value="#session['ua'].primaryCustId.firstName" /></h3>
<br/>
<%=new Date() %>
<br/>
<a href="admin/createaccount.jsp">Create Account</a><br/>
<a href="admin/linkaccount.jsp">Link new account</a><br/>
<a href="chequeaction.action">Cheque request</a><br/>
<a href="chequebookaction.action">ChequeBook request</a><br/>
<a href="logout.action">Logout</a><br/>
</s:if>
<s:else>
<h3><a href="login.jsp">Please login to continue</a></h3>
</s:else>