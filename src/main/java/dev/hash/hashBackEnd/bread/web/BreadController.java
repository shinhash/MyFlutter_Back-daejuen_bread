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
	public List<Map<String, Object>> selectBreadRegionList(@RequestBody HashMap<String, Object> receiveJson) throws Exception {
		List<Map<String, Object>> returnJson = null;
		try {
			returnJson = breadService.selectBreadRegionList();
		}catch (Exception e) { e.printStackTrace(); }

		log.info("================= spring boot selectBreadRegionList success !!! =================");
		return returnJson;
	}
	
	@PostMapping("/bread/area/list")
	public List<Map<String, Object>> selectBreadAreaList(@RequestBody HashMap<String, Object> receiveJson) throws Exception {
		List<Map<String, Object>> returnJson = null;
		try {
			String regionCd = receiveJson.get("regionCd").toString();
			returnJson = breadService.selectBreadAreaList(regionCd);
		}catch (Exception e) { e.printStackTrace(); }
		
		log.info("================= spring boot selectBreadAreaList success !!! =================");
		return returnJson;
	}

	@PostMapping("/bread/store/list")
	public List<Map<String, Object>> selectBreadStoreList(@RequestBody HashMap<String, Object> receiveJson) throws Exception {
		List<Map<String, Object>> returnJson = null;
		try {
			String areaCd = receiveJson.get("areaCd").toString();
			returnJson = breadService.selectBreadStoreList(areaCd);
		}catch (Exception e) { e.printStackTrace(); }
		
		log.info("================= spring boot selectBreadStoreList success !!! =================");
		return returnJson;
	}
}
