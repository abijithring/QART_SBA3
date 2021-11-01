package com.springProg.donations.respository;

import com.springProg.donations.entity.Ngo;

public interface NgoRepository {

	Ngo getNgoByNgoName(String NgoName);
}
