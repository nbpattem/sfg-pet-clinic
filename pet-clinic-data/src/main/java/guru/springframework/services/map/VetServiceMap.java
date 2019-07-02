package guru.springframework.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.model.Owner;
import guru.springframework.model.Vet;
import guru.springframework.services.OwnerService;
import guru.springframework.services.VetService;
@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService
{

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet save(Vet obj) {
		return super.save( obj);
	}

	@Override
	public void delete(Vet obj) {
		super.delete(obj);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

	

	

}
