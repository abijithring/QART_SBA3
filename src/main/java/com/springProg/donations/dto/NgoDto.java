package com.springProg.donations.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.springProg.donations.entity.Donar;

public class NgoDto {

	private Long donarId;
	public Long getDonarId() {
		return donarId;
	}
	public void setDonarId(Long donarId) {
		this.donarId = donarId;
	}
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public String getNgoAddress() {
		return ngoAddress;
	}
	public void setNgoAddress(String ngoAddress) {
		this.ngoAddress = ngoAddress;
	}
	public BigDecimal getDonarPhoneNumber() {
		return donarPhoneNumber;
	}
	public void setDonarPhoneNumber(BigDecimal donarPhoneNumber) {
		this.donarPhoneNumber = donarPhoneNumber;
	}
	public Donar getDonar() {
		return donar;
	}
	public void setDonar(Donar donar) {
		this.donar = donar;
	}
	@NotNull
	@Length(min = 3, max = 30)
	private String ngoName;
	private String ngoAddress;
	@NotNull
	@Min(1000000000)
	@Max(9999999999L)
	private BigDecimal donarPhoneNumber;
	private Donar donar;

}
