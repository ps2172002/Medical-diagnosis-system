package PatienRecord;

public class PatientRecord {
	private String Name;
	private String Phone;
	private String Address;
	private String sex;
	private String age;
	
	public String getAddress() {
		return Address;
	}
	public String getAge() {
		return age;
	}
	public String getName() {
		return Name;
	}
	public String getPhone() {
		return Phone;
	}
	public String getSex() {
		return sex;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

}
