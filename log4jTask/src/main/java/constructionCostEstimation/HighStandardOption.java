package constructionCostEstimation;

public class HighStandardOption{
	private double costPerSquareFeet=1800;
	public double estimate(double SquareFeet) {
		return (SquareFeet*costPerSquareFeet);
	}

}
