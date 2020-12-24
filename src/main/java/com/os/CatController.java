package com.os;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatController {
	

	private List<Category> cateList = new ArrayList<Category>();
	
	@Autowired
	private CatService catService;
	
	public CatController(CatService catService) {
		super();
		this.catService = catService;
		
		System.out.println("\n\nIn CatController Called\n\n");
	}

	@RequestMapping(value = {"/", "/home"})
	public String getHome(Model theModel) {
		

		
		
		List<Category> catFromService = new ArrayList<Category>();

		catFromService = catService.getFirstCatList();

		
		
		// add to the spring model
		theModel.addAttribute("cats", cateList);
		
		// add to the spring model
		theModel.addAttribute("catserv", catFromService);
		
		return "home";
	}

	
	@GetMapping("/subview")
	public ModelAndView showEventPage(@RequestParam("catId") int catId) {
		ModelAndView modelAndView = new ModelAndView("subview");

		List<Category> subcatFromService = new ArrayList<Category>();

		subcatFromService = catService.getSubCatList(catId);
		
		System.out.println("\n\nSubview Called" + subcatFromService);
		
		modelAndView.addObject("subcats", subcatFromService);
		
		return modelAndView;
	}

}
