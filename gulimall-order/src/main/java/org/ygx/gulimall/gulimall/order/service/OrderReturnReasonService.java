package org.ygx.gulimall.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ygx.gulimall.common.utils.PageUtils;
import org.ygx.gulimall.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 15:14:34
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

