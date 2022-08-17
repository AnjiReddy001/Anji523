package com.cog.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	
	private String bookName;
	private String picture;
	private String catogiry;
	private String authorName;
	private String logo;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getCatogiry() {
		return catogiry;
	}
	public void setCatogiry(String catogiry) {
		this.catogiry = catogiry;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Book(Integer bookId, String bookName, String picture, String catogiry, String authorName, String logo) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.picture = picture;
		this.catogiry = catogiry;
		this.authorName = authorName;
		this.logo = logo;
	}
	public Book() {
		super();
	}

}
