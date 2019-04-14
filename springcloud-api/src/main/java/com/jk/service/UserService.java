/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserService
 * Author:   Administrator
 * Date:     2019/4/13 8:36
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.BookBean;
import com.jk.model.TreeBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lvdl
 * @create 2019/4/13
 * @since 1.0.0
 */
//public interface UserService {
public interface UserService{
    @GetMapping("getMyTree")
    @ResponseBody
    List<TreeBean> getMyTree();

    @GetMapping("queryBook")
    @ResponseBody
    HashMap<String, Object> queryBook(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @PostMapping("addBook")
    @ResponseBody
    void addBook(@RequestBody BookBean bookBean);

    @GetMapping("findBookById/{bookId}")
    @ResponseBody
    BookBean findBookById(@PathVariable("bookId")Integer bookId);

    @PutMapping("updateBook")
    @ResponseBody
    void updateBook(@RequestBody BookBean bookBean);

    @DeleteMapping("deleteById/{bookId}")
    @ResponseBody
    void deleteById(@PathVariable("bookId")Integer bookId);
}