package cn.edu.xmu.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 */
@SpringBootApplication
@MapperScan("cn.edu.xmu.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
