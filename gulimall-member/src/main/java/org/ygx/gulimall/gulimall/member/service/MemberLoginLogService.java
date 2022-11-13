package org.ygx.gulimall.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ygx.gulimall.common.utils.PageUtils;
import org.ygx.gulimall.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 15:03:56
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

