package org.ygx.gulimall.gulimall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ygx.gulimall.common.utils.PageUtils;
import org.ygx.gulimall.common.utils.Query;

import org.ygx.gulimall.gulimall.warehouse.dao.WareOrderTaskDetailDao;
import org.ygx.gulimall.gulimall.warehouse.entity.WareOrderTaskDetailEntity;
import org.ygx.gulimall.gulimall.warehouse.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new Query<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}