package com.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * ???Է??
 *
 * @author wyh
 * @email 1697473465@qq.com
 * @date 2022-05-28 16:27:41
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

