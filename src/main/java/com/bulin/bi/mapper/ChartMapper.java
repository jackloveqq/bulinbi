package com.bulin.bi.mapper;

import com.bulin.bi.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.bulin.springbootinit.model.entity.Chart
 */
public interface ChartMapper extends BaseMapper<Chart> {
    List<Map<String , Object>> queryChartData (String querySql);
}




