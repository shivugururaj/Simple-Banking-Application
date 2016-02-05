
<%@page import="java.util.Iterator"%>
<%@page import="com.classes.UserAccount"%>
<%@page import="com.classes.Cheque"%>
<%@page import="com.facade.Facade"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<h3>UR TRANSACTION DETAILS ARE AS BELOW...</h3>


<table  align="center" border="gray" bordercolor="red">
	<th>TRANSACTION DETAILS</th>
	<br />
		<tr><td>TRANSACTION ID</td><td>DEPOSITED TO ACCOUNT NO</td><td>AMOUNT</td><td>MODE OF PAYMENT</td><td>TRANSACTION DATE AND TIME</td><td>DEPOSITED FROM ACCOUNT</td></tr>
	
	<s:iterator value="#session['lt']">
		<tr>
			<td><s:property value="transactionId" /></td>
			<td><s:property value="toAccountNo" /></td>
			<td><s:property value="amount" /></td>
			<td><s:property value="paymentMode" /></td>
			<td><s:property value="transactionDate" /></td>
			<td><s:property value="fromAccount" /></td>
		</tr></br>

	</s:iterator>
</table></br>
 </s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>