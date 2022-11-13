package org.ygx.gulimall.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ygx.gulimall.common.utils.PageUtils;
import org.ygx.gulimall.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-11 17:29:02
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

