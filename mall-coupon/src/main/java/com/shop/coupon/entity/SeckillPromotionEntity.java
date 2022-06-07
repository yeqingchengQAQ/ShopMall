package com.shop.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??ɱ?
 * 
 * @author wyh
 * @email 1697473465@qq.com
 * @date 2022-05-29 17:27:43
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ????
	 */
	private String title;
	/**
	 * ??ʼ???
	 */
	private Date startTime;
	/**
	 * ???????
	 */
	private Date endTime;
	/**
	 * ??????״̬
	 */
	private Integer status;
	/**
	 * ????ʱ?
	 */
	private Date createTime;
	/**
	 * ?????
	 */
	private Long userId;

}
