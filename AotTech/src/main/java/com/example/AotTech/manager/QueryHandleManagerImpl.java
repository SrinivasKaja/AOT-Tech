package com.example.AotTech.manager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class QueryHandleManagerImpl implements QueryHandleManager {

	@Override
	public Set<String> checkPalindromes(String message) {
		String[] messageArray = message.split(" ");
		Set<String> palindromeStrings = new HashSet<String>();
		for (String msg : messageArray) {
			StringBuilder sb = new StringBuilder(msg);
			sb.reverse();
			String rev = sb.toString();
			if (msg.equals(rev)) {
				palindromeStrings.add(msg);
			}
		}
		return palindromeStrings;
	}

	@Override
	public Integer queryMatchesCount(String query, String message) {
		return StringUtils.countMatches(message.replace(" ", ""), query);
	}
	
	@Override
	public Integer revQueryMatchesCount(String query, String message) {
		StringBuilder sb = new StringBuilder(query);
		sb.reverse();
		String revQuery = sb.toString();
		return StringUtils.countMatches(message.replace(" ", ""), revQuery);
	}
}
