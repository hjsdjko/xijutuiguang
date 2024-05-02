package com.entity.view;

import com.entity.XiquLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 戏曲留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiqu_liuyan")
public class XiquLiuyanView extends XiquLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xiqu
			/**
			* 戏曲名称
			*/
			private String xiquName;
			/**
			* 戏曲类型
			*/
			private Integer xiquTypes;
				/**
				* 戏曲类型的值
				*/
				private String xiquValue;
			/**
			* 戏曲封面
			*/
			private String xiquPhoto;
			/**
			* 戏曲视频
			*/
			private String xiquVideo;
			/**
			* 地区
			*/
			private String xiquAddress;
			/**
			* 戏曲详情
			*/
			private String xiquContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XiquLiuyanView() {

	}

	public XiquLiuyanView(XiquLiuyanEntity xiquLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xiquLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set xiqu

					/**
					* 获取： 戏曲名称
					*/
					public String getXiquName() {
						return xiquName;
					}
					/**
					* 设置： 戏曲名称
					*/
					public void setXiquName(String xiquName) {
						this.xiquName = xiquName;
					}

					/**
					* 获取： 戏曲类型
					*/
					public Integer getXiquTypes() {
						return xiquTypes;
					}
					/**
					* 设置： 戏曲类型
					*/
					public void setXiquTypes(Integer xiquTypes) {
						this.xiquTypes = xiquTypes;
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

					/**
					* 获取： 戏曲封面
					*/
					public String getXiquPhoto() {
						return xiquPhoto;
					}
					/**
					* 设置： 戏曲封面
					*/
					public void setXiquPhoto(String xiquPhoto) {
						this.xiquPhoto = xiquPhoto;
					}

					/**
					* 获取： 戏曲视频
					*/
					public String getXiquVideo() {
						return xiquVideo;
					}
					/**
					* 设置： 戏曲视频
					*/
					public void setXiquVideo(String xiquVideo) {
						this.xiquVideo = xiquVideo;
					}

					/**
					* 获取： 地区
					*/
					public String getXiquAddress() {
						return xiquAddress;
					}
					/**
					* 设置： 地区
					*/
					public void setXiquAddress(String xiquAddress) {
						this.xiquAddress = xiquAddress;
					}

					/**
					* 获取： 戏曲详情
					*/
					public String getXiquContent() {
						return xiquContent;
					}
					/**
					* 设置： 戏曲详情
					*/
					public void setXiquContent(String xiquContent) {
						this.xiquContent = xiquContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
