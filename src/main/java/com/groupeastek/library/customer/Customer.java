package com.groupeastek.library.customer;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.groupeastek.library.loan.Loan;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	private int id;
	
	private String lastName; 
	
	private String firstName;
	
	private String email;
	
	private String job;
	
	private String address;
	
	private LocalDate creationDate;
	
	Set<Loan> loans = new HashSet<Loan>();
	
	public Customer() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="COSTUMER_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="LAST_NAME", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name="FIRST_NAME", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name="EMAIL", nullable = false, unique = true)
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="JOB")
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="CREATION_DATE")
	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.customer", cascade = CascadeType.ALL)
	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	
	
}
