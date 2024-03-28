package exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
//import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data //@Getter @Setter가 다 들어있는거임. 따로따로 할 수도 있음. 
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//RequiredArgsConstructor는 기본적으로 매개변수가 없는 생성자를 포함시키지만,
//final 또는 @NonNull이 붙은 필드가 있다면 이 필드만 초기화 시키는 생성자를 갖고있다.
public class Member {

	@NonNull
	private String id;
	private String name;
	private int age;
	
	
//	public Member(String id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}
	// -> AllArgsConstructor로 할 수 있음. 
	
//	@Override
//	public String toString() {
//		
//		return "회원 ID : " + this.id + "회원 이름 : " + this.name + "회원 나이 : " + this.age ;
//	}
	
}
