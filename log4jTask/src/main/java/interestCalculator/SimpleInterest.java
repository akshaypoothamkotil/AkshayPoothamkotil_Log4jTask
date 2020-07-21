package interestCalculator;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;
public class SimpleInterest {
	private static final Logger logger = LogManager.getLogger(CompoundInterest.class);

public double simpleIntrest(double principle,double time,double rate) {
	DOMConfigurator.configure("log4j.xml");
	logger.info("simpleIntest Method is running");
	return (principle*time*rate)/100;
}

}
