package jungsuk09;

public class SutdaCard {

	int   num;
	boolean   isKwang; 
	
	SutdaCard()   {
	this(1,   true); 
	}
	
	SutdaCard(int   num,    boolean   isKwang)   { 
	this.num   =   num;
	this.isKwang   =   isKwang; 
	}
	
	public   boolean   equals(Object   obj)   {
		if(obj instanceof SutdaCard) {
			SutdaCard sutdaCard =(SutdaCard)obj;
			if(sutdaCard.num == this.num && sutdaCard.isKwang==this.isKwang){
				return true;
			}
		} return false;
		//여기에 작성하시오
	}
	
	public   String   toString()   {
		return   num   +   (   isKwang   ?    "K":""); 
		}
	
	
	
}
