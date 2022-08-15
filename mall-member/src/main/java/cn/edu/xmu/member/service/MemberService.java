package cn.edu.xmu.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.xmu.common.utils.PageUtils;
import cn.edu.xmu.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 15:40:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

