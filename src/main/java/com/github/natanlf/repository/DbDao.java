package com.github.natanlf.repository;

import java.util.Optional;

public class DbDao {
	
	 public <T> Optional<T> getAll(Class<T> clazz) {
		return (Optional<T>) Optional.of(clazz.getClass().toString());
		 
	 }
}
