<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>


<s:if test="#session['ua']!=null">
this is withdraw page

<s:form action="withdraw.action">
<s:textfield name="amount" label="amount"/>
<s:radio list="{'cash','cheque'}" name="paymentMode" label="paymentMode"/>
<s:submit value="withdraw"/> 
</s:form>

 </s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>