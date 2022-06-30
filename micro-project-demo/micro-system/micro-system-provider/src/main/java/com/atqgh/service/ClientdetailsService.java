package com.atqgh.service;

import com.atqgh.common.utils.PageUtils;
import com.atqgh.entity.ClientdetailsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;

/**
 * 
 *
 * @author qiguohui
 * @email 1948727809@qq.com
 * @date 2021-06-11 15:10:08
 */
public interface ClientdetailsService extends IService<ClientdetailsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

