<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>
<s:if test="#session['ua']!=null">
Password updated successfully:
<table border='1'>
<s:iterator value="#session['ua']" >
<tr>
<td>
Password:<s:property value="password"/>
</td>
</tr>


</s:iterator>



</table>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>

