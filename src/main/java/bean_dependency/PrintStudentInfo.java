package bean_dependency;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintStudentInfo {
	
	@Autowired
	Person person;
	@Autowired
	Student student;
	
	
	@Autowired 
	ModelMapper modelMapper;
	
	
	
	public void printstudentinfo() {
		
//		student.setAddress(person.getAddress());
//		student.setName(person.getName());
		
		
		modelMapper.map(person,student);
		System.out.println(student.toString());
		
	}

}
