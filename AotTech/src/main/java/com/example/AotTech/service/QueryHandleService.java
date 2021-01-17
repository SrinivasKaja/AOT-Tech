package com.example.AotTech.service;

import com.example.AotTech.dto.response.BaseResponse;
import com.example.AotTech.dto.response.QueryProcessedResponse;


public interface QueryHandleService {

	public BaseResponse<QueryProcessedResponse> processQuery(String query, String message);
}
