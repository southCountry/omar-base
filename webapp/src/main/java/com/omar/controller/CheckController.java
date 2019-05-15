package com.omar.controller;

import com.omar.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author zhanglei03
 * @Date 2019/5/14
 **/
@RestController
public class CheckController {

	@Autowired
	private BookDAO bookDAO;

	@RequestMapping("book")
	public String getBook(Integer id){
		return bookDAO.selectByPrimaryKey(id).getName();
	}
}
