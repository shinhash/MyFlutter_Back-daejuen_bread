package dev.hash.hashBackEnd.bread.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.hash.hashBackEnd.bread.service.BreadService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class BreadController {
	
	@Resource(name="breadService")
	private BreadService breadService;
	
	@PostMapping("/bread/region/list")
	public Map<String, Object> selectBreadRegionList(@RequestBody Map<String, Object> receiveJson) throws Exception {
		Map<String, Object> returnJson = new HashMap<>();
		Map<String, Object> dataInfo = new HashMap<>();
		try {
			dataInfo.putAll(receiveJson);
			log.info("dataInfo put all : " + dataInfo.toString());
			returnJson = breadService.selectBreadRegionList(dataInfo);
		}catch (Exception e) { e.printStackTrace(); }

		log.info("================= spring boot selectBreadRegionList success !!! =================");
		return returnJson;
	}
	
	@PostMapping("/bread/area/list")
	public Map<String, Object> selectBreadAreaList(@RequestBody Map<String, Object> receiveJson) throws Exception {
		Map<String, Object> returnJson = new HashMap<>();
		Map<String, Object> dataInfo = new HashMap<>();
		try {
			dataInfo.putAll(receiveJson);
			log.info("dataInfo put all : " + dataInfo.toString());
			returnJson = breadService.selectBreadAreaList(dataInfo);
		}catch (Exception e) { e.printStackTrace(); }
		
		log.info("================= spring boot selectBreadAreaList success !!! =================");
		return returnJson;
	}

	@PostMapping("/bread/store/list")
	public Map<String, Object> selectBreadStoreList(@RequestBody Map<String, Object> receiveJson) throws Exception {
		Map<String, Object> returnJson = new HashMap<>();
		Map<String, Object> dataInfo = new HashMap<>();
		try {
			dataInfo.putAll(receiveJson);
			log.info("dataInfo put all : " + dataInfo.toString());
			returnJson = breadService.selectBreadStoreList(dataInfo);
		}catch (Exception e) { e.printStackTrace(); }
		
		log.info("================= spring boot selectBreadStoreList success !!! =================");
		return returnJson;
	}
}
