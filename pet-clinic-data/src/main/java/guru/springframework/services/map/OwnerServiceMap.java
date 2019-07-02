package guru.springframework.services.map;

import java.util.Set;

import guru.springframework.model.Owner;
import guru.springframework.services.OwnerService;

public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService
{

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner save(Owner obj) {
		return super.save(obj.getId(), obj);
	}

	@Override
	public void delete(Owner obj) {
		super.delete(obj);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

	@Override
	public Owner findByLastName(String lstName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
