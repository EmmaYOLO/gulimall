package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author lk
 * @email lk@gmail.com
 * @date 2022-06-09 09:15:51
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
