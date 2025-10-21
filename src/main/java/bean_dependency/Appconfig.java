package bean_dependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Appconfig{

	
	@Bean
	public static  CustormBeanFactoryPostProcessor  BeanFactoryPostProcessor() {
		  return new  CustormBeanFactoryPostProcessor ();
	

	}
	@Bean(initMethod="init")
	public Laptop laptop() {
		return new Laptop();
	}
	
	@Bean
	public CustomBeanPostProcessor postprocessing() {
		 return new CustomBeanPostProcessor();
	}
	
	
	
	
	
}
