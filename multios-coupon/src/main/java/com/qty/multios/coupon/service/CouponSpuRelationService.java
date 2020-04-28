package com.qty.multios.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;


/**
 * @author 123
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

