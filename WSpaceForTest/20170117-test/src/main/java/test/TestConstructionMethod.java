/**
 * 
 */
package test;

/**
 * @author Administrator
 *
 */
public class TestConstructionMethod {

	/*
	 * public static TestConstructionMethod testConstructionMethod;
	 * 
	 * public TestConstructionMethod() { testConstructionMethod = new
	 * TestConstructionMethod(); }
	 * 
	 * private void showMessage() { // TODO Auto-generated method stub
	 * System.out.println("��Һ�!"); }
	 * 
	 * public static void main(String[] args) {
	 * testConstructionMethod.showMessage(); }
	 */
	public  TestConstructionMethod ww ;
	
/*	{
		System.out.println("static�����");
	}*/
	
	/*public TestConstructionMethod testConstructionMethod = new TestConstructionMethod();*/

	public TestConstructionMethod() {
		System.out.println("dajiahao");
	}

	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("��Һ�!");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		/*Class clazz=Class.forName("test.TestConstructionMethod");*/
		
		TestConstructionMethod  ss=new TestConstructionMethod();
	}
}
