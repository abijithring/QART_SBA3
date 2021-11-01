package com.springProg.donations.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springProg.donations.dto.DonationsDto;
import com.springProg.donations.entity.Donations;
import com.springProg.donations.respository.DonationsRepository;
import com.springProg.donations.service.DonationsService;

public class DonationsServiceImpl implements DonationsService{
	
	@Autowired
	DonationsRepository donationsRepository;
	
	@Override
	public DonationsDto placeDonation(DonationsDto donationDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Donations> getAllDonationsOnProductById(Long donationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
