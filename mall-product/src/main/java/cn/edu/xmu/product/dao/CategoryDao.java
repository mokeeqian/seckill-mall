package cn.edu.xmu.product.dao;

import cn.edu.xmu.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 13:49:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
