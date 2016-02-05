<%@page import="com.classes.UserAccount"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<h3>Welcome,

<s:property value="#session['ua'].primaryCustId.firstName" /></h3><br/>
<%=new Date() %>
<br/>
<s:form action="linkaccount.action">
<s:textfield name="custId" label="CustID:"/>
<s:textfield name="accountNo" label="AccountNo:"/>
<s:textfield name="balance" label="Balance:"/>
<s:select name="type" list="{'SB','CA' }" />
<s:submit value="linkaccount"/><br/>
</s:form>
</s:if>
<s:else>
<h3><a href="login.jsp">Please login to continue</a></h3>
</s:else>
