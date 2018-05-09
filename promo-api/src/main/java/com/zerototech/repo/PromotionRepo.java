package com.zerototech.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.zerototech.model.Promotion;

@Component
public class PromotionRepo {

	private static Map<Integer ,Promotion> map = new HashMap<>();
	private Integer idIndex = map.size();
	static {
		Promotion promo1 = new Promotion(1 ,"get 10% off" ,"get 10% off on order" ,"12/04/2018" ,"01/05/2018");
		Promotion promo2 = new Promotion(2 ,"buyXgetX" ,"buy one and get one free" ,"12/04/2018" ,"01/05/2018");
		Promotion promo3 = new Promotion(3 ,"buyXgetY" ,"buy one and get another free" ,"12/04/2018" ,"01/05/2018");
		map.put(1,promo1);
		map.put(2 ,promo2);
		map.put(3 ,promo3);
	}
	
	public List<Promotion> findAll(){
		return new ArrayList<Promotion>(map.values());
	}
	
	public void save(Promotion promo) {
		map.put(idIndex+1, promo);
	}
	
	public void update(int Id ,Promotion promo) {
		map.put(Id,promo);
	}
	
	public void delete(int id) {
		map.remove(id);
	}
}
