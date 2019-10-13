package com.santiago.controller;

import java.util.List;

import com.santiago.entity.Category;
import com.santiago.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/findAll.do")
	public String findAll(ModelMap map){
		List<Category> parents = categoryService.findAll();
		map.addAttribute("parents", parents);
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		return "left";
	}
}
