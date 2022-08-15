package cn.edu.xmu.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 远程调用三步走：
 *  1. 引入open-feign
 *  2. 编写一个接口，写一个接口，告诉springcloud这个接口需要调用远程服务
 *  3. 开启远程调用
 */

// 开启远程调用
@EnableFeignClients(basePackages = "cn.edu.xmu.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
