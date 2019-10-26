package com.groupeastek.library.book;

import java.util.List;

public interface IBookService {

    public Book saveBook(Book book);

    public Book updateBook(Book book);

    public void deleteBook(int idBook);

    public List<Book> findBookByTitleOrPartTitle(String title);

    public Book findBookByIsbn(String isbn);

    public boolean checkIfIdexists(int idBook);

    public List<Book> getBookByCategory(String category);
}
