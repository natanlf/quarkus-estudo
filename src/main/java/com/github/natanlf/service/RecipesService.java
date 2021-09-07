package com.github.natanlf.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import com.github.natanlf.entities.ExceptionUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class RecipesService {

	public <T> Optional<T> getAll(Class<T> clazz) throws Exception {
		return ExceptionUtil.exceptionWrapper(() -> {
			System.out.println(clazz.getName());
			return (Optional<T>) Optional.of(getRandomName());
		});
	}
	
	private String getRandomName() {
		log.info("random name");
		Random random = new Random();
		int index = random.nextInt(5);
		List<String> names = Arrays.asList("Monitor", "Teclado", "Mouse", "Gabinete", "Headset");
		log.info("Index ", index);
		return names.get(index);
	}
}
