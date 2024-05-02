package com.entity.model;

import com.entity.ZixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 相关资讯
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZixunxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资讯标题
     */
    private String zixunxinxiName;


    /**
     * 资讯类型
     */
    private Integer zixunxinxiTypes;


    /**
     * 资讯图片
     */
    private String zixunxinxiPhoto;


    /**
     * 地点
     */
    private String zixunxinxiAddress;


    /**
     * 联系人电话
     */
    private String zixunxinxiPhone;


    /**
     * 方式
     */
    private Integer statusTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 资讯详情
     */
    private String zixunxinxiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：资讯标题
	 */
    public String getZixunxinxiName() {
        return zixunxinxiName;
    }


    /**
	 * 设置：资讯标题
	 */
    public void setZixunxinxiName(String zixunxinxiName) {
        this.zixunxinxiName = zixunxinxiName;
    }
    /**
	 * 获取：资讯类型
	 */
    public Integer getZixunxinxiTypes() {
        return zixunxinxiTypes;
    }


    /**
	 * 设置：资讯类型
	 */
    public void setZixunxinxiTypes(Integer zixunxinxiTypes) {
        this.zixunxinxiTypes = zixunxinxiTypes;
    }
    /**
	 * 获取：资讯图片
	 */
    public String getZixunxinxiPhoto() {
        return zixunxinxiPhoto;
    }


    /**
	 * 设置：资讯图片
	 */
    public void setZixunxinxiPhoto(String zixunxinxiPhoto) {
        this.zixunxinxiPhoto = zixunxinxiPhoto;
    }
    /**
	 * 获取：地点
	 */
    public String getZixunxinxiAddress() {
        return zixunxinxiAddress;
    }


    /**
	 * 设置：地点
	 */
    public void setZixunxinxiAddress(String zixunxinxiAddress) {
        this.zixunxinxiAddress = zixunxinxiAddress;
    }
    /**
	 * 获取：联系人电话
	 */
    public String getZixunxinxiPhone() {
        return zixunxinxiPhone;
    }


    /**
	 * 设置：联系人电话
	 */
    public void setZixunxinxiPhone(String zixunxinxiPhone) {
        this.zixunxinxiPhone = zixunxinxiPhone;
    }
    /**
	 * 获取：方式
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 设置：方式
	 */
    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：资讯详情
	 */
    public String getZixunxinxiContent() {
        return zixunxinxiContent;
    }


    /**
	 * 设置：资讯详情
	 */
    public void setZixunxinxiContent(String zixunxinxiContent) {
        this.zixunxinxiContent = zixunxinxiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
