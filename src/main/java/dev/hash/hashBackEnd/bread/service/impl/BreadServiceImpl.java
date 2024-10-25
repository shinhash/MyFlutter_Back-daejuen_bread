package dev.hash.hashBackEnd.bread.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import dev.hash.hashBackEnd.bread.mapper.BreadMapper;
import dev.hash.hashBackEnd.bread.service.BreadService;
import jakarta.annotation.Resource;


@Service(value="breadService")
public class BreadServiceImpl implements BreadService {
	
	@Resource(name="breadMapper")
	private BreadMapper breadMapper;
	
	@Override
	public List<Map<String, Object>> selectBreadRegionList(Map<String, Object> dataInfo) throws Exception {
		return breadMapper.selectBreadRegionList(dataInfo);
	}
	
	@Override
	public List<Map<String, Object>> selectBreadAreaList(Map<String, Object> dataInfo) throws Exception {
		return breadMapper.selectBreadAreaList(dataInfo);
	}

	@Override
	public List<Map<String, Object>> selectBreadStoreList(Map<String, Object> dataInfo) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("regionCd", "CJ_C001");
		map.put("areaCd", "CA001");
		System.out.println(map);
		return breadMapper.selectBreadStoreList(map);
	}

}
