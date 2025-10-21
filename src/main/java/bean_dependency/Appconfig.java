package bean_dependency;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Appconfig{

@Bean
public ModelMapper modelmapper() {
	return new ModelMapper();
}
	

@Bean(autowireCandidate=false)
public SRK srk() {
	return new SRK();
}

@Bean(name= {"mahesh","babu"})
public Maheshbabu mahesh() {
	return new Maheshbabu();
//}bean_dependency.Maheshbabu
}
	
@Bean(autowireCandidate=false)
public KK kk() {
	return new KK();
}

@Bean
public Film film(@Autowired  Actor actor) {
	return new Film(actor);
}


	
	
}
