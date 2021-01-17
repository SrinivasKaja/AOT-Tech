package com.example.AotTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AotTech.dto.response.BaseResponse;
import com.example.AotTech.dto.response.QueryProcessedResponse;
import com.example.AotTech.service.QueryHandleService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/aotinterview")
public class QueryHandleController {

	@Autowired
	private QueryHandleService queryHandleService;

	@GetMapping(value = "/processquery")
	public BaseResponse<QueryProcessedResponse> processQuery(@RequestParam(name = "query")String query, @RequestParam(name="message")String message) {
		return this.queryHandleService.processQuery(query, message);
	}

}
