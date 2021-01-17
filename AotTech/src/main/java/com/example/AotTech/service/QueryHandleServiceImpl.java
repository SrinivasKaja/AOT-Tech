package com.example.AotTech.service;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AotTech.dto.response.BaseResponse;
import com.example.AotTech.dto.response.QueryProcessedResponse;
import com.example.AotTech.enums.StatusCode;
import com.example.AotTech.manager.QueryHandleManager;

@Service
public class QueryHandleServiceImpl implements QueryHandleService {

	@Autowired
	private QueryHandleManager queryHandleManager;

	@Override
	public BaseResponse<QueryProcessedResponse> processQuery(String query, String message) {
		Set<String> palindromes = this.queryHandleManager.checkPalindromes(message);
		Integer queryMatchingCount = this.queryHandleManager.queryMatchesCount(query, message);
		Integer revQueryMatchesCount = this.queryHandleManager.revQueryMatchesCount(query, message);
		return new BaseResponse<QueryProcessedResponse>(StatusCode.SC_OK.getCode(), StatusCode.SC_OK.getMessage(),
				QueryProcessedResponse.builder().palindromeStrings(palindromes).queryMathchesCount(queryMatchingCount)
						.revQueryMatchesCount(revQueryMatchesCount).build());
	}

}
