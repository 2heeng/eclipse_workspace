package jungsuk06_Answer;

public class SutdaCard {

	int num;
	boolean isKwang;

	public SutdaCard() {
	this(1,true); //SutdaCard생성자에 변수 두개짜리 부른거임
	}
	public SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		}

	
	String info() {
		return (this.isKwang ? this.num+"K" : " "+this.num);
	}
	

}
