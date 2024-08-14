// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.math.BigDecimal;

public class Salesman {
	private int id;
	private BigDecimal commission;
	private String name, city;

	public int getId() {
		return id;
	}
	
	public void setId(int _id) {
		id = _id;
	}

	public BigDecimal getCommission() {
		return commission;
	}
	
	public void setCommission(BigDecimal _comission) {
		commission = _comission;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		name = _name;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String _city) {
		city = _city;
	}
}