<%@ taglib uri="/struts-tags" prefix="s" %>
<head>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<s:if test="#session['ua']!=null">
 <h2> You PIN generated is : </h2>


 
 <h3><s:property value="gen" /></h3>

</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>
 