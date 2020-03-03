package com.fuxi.mapper.service;

import com.fuxi.mapper.bean.UserInfo;
import org.apache.catalina.User;

import java.util.List;

/**
 * @Author Jingxv Zhang
 * @Date 2019/12/6 14:01
 * @Version 1.0
 */
public interface UserInfoService {
    //定义接口
    //查询所有
    List<UserInfo> getUserList();

    //添加用户
    void addUser(UserInfo userInfo );

    //删除用户
    void deleteUser(UserInfo userInfo);
    void deleteByName(String name);
    //修改update
    void update(UserInfo userInfo);
    //根据名称修改 update user set  email = XXX where user.name = xxx
    void updateByName(String name,UserInfo userInfo);
    void updateByLoginName(String loginName, UserInfo userInfo);
}
