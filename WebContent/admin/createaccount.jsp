<%@page import="java.util.Date"%>
<%@page import="com.classes.UserAccount"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>

<s:if test="#session['ua']!=null">
<h3>Welcome,
<s:property value="#session['ua'].primaryCustId.firstName" /></h3>
<br/>
<%=new Date() %>
<br/>
<s:head/>


<h3>Create an account...</h3><br/>
<s:form action="createaccount.action">
<s:textfield name="firstName" label="FirstName:"/>
<s:textfield name="secondName" label="SecondName:"/>
<s:textfield name="surName" label="SurName:"/>
<s:textfield name="city" label="City:"/>
<s:textfield name="plotNo" label="Plot No:"/>
<s:textfield name="state" label="State:"/>
<s:textfield name="street" label="Street:"/>
<s:textfield name="zip" label="Zip:"/>
<s:textfield name="email" label="Email:"/>
<s:textfield name="landline" label="Landline:"/>
<s:textfield name="mobile" label="Mobile:"/>
<s:textfield name="panno" label="Panno:"/>
<s:textfield name="accountNo" label="AccountNo:"/>
<s:textfield name="balance" label="Balance:"/>

<s:select name="type" list="{'SB','CA' }" />


<s:password name="password" label="Password:"/>

<s:select name="role" list="{'Admin','Customer'}" />

<s:datetimepicker name="dateOfAccount" label="Date Of Account:(yy-MM-dd/e.g.13-02-02)" displayFormat="yy-MM-dd" />

<s:submit value="createaccount"/><br/>
</s:form>
</s:if>
<s:else>
<h3><a href="login.jsp">Please login to continue</a></h3>
</s:else>