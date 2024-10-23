package dev.hash.hashBackEnd.bread.service.impl;

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
	public List<Map<String, Object>> selectBreadRegionList() throws Exception {		
		return breadMapper.selectBreadRegionList();
	}
	
	@Override
	public List<Map<String, Object>> selectBreadAreaList(String regionCd) throws Exception {		
		return breadMapper.selectBreadAreaList(regionCd);
	}

	@Override
	public List<Map<String, Object>> selectBreadStoreList(String areaCd) throws Exception {		
		return breadMapper.selectBreadStoreList(areaCd);
	}

}
