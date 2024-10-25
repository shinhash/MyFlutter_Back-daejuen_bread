package dev.hash.hashBackEnd.bread.service;

import java.util.List;
import java.util.Map;

public interface BreadService {
	
	List<Map<String, Object>> selectBreadRegionList(Map<String, Object> dataInfo) throws Exception;
	
	List<Map<String, Object>> selectBreadAreaList(Map<String, Object> dataInfo) throws Exception;
	
	List<Map<String, Object>> selectBreadStoreList(Map<String, Object> dataInfo) throws Exception;

}
