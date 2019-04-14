/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TreeController
 * Author:   Administrator
 * Date:     2019/4/13 8:32
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.UserService;
import com.jk.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author lvdl
 * @create 2019/4/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private UserService userService;
    /*@Autowired
    private UserServiceFeign userService;*/

    @GetMapping("getMyTree")
    public List<TreeBean> getMyTree(){
        return userService.getMyTree();
    }

}