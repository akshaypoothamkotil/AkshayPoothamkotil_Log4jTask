package ConstructionCostEstimationTest;

import org.junit.Assert;
import org.junit.Test;
import constructionCostEstimation.Estimator;
public class ConstructionTest {
	
	Estimator Estimator=new Estimator();
	@Test
	public void test0() {
		Assert.assertEquals(15000,Estimator.estimateCost(2,10,false),0);
		
	}
	@Test
	public void test1() {
		Assert.assertEquals(25000,Estimator.estimateCost(3,10,true),0);
	}
	@Test
	public void test2() {
		Assert.assertEquals(-1,Estimator.estimateCost(2,10,true),0);	
	}
	@Test
	public void test3() {
		Assert.assertEquals(18000,Estimator.estimateCost(3,10,false),0);
	}
	@Test
	public void test4() {
		Assert.assertEquals(12000,Estimator.estimateCost(1,10,false),0);
	}
	@Test
	public void test5() {
		Assert.assertEquals(-1,Estimator.estimateCost(1,10,true),0);
	}
	@Test
	public void test6() {
		Assert.assertEquals(-1,Estimator.estimateCost(6,10,true),0);
	}
	
	

}
