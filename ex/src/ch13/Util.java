package ch13;

public class Util {

	 static <K,V> V getValue(Pair<K,V> p, K key) {
			
		 if(p.getKey()==key) {
			 return p.getValue();
		 }
		 else {return null;}
		}
	}

	
	//내가한거
// static <K,V> V getValue(Pair<K,V> p, String key) {
//		
//	 if(key.equals(p.getKey()) ) {
//		 return p.getValue();
//	 }
//	 else {return null;}
//	}
//}
