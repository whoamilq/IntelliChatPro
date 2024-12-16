package com.chat_blog.java_agi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: huangpenglong
 * @Date: 2023/4/20 19:36
 */


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user_apikey")
public class UserApiKeyEntity {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * api的类型编号, 详情见枚举类ApiType
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 具体的apikey
     */
    @TableField(value = "apikey")
    private String apikey;


    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;


}
