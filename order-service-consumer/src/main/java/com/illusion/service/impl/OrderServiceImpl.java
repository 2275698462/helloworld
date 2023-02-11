package com.illusion.service.impl;

import com.illusion.entity.UserAddress;
import com.illusion.service.OrderService;
import com.illusion.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 1.将服务提供者注册到注册中心（暴露服务）
 *      1.导入dubbo和操作zookeeper的客户端（curator）的依赖
 *      2.配置服务提供者
 *
 * 2.让服务订阅者去注册中心订阅服务提供者的服务地址
 *
 * @author illusion
 * @date 2023/2/10 12:45
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户id：" + userId);

        //1.查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
