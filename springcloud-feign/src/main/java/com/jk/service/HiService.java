package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "service-hi")
public interface HiService {

    //restful编程风格
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    //@GetMapping(value  ="/hi") 查询
    //@RequestMapping(value = "/hi",method = RequestMethod.GET)  查询
    // @PostMapping   //新增请求  @RequestMapping(value = "/hi",method = RequestMethod.POST)
    //@DeleteMapping  //删除请求 @RequestMapping(value = "/hi",method = RequestMethod.DELETE)
    //@PutMapping   //修改  @RequestMapping(value = "/hi",method = RequestMethod.PUT)
    //如果传入的参数是 String Integer  用@RequestParam  如果传递的是对象  @RequestBody
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
