package homework;
//测试类

public class SMTest {
//主函数	
	public static void main(String[] args) {
		//创建学生管理类对象sm
		StudentManager sm = new StudentManager();
		//sm初始化数组
		sm.init();
		//调用学生管理类操作函数
		sm.app();
//		sm.insert();
	}
}