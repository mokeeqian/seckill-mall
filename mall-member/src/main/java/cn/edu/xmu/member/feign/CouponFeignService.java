package cn.edu.xmu.member.feign;

import cn.edu.xmu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明式远程调用
 */
// member调用coupon
@FeignClient("mall-coupon")
public interface CouponFeignService {
    // 调用这个方法，就回去找coupon所在的位置
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}