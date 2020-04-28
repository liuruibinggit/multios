package com.qty.multios.coupon.service.impl;

import com.qty.multios.common.utils.Query;
import com.qty.multios.coupon.dao.MemberPriceDao;
import com.qty.multios.coupon.entity.MemberPriceEntity;
import com.qty.multios.coupon.service.MemberPriceService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.common.utils.R;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}