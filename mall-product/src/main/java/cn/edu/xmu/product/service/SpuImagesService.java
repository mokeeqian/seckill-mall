package cn.edu.xmu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.xmu.common.utils.PageUtils;
import cn.edu.xmu.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 13:49:08
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

