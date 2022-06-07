package com.shop.member.feign;


import com.shop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeign {

    @RequestMapping("coupon/coupon/get")
    public R me();
}
