package ReviewClass;

public class Marketing {
private String employeeName, productName;
double saleAmmount;
@Override
public String toString() {
	return "Marketing [employeeName=" + employeeName + ", productName=" + productName + ", saleAmmount=" + saleAmmount
			+ "]";
}
public Marketing(String employeeName, String productName, double saleAmmount) {
	super();
	this.employeeName = employeeName;
	this.productName = productName;
	this.saleAmmount = saleAmmount;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getSaleAmmount() {
	return saleAmmount;
}
public void setSaleAmmount(double saleAmmount) {
	this.saleAmmount = saleAmmount;
}
Marketing(String employeeName, String productName){
	this.employeeName = employeeName;
	this.productName = productName;
	
}
public void setSale(int saleAmount) {
	this.saleAmmount = saleAmount;
}
}
