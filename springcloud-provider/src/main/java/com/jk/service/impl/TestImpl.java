/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestImpl
 * Author:   Administrator
 * Date:     2019/4/13 9:30
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * @author lvdl
 * @create 2019/4/13
 * @since 1.0.0
 */
@Controller
@RequestMapping("test")
public class TestImpl {

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

}