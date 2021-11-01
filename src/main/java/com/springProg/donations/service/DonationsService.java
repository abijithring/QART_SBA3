package com.springProg.donations.service;

import java.util.List;

import com.springProg.donations.dto.DonationsDto;
import com.springProg.donations.entity.Donations;

public interface DonationsService {
	public DonationsDto placeDonation(DonationsDto donationDto);
	public List<Donations> getAllDonationsOnProductById(Long donationId);
}
