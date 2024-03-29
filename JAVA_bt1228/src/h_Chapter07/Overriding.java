package h_Chapter07;

// 오버라이딩

//! 오버라이딩의 정의
// : 자식 클래스가 부모 클래스에서 정의된 메서드를 자신의 상황에 맞게 재정의
// : 상송관계에 있는 클래스들 사이에서 사용

//! 오버라이딩의 특징
// - 메서드의 시그니처가 일치
//   : 부모 클래스에서 정의된 메서드와 동일한 이름, 매개변수 구성을 가져야 함.
// - 반환타입
//   : 부모 클래스의 메서드 반환 타입과 같거나 자동 형변환이 가능한 것이어야 함.
// - @Override(어노테이션)
//   : 오버라이딩된 메서드임을 명시적으로 표시

//! 오버라이딩의 구현 방법
// 1. 부모 클래스의 상속받은 메서드를 하위 클래스에서 다시 정의
// 2. 메서드의 이름, 반환 타입, 매개변수가 부모 클래스의 메서드와 동일하게 작성
//       : 자식 클래스의 특성에 맞는 구현부를 재정의 
// 3. @Override 어노테이션을 메서드 위에 작성

//! 오버라이딩을 사용하는 이유
// 1. 다형성을 구현
// : 하나의 이름으로 여러 기능을 수행가능한 코드를 작성

// 2. 재사용성과 확장성 향상
// : 기존 코드를 변경하지 않고, 새로운 기능을 추가하거나 기존 기능을 변경 가능
class Animal2 {
	 void sound() {
		System.out.println("동물이 소리를 냅니다.");
		
	}
}

class Dog2 extends Animal2 {
	// 오버라이딩 어노테이션
	// : 코드에 메타데이터를 제공하는 방법
	// @Override
	// : 현재 메서드가 부모 클래스의 메서드를 오버라이딩한다는 것을 명시
	@Override
	void sound() {
		System.out.println("개가 멍멍하고 짖습니다.");
	}
}

class Cat2 extends Animal2 {
	@Override
	void sound() {
		System.out.println("고양이가 야옹하고 짖습니다.");
	}
}
public class Overriding {
	public static void main(String[] args) {
		// 오버로딩 VS 오버라이딩
		// : 모두 메서드의 이름을 재사용하는 방법
		
		// 1. 오버로딩
		// - 같은 클래스 내에서 같은 이름을 가진 메서드를 여러 개 정의
		// - 메서드 이름은 같아야 하지만 
		// , 매개변수의 타입, 개수, 순서 중 적어도 하나는 달라야 함
		// : 메서드의 동작을 다양한 상황에 맞게 조정
		// 2. 오버라이딩
		// - 상송관계에 있는 클래스에서 사용
		// - 메서드의 시그니처(이름, 매개변수, 반환 타입)이 같아야 한다.
		// , @Override 어노테이션을 사용(컴파일러 오버라이딩 됨을 전달)
		// : 메서드의 동작을 변경하거나 확장
	}
}
