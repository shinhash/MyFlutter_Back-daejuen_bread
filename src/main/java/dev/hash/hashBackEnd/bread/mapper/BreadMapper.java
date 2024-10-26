package dev.hash.hashBackEnd.bread.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BreadMapper {
	
	public List<Map<String, Object>> selectBreadRegionList(Map<String, Object> dataInfo) throws Exception;
	
	public List<Map<String, Object>> selectBreadAreaList(Map<String, Object> dataInfo) throws Exception;
	
	public List<Map<String, Object>> selectBreadStoreList(Map<String, Object> dataInfo) throws Exception;
}
