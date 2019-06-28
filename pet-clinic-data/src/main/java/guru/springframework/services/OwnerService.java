package guru.springframework.services;

import java.util.List;

import guru.springframework.model.Owner;

public interface OwnerService {
	
	Owner findById(Long Id);
	void save(Owner owner);
	List<Owner> findAll();
	Owner findByLastName(String lstName);
	

}
