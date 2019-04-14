/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   Administrator
 * Date:     2019/4/13 9:10
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.BookBean;
import com.jk.model.TreeBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lvdl
 * @create 2019/4/13
 * @since 1.0.0
 */
@Controller
public class UserServiceImpl implements UserService{
//public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getMyTree")
    @ResponseBody
    public List<TreeBean> getMyTree() {
        int pid = 0;
        List<TreeBean> list = getNodes(pid);
        return list;
    }


    private List<TreeBean> getNodes(int pid) {
        List<TreeBean> list = userMapper.queryTreeById(pid);
        for (TreeBean treeBean : list) {
            Integer id = treeBean.getId();
            List<TreeBean> nodes = getNodes(id);
            if (nodes.size() <= 0) {
                treeBean.setSelectable(true);
            } else {
                treeBean.setNodes(nodes);
                treeBean.setSelectable(false);
            }

        }
        return list;
    }

    @Override
    @ResponseBody
    public HashMap<String, Object> queryBook(@RequestParam("page")Integer page, @RequestParam("rows") Integer rows) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = userMapper.findBookCount();
        //分页查询
        int start = (page-1)*rows;
        List<BookBean> list = userMapper.findBookPage(start,rows);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    @ResponseBody
    public void addBook(BookBean bookBean) {
        userMapper.addBook(bookBean);
    }

    @Override
    @ResponseBody
    public BookBean findBookById(Integer bookId) {
        return userMapper.findBookById(bookId);
    }

    @Override
    @ResponseBody
    public void updateBook(BookBean bookBean) {
        userMapper.updateBook(bookBean);
    }

    @Override
    @ResponseBody
    public void deleteById(Integer bookId) {
        userMapper.deleteById(bookId);
    }


}