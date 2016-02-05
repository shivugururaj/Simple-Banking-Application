<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
Personal details:
<table border='1'>



<s:iterator value="list[0]">


<%-- <tr><td headers="Primary Customer Id"><s:property value="primaryCustId"/></td></tr> --%>
<tr><td headers="Balance">Balance:<s:property value="balance"/></td></tr>
<tr><td headers="Type">Type:<s:property value="type"/></td></tr>

<tr><td headers="First Name">First Name:<s:property value="primaryCustId.firstName"/></td></tr>
<tr><td headers="Second Name">Second Name:<s:property value="primaryCustId.secondName"/></td></tr>
<tr><td headers="Surname">Surname:<s:property value="primaryCustId.surName"/></td></tr>
<tr><td headers="mobile">Mobile:<s:property value="primaryCustId.mobile"/></td></tr>



</s:iterator>

</table>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>
