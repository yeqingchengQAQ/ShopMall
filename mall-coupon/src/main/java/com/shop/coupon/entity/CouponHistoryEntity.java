package com.shop.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?????????????
 * 
 * @author wyh
 * @email 1697473465@qq.com
 * @date 2022-05-29 17:27:43
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ????id
	 */
	private Long couponId;
	/**
	 * ???id
	 */
	private Long memberId;
	/**
	 * ??????
	 */
	private String memberNickName;
	/**
	 * ??????[0->????????1->???????]
	 */
	private Integer getType;
	/**
	 * ??????
	 */
	private Date createTime;
	/**
	 * ?????[0->δ????1->??????2->?????]
	 */
	private Integer useType;
	/**
	 * ?????
	 */
	private Date useTime;
	/**
	 * ????id
	 */
	private Long orderId;
	/**
	 * ?????
	 */
	private Long orderSn;

}
