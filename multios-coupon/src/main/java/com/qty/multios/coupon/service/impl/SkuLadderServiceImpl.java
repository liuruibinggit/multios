package com.qty.multios.coupon.service.impl;

import com.qty.multios.common.utils.Query;
import com.qty.multios.coupon.dao.SkuLadderDao;
import com.qty.multios.coupon.entity.SkuLadderEntity;
import com.qty.multios.coupon.service.SkuLadderService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.common.utils.R;


@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements SkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuLadderEntity> page = this.page(
                new Query<SkuLadderEntity>().getPage(params),
                new QueryWrapper<SkuLadderEntity>()
        );

        return new PageUtils(page);
    }

}