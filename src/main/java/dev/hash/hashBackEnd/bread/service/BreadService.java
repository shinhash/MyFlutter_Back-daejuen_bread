package dev.hash.hashBackEnd.bread.service;

import java.util.Map;

public interface BreadService {
	
	Map<String, Object> selectBreadRegionList(Map<String, Object> dataInfo) throws Exception;
	
	Map<String, Object> selectBreadAreaList(Map<String, Object> dataInfo) throws Exception;
	
	Map<String, Object> selectBreadStoreList(Map<String, Object> dataInfo) throws Exception;

}
