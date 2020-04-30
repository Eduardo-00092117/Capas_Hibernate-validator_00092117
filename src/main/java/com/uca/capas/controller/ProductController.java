package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class ProductController {

	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index"); 
		mav.addObject("product", new Product());
		return mav;
	}
	
	@RequestMapping("/validar")
	public ModelAndView validar(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.setViewName("resultado");
			mav.addObject("nombre", product.getNombre());
		}
		
		return mav;
	}
	
}
