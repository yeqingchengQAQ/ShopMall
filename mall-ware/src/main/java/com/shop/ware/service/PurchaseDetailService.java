package com.shop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wyh
 * @email wangyinghao@qq.com
 * @date 2022-05-29 22:46:01
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

