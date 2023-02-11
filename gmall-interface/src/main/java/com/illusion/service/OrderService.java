package com.illusion.service;

import com.illusion.entity.UserAddress;

import java.util.List;

/**
 * @author illusion
 * @date 2023/2/10 12:43
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    List<UserAddress> initOrder(String userId);
}
