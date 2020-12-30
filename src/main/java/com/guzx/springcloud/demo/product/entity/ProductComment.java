package com.guzx.springcloud.demo.product.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "scProduct_Comment")
public class ProductComment implements Serializable {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue
    /** 商品评论数据库主键 */
    private Long id;
    /**
     * 所示商品的Id
     */
    private Long productId;
    /**
     * 评论作者的Id
     */
    private Long authorId;
    /**
     * 评论的具体内容
     */
    private String content;
    /**
     * 评论创建时间
     */
    private Date created;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", getId())
                .add("productId", getProductId())
                .add("authorId", getAuthorId())
                .add("content", getContent()).toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
