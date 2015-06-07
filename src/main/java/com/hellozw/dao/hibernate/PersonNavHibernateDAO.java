package com.hellozw.dao.hibernate;

import java.util.List;

import com.hellozw.dao.IPersonNavDAO;
import com.hellozw.model.PersonalNav;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class PersonNavHibernateDAO extends HibernateDaoSupport implements
		IPersonNavDAO {

	/**
	 * 获取所有的用户导航菜单数据
	 */
	@Override
	public List<PersonalNav> findAllPersonalNav() {
		List<PersonalNav> PersonalNavs = (List<PersonalNav>) getHibernateTemplate()
				.loadAll(PersonalNav.class);
		return PersonalNavs;
	}

	/**
	 * 添加用户导航数据
	 */
	@Override
	public void savePersonalNav(PersonalNav PersonalNav) {
		getHibernateTemplate().save(PersonalNav);
	}

	@Override
	public List<PersonalNav> findAllByType(PersonalNav PersonalNav) {
		try {
			if (PersonalNav.getType() == 0) {
				return findAllPersonalNav();
			}
			@SuppressWarnings("unchecked")
			List<PersonalNav> PersonalNavs = (List<PersonalNav>) getHibernateTemplate()
					.find("select p from PersonalNav p where p.type like ? order by p.level",
							PersonalNav.getType());
			return PersonalNavs;
		} catch (Exception e) {
			System.out.println("findAllByType出错：" + e.getMessage());
			return null;
		}
	}

	@Override
	public List<PersonalNav> findAllByName(PersonalNav PersonalNav) {
		try {
			@SuppressWarnings("unchecked")
			List<PersonalNav> PersonalNavs = (List<PersonalNav>) getHibernateTemplate()
					.find("select p from PersonalNav p where p.name=?",
							PersonalNav.getName());
			return PersonalNavs;
		} catch (Exception e) {
			System.out.println("findAllByName出错：" + e.getMessage());
			return null;
		}
	}

	/**
	 * 删除导航
	 */
	@Override
	public void delPersonalNav(PersonalNav PersonalNav) {
		try {
            PersonalNav PersonalNav2=getHibernateTemplate().load(PersonalNav.class, PersonalNav.getId());
			getHibernateTemplate().delete(PersonalNav2);
		} catch (Exception e) {
			System.out.println("delPersonalNav出错:" + e.getMessage());
		}

	}

	/**
	 * 查询导航下链接的个数
	 */
	@Override
	public int findPersonalNavOfLinkCount(PersonalNav PersonalNav) {
		int count;
		try {
            PersonalNav PersonalNav2 = getHibernateTemplate().load(
                    PersonalNav.class, PersonalNav.getId());
			count =0;
			return count;

		} catch (Exception e) {
			System.out
					.println("findPersonalNavOfLinkCount出错:" + e.getMessage());
			return 0;
		}
	}

	@Override
	public void updatePersonalNav(PersonalNav PersonalNav) {
		try {
            PersonalNav PersonalNav2 = getHibernateTemplate().load(
                    PersonalNav.class, PersonalNav.getId());
			if (PersonalNav.getName() != null) {
				PersonalNav2.setName(PersonalNav.getName());
			}
			if (PersonalNav.getLevel()!= 0) {
				PersonalNav2.setLevel(PersonalNav.getLevel());
			}
			if (PersonalNav.getType() != 0) {
				PersonalNav2.setType(PersonalNav.getType());
			}

			getHibernateTemplate().update(PersonalNav2);
		} catch (Exception e) {
			System.out.println("updatePersonalNav出错:" + e.getMessage());
		}
	}

}
