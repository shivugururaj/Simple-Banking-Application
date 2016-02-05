<%@ taglib uri="/struts-tags" prefix="s" %>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
 <h1> Welcome </h1>

<s:form action="display.action">
 <s:textfield  name="custId" label="Customer Id"/><br/>
<s:submit value="display"/>	

</s:form>

</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>
 
