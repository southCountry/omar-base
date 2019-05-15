package com.omar.dao;

import com.omar.entity.dataobj.Book;
import org.springframework.stereotype.Component;

/**
 * BookDAO继承基类
 */
@Component
public interface BookDAO extends MyBatisBaseDao<Book, Integer> {
}