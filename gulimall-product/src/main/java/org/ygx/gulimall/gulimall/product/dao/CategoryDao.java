package org.ygx.gulimall.gulimall.product.dao;

import org.ygx.gulimall.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-11 17:29:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
