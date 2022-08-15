package cn.edu.xmu.ware.dao;

import cn.edu.xmu.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 15:52:23
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
