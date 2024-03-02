package com.entity.vo;

import com.entity.WendangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 资料信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wendang")
public class WendangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资料标题
     */

    @TableField(value = "wendang_name")
    private String wendangName;


    /**
     * 资料类型
     */

    @TableField(value = "wendang_types")
    private Integer wendangTypes;


    /**
     * 二级分类
     */

    @TableField(value = "wendang_erji_types")
    private Integer wendangErjiTypes;


    /**
     * 资料封面
     */

    @TableField(value = "wendang_photo")
    private String wendangPhoto;


    /**
     * 文件
     */

    @TableField(value = "wendang_file")
    private String wendangFile;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 审核结果
     */

    @TableField(value = "wendang_yesno_types")
    private Integer wendangYesnoTypes;


    /**
     * 资料详情
     */

    @TableField(value = "wendang_content")
    private String wendangContent;


    /**
     * 假删
     */

    @TableField(value = "wendang_delete")
    private Integer wendangDelete;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：资料标题
	 */
    public String getWendangName() {
        return wendangName;
    }


    /**
	 * 获取：资料标题
	 */

    public void setWendangName(String wendangName) {
        this.wendangName = wendangName;
    }
    /**
	 * 设置：资料类型
	 */
    public Integer getWendangTypes() {
        return wendangTypes;
    }


    /**
	 * 获取：资料类型
	 */

    public void setWendangTypes(Integer wendangTypes) {
        this.wendangTypes = wendangTypes;
    }
    /**
	 * 设置：二级分类
	 */
    public Integer getWendangErjiTypes() {
        return wendangErjiTypes;
    }


    /**
	 * 获取：二级分类
	 */

    public void setWendangErjiTypes(Integer wendangErjiTypes) {
        this.wendangErjiTypes = wendangErjiTypes;
    }
    /**
	 * 设置：资料封面
	 */
    public String getWendangPhoto() {
        return wendangPhoto;
    }


    /**
	 * 获取：资料封面
	 */

    public void setWendangPhoto(String wendangPhoto) {
        this.wendangPhoto = wendangPhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getWendangFile() {
        return wendangFile;
    }


    /**
	 * 获取：文件
	 */

    public void setWendangFile(String wendangFile) {
        this.wendangFile = wendangFile;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getWendangYesnoTypes() {
        return wendangYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setWendangYesnoTypes(Integer wendangYesnoTypes) {
        this.wendangYesnoTypes = wendangYesnoTypes;
    }
    /**
	 * 设置：资料详情
	 */
    public String getWendangContent() {
        return wendangContent;
    }


    /**
	 * 获取：资料详情
	 */

    public void setWendangContent(String wendangContent) {
        this.wendangContent = wendangContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getWendangDelete() {
        return wendangDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setWendangDelete(Integer wendangDelete) {
        this.wendangDelete = wendangDelete;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
