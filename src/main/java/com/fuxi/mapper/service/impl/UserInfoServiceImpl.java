package com.fuxi.mapper.service.impl;

import com.fuxi.mapper.bean.UserInfo;
import com.fuxi.mapper.mapper.UserInfoMapper;
import com.fuxi.mapper.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author Jingxv Zhang
 * @Date 2019/12/6 14:02
 * @Version 1.0
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    /**
     *
     */
   //服务层调用mapper
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override//查询所有,返回列表
    public List<UserInfo> getUserList() {
        return userInfoMapper.selectAll();
    }

    @Override//添加一个,不返回
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void deleteUser(UserInfo userInfo) {
        userInfoMapper.delete(userInfo);
    }

    @Override
    public void deleteByName(String name) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.deleteByExample(example);
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateByName(String name,UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",name);
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void updateByLoginName(String loginName, UserInfo userInfo) {
        Example exampe = new Example(UserInfo.class);
        exampe.createCriteria().andEqualTo("loginName",loginName);
        userInfoMapper.updateByExampleSelective(userInfo,exampe);
    }
}
