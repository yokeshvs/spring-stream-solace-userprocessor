
package com.yo.prototype.userprocessor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;


@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Function<Flux<User>, Flux<Result>> yokeshDemoEmailUserConsumer() {
		// Add business logic here.
		return userFlux -> userFlux.flatMap(this::validateEmail);
	}

	private Mono<Result> validateEmail(User user) {
		return Mono.just(new Result(!user.getEmail().contains("$"), user.getEmail()));
	}
}
