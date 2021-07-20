class Cat extends Animal {

	public Cat (String name){
		this.name = name;
	}

	public void makeSound (){
		System.out.println(this.name + " made a sound!");
	};
}

class Dog extends Animal {

	public Dog (String name){
		// super(nameOfDog);

		this.name = name;
	}

	public void makeSound (){
		System.out.println(this.name + " made a sound!");
	};
}

public class TestClass {

	public static void main (String[] args){
		System.out.println("Hello world");

		Cat c1 = new Cat("Mittens");
		Dog d1 = new Dog("Doggo");

		c1.makeSound();
		d1.makeSound();

		System.out.println("The name of the cat is: " + c1.name);
		System.out.println("The name of the dog is: " + d1.name);



	}
}