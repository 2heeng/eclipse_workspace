package jungsuk12;

public class jungsuk12_1 {

	public static void main(String[] args) {
		//Box<Object>    b    =    (Object) new   Box<String>();
		
		//new   Box<String>().setItem(new    Object());
		
	    new   Box<String>().setItem("ABC");
	}
}

class Box<T> {
	T item;

	void setItem(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}
}