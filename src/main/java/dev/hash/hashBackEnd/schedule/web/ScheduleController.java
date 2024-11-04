package dev.hash.hashBackEnd.schedule.web;

import org.springframework.web.bind.annotation.RestController;

import dev.hash.hashBackEnd.schedule.service.ScheduleService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Slf4j
@RestController
public class ScheduleController {
	
	
	@Resource(name="scheduleService")
	private ScheduleService scheduleService;
	
	@PostMapping("/category/list")
	public Map<String, Object> selectCategoryList(@RequestBody Map<String, Object> receiveJson) throws Exception {
		log.info("================ controller success ================");
		List<Map<String, Object>> resp = new ArrayList<Map<String, Object>>();
		Map<String, Object> respData = new HashMap<>();

		log.info("data : " + receiveJson.toString());
		resp = scheduleService.selectCategoryList();
		respData.put("resp", resp);
		
		return respData;
	}
	
	@PostMapping("/schedule/list")
	public Map<String, Object> selectScheduleList(@RequestBody Map<String, Object> receiveJson) throws Exception {
		log.info("================ controller success ================");
		List<Map<String, Object>> resp = new ArrayList<Map<String, Object>>();
		Map<String, Object> respData = new HashMap<>();

		log.info("data : " + receiveJson.toString());
		resp = scheduleService.selectScheduleList();
		respData.put("resp", resp);
		
		return respData;
	}
	

}
