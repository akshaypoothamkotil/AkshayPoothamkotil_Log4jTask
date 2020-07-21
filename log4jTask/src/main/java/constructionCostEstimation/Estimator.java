package constructionCostEstimation;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;

public class Estimator {
	 
	
	private static final Logger logger = LogManager.getLogger(Estimator.class);



public double estimateCost(int choice,double SquareFeet,boolean Automated) {
	  DOMConfigurator.configure("log4j.xml");

	logger.info("estimateCost method is running");
	switch(choice) {
	case 1:{
		if(!Automated) {
			StandardOption standard=new StandardOption();
			logger.info("StandardOption without Automation");
			return (standard.estimate(SquareFeet));
		}
		else {
			logger.error("Invalid option 'Automated' is passed for StandardOption returning -1");
			return -1;
		}
	}
	case 2:
	{
		if(!Automated) {
			AboveStandardOption aboveStandard=new AboveStandardOption();
			logger.info("AboveStandardOption without Automation");
			return (aboveStandard.estimate(SquareFeet));
		}
		else {
			logger.error("Invalid option 'Automated' is passed for AboveStandardOption returning -1");
			return -1;
		}
	}
	case 3:{
		if(!Automated) {
			HighStandardOption HighStandardOption =new HighStandardOption();
			logger.info("HighStandardOption without Automation");
			return (HighStandardOption.estimate(SquareFeet));
		}
		else {
			AutomatedHighStandardOption AutomatedHighStandardOption =new AutomatedHighStandardOption();
			logger.info("HighStandardOption with Automation");

			return (AutomatedHighStandardOption.estimate(SquareFeet));
		}
	}
	
	}
	logger.error("Invalid option is passed for Estimator returning -1");

	return -1;
}

}
