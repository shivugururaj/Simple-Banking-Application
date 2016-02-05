
<%@ taglib  uri="/struts-tags" prefix="s"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="http://t2.gstatic.com/images?q=tbn:ANd9GcT5rp4q8MxJBf8iWGYeq11Dxr-wiepH6LlfRf18MwXWfAXT87ww"  alt="Image not displayed"/>
<s:if test="#session['ua']!=null">

<h1> INDIAN NET BANKING APPLICATION </h1>
<head>


</head>
<body>

<h3>WELCOME
<s:property value="#session['ua'].primaryCustId.firstName" /></h3>
<br/>
<%=new Date() %>
<br/>

<a href="display.action">Display personal details</a><br>

<!-- <a href="customer/update.jsp">Update password</a><br>  -->
<a href="customer/ViewDetailStatement1.jsp">Detail Statement</a><br>
<a href="ViewBalance.action">View Balance</a><br/>
<a href="customer/SelectAccountNo_checkstatus.jsp">View submitted Cheque Status</a><br/>
<a href="customer/SelectAccountNo_checkbook.jsp">Request For A ChequeBook</a><br/>
<a href="customer/transfer.jsp">Transfer</a><br/>
<a href="customer/deposit.jsp">Deposit</a><br/>
<a href="GeneratePinAction.action">Generate Internet Banking Pin</a><br>
<!--<a href="customer/withdraw.jsp">Withdraw</a><br/>  -->
<a href="logout.action">Logout</a><br/>
</body>
</s:if>
<s:else>

<h3>Please login to continue</h3>
</s:else>