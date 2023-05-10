package myspring.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class DtoBankTransfer {

	private int code;

	private int accountNumFrom;

	private int accountNumTo;

	private double sumOfTransfer;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getAccountNumFrom() {
		return accountNumFrom;
	}
	public void setAccountNumFrom(int accountNumFrom) {
		this.accountNumFrom = accountNumFrom;
	}
	public int getAccountNumTo() {
		return accountNumTo;
	}
	public void setAccountNumTo(int accountNumTo) {
		this.accountNumTo = accountNumTo;
	}
	public double getSumOfTransfer() {
		return sumOfTransfer;
	}
	public void setSumOfTransfer(double sumOfTransfer) {
		this.sumOfTransfer = sumOfTransfer;
	}
	public Date getDateOfTransfer() {
		return dateOfTransfer;
	}
	public void setDateOfTransfer(Date dateOfTransfer) {
		this.dateOfTransfer = dateOfTransfer;
	}
	private Date dateOfTransfer;
	

}
