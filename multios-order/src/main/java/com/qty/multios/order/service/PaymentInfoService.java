package com.qty.multios.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

