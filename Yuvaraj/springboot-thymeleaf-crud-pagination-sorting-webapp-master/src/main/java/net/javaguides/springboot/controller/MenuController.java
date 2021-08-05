package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.model.MenuEntity;
import net.javaguides.springboot.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	// display list of employees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1, "foodType", "asc", model);		
	}
	
	@GetMapping("/showNewForm")
	public String showNewForm(Model model) {
		// create model attribute to bind form data
		MenuEntity details = new MenuEntity();
		model.addAttribute("details", details);
		return "new_dishes";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("details") MenuEntity details) {
		// save employee to database
		menuService.save(details);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		
		// get employee from the service
		MenuEntity details = menuService.getById(id);
		
		// set employee as a model attribute to pre-populate the form
		model.addAttribute("details", details);
		return "update_dishes";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable (value = "id") long id) {
		
		// call delete employee method 
		this.menuService.deleteById(id);
		return "redirect:/";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<MenuEntity> page = menuService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<MenuEntity> list = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("list", list);
		return "index";
	}
}
