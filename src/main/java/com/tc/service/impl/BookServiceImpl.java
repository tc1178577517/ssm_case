package com.tc.service.impl;

import com.tc.controller.Code;
import com.tc.dao.BookDao;
import com.tc.domain.Book;
import com.tc.exception.BusinessException;
import com.tc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }
    public Book getById(Integer id) {
        if(id==2){
            throw new BusinessException(Code.BUSINESS_ERR,"id为2的图书不存在");
        }
        return bookDao.getById(id);
    }
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
