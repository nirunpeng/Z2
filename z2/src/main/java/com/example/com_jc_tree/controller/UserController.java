package com.example.com_jc_tree.controller;

import com.example.com_jc_tree.support.AccessResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/getSalaryByUserId")
    @ResponseBody
    AccessResult getTreeByUserId(@RequestParam("userId") int  id){
        return treeService.getTreeByUserId(id);
    }


}
