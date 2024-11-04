package dev.hash.hashBackEnd.schedule.service;

import java.util.List;
import java.util.Map;

public interface ScheduleService {

	public List<Map<String, Object>> selectCategoryList() throws Exception;
	
	public List<Map<String, Object>> selectScheduleList() throws Exception;

}
