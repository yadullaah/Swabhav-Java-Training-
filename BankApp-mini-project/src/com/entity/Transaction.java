package com.entity;

import java.util.Date;

public class Transaction {
private int transactionID;
private int transactionAmount;
private Date transactionDate;
private String transactionType;
private int senderAccountNumber;
private int receiverAccountNumber;

public Transaction(int transactionID, int transactionAmount, Date transactionDate, String transactionType,
		int senderAccountNumber, int receiverAccountNumber) {
	super();
	this.transactionID = transactionID;
	this.transactionAmount = transactionAmount;
	this.transactionDate = transactionDate;
	this.transactionType = transactionType;
	this.senderAccountNumber = senderAccountNumber;
	this.receiverAccountNumber = receiverAccountNumber;
}

public int getTransactionID() {
	return transactionID;
}

public void setTransactionID(int transactionID) {
	this.transactionID = transactionID;
}

public int getTransactionAmount() {
	return transactionAmount;
}

public void setTransactionAmount(int transactionAmount) {
	this.transactionAmount = transactionAmount;
}

public Date getTransactionDate() {
	return transactionDate;
}

public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}

public String getTransactionType() {
	return transactionType;
}

public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

public int getSenderAccountNumber() {
	return senderAccountNumber;
}

public void setSenderAccountNumber(int senderAccountNumber) {
	this.senderAccountNumber = senderAccountNumber;
}

public int getReceiverAccountNumber() {
	return receiverAccountNumber;
}

public void setReceiverAccountNumber(int receiverAccountNumber) {
	this.receiverAccountNumber = receiverAccountNumber;
}


}

