package com.entity.view;

import com.entity.ZixunxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 相关资讯
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zixunxinxi")
public class ZixunxinxiView extends ZixunxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 资讯类型的值
		*/
		private String zixunxinxiValue;
		/**
		* 方式的值
		*/
		private String statusValue;



	public ZixunxinxiView() {

	}

	public ZixunxinxiView(ZixunxinxiEntity zixunxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, zixunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 资讯类型的值
			*/
			public String getZixunxinxiValue() {
				return zixunxinxiValue;
			}
			/**
			* 设置： 资讯类型的值
			*/
			public void setZixunxinxiValue(String zixunxinxiValue) {
				this.zixunxinxiValue = zixunxinxiValue;
			}
			/**
			* 获取： 方式的值
			*/
			public String getStatusValue() {
				return statusValue;
			}
			/**
			* 设置： 方式的值
			*/
			public void setStatusValue(String statusValue) {
				this.statusValue = statusValue;
			}











}
