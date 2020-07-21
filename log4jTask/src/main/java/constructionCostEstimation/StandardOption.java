package constructionCostEstimation;

public class StandardOption{
	final double costPerSquareFeet=1200;
	public double estimate(double SquareFeet) {
		
		return (SquareFeet*costPerSquareFeet);
	}

}
