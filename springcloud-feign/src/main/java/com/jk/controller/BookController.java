/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BookController
 * Author:   Administrator
 * Date:     2019/4/13 10:47
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.BookBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 *
 * @author lvdl
 * @create 2019/4/13
 * @since 1.0.0
 */
@RequestMapping("book")
@RestController
public class BookController {

    @Autowired
    private UserService userService;

    @GetMapping("queryBook")
    public HashMap<String, Object> queryBook(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return userService.queryBook(page,rows);
    }

    //新增
    @PostMapping("addBook")
    public void addBook(@RequestBody BookBean bookBean){
        userService.addBook(bookBean);
    }

    //修改
    @PutMapping("updateBook")
    public void updateBook(@RequestBody BookBean bookBean){
        userService.updateBook(bookBean);
    }

    //回显
    @GetMapping("findBookById/{bookId}")
    public BookBean findBookById(@PathVariable("bookId") Integer bookId){
        return userService.findBookById(bookId);
    }

    //删除
    @DeleteMapping("deleteById/{bookId}")
    public void deleteById(@PathVariable("bookId") Integer bookId){
        userService.deleteById(bookId);
    }




}