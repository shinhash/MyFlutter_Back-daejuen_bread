package dev.hash.hashBackEnd.bread.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BreadMapper {

	List<Map<String, Object>> selectBreadRegionList() throws Exception;
	
	List<Map<String, Object>> selectBreadAreaList(String regionCd) throws Exception;
	
	List<Map<String, Object>> selectBreadStoreList(String areaCd) throws Exception;

}
