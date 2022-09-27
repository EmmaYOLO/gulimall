package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 1. 在pom.xml中引入oss-starter
 * 2. 在yml中配置key、endpoint
 * 3. 使用OSSClient进行相关操作
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;


    @Test
    public void testUpload() throws FileNotFoundException {
//        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-chengdu.aliyuncs.com";
//        // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//        String accessKeyId = "LTAI5tN8NMED4VYQvpQG9znh";
//        String accessKeySecret = "ZXGbtEHAD5RIxhK7J2nt6XBF57WxDT";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        //上传文件流
        InputStream inputStream = new FileInputStream("C:\\Users\\84519\\Desktop\\738d919cgy1h6cafuzrjij20o00wfmzg.jpg");
        ossClient.putObject("gulimall-emma","挺住1.jpg",inputStream);

        //关闭OSSClient
        ossClient.shutdown();
        System.out.println("上传完成……");

    }

    @Test
    public void contextLoads() {
    }

}
