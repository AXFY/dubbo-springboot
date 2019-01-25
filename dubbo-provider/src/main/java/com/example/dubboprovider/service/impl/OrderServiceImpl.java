package com.example.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pactera.api.OrderService;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoulonghui
 * @Date: 2019/1/25 10:31
 */
@Component
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrder(String UserId) {
        String result = null;
        switch (UserId) {
            case "1":
                result = "电脑订单";
                break;
            case "2":
                result = "手机订单";
                break;
            default:
                result = "没有查询到订单信息";
                break;
        }
        return result;
    }
}
