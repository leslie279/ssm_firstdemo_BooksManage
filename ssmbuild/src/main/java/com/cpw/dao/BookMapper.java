package com.cpw.dao;

import com.cpw.pojo.Books;

import java.util.List;

public interface BookMapper {

    //����һ��Book
    int addBook(Books book);

    //����idɾ��һ��Book
    int deleteBookById(int id);

    //����Book
    int updateBook(Books books);

    //����id��ѯ,����һ��Book
    Books queryBookById(int id);

    //��ѯȫ��Book,����list����
    List<Books> queryAllBook();
}
