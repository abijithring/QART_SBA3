package com.springProg.donations.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProg.donations.entity.Donations;

@Repository
public interface DonationsRepository extends JpaRepository<Donations, Long> 
{
	List<Donations> getDonationsByDonarId(Long donationsId);
	List<Donations> findByDonarIdOrderByAmount(Long donationsId);
}
