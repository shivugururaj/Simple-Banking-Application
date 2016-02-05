<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<s:label>YOUR BALANCE IS:</s:label>
<table>
	Balance Details
	<br />
	
		
<tr>
<th id="AccountNo">AccountNo</th>
<th id="Balance">Balance</th>
<th id="DateOfAccount">DateOfAccount</th>
<th id="Type">Type</th>
<th id="FirstName">FirstName</th>

</tr>
	<s:iterator value="#session['list_account']">	
		<tr>
				<td headers="AccountNo" ><s:property value="accountNo" /></td>
				<td headers="Balance" ><s:property value="balance" /></td>		
				<td headers="DateOfAccount" ><s:property value="dateOfAccount" /></td>	
				<td headers="Type" ><s:property value="type" /></td>	
				<td headers="FirstName" ><s:property value="primaryCustId.firstName" /></td>
							
			</tr>
			
	
	</s:iterator>
</table>
<br/>

 </s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>




