<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

THANK YOU....

YOUR REQUEST FOR CHEQUEBOOK IS SUCCESSFUL......

<s:if test="#session['ua']!=null">

<a href="custhome.jsp">GO TO CUSTOMER HOME PAGE</a><br>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>