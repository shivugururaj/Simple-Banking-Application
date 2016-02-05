<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<s:form action="retrieve" >

 <s:textfield name="custId" label="custId" value="%{#session['a']}" />

 
 <s:submit value="retrieve" />
 </s:form>
 </s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>