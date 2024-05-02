package com.entity.vo;

import com.entity.XiquEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 戏曲信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiqu")
public class XiquVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
