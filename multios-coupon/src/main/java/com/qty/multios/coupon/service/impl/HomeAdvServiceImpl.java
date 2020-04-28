package com.qty.multios.coupon.service.impl;

import com.qty.multios.common.utils.Query;
import com.qty.multios.coupon.dao.HomeAdvDao;
import com.qty.multios.coupon.entity.HomeAdvEntity;
import com.qty.multios.coupon.service.HomeAdvService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.common.utils.R;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvEntity> page = this.page(
                new Query<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}