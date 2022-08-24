package Chapter6;

public class Member {
	String name;
	String id;
	String password;
	int age ;
	
	Member() {
		this(null,null); // 힙 영역에 Member라는 클래스를 생성하고 그 주소값 반환
		password ="1234";
	}
	Member(String name) {
		this.name = name;
	}
	Member(String name, String id) {
		this.name = name ;
		this.id = id;
		}

}
