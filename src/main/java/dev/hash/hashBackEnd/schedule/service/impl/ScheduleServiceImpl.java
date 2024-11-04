package dev.hash.hashBackEnd.schedule.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.hash.hashBackEnd.schedule.mapper.ScheduleMapper;
import dev.hash.hashBackEnd.schedule.service.ScheduleService;


@Service(value="scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleMapper scheduleMapper;

	@Override
	public List<Map<String, Object>> selectCategoryList() throws Exception {
		return scheduleMapper.selectCategoryList();
	}
	
	@Override
	public List<Map<String, Object>> selectScheduleList() throws Exception {
		return scheduleMapper.selectScheduleList();
	}
}
