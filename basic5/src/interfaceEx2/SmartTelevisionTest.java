package interfaceEx2;

public class SmartTelevisionTest {

	public static void main(String[] args) {
		
		RemoteControl rc=new SmartTelevision();
		rc.turnOn();
		rc.turnOff();

		Searchable searchable=new SmartTelevision();
		searchable.search("www.naver.com");
	}

}
