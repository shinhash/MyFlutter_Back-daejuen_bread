package dev.hash.hashBackEnd.bread.service.impl;

import java.util.HashMap;
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
	public Map<String, Object> selectBreadRegionList(Map<String, Object> dataInfo) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("breadRegionInfo", breadMapper.selectBreadRegionList(dataInfo));
		return resultMap;
	}
	
	@Override
	public Map<String, Object> selectBreadAreaList(Map<String, Object> dataInfo) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("breadAreaInfo", breadMapper.selectBreadAreaList(dataInfo));
		return resultMap;
	}

	@Override
	public Map<String, Object> selectBreadStoreList(Map<String, Object> dataInfo) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("breadAreaInfo", breadMapper.selectBreadAreaList(dataInfo));
		resultMap.put("breadStoreInfo", breadMapper.selectBreadStoreList(dataInfo));
		return resultMap;
	}

}
