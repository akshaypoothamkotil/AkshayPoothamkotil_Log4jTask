package constructionCostEstimation;

public class AboveStandardOption{
	private double costPerSquareFeet=1500;
	public double estimate(double SquareFeet) {
		return (SquareFeet*costPerSquareFeet);
	}

}
