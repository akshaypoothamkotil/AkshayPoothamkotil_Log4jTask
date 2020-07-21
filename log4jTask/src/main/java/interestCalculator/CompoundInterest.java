package interestCalculator;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;
public class CompoundInterest {
	private static final Logger logger = LogManager.getLogger(CompoundInterest.class);

public double compoundIntrest(double principle,double time,double rate, int coumpoundedAt) {
	  DOMConfigurator.configure("log4j.xml");
		logger.info("compoundIntest Method is running");

    return (principle * Math.pow(1 + (rate / coumpoundedAt), coumpoundedAt * time))-principle;
}
	
}
