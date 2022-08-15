package cn.edu.xmu.ware.dao;

import cn.edu.xmu.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 15:52:23
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
