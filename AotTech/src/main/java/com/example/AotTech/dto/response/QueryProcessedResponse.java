package com.example.AotTech.dto.response;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonDeserialize(builder = QueryProcessedResponse.QueryProcessedResponseBuilder.class)
public class QueryProcessedResponse implements Serializable {
	private Set<String> palindromeStrings;
	private Integer queryMathchesCount;
	private Integer revQueryMatchesCount;
}
