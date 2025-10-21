package bean_dependency;

import org.springframework.context.annotation.Primary;


public class SRK implements Actor{

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("hello am srk");
		System.out.println("am acting......");
	}

}
