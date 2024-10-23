package dev.hash.hashBackEnd.bread.service;

import java.util.List;
import java.util.Map;

public interface BreadService {
	
	List<Map<String, Object>> selectBreadRegionList() throws Exception;
	
	List<Map<String, Object>> selectBreadAreaList(String regionCd) throws Exception;
	
	List<Map<String, Object>> selectBreadStoreList(String areaCd) throws Exception;

}
