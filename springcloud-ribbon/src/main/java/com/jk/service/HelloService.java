/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HelloService
 * Author:   Administrator
 * Date:     2019/4/12 19:31
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author lvdl
 * @create 2019/4/12
 * @since 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}