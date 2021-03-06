package io.github.vixo341.simpletodoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.management.DefaultLoaderRepository;


@SpringBootApplication
public class SimpleTodoAppApplication implements RepositoryRestConfigurer {


	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}


	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		validatingListener.addValidator("beforeCreate", validator());
		validatingListener.addValidator("beforeSave", validator());

	}



	public static void main(String[] args) {
		SpringApplication.run(SimpleTodoAppApplication.class, args);
	}

}
