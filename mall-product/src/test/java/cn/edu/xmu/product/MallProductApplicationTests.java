package cn.edu.xmu.product;

import cn.edu.xmu.product.entity.BrandEntity;
import cn.edu.xmu.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("诺基亚");
//        brandService.save(brandEntity);
//        System.out.println("插入成功....");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 12L));
        list.forEach(System.out::println);
    }

}
