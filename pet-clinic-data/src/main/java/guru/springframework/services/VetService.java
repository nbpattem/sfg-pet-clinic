package guru.springframework.services;

import java.util.List;

import guru.springframework.model.Vet;

public interface VetService {
	
	Vet findById(Long Id);
	void save(Vet vet);
	List<Vet> findAll();
	

}
