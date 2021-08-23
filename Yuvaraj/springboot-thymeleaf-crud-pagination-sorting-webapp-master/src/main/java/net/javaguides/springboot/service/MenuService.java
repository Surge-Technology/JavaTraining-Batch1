package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.MenuEntity;

public interface MenuService {
	List<MenuEntity> getAllDishes();
	void save(MenuEntity employee);
	MenuEntity getById(long id);
	void deleteById(long id);
	Page<MenuEntity> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
