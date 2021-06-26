package com.cpw.service;

import com.cpw.dao.BookMapper;
import com.cpw.pojo.Books;

import java.util.List;

public class BookServiceImpl implements  BookService{

    //����dao��Ĳ���������һ��set�ӿڣ�����Spring����
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

}
