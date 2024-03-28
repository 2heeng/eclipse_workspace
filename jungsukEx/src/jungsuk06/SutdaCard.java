package jungsuk06;

public class SutdaCard {

	int num;
	boolean isKwang;

	public SutdaCard() {
	this.num=1;
	this.isKwang=true;
	}
	public SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		}

	
	
	String info() {
		return this.num + (this.isKwang ? "k" : " ");
	}
	

}
