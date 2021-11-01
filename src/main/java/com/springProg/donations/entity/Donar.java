package com.springProg.donations.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "donar")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Donar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long donarId;
	public Long getDonarId() {
		return donarId;
	}
	public void setDonarId(Long donarId) {
		this.donarId = donarId;
	}
	@NotBlank
	@Length(min = 5, max = 30)
	private String donarName;
	@NotBlank
	@Length(min = 5, max = 30)
	private String donarUserName;
	@NotBlank
	@Length(min = 5, max = 30)
	private String donarPassword;
	private String donarAddress;
	@NotNull
	@Min(1000000000)
	@Max(9999999999L)
	private Long donarPhoneNumber;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donar")
	@JsonIgnore
	private Set<Donations> donations = new HashSet<>();

}
