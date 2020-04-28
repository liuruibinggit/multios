package com.qty.multios.coupon.service.impl;

import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.common.utils.Query;
import com.qty.multios.coupon.dao.SeckillSkuNoticeDao;
import com.qty.multios.coupon.entity.SeckillSkuNoticeEntity;
import com.qty.multios.coupon.service.SeckillSkuNoticeService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNoticeEntity> page = this.page(
                new Query<SeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}