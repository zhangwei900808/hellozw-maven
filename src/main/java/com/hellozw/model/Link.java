package com.hellozw.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

/**
 * 链接表
 *
 * @author Administrator
 */
@Entity(name = "Link")
public class Link {
    // id
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @Column(name = "id", length = 40)
    private String id;

    // 链接名称
    @Column(name = "name")
    private String name;

    // 链接地址
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "url", columnDefinition = "TEXT", nullable = true)
    private String url;

    // 网站图标
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "icon", columnDefinition = "TEXT", nullable = true)
    private String icon;

    // 显示顺序
    @Column(name = "level")
    private int level;

    // 类型
    @Column(name = "type")
    private int type;

    // 介绍说明
    @Column(name = "introduction")
    private String introduction;

    // 创建时
    @Column(name = "createDt")
    private Timestamp createDt;

    // 更新时间
    @Column(name = "updateDt")
    private Timestamp updateDt;

    // 个性导航(多对一)
    //延迟加载：多对一方式
    //关联信息：外键name = "category_id"
    @ManyToOne
    @JoinColumn(name = "pnid")
    private PersonalNav personalNav;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Timestamp getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Timestamp createDt) {
        this.createDt = createDt;
    }

    public Timestamp getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Timestamp updateDt) {
        this.updateDt = updateDt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PersonalNav getPersonalNav() {
        return personalNav;
    }

    public void setPersonalNav(PersonalNav personalNav) {
        this.personalNav = personalNav;
    }
}
