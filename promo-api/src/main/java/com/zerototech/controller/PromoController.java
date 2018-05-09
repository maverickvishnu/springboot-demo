package com.zerototech.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zerototech.model.Promotion;
import com.zerototech.repo.PromotionRepo;
import com.zerototech.repo.PromotionRepository;

@RestController
@RequestMapping("promo")
public class PromoController {

	@Autowired
	private PromotionRepository promoRepo;
	@RequestMapping("/")
	public String testApp() {
		return "This is spring boot promo application";
	}
	
	@RequestMapping(value="/get" , method=RequestMethod.GET)
	public List<Promotion> getPromotion(){
		return promoRepo.findAll();
	}
	
	@RequestMapping(value="/get/{Id}" , method=RequestMethod.GET)
	public Promotion getPromotionById(@PathVariable long Id){
		return promoRepo.findOne(Id);
	}
	
	@RequestMapping(value="/add" , method=RequestMethod.POST)
	public void addPromotion(@RequestBody Promotion promo) {
		promoRepo.saveAndFlush(promo);
		
	}
	
	@RequestMapping(value="/update/{Id}" , method=RequestMethod.PUT)
	public Promotion updatePromotion(@PathVariable int Id , @RequestBody Promotion promo) {
		Promotion existingPromo = promoRepo.findOne((long) Id);
		BeanUtils.copyProperties(promo, existingPromo);
		return promoRepo.saveAndFlush(existingPromo);
	}
	
	@RequestMapping(value="/delete/{Id}" , method=RequestMethod.DELETE)
	public Promotion deletePromotion(@PathVariable int id) {
		Promotion existingPromo = promoRepo.findOne((long) id);
		promoRepo.delete(existingPromo);
		return existingPromo;
		
	}
}
