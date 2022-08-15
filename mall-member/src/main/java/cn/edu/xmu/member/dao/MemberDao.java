package cn.edu.xmu.member.dao;

import cn.edu.xmu.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 15:40:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
