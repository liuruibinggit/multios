package com.qty.multios.member.service.impl;

import com.qty.multios.common.utils.PageUtils;
import com.qty.multios.common.utils.Query;
import com.qty.multios.member.dao.MemberCollectSpuDao;
import com.qty.multios.member.entity.MemberCollectSpuEntity;
import com.qty.multios.member.service.MemberCollectSpuService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity> implements MemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSpuEntity> page = this.page(
                new Query<MemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<MemberCollectSpuEntity>()
        );

        return new PageUtils(page);
    }

}