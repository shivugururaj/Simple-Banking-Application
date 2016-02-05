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
	<s:iterator value="list_chequebook">
		<s:form action="issue.action">
<tr>
<th id="AccountNo">AccountNo</th>
<th id="Balance">Balance</th>
<th id="DateOfAccount">DateOfAccount</th>
<th id="Type">Type</th>
<th id="FirstName">FirstName</th>

</tr>
			<tr>
				<td headers="AccountNo" ><s:property value="accountNo.accountNo" /></td>
				<td headers="Balance" ><s:property value="accountNo.balance" /></td>		
				<td headers="DateOfAccount" ><s:property value="accountNo.dateOfAccount" /></td>	
				<td headers="Type" ><s:property value="accountNo.type" /></td>	
				<td headers="FirstName" ><s:property value="accountNo.primaryCustId.firstName" /></td>
				<td>
				<input type="hidden" name="bookId"
					value='<s:property value="bookId"/>' />
				</td>
				
			</tr>
			<s:submit name="" value="issue" />
		</s:form>
	</s:iterator>
</table>
</s:if>
<s:else>
<h3><a href="login.jsp">Please login to continue</a></h3>
</s:else>