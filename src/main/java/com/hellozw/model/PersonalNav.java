package com.hellozw.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * 个性导航类
 *
 * @author Administrator
 */
@Entity
@Table(name = "PersonalNav")
public class PersonalNav {

    // id
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @Column(name = "id", length = 40)
    private String id;

    // 节点名称
    @Column(name = "name", length = 40)
    private String name;

    // 节点类型
    @Column(name = "type")
    private int type;

    //显示顺序
    @Column(name = "level")
    private int level;

    // 创建时间
    @Column(name = "createDt")
    private Timestamp createDt;

    // 更新时间
    @Column(name = "updateDt")
    private Timestamp updateDt;

    //链接列表(一对多)
    //级联操作：cascade = CascadeType.ALL
    //延迟加载：fetch = FetchType.LAZY
    //映射：mappedBy = "category"
    //一对多方式
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalNav")
    private Set<Link> links = new HashSet<Link>();

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public Set<Link> getLinks() {
        return links;
    }

    public void setLinks(Set<Link> links) {
        this.links = links;
    }
}
