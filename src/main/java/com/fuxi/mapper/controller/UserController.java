package com.fuxi.mapper.controller;

import com.fuxi.mapper.bean.UserInfo;
import com.fuxi.mapper.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Jingxv Zhang
 * @Date 2019/12/6 14:07
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserInfoService userInfoService;


    @GetMapping("/findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        return userInfoService.getUserList();
    }

    @RequestMapping("/add")//添加一个
    @ResponseBody
    public void add(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("11");
        userInfo.setLoginName("zhangsanesc");
        userInfoService.addUser(userInfo);
    }

    @RequestMapping("/delete")//
    @ResponseBody
    public void delete(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("11");
        userInfoService.deleteUser(userInfo);

    }
    @RequestMapping("/deleteByName")//
    @ResponseBody
    public void deleteByName(String name){
        userInfoService.deleteByName(name);
    }
    @RequestMapping("/update")//添加一个
    @ResponseBody
    public void update(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("1");
        userInfo.setLoginName("zhangsan");
        userInfo.setEmail("zhangsanesc@sina.com");
        userInfoService.update(userInfo);
    }
    @RequestMapping("/updateByName")//根据名称修改
    @ResponseBody
    public String  updateByName(String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setLoginName("wnagwu");
        userInfoService.updateByName(name,userInfo);
        return "OK";
    }
    @RequestMapping("/updateByLoginName")//根据名称修改
    @ResponseBody
    public String  updateByLoginName(String loginName){

        UserInfo userInfo =new UserInfo();
        userInfo.setName("大傻逼");
        userInfoService.updateByLoginName(loginName,userInfo);
        return "OK";
    }
}
