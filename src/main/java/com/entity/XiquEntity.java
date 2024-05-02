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
 * 戏曲信息
 *
 * @author 
 * @email
 */
@TableName("xiqu")
public class XiquEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiquEntity() {

	}

	public XiquEntity(T t) {
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
     * 戏曲名称
     */
    @TableField(value = "xiqu_name")

    private String xiquName;


    /**
     * 戏曲类型
     */
    @TableField(value = "xiqu_types")

    private Integer xiquTypes;


    /**
     * 戏曲封面
     */
    @TableField(value = "xiqu_photo")

    private String xiquPhoto;


    /**
     * 戏曲视频
     */
    @TableField(value = "xiqu_video")

    private String xiquVideo;


    /**
     * 地区
     */
    @TableField(value = "xiqu_address")

    private String xiquAddress;


    /**
     * 戏曲详情
     */
    @TableField(value = "xiqu_content")

    private String xiquContent;


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
	 * 设置：戏曲名称
	 */
    public String getXiquName() {
        return xiquName;
    }
    /**
	 * 获取：戏曲名称
	 */

    public void setXiquName(String xiquName) {
        this.xiquName = xiquName;
    }
    /**
	 * 设置：戏曲类型
	 */
    public Integer getXiquTypes() {
        return xiquTypes;
    }
    /**
	 * 获取：戏曲类型
	 */

    public void setXiquTypes(Integer xiquTypes) {
        this.xiquTypes = xiquTypes;
    }
    /**
	 * 设置：戏曲封面
	 */
    public String getXiquPhoto() {
        return xiquPhoto;
    }
    /**
	 * 获取：戏曲封面
	 */

    public void setXiquPhoto(String xiquPhoto) {
        this.xiquPhoto = xiquPhoto;
    }
    /**
	 * 设置：戏曲视频
	 */
    public String getXiquVideo() {
        return xiquVideo;
    }
    /**
	 * 获取：戏曲视频
	 */

    public void setXiquVideo(String xiquVideo) {
        this.xiquVideo = xiquVideo;
    }
    /**
	 * 设置：地区
	 */
    public String getXiquAddress() {
        return xiquAddress;
    }
    /**
	 * 获取：地区
	 */

    public void setXiquAddress(String xiquAddress) {
        this.xiquAddress = xiquAddress;
    }
    /**
	 * 设置：戏曲详情
	 */
    public String getXiquContent() {
        return xiquContent;
    }
    /**
	 * 获取：戏曲详情
	 */

    public void setXiquContent(String xiquContent) {
        this.xiquContent = xiquContent;
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
        return "Xiqu{" +
            "id=" + id +
            ", xiquName=" + xiquName +
            ", xiquTypes=" + xiquTypes +
            ", xiquPhoto=" + xiquPhoto +
            ", xiquVideo=" + xiquVideo +
            ", xiquAddress=" + xiquAddress +
            ", xiquContent=" + xiquContent +
            ", createTime=" + createTime +
        "}";
    }
}
