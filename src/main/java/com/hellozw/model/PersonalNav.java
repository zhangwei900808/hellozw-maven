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
    private String id;

    private String pid;

    private String name;

    private int type;

    private int level;

    private Timestamp createDt;

    private Timestamp updateDt;

    //链接列表(一对多)
    private Set<Link> links = new HashSet<Link>();

    // id
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @Column(name = "id", length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 节点名称
    @Column(name = "pid", length = 40)
    public String getPid() {
        return pid;
    }

    public void setPid(String pId) {
        this.pid = pId;
    }

    // 节点名称
    @Column(name = "name", length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 节点类型
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    //显示顺序
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // 创建时间
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

    //级联操作：cascade = CascadeType.ALL
    //延迟加载：fetch = FetchType.LAZY
    //映射：mappedBy = "category"
    //一对多方式
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalNav")
    public Set<Link> getLinks() {
        return links;
    }

    public void setLinks(Set<Link> links) {
        this.links = links;
    }
}
