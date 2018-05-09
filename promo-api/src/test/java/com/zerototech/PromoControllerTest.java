package com.zerototech;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.zerototech.controller.PromoController;
import com.zerototech.model.Promotion;
import com.zerototech.repo.PromotionRepository;

public class PromoControllerTest {
	
	@InjectMocks
	private PromoController promoController;
	@Mock
	private PromotionRepository promoRepo;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
  @Test	
  public void testPromotionGet() {
	 
	  Promotion promo = new Promotion();
	  promo.setId(1l);
	  when(promoRepo.findOne(1L)).thenReturn(promo);
	  verify(promoRepo).findOne(1l);
	  assertEquals(1L ,promo.getId());
	  
  }
	
}
