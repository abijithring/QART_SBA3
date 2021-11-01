package com.springProg.donations.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "ngo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Ngo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ngoId;
	@NotBlank
	@Length(min = 5, max = 30)
	private String ngoName;
	@NotBlank
	@Length(min = 5, max = 30)
	private String ngoUserName;
	@NotBlank
	@Length(min = 5, max = 30)
	private String ngoPassword;
	private String ngoAddress;
	@NotNull
	@Min(1000000000)
	@Max(9999999999L)
	private Long donarPhoneNumber;
	
}
