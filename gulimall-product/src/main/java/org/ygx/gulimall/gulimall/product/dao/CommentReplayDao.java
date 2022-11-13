package org.ygx.gulimall.gulimall.product.dao;

import org.ygx.gulimall.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-11 17:29:02
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
