package test;

import static org.junit.Assert.*;

import org.junit.Test;

import discount.DiscountStrategy;
import discount.Order;
import discount.RandomDiscountStrategy;

public class OrderTestRandomDiscount {


	//test that the random discount does not apply discounts of less than 0% or greater than 100%

	@Test
	public void randomDiscountTest1() {

		double percentageOfTimesWithinBounds = 0;
		int repeat = 1000;
		int withinBounds = 0;

		for (int i = 0; i<repeat; i++) {
			Order order = new Order("Shane", 444.0f);

		    DiscountStrategy strategy = new RandomDiscountStrategy();
		    float discounted = strategy.applyDiscount(order);

		    if (discounted >= 0 || discounted <= 444) {
		    	withinBounds++;
		    }
		}

		percentageOfTimesWithinBounds = (withinBounds/repeat)*100;
		
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(100,percentageOfTimesWithinBounds,0);
	}

}
