package bean_dependency;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.context.WebApplicationContext;

//import hellospringbootapp.StarterApp;

//import hellospringbootapp.autoconfig.SpringBootCourse;32


@SpringBootApplication
public class StarterApp  {
	
	public static void main(String[] args) {
//SpringApplication springapplication =new SpringApplication(Appconfig.class);
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		
		
		
//		ConfigurableApplicationContext container = springapplication.run(args);
		
//		AnnotationConfigApplicationContext container1=new AnnotationConfigApplicationContext ();
		System.out.println("hello");
		
		Person p=new Person();
		System.out.println(p);
		Student s=new Student();
//		s.setAddress(p.getAddress());
//		s.setName(p.getName());
//		
//		
//		
//		ModelMapper modelmapper= new ModelMapper();
//		modelmapper.map(p,s);
//		
//		
		System.out.println(s);
    }

	
	
}
