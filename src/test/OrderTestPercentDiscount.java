package test;

import static org.junit.Assert.*;

import org.junit.Test;

import discount.DiscountStrategy;
import discount.Order;
import discount.PercentDiscountStrategy;

public class OrderTestPercentDiscount {




	//test range of discount percentages

	@Test
	public void percentageDiscountTest1() {
		Order order = new Order("Shane", 444.0f);
		float amt = 0;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(444,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest2() {
		Order order = new Order("Shane", 444.0f);
		float amt = 25;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(333,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest3() {
		Order order = new Order("Shane", 444.0f);
		float amt = 50;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(222,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest4() {
		Order order = new Order("Shane", 444.0f);
		float amt = 75;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(111,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest5() {
		Order order = new Order("Shane", 444.0f);
		float amt = 100;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(0,discounted,0.01);
	}



	//Test that discount is bounded by 0% and 100%

	@Test
	public void percentageDiscountTest6() {
		Order order = new Order("Shane", 444.0f);
		float amt = -1000;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(444,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest7() {
		Order order = new Order("Shane", 444.0f);
		float amt = 1000;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(0,discounted,0.01);
	}



	//Test accuracy of percentage discount

	@Test
	public void percentageDiscountTest8() {
		Order order = new Order("Shane", 100.0f);
		float amt = 0.01f;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(99.99,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest9() {
		Order order = new Order("Shane", 100.0f);
		float amt = 33.33f;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(66.67,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest10() {
		Order order = new Order("Shane", 100.0f);
		float amt = 66.66f;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(33.34,discounted,0.01);
	}

	@Test
	public void percentageDiscountTest11() {
		Order order = new Order("Shane", 100.0f);
		float amt = 99.99f;
		
	    DiscountStrategy strategy = new PercentDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(0.01,discounted,0.01);
	}

}
