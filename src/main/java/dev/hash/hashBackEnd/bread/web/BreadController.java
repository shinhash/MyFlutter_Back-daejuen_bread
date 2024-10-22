package dev.hash.hashBackEnd.bread.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class BreadController {

	@RequestMapping(value="/bread/main", method={RequestMethod.POST, RequestMethod.GET})
	public List<Map<String, Object>> selectBreadList(@RequestBody HashMap<String, Object> reqInfo) throws Exception {
		log.info("================= network connection success !!! =================");
		log.info("reqInfo t : " + reqInfo.get("reqInfo").toString());
		
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "tt");
		
		result.add(map);
		
		return result;
	}
}
