package guru.springframework.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractServiceMap<T, ID> {
	
	private Map<ID, T> map = new HashMap<>();
	
	Set<T> findAll() {
		return new HashSet<T>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(ID id, T obj) {
		map.put(id, obj);
		return obj;
	}
	
	void delete(T obj) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}

}
