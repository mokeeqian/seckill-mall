package cn.edu.xmu.coupon.dao;

import cn.edu.xmu.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 14:19:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
