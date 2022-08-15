package cn.edu.xmu.ware.dao;

import cn.edu.xmu.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 15:52:23
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
