package cn.edu.xmu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.xmu.common.utils.PageUtils;
import cn.edu.xmu.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 13:49:08
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

