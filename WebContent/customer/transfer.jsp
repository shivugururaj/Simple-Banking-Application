<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">

Transaction
<s:head/>
<s:form action="transfer.action">
From Account<s:select name="fromAccount" list="#session['accNos']"/>
<s:textfield name="toAccountNo" label="toAccountNo"/>
<s:textfield name="amount" label="amount"/>
<s:radio list="{'cash','cheque'}" name="paymentMode" label="paymentMode"/>
<s:datetimepicker name="transactionDate" label="transactionDate" displayFormat="yy-MM-dd"/>
<s:submit value="transfer"/> 
</s:form>
</s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>