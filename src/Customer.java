// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.math.BigDecimal;

public class Customer {
	private int customerId, salesmanId;
	private BigDecimal grade;
	private String customerName, city;

	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int _customerId) {
		customerId = _customerId;
	}

	public BigDecimal getGrade() {
		return grade;
	}
	
	public void setGrade(BigDecimal _grade) {
		grade = _grade;
	}

	public int getSalesmanId() {
		return salesmanId;
	}
	
	public void setSalesmanId(int _salesmanId) {
		salesmanId = _salesmanId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String _customerName) {
		customerName = _customerName;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String _city) {
		city = _city;
	}
}