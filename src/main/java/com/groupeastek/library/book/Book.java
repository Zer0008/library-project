package com.groupeastek.library.book;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.groupeastek.library.category.Category;
import com.groupeastek.library.loan.Loan;

@Entity
@Table(name = "BOOK")
public class Book {

	private int id;
	
	private String title;
	
	private String isbn;
	
	private LocalDate releaseDate;
	
	private LocalDate registerDate;
	
	private int totalExemplaries;
	
	private String author;
	
	private Category category;
	
	Set<Loan> loans = new HashSet<Loan>();
	
	
	public Book() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOK_ID")
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column(name="TITLE", nullable = false)
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="ISBN", nullable = false)
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Column(name="RELEASE_DATE", nullable = false)
	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Column(name="REGISTER_DATE", nullable = false)
	public LocalDate getRegisterDate() {
		return registerDate;
	}


	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	@Column(name="TOTAL_EXEMPLARIES")
	public int getTotalExemplaries() {
		return totalExemplaries;
	}


	public void setTotalExemplaries(int totalExemplaries) {
		this.totalExemplaries = totalExemplaries;
	}

	@Column(name="AUTHOR")
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	@ManyToOne(optional = false)
	@JoinColumn(name="CAT_CODE", referencedColumnName="CODE")
	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.book", cascade = CascadeType.ALL)
	public Set<Loan> getLoans() {
		return loans;
	}


	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	
}
