package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.MenuEntity;
import net.javaguides.springboot.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuRepository menuRepository;

	@Override
	public List<MenuEntity> getAllDishes() {
		return menuRepository.findAll();
	}

	@Override
	public void save(MenuEntity details) {
		this.menuRepository.save(details);
	}

	@Override
	public MenuEntity getById(long id) {
		Optional<MenuEntity> optional = menuRepository.findById(id);
		MenuEntity details = null;
		if (optional.isPresent()) {
			details = optional.get();
		} else {
			throw new RuntimeException(" Details not found for id :: " + id);
		}
		return details;
	}

	@Override
	public void deleteById(long id) {
		this.menuRepository.deleteById(id);
	}

	@Override
	public Page<MenuEntity> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.menuRepository.findAll(pageable);
	}
}
