package com.github.natanlf.entities;

import java.util.Optional;
import java.util.function.Supplier;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionUtil {

	public static <T> Optional<T> exceptionWrapper(Supplier<Optional<T>> method) throws Exception {
		try {
			return method.get();
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			log.error("ArrayIndexOutOfBoundsException = ", e);
			throw new Exception("ArrayIndexOutOfBoundsException: "+e.getMessage());
		}
		catch (Exception e) {
			log.error("Exception genérica = ", e);
			throw new Exception("Exception Genérica: "+e.getMessage());
		}
	}
}
