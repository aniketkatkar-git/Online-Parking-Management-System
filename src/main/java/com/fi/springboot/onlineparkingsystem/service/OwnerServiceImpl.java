package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Owner;
import com.fi.springboot.onlineparkingsystem.repository.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService 
{
	@Autowired
	OwnerRepository ownerRepository;

	@Override
	public List<Owner> getAllOwners() 
	{
		return ownerRepository.findAll();
	}

	@Override
	public Owner getOwnerById(long id) 
	{
		return ownerRepository.findById(id).get();
	}


	@Override
	public int login(String userName, String password) 
	{
		List<Owner> owner= ownerRepository.validation(userName, password);

		if(owner.isEmpty())
			return 0;			
		else
			return 1;			
	}


	@Override
	public Owner registerOwner(Owner owner) 
	{
		return ownerRepository.save(owner);
	}

	@Override
	public ResponseEntity<Owner>updateOwner(long id,Owner ownerDetails)
	{
		Owner owner=ownerRepository.findById(id).get();

		owner.setUsername(ownerDetails.getUsername());
		owner.setPassword(ownerDetails.getPassword());
		owner.setFirst_name(ownerDetails.getFirst_name());
		owner.setLast_name(ownerDetails.getLast_name());
		owner.setEmail(ownerDetails.getEmail());
		owner.setContact_no(ownerDetails.getContact_no());
		owner.setAddress(ownerDetails.getAddress());

		final Owner updateOwner=ownerRepository.save(owner);
		return ResponseEntity.ok(updateOwner);
	}

	@Override
	public String deleteOwner(long id) 
	{
		Optional<Owner> owner=ownerRepository.findById(id);
		if(owner.isPresent())
		{
			ownerRepository.delete(owner.get());
			return " Owner is deleted ";
		}
		else
		{
			throw new RuntimeException("Owner not found for the id : "+ id);
		}
	}
}