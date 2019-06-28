package guru.springframework.services;

import java.util.List;

import guru.springframework.model.Pet;

public interface PetService {
	
	Pet findById(Long Id);
	void save(Pet pet);
	List<Pet> findAll();
	

}
