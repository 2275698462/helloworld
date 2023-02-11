package com.illusion.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.illusion.entity.UserAddress;
import com.illusion.service.OrderService;
import com.illusion.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author illusion
 * @date 2023/2/10 12:45
 */
@Service
public class OrderServiceImpl implements OrderService {

//    @Resource
    @Reference //从注册中心发现接口
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id：" + userId);

        //1.查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
