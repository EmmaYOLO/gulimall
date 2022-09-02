package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Emma_Lyy
 * @create 2022-08-11 11:17
 */

/**
 * 这是一个声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
    //只要调用接口CouponFeignService中的membercoupons方法，
    //就会先去注册中心找名字为"gulimall-coupon"的服务，
    //再去调用"/coupon/coupon/member/list"对应的方法。
}
