package dev.hash.hashBackEnd.bread.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BreadMapper {

	List<Map<String, Object>> selectBreadRegionList(Map<String, Object> dataInfo) throws Exception;
	
	List<Map<String, Object>> selectBreadAreaList(Map<String, Object> dataInfo) throws Exception;
	
	List<Map<String, Object>> selectBreadStoreList(Map<String, Object> dataInfo) throws Exception;

}
