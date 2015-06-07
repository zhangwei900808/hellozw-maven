package com.hellozw.service;

import java.util.List;

import com.hellozw.model.PersonalNav;

public interface IPersonNavService {

	/**
	 * 查询所有导航标题菜单
	 * 
	 * @return
	 */
	List<PersonalNav> findAllPersonalNavs();

	/**
	 * 添加用户导航菜单
	 * 
	 * @param
	 */
	void savePersonalNav(PersonalNav PersonalNav);

	/**
	 * 删除导航
	 * 
	 * @param PersonalNav
	 */
	void delPersonalNav(PersonalNav PersonalNav);
	
	/**
	 * 更新导航
	 * @param PersonalNav
	 */
	void updatePersonalNav(PersonalNav PersonalNav);

	/**
	 * 
	 * @param type
	 * @return
	 */
	List<PersonalNav> findAllByType(PersonalNav type);
	
	
	/**
	 * 查询导航下链接的个数
	 * @return
	 */
	int findPersonalNavOfLinkCount(PersonalNav PersonalNav);
}
