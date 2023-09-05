package com.kopo.color;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("create")
	public String createTable() {
		//DB 테이블 생성
		DB db = new DB();
		db.createTable();
		return "테이블 생성 완료";
	}
	
	@GetMapping("insert")
	public HashMap<String, String> insertCode(@RequestParam(value="code", defaultValue="")String code) {
		DB db = new DB();
		db.insertData(code);
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("message", "success");
		return result;
	}
	
	@GetMapping("history")
	@ResponseBody
	public ArrayList<Color> history() {
		DB db = new DB();
		ArrayList<Color> result = db.selectData();
		return result;
	}
}
