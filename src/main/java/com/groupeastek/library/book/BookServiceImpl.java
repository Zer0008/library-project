package com.groupeastek.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bookService")
@Transactional
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookDao bookDao;

    @Override
    public Book saveBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookDao.save(book);
    }

    @Override
    public void deleteBook(int idBook) {
        this.bookDao.deleteById(idBook);
    }

    @Override
    public List<Book> findBookByTitleOrPartTitle(String title) {
        return this.bookDao.findByTitleLikeIgnoreCase(title);
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return this.bookDao.findByIsbnIgnoreCase(isbn);
    }

    @Override
    public boolean checkIfIdexists(int idBook) {
        return this.bookDao.existsById(idBook);
    }

    @Override
    public List<Book> getBookByCategory(String category) {
        return this.bookDao.findByCategory(category);
    }
}
