package tns.inherit;

public class Child extends Father{

	int s=9;
	public static void main(String[] args) {
		
		Child c=new Child();
		c.learn();
		System.out.println(c.money);
		System.out.println(c.car);
		System.out.println(c.s);

}
}