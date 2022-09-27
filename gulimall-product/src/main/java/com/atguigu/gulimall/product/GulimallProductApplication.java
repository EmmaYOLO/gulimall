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
 * 3.JSR303
 *   1) 给Bean添加校验注解: javax.validation.constraints，并定义自己的message提示
 *   2) 开启校验功能@Valid（在controller中）
 *      效果：校验错误以后会有默认的响应；
 *   3) 要校验的Bean后，跟一个BindingResult，就可以获取到校验的结果
 *   4) 分组校验（多场景的复杂校验）
 *      ① @NotBlank(message = "品牌名不得为空", groups={AddGroup.class,UpdateGroup.class}
 *        给校验注解标注什么情况需要进行校验
 *      ② @Validated({AddGroup.class})
 *      ③ 没指定分组的校验注解@NotBlank，在分组校验情况下（controller标注了@Validated(UpdateGroup.class)）不生效；
 *        只会在@Validated生效；
 *   5) 自定义校验
 *      ① 编写一个自定义校验注解
 *      ② 编写一个自定义校验器
 *      ③ 关联自定义校验器和自定义校验注解:校验注解上面的注解
 *          @Constraint(validatedBy = { ListValueConstraintValidator.class })
 *
 * 4.统一的异常处理
 * @Controller
 * 1）、
 * 2）、
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
