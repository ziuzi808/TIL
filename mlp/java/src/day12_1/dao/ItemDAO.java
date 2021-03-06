package day12_1.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import day12_1.frame.DAO;
import day12_1.vo.ItemVO;

public class ItemDAO implements DAO<Integer, ItemVO> {

	HashMap<Integer, ItemVO> map;
	
	public ItemDAO() {
		map = new HashMap<Integer, ItemVO>();
	}
	
	@Override
	public void insert(ItemVO v) throws Exception {
		int id = v.getId();
		if(map.containsKey(id)) {
			throw new Exception("ID 존재");
		}
		map.put(id, v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!map.containsKey(k)) {
			throw new Exception("ID 없음");
		}
		map.remove(k);
	}

	@Override
	public void update(ItemVO v) throws Exception {
		if(!map.containsKey(v.getId())) {
			throw new Exception("ID 없음");
		}
		map.put(v.getId(), v);
	}

	@Override
	public ItemVO select(Integer k) throws Exception {
		ItemVO item = null;
		if(!map.containsKey(k)) {
			throw new Exception("ID 없음");
		}
		item = map.get(k);
		return item;
	}

	@Override
	public List<ItemVO> select() throws Exception {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		
		if(map.size() == 0) {
			throw new Exception("데이터가 존재하지않음");
		}
		
		Collection<ItemVO> col = map.values();
		Iterator<ItemVO> it = col.iterator();
		
		while(it.hasNext()) {
			ItemVO item = it.next();
			list.add(item);
		}		
		return list;
	}

}
