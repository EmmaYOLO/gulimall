package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lk
 * @email lk@gmail.com
 * @date 2022-06-09 13:29:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
