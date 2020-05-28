package com.soap.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表-MS
 * </p>
 *
 * @author ZhangPY
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id uuid
     */
    @TableId("id")
    private String id;

    /**
     * 昵称（用于显示）
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 手机号（可用手机号登录）
     */
    @TableField("phone_num")
    private String phoneNum;

    /**
     * 用户名（用于登录）
     */
    @TableField("user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 默认验证码（用于手机不能接收验证码后提供可用的验证码）
     */
    @TableField("verification_code")
    private String verificationCode;

    /**
     * 优先级别（1：最低  2：默认  3：稍高  4：高  5：最高）
     */
    @TableField("priority")
    private Integer priority;

    /**
     * 角色id
     */
    @TableField("role_id")
    private String roleId;

    /**
     * 是否锁定（0：未锁定   1：锁定）
     */
    @TableField("is_locked")
    private Integer isLocked;

    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 公司id
     */
    @TableField("company_id")
    private String companyId;

    /**
     * 创建人id
     */
    @TableField("create_user_id")
    private String createUserId;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新人id
     */
    @TableField("update_user_id")
    private String updateUserId;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


}
