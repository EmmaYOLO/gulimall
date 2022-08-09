package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lk
 * @email lk@gmail.com
 * @date 2022-06-09 10:38:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
