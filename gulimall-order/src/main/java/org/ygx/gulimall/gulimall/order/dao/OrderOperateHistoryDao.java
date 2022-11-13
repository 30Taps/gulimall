package org.ygx.gulimall.gulimall.order.dao;

import org.ygx.gulimall.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 15:14:35
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
