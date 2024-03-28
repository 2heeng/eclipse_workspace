package sec02_1;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member implements Serializable {

	String id;
	String name;
	
	public String toString(){
	return this.id + ", " + this.name; }
	
}
