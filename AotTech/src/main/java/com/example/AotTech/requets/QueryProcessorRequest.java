package com.example.AotTech.requets;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@JsonDeserialize(builder = QueryProcessorRequest.QueryProcessorRequestBuilder.class)
public class QueryProcessorRequest{

	private String query;
	private String message;

}
