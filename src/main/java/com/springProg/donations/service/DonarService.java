package com.springProg.donations.service;

import java.util.List;

import com.springProg.donations.dto.DonarDto;

public interface DonarService {
	public DonarDto registerDonar(DonarDto donarDto);
	public DonarDto updateDonar(DonarDto donarDto);
	public Boolean deleteDonar(Long donarId);
	public DonarDto getDonarDonarById(Long serlerid);
	public List<DonarDto> getAllDonars();

}
