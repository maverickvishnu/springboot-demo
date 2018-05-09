package com.zerototech;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.zerototech.model.Promotion;
import com.zerototech.repo.PromotionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class PromoControllerIntegrationTest {

	@Autowired
	PromotionRepository promoRepo;
	@Test
	public void findAll() {
		List<Promotion> list = promoRepo.findAll();
		assertThat(list.size() ,is(greaterThanOrEqualTo(0)));
	}
}
