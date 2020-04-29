package com.uca.capas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class ProductController {

	private List<Product> productos = new ArrayList<Product>();
	
	@GetMapping("/comprarproducto")
	public ModelAndView compraProducto() {
		ModelAndView mav = new ModelAndView();
		
		productos.add(new Product(0, "alsjda", 8));
		productos.add(new Product(1, "aqlwn", 1));
		productos.add(new Product(2, "asdfjlnallña", 6));
		
		mav.setViewName("select");
		mav.addObject("product", new Product());
		mav.addObject("producto", productos);
		
		return mav;
	}
	
	
	@PostMapping("validar")
	@ResponseBody
	public String validar(Product product) {
		return productos.get(product.getId()).getNombre() + "\n" + productos.get(product.getId()).getCantidad();
	}
	
}
