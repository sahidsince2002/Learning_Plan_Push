package com.jparepo.h2setup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class H2entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Book;
    private String title;
   



    
    public H2entity(String book, String title) {
        Book = book;
        this.title = title;
      
    }
    public String getBook() {
        return Book;
    }
    public void setBook(String book) {
        Book = book;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Long getId() {
        return id;
    }
    

    

}
