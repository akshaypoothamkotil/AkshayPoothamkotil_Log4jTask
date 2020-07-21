package intrestTest;

import org.junit.Assert;
import org.junit.Test;
import interestCalculator.CompoundInterest;
public class CompoundIntrestTest {
	CompoundInterest CompoundInterestObj=new CompoundInterest();
	@Test
	public void test() {
		Assert.assertEquals(979.6914166032102, CompoundInterestObj.compoundIntrest(2000, 5, .08, 12),0);

	}

}
