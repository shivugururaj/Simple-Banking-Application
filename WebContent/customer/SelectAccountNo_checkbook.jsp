<%@ taglib uri="/struts-tags" prefix="s" %>
<%@page import="com.classes.Account"%>
<%@page import="java.util.List"%>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>


<s:if test="#session['ua']!=null">
<s:form action="ChequeBookRequest.action">


Account No:
<s:select name="accountNo" list="#session['accNos']"/>
<s:submit value="proceed"/><br/>
</s:form>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>