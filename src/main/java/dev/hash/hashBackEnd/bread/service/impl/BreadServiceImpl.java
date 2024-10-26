package dev.hash.hashBackEnd.bread.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.hash.hashBackEnd.bread.mapper.BreadMapper;
import dev.hash.hashBackEnd.bread.service.BreadService;


@Service(value="breadService")
public class BreadServiceImpl implements BreadService {
	
	@Autowired
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
		return breadMapper.selectBreadStoreList(dataInfo);
	}

}
