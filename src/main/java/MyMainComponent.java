public class MyMainComponent {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		MyMainComponent myMainComponent = new MyMainComponent();
		myMainComponent.method1();

		MySecondComponent mySecondComponent = new MySecondComponent();
		mySecondComponent.method2();
	}


	public void method1(){
		System.out.println("I am called from main method");
	}
}
