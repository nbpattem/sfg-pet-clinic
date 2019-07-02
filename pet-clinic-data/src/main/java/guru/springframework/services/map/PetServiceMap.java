package guru.springframework.services.map;

import java.util.Set;

import guru.springframework.model.Owner;
import guru.springframework.model.Pet;
import guru.springframework.services.OwnerService;
import guru.springframework.services.PetService;

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
		return super.save(obj.getId(), obj);
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
