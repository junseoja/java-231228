package j_Chapter09;

// 다형성
// Animal, Cat, Dog 클래스
// Animal 클래스: sound메서드 (The animal makes a sound)
// Cat, Dog 클래스 - Animal 클래스를 상속
// : sound 메서드를 오버라이딩 >> 각각 "meow", "bark" 출력

// instanceof 연산자
// AnimalChecker 클래스 선언
// : Animal, Cat, Dog 클래스르 사용하여 다형성을 확인하는 메서드 작성
// : checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
// : Cat > 'cat' 출력 / Dog > 'dog'출력 / 둘 다 x > 'Unknown animal type'

class Animal1 {
	void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal {
	void animalSound() {
		System.out.println("meow");
	}
}

class Dog1 extends Animal {
	void animalSound() {
		System.out.println("bark");
	}
}

public class Z_Practice01 {
	public static void main(String[] args) {
//		Animal,Cat,Dog 클래스의 객체를 Animal 타입으로 저장
//		 생성된 각 객체를 checkAnimalType 메서드를 사용하여 확인
		Animal myAnimal = new Animal();
		Animal myCat = new Animal();
		Animal myDog = new Dog();
		
		if (myCat instanceof Cat) {
			System.out.println("cat");
		}
		
		if (myDog instanceof Dog) {
			System.out.println("dog");
		} else {
			System.out.println("Unknown animal type");
		}
	}
}
