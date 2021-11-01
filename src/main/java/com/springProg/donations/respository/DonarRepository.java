package com.springProg.donations.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springProg.donations.entity.Donar;

@Repository
public interface DonarRepository extends JpaRepository<Donar, Long> {
	
	Donar getDonarByDonarName(String DonarName);

}
