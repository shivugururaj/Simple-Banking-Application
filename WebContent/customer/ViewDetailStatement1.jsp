<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>




<s:if test="#session['ua']!=null">
<s:head/>
<s:form action="ViewDetailStatement.action">
Account No:<s:select name="accountNo" list="#session['accNos']"/>
<s:datetimepicker name="fromTransactionDate" label="StartingDate" displayFormat="dd-MMM-yy"/>
<s:datetimepicker name="toTransactionDate" label="EndingDate" displayFormat="dd-MMM-yy"/>

<s:submit value="To Transaction"/>
</s:form>

 </s:if>
<s:else>
<h3>Please login to continue</h3>
</s:else>
