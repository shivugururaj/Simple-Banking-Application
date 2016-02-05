<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>


<h3>Deposit</h3>

<s:if test="#session['ua']!=null">
<s:form action="deposit.action">


<s:textfield name="toAccountNo" label="toAccountNo"/>
<s:textfield name="amount" label="amount"/>
<s:radio list="{'cash','cheque'}" name="paymentMode" label="paymentMode"/>
<s:submit value="deposit"/> 

</s:form>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>