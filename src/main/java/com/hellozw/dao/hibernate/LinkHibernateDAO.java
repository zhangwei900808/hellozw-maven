package com.hellozw.dao.hibernate;

import java.util.List;

import com.hellozw.dao.ILinkDAO;
import com.hellozw.model.Link;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("linkDAO")
public class LinkHibernateDAO extends HibernateDaoSupport implements ILinkDAO {

    @Resource(name = "sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Link> QueryLinkByNavId(String id) {
        try {
            return (List<Link>) getHibernateTemplate()
                    .find("select l from Link l");
        } catch (Exception e) {
            System.out.println("QueryLinkByNavId出错：" + e.getMessage());
            return null;
        }
    }

    @Override
    public void saveLink(Link link) {
        try {
            getHibernateTemplate().save(link);
        } catch (Exception e) {
            System.out.println("SaveLink出错：" + e.getMessage());
        }
    }

    @Override
    public void delLink(Link link) {
        try {
            Link link2 = getHibernateTemplate().load(Link.class, link.getId());
            getHibernateTemplate().delete(link2);
        } catch (Exception e) {
            System.out.println("delLink出错：" + e.getMessage());
        }
    }

    @Override
    public void updateLink(Link link) {
        try {
            Link link2 = getHibernateTemplate().load(Link.class, link.getId());
            if (link.getName() != null) {
                link2.setName(link.getName());
            }
            if (link.getLevel() != 0) {
                link2.setLevel(link.getLevel());
            }
            if (link.getIcon() != null) {
                link2.setIcon(link.getIcon());
            }
            if (link.getUrl() != null) {
                link2.setUrl(link.getUrl());
            }

            getHibernateTemplate().update(link2);
        } catch (Exception e) {
            System.out.println("updateLink出错：" + e.getMessage());
        }
    }

    @Override
    public List<Link> QueryLinkByName(String name) {
        try {
            @SuppressWarnings("unchecked")
            List<Link> links = (List<Link>) getHibernateTemplate()
                    .find("select l from Link l left join fetch l.PersonalNav p where l.name like ?",
                            "%" + name + "%");
            return links;
        } catch (Exception e) {
            System.out.println("QueryLinkByName出错：" + e.getMessage());
            return null;
        }
    }
}
