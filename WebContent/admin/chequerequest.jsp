<%@page import="java.util.Iterator"%>
<%@page import="com.classes.UserAccount"%>
<%@page import="com.classes.Cheque"%>
<%@page import="com.facade.Facade"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<h3>Welcome, <s:property
	value="#session['ua'].primaryCustId.firstName" /></h3>
<br />
<br />
<br />
<%=new Date()%>
<br />

<table>
	Cheque Details
	<br />
	<s:iterator value="list_cheque">
		<s:form action="clear.action">
<tr>
<th id="cheque no">Cheque no</th>
<th id="To accountNo">To accountNo</th>
<th id="From Account">From Account</th>
<th id="Amount">Amount</th>

</tr>
			<tr>
				<td headers="cheque no" ><s:property value="chequeNo" /></td>
				<td headers="To accountNo"><s:property value="toaccountNo" /></td>
				<td headers="From Account"><s:property value="fromAccount" /></td>
				<td headers="Amount"><s:property value="amount" /></td>
				<input type="hidden" name="chequeNo"
					value='<s:property value="chequeNo"/>' />
			</tr>
			<s:submit name="" value="clear" />
		</s:form>
	</s:iterator>
</table>
</s:if>
<s:else>
<h3><a href="login.jsp">Please login to continue</a></h3>
</s:else>