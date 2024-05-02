package com.entity.model;

import com.entity.XiquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 戏曲信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiquModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 戏曲名称
     */
    private String xiquName;


    /**
     * 戏曲类型
     */
    private Integer xiquTypes;


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


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：戏曲名称
	 */
    public String getXiquName() {
        return xiquName;
    }


    /**
	 * 设置：戏曲名称
	 */
    public void setXiquName(String xiquName) {
        this.xiquName = xiquName;
    }
    /**
	 * 获取：戏曲类型
	 */
    public Integer getXiquTypes() {
        return xiquTypes;
    }


    /**
	 * 设置：戏曲类型
	 */
    public void setXiquTypes(Integer xiquTypes) {
        this.xiquTypes = xiquTypes;
    }
    /**
	 * 获取：戏曲封面
	 */
    public String getXiquPhoto() {
        return xiquPhoto;
    }


    /**
	 * 设置：戏曲封面
	 */
    public void setXiquPhoto(String xiquPhoto) {
        this.xiquPhoto = xiquPhoto;
    }
    /**
	 * 获取：戏曲视频
	 */
    public String getXiquVideo() {
        return xiquVideo;
    }


    /**
	 * 设置：戏曲视频
	 */
    public void setXiquVideo(String xiquVideo) {
        this.xiquVideo = xiquVideo;
    }
    /**
	 * 获取：地区
	 */
    public String getXiquAddress() {
        return xiquAddress;
    }


    /**
	 * 设置：地区
	 */
    public void setXiquAddress(String xiquAddress) {
        this.xiquAddress = xiquAddress;
    }
    /**
	 * 获取：戏曲详情
	 */
    public String getXiquContent() {
        return xiquContent;
    }


    /**
	 * 设置：戏曲详情
	 */
    public void setXiquContent(String xiquContent) {
        this.xiquContent = xiquContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
