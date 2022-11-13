package org.ygx.gulimall.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ygx.gulimall.common.utils.PageUtils;
import org.ygx.gulimall.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 14:54:00
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

