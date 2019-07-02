package guru.springframework.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import guru.springframework.model.BaseEntity;

public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> {
	
	private Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll() {
		return new HashSet<T>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T obj) {
		if ( obj != null) {
			System.out.println(obj.getId());
			if( obj.getId() != null) {
				map.put(obj.getId(), obj);
			}else {
				obj.setId(nextKey());
				map.put(obj.getId(), obj);
			}
		}
		return obj;
	}
	
	void delete(T obj) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	private Long nextKey() {
		System.out.println("size is:"+map.values().size());
		return new Long(map.values().size())+1;
	}

}
