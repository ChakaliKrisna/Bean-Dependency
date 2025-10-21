package bean_dependency;

public class Student {
	
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", address=" + address + "]";
	}

}
