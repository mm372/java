public abstract class people {
	private int age;
	private String city = "����";
	public people() {}
	
	public people(int age,String city) {
		this.age = age;
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public void show() {
		System.out.print(city+"��"+age+"��");
		
	}
	public abstract void eat();

}
