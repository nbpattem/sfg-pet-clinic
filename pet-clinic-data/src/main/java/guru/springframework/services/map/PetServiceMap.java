package guru.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.model.Owner;
import guru.springframework.model.Pet;
import guru.springframework.services.OwnerService;
import guru.springframework.services.PetService;

@Service
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService
{

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet save(Pet obj) {
		return super.save( obj);
	}

	@Override
	public void delete(Pet obj) {
		super.delete(obj);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

	
	

}
