<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>
<s:if test="#session['ua']!=null">
Your Existing accounts:
<table border='1'>



<s:iterator value="#session['list']">


<%-- <tr><td headers="Primary Customer Id"><s:property value="primaryCustId"/></td></tr> --%>
<tr><td headers="AccountNo">Account No:<s:property value="accountNo"/></td></tr>

</s:iterator>

</table>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>
