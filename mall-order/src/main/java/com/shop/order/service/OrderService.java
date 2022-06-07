package com.shop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.order.entity.OrderEntity;

import java.util.Map;

/**
 * ????
 *
 * @author wyh
 * @email 1697473465@qq.com
 * @date 2022-05-29 18:25:44
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

