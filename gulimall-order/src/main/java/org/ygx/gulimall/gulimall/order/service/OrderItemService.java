package org.ygx.gulimall.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ygx.gulimall.common.utils.PageUtils;
import org.ygx.gulimall.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 15:14:35
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

