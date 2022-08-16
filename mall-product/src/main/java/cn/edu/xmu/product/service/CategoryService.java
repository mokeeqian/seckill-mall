package cn.edu.xmu.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.xmu.common.utils.PageUtils;
import cn.edu.xmu.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author mokeeqian
 * @email mokeeqian@gmail.com
 * @date 2022-08-15 13:49:08
 */
public interface CategoryService extends IService<CategoryEntity> {

    /**
     * 分页查询
     * @param params
     * @return
     */
    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询所有记录，返回树形结构
     * @return
     */
    List<CategoryEntity> listWithTree();
}

