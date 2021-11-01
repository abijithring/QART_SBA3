package com.springProg.donations.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProg.donations.dto.DonarDto;
import com.springProg.donations.entity.Donar;
import com.springProg.donations.exceptions.DonarNotFoundException;
import com.springProg.donations.respository.DonarRepository;
import com.springProg.donations.service.DonarService;

@Service
public class DonarServiceImpl implements DonarService{
	
	@Autowired
	private DonarRepository donarRepository;

	@Override
	public DonarDto registerDonar(DonarDto donarDto) {
		Donar donarEntity = new Donar();
		BeanUtils.copyProperties(donarDto, donarEntity);
		Donar donar = donarRepository.save(donarEntity);
		donarDto.setDonarId(donar.getDonarId());
		return donarDto;
	}

	@Override
	public DonarDto updateDonar(DonarDto donarDto) {
		Donar donarEntity = new Donar();
		BeanUtils.copyProperties(donarDto, donarEntity);
		donarRepository.save(donarEntity);
		return donarDto;
	}

	@Override
	public Boolean deleteDonar(Long donarId) {
		DonarDto donarById = getDonarDonarById(donarId);
		Donar donarEntity = new Donar();
		BeanUtils.copyProperties(donarById, donarEntity);
		donarRepository.delete(donarEntity);
		return true;
	}

	@Override
	public DonarDto getDonarDonarById(Long donarId) {
		Optional<Donar> donar = donarRepository.findById(donarId);
		if (donar.isPresent()) {
			DonarDto donarDto = new DonarDto();
			BeanUtils.copyProperties(donar.get(), donarDto);
			return donarDto;
		} else {
			throw new DonarNotFoundException("Donar with id " + donarId + " does not exists");
		}
	}

	@Override
	public List<DonarDto> getAllDonars() {
		List<Donar> donars = donarRepository.findAll();
		List<DonarDto> donarDtos = new ArrayList<>();
		for (Donar entity : donars) {
			DonarDto donarDto = new DonarDto();
            BeanUtils.copyProperties(entity, donarDto);
            donarDtos.add(donarDto);			
		}
		return donarDtos;
	}
	
}

