package e_Chapter04;

// 게임 캐릭터 클래스(GameCharacter)

// 이름(name), 레벨(level), 힘(strength) 속성
// 캐릭터의 정보를 출력(displayInfo) 메서드
// - "Name: " + name + ", Level: " + level + ", Strength: " + strength
// 생성자 - 각 필드의 데이터를 초기화 

class GameCharacter{
	String name;
	int level;
	int strength;
	
	GameCharacter(String name, int level, int strength) {
		this.name = name;
		this.level = level;
		this.strength = strength;
	}
	
	void displayInfo() {
		System.out.println("Name: " + name + ", Level: " + level + ", Strength: " + strength);
	}
}
public class Object05 {

	public static void main(String[] args) {
		// 캐릭터 객체 생성
		GameCharacter Character = new GameCharacter("Warrior", 10, 100);
		
		// "Warrior", 10, 100 초기화
		
		// 캐릭터
		Character.displayInfo();
	}

}
