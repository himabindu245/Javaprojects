package xyz;

public class Animal {
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class cat extends Animal{
	void sound() {
		System.out.println("cat meows");
	}
}
class Main{
	public static void main(String[] args) {
		Animal a1=new Animal();				
		Animal a2=new Dog();
		Animal a3=new cat();
		a1.sound();
		a2.sound();
		a3.sound();
	}
}
