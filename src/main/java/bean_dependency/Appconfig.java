package bean_dependency;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Appconfig{

@Bean
public ModelMapper modelmapper() {
	return new ModelMapper();
}
	

	
	
	
}
