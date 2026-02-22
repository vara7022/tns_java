package oopsdemo;

class Device {
	void deviceType() {
		System.out.println("I am a Electronic gadget");
	}
}
	
class  Phone extends Device{
	void brand() {
		System.out.println("brand:samsung");
	}
}
class SmartPhone extends Phone {
	void features() {
		System.out.println("Features: TouchScreen, Camera,Microphone");
	}
}
	
public class MultiLevelnheritence {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.deviceType();
		phone.brand();
		phone.features();

	}

}
