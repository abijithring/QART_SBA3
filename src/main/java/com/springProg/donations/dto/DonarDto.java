package com.springProg.donations.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DonarDto {
	
	
	private Long donarId;
	
	public Long getDonarId() {
		return donarId;
	}
	public void setDonarId(Long donarId) {
		this.donarId = donarId;
	}
	@NotBlank
	@Length(min = 5, max = 30)
	private String donarUserName;
	private String donarAddress;
	@NotNull
	@Min(1000000000)
	@Max(9999999999L)
	private Long donarPhoneNumber;
	

}
