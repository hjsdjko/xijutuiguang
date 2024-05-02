package com.dao;

import com.entity.ZixunxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixunxinxiView;

/**
 * 相关资讯 Dao 接口
 *
 * @author 
 */
public interface ZixunxinxiDao extends BaseMapper<ZixunxinxiEntity> {

   List<ZixunxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
