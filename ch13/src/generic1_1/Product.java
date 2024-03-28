package generic1_1;

import lombok.Data;

@Data
public class Product <T,M> {

	//제품
	private T kind;
	
	//모델
	private M  model;
}
