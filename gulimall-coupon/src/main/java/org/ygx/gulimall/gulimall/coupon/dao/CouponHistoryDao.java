package org.ygx.gulimall.gulimall.coupon.dao;

import org.ygx.gulimall.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 14:54:00
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}