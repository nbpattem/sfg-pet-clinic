package guru.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	
	Owner findByLastName(String lstName);
	

}
