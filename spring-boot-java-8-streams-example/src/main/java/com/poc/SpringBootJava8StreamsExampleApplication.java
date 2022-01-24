package com.poc;

import com.poc.collecting.CollectExample;
import com.poc.filtering.FilterExample;
import com.poc.mapping.MapExample;
import com.poc.matching.MatchExample;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJava8StreamsExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJava8StreamsExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("======================================================");
		System.out.println("1- Creating a Stream - Example Filtering");
		FilterExample filterExample1 = new FilterExample();
		filterExample1.Example1();

		System.out.println("- Filter en utilisant Object::method ***");
		FilterExample filterExample2 = new FilterExample();
		filterExample2.Example2();

		System.out.println("======================================================");
		System.out.println("2- Creating a Stream - Example Mapping");
		MapExample mapExample1 = new MapExample();
		mapExample1.traditionalApproach();

		MapExample mapExample2 = new MapExample();
		mapExample2.streamApproach();

		System.out.println("======================================================");
		System.out.println("3- Creating a Stream - Example Collecting");
		CollectExample collectExample = new CollectExample();
		collectExample.collectStream();

		System.out.println("======================================================");
		System.out.println("4- Creating a Stream - Example Matching");
		MatchExample matchExample = new MatchExample();
		matchExample.matchStream();
	}
}
