package com.qty.multios.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.coupon.entity.CouponEntity;

import java.util.Map;


/**
 * @author 123
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

