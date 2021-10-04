
class Employee {
	public Person me = new Person();
	public String getStreet(){
		return me.home.street;
	}
}
class Person{
	public Address home = new Address();
}
class Address{
	public String street = "Test";
}
