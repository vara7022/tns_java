package oopsdemo;
class Calculator{
	int add(int a ,int b) {
		return a + b;
	}
	int add(int a , int b, int c) {
		return a + b + c;
	}
}

public class Overloading {

	public static void main(String[] args) {
	
		Calculator calci = new Calculator();
		System.out.println("Two integer sum:"+ calci.add(3, 4));
		System.out.println("Three integer sum:"+calci.add(3,3,4));

	}

}
