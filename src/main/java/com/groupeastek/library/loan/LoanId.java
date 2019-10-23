package com.groupeastek.library.loan;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import com.groupeastek.library.book.Book;
import com.groupeastek.library.customer.Customer;


@Embeddable
public class LoanId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Customer customer;
	
	private Book book;
	
	private LocalDate creationDateTime;

	
	public LoanId() {
		super();
	}
	
	public LoanId(Customer customer, Book book, LocalDate creationDateTime) {
		super();
		this.customer = customer;
		this.book = book;
		this.creationDateTime = creationDateTime;
	}

	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Column(name="CREATION_DATE")
	public LocalDate getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(LocalDate creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
	
}
