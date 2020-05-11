package com.awstechguide.webapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.awstechguide.webapp.model.Products;
import com.awstechguide.webapp.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("message", "It is Working!!");
		System.out.println("Hello");
		return "index";
	}
	
	@GetMapping("/products")
	public String getProducts(Model model){
		model.addAttribute("products", productService.getProducts());
		return "products";
	}
}
