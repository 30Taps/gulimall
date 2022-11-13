package org.ygx.gulimall.gulimall.member.dao;

import org.ygx.gulimall.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ygx
 * @email wudaliujiwang@163.com
 * @date 2022-11-13 15:03:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
