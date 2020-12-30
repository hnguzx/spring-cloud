package com.guzx.springcloud.demo.user.entity;


import com.google.common.base.MoreObjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "scUser")
public class User implements Serializable {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue
    /** 用户数据库主键 */
    private Long id;
    /** 用户昵称 */
    private String nickName;
    /** 用户头像 */
    private String avatar;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).
                add("id", getId()).
                add("nickName", getNickName()).
                toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
