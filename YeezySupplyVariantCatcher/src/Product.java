
public class Product {
	private String Name;
	private double SizeShoe;
	private char SizeClothing;
	private int VariantId;
	private int Sku;
	
	public Product()
	{
		
	}
	
	//Product Getters
	public String getName() {
		return Name;
	}
	public double getSizeShoe() {
		return SizeShoe;
	}
	public char getSizeClothing() {
		return SizeClothing;
	}
	public int getVariantId() {
		return VariantId;
	}
	public int getSku() {
		return Sku;
	}
	
	
	//Product Setters
	public void setName(String x)
	{
		Name=x;
	}
	public void setVariantId(int x)
	{
		VariantId=x;
	}
	public void setSizeClothing(char x)
	{
		SizeClothing=x;
	}
	public void setSizeShoe(double x)
	{
		SizeShoe=x;
	}
	public void setSku(int x)
	{
		Sku=x;
	}
	
	
}
