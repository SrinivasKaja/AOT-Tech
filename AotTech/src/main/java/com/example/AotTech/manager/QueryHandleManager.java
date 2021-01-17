package com.example.AotTech.manager;

import java.util.Set;

public interface QueryHandleManager {
	public Set<String> checkPalindromes(String message);

	public Integer queryMatchesCount(String query, String message);

	public Integer revQueryMatchesCount(String query, String message);
}
