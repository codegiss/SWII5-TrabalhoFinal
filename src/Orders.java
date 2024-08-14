// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.math.BigDecimal;
import java.sql.Date;

public class Orders {
	private int ordNo, customerId, salesmanId;
	private BigDecimal purchAmt;
	private Date date;
	
	public int getOrdNo() {
		return ordNo;
	}
	
	public void setOrdNo(int _ordNo) {
		ordNo = _ordNo;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int _customerId) {
		customerId = _customerId;
	}
	
	public int getSalesmanId() {
		return salesmanId;
	}
	
	public void setSalesmanId(int _salesmanId) {
		salesmanId = _salesmanId;
	}
	
	public BigDecimal getPurchAmt() {
		return purchAmt;
	}
	
	public void setPurchAmt(BigDecimal _purchAmt) {
		purchAmt = _purchAmt;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date _date) {
		date = _date;
	}
}