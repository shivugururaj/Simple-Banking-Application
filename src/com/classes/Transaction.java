
package com.classes;

import java.util.Date;

public class Transaction {

        private String transactionId;
        private Account toAccountNo;
        private double amount;
        private String paymentMode;
        private Date transactionDate;
        private Account fromAccount;
        
        
        public String getTransactionId() {
                return transactionId;
        }
        public void setTransactionId(String transactionId) {
                this.transactionId = transactionId;
        }
        public Account getToAccountNo() {
                return toAccountNo;
        }
        public void setToAccountNo(Account toAccountNo) {
                this.toAccountNo = toAccountNo;
        }
        public double getAmount() {
                return amount;
        }
        public void setAmount(double amount) {
                this.amount = amount;
        }
        public String getPaymentMode() {
                return paymentMode;
        }
        public void setPaymentMode(String paymentMode) {
                this.paymentMode = paymentMode;
        }
        public Date getTransactionDate() {
                return transactionDate;
        }
        public void setTransactionDate(Date transactionDate) {
                this.transactionDate = transactionDate;
        }
        public Account getFromAccount() {
                return fromAccount;
        }
        public void setFromAccount(Account fromAccount) {
                this.fromAccount = fromAccount;
        }
        public Transaction(String transactionId, Account toAccountNo, double amount,
                        String paymentMode, Date transactionDate, Account fromAccount) {
                super();
                this.transactionId = transactionId;
                this.toAccountNo = toAccountNo;
                this.amount = amount;
                this.paymentMode = paymentMode;
                this.transactionDate = transactionDate;
                this.fromAccount = fromAccount;
        }
        public Transaction() {
                super();
                // TODO Auto-generated constructor stub
        }        
}
