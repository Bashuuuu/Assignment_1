package day_2;
public class Employee {
	private int eid;
	private String  name;
	private String city;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String toString() {
		return "Employee[eid="+eid+" : name="+name+" : city="+city+"]";
	}
}
