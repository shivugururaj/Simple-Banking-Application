<%@page import="java.util.Iterator"%>
<%@page import="com.classes.UserAccount"%>
<%@page import="com.classes.Cheque"%>
<%@page import="com.facade.Facade"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>
<s:if test="#session['ua']!=null">
<h3>DEPOSITED CHEQUE DETAILS...</h3>

<table  align="center" border="gray" bordercolor="black">
	<th>DEPOSITED CHEQUE DETAILS</th>
	<br />
	<tr><td>CHEQUE NO</td><td>DEPOSITED TO ACCOUNT NO:</td><td>TRANSFERRED FROM ACCOUNT NO:</td><td>STATUS</td><td>AMOUNT</td><td>DATE AND TIME OF CLEARENCE</td></tr>
	<s:iterator value="#session['lt']">
		<tr>
			<td><s:property value="chequeNo" /></td>
			<td><s:property value="toAccountNo"/></td>
			<td><s:property value="fromAccount" /></td>
			<td><s:property value="status" /></td>
			<td><s:property value="amount" /></td>
			<td><s:property value="dateOfClearence" /></td>
		</tr>
	</s:iterator>
</table>

</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>





