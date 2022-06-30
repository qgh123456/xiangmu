package com.atqgh.service.impl;

import com.atqgh.common.utils.PageUtils;
import com.atqgh.common.utils.Query;
import com.atqgh.dao.ClientdetailsDao;
import com.atqgh.entity.ClientdetailsEntity;
import com.atqgh.service.ClientdetailsService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service("clientdetailsService")
public class ClientdetailsServiceImpl extends ServiceImpl<ClientdetailsDao, ClientdetailsEntity> implements ClientdetailsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        IPage<ClientdetailsEntity> page = this.page(
                new Query<ClientdetailsEntity>().getPage(params),
                new QueryWrapper<ClientdetailsEntity>()
        );

        return new PageUtils(page);
    }

}