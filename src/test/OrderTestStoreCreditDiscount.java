package test;

import static org.junit.Assert.*;

import org.junit.Test;

import discount.DiscountStrategy;
import discount.Order;
import discount.StoreCreditDiscountStrategy;

public class OrderTestStoreCreditDiscount {



	//test range of credit discounts 

	@Test
	public void creditDiscountTest1() {
		Order order = new Order("Shane", 444.0f);
		float amt = 0;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(444,discounted,0.01);
	}

	@Test
	public void creditDiscountTest2() {
		Order order = new Order("Shane", 444.0f);
		float amt = 111;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(333,discounted,0.01);
	}

	@Test
	public void creditDiscountTest3() {
		Order order = new Order("Shane", 444.0f);
		float amt = 222;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(222,discounted,0.01);
	}

	@Test
	public void creditDiscountTest4() {
		Order order = new Order("Shane", 444.0f);
		float amt = 333;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(111,discounted,0.01);
	}

	@Test
	public void creditDiscountTest5() {
		Order order = new Order("Shane", 444.0f);
		float amt = 444;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(0,discounted,0.01);
	}



	//Test that discount is bounded by 0 and the order price

	@Test
	public void creditDiscountTest6() {
		Order order = new Order("Shane", 444.0f);
		float amt = -1000;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(444,discounted,0.01);
	}

	@Test
	public void creditDiscountTest7() {
		Order order = new Order("Shane", 444.0f);
		float amt = 1000;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(0,discounted,0.01);
	}



	//Test accuracy of credit discount

	@Test
	public void creditDiscountTest8() {
		Order order = new Order("Shane", 100.0f);
		float amt = 0.01f;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(99.99,discounted,0.01);
	}

	@Test
	public void creditDiscountTest9() {
		Order order = new Order("Shane", 100.0f);
		float amt = 33.33f;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(66.67,discounted,0.01);
	}

	@Test
	public void creditDiscountTest10() {
		Order order = new Order("Shane", 100.0f);
		float amt = 66.66f;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(33.34,discounted,0.01);
	}

	@Test
	public void creditDiscountTest11() {
		Order order = new Order("Shane", 100.0f);
		float amt = 99.99f;
		
	    DiscountStrategy strategy = new StoreCreditDiscountStrategy(amt);
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(0.01,discounted,0.01);
	}

}
