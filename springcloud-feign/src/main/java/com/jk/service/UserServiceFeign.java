package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-hi")
public interface UserServiceFeign extends UserService{

    /*@GetMapping("getMyTree")
    List<TreeBean> getMyTree();*/
}
