package com.springProg.donations.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.springProg.donations.entity.Donations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DonationsDto {
	
	private Long donarId;
	private Long ngoId;
	private String donationType;
	@Digits(fraction = 0, integer = 10)
	private BigDecimal amount;
	@Future
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate donationDate;
	private Donations donations;
	

}
