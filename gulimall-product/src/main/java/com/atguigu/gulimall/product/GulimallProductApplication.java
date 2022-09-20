package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合MyBatis-Plus
 *      1）.导入依赖
 *      <dependency>
 *          <groupId>com.baomidou</groupId>
 *          <artifactId>mybatis-plus-boot-starter</artifactId>
 *          <version>3.2.0</version>
 *      </dependency>
 *      2）.配置
 *          ① 配置数据源：
 *              a.导入数据库的驱动：https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-version
 *              b.在application.yml配置数据源相关信息
 *          ② 配置MyBatis-Plus
 *              a.使用@MapperScan
 *              b.告诉MyBatis-Plus，sql映射文件位置
 *
 * 2.逻辑删除
 *  1)配置全局的逻辑删除规则（可省略）
 *  2)配置逻辑删除的组件Bean（高版本可省略）
 *  3)实体类字段上加上逻辑删除注解@TableLogic
 *
 *
 */

@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
