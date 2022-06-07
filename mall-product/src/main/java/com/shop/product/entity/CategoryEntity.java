package com.shop.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * ??????????
 * 
 * @author wyh
 * @email 1697473465@qq.com
 * @date 2022-05-28 16:27:41
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????id
	 */
	@TableId
	private Long catId;
	/**
	 * ???????
	 */
	private String name;
	/**
	 * ??????id
	 */
	private Long parentCid;
	/**
	 * ??
	 */
	private Integer catLevel;
	/**
	 * ??????[0-???????1???]
	 */
	private Integer showStatus;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ??????
	 */
	private String icon;
	/**
	 * ???????
	 */
	private String productUnit;
	/**
	 * ???????
	 */
	private Integer productCount;

	/**
	 * 子菜单，在表里不存在
	 */
	@TableField(exist = false)
	private List<CategoryEntity> children;

}
