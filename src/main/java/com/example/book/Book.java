package com.example.book;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
public class Book {
//    @Id
//    @GeneratedValue
    private Integer id;

    private String bookname;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
