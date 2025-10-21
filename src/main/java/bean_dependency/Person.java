package bean_dependency;

public class Person {
	private String Name="krishna";
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address="hyd";
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", address=" + address + "]";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	
	

}
