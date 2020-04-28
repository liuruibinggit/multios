package com.qty.multios.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

