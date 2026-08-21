package org.example.springbootpractice;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringBootPracticeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootPracticeApplication.class, args);
		SpringApplication app = new SpringApplication(SpringBootPracticeApplication.class);
		app.setBanner(new Banner() {
			@Override
			public void printBanner(Environment environment, @Nullable Class<?> sourceClass, PrintStream out) {
				out.println("================================================");
				out.println("======= Enterprise Payment System =======");
				out.println("================================================");
			}
		});
		app.run(args);

	}

}
