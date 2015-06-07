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
@Entity
@Table(name="Link")
public class Link {
    private String id;
    private String name;
    private String url;
    private String icon;
    private int level;
    private int type;
    private String introduction;
    private Timestamp createDt;
    private Timestamp updateDt;
    // 个性导航(多对一)
    private PersonalNav PersonalNav;

    // id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 链接名称
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 类型
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // 介绍说明
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    // 创建时
    @Column(name = "createDt")
    public Timestamp getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Timestamp createDt) {
        this.createDt = createDt;
    }

    // 更新时间
    @Column(name = "updateDt")
    public Timestamp getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Timestamp updateDt) {
        this.updateDt = updateDt;
    }

    //延迟加载：多对一方式
    //关联信息：外键name = "category_id"
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PersonalNav_id")
    public PersonalNav getPersonalNav() {
        return PersonalNav;
    }

    public void setPersonalNav(PersonalNav PersonalNav) {
        this.PersonalNav = PersonalNav;
    }

    // 链接地址
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 网站图标
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    // 显示顺序
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
