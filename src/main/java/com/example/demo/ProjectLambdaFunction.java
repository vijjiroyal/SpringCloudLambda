package com.example.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class ProjectLambdaFunction implements Function<String, String> {

	@Override
	public String apply(String input) {
		// TODO Auto-generated method stub
		return input.toUpperCase();
	}

}
