/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PageController
 * Author:   Administrator
 * Date:     2019/4/12 23:16
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author lvdl
 * @create 2019/4/12
 * @since 1.0.0
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }

    @RequestMapping("toShowBook")
    public String toShowBook(){
        return "showBook";
    }

    @RequestMapping("toAddBookPage")
    public String toAddBookPage(){
        return "addBookPage";
    }

}