package org.ygx.gulimall.gulimall.order.dao;

import org.ygx.gulimall.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 15:14:34
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
