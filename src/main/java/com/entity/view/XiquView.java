package com.entity.view;

import com.entity.XiquEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 戏曲信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiqu")
public class XiquView extends XiquEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 戏曲类型的值
		*/
		private String xiquValue;



	public XiquView() {

	}

	public XiquView(XiquEntity xiquEntity) {
		try {
			BeanUtils.copyProperties(this, xiquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 戏曲类型的值
			*/
			public String getXiquValue() {
				return xiquValue;
			}
			/**
			* 设置： 戏曲类型的值
			*/
			public void setXiquValue(String xiquValue) {
				this.xiquValue = xiquValue;
			}











}
