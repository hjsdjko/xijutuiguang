package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 相关资讯
 *
 * @author 
 * @email
 */
@TableName("zixunxinxi")
public class ZixunxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZixunxinxiEntity() {

	}

	public ZixunxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 资讯标题
     */
    @TableField(value = "zixunxinxi_name")

    private String zixunxinxiName;


    /**
     * 资讯类型
     */
    @TableField(value = "zixunxinxi_types")

    private Integer zixunxinxiTypes;


    /**
     * 资讯图片
     */
    @TableField(value = "zixunxinxi_photo")

    private String zixunxinxiPhoto;


    /**
     * 地点
     */
    @TableField(value = "zixunxinxi_address")

    private String zixunxinxiAddress;


    /**
     * 联系人电话
     */
    @TableField(value = "zixunxinxi_phone")

    private String zixunxinxiPhone;


    /**
     * 方式
     */
    @TableField(value = "status_types")

    private Integer statusTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 资讯详情
     */
    @TableField(value = "zixunxinxi_content")

    private String zixunxinxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：资讯标题
	 */
    public String getZixunxinxiName() {
        return zixunxinxiName;
    }
    /**
	 * 获取：资讯标题
	 */

    public void setZixunxinxiName(String zixunxinxiName) {
        this.zixunxinxiName = zixunxinxiName;
    }
    /**
	 * 设置：资讯类型
	 */
    public Integer getZixunxinxiTypes() {
        return zixunxinxiTypes;
    }
    /**
	 * 获取：资讯类型
	 */

    public void setZixunxinxiTypes(Integer zixunxinxiTypes) {
        this.zixunxinxiTypes = zixunxinxiTypes;
    }
    /**
	 * 设置：资讯图片
	 */
    public String getZixunxinxiPhoto() {
        return zixunxinxiPhoto;
    }
    /**
	 * 获取：资讯图片
	 */

    public void setZixunxinxiPhoto(String zixunxinxiPhoto) {
        this.zixunxinxiPhoto = zixunxinxiPhoto;
    }
    /**
	 * 设置：地点
	 */
    public String getZixunxinxiAddress() {
        return zixunxinxiAddress;
    }
    /**
	 * 获取：地点
	 */

    public void setZixunxinxiAddress(String zixunxinxiAddress) {
        this.zixunxinxiAddress = zixunxinxiAddress;
    }
    /**
	 * 设置：联系人电话
	 */
    public String getZixunxinxiPhone() {
        return zixunxinxiPhone;
    }
    /**
	 * 获取：联系人电话
	 */

    public void setZixunxinxiPhone(String zixunxinxiPhone) {
        this.zixunxinxiPhone = zixunxinxiPhone;
    }
    /**
	 * 设置：方式
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }
    /**
	 * 获取：方式
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：资讯详情
	 */
    public String getZixunxinxiContent() {
        return zixunxinxiContent;
    }
    /**
	 * 获取：资讯详情
	 */

    public void setZixunxinxiContent(String zixunxinxiContent) {
        this.zixunxinxiContent = zixunxinxiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zixunxinxi{" +
            "id=" + id +
            ", zixunxinxiName=" + zixunxinxiName +
            ", zixunxinxiTypes=" + zixunxinxiTypes +
            ", zixunxinxiPhoto=" + zixunxinxiPhoto +
            ", zixunxinxiAddress=" + zixunxinxiAddress +
            ", zixunxinxiPhone=" + zixunxinxiPhone +
            ", statusTypes=" + statusTypes +
            ", insertTime=" + insertTime +
            ", zixunxinxiContent=" + zixunxinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
