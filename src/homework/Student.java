package homework;
//学生类
public class Student implements Comparable<Object>{
	//设置默认学号
	private int ID=100000000;
	//学生姓名
	//private String name;错误编号10，11
	private String name = null;
	//学生生日
	//private String birDay;错误编号10，11
	private String birDay = null;
	//学生性别，true为男
	//private Boolean gender;错误编号10，11
	private Boolean gender = true;

//	public Student(int ID,String name,String birDay,Boolean gender) {
//		this.ID=ID;
//		this.name = name;
//		this.birDay = birDay;
//		this.gender=gender;
//	}
	//设置学号
	public void setID(int id) {
		ID=id;
	}
	//获取学号
	public int getID() {
		return ID;
	}
	//设置姓名
	public void setName(String name) {
		this.name=name;
	}
	//获取姓名
	public String getName() {
		return name;
	}
	//设置生日
	public void setBirDay(String birday) {
		this.birDay=birday;
	}
	//获取生日
	public String getBirDay() {
		return birDay;
	}
	//设置性别
	public void setGender(Boolean gender) {
		this.gender=gender;
	}
	//获取性别
	public Boolean getGender() {
		return gender;
	}
	
	//按学号从小到大排序
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			if (this.ID > s.ID) {
				return 1;
			} else if (this.ID == s.ID) {
				return 0;
			} else {
				return -1;
			}
		}
		return 0;

	}
	
	//打印学生信息
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name +",birDay="+ birDay + ",gender=" + gender + "]";
	}
}
