package dev.hash.hashBackEnd.schedule.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScheduleMapper {
	
	public List<Map<String, Object>> selectCategoryList() throws Exception;
	
	public List<Map<String, Object>> selectScheduleList() throws Exception;

}
