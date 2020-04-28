package com.qty.multios.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;


/**
 * @author 123
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

