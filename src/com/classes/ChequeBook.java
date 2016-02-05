package com.classes;

import java.util.Date;

public class ChequeBook {
	private String bookId;
	private String status;
	private Account accountNo;
	private Date dateOfIssue;
	public ChequeBook(String bookId, String status, Account accountNo,
			Date dateOfIssue) {
		super();
		this.bookId = bookId;
		this.status = status;
		this.accountNo = accountNo;
		this.dateOfIssue = dateOfIssue;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Account getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Account accountNo) {
		this.accountNo = accountNo;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public ChequeBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ChequeBook [bookId=" + bookId + ", status=" + status
				+ ", accountNo=" + accountNo + ", dateOfIssue=" + dateOfIssue
				+ "]";
	}
	

}
