import java.util.Arrays;


public class HashTable2 {
	
	private int size = 0;
	private String[] fr;
	private String[] eng;
	
	public HashTable2(int capacity) { // constructor method
		
		this.fr = new String[capacity];
		this.eng = new String[capacity];
		
	}
	
	public void put(String key, String value) { // add Data to the table
		// is hashtable full?
		if (size == fr.length) { // no of data EQUAL to array'size, or not?
			System.out.println("Hash table is full");
			return;
			
		}
		
		//use hash function to convert key to hash index
		int index = hashFunction(key);
		
//		System.out.println(index + " " + value); // Modulus Index
//		System.out.println();
		
//		//add new value to the array at the computed position
//		String head1 = fr[index];
//		System.out.println(head1);
//		fr[index] = key;
//		
//		eng[index] = value;
//		System.out.println(fr[index] + " fr[index]");
//		System.out.println(eng[index] + " eng[index]");
		
//		String head = fr[index];
//		System.out.println(head + " head");
		
		while(fr[index] != null) {
			index = (index + 1) % fr.length;
			
//			index++;
//			System.out.println("fail");
			
//			if (index != 4) {
//				index = (index + 1) % fr.length;
//				System.out.println("collision");
//				break;
//				
//			}
		
			if(index == size) {
				System.out.println("Putting " + value + " has collision!");
//				System.out.println(size);
//				index++;
				
			}
//			if (index != 4) {
////				   index = (index + 1) % fr.length;
//				   System.out.println("collision");
////				   return;
//			   }			
			
			int fullNum = eng.length - 1; // or 4;
			
		    if(index == fullNum) {
		    	System.out.println("Purring " + value + " is failed!");
				
				return;
			}
		   
//		    index++;
			
//			break;
			
		}
		
//		if (fr[index] != null) {
//			index = (index + 1) % eng.length;
//			System.out.println("Collision");
//			
////			if (index == 4) {
////				System.out.println("fail");
////				
////			}
//			
//		}
//	
//		else if  (fr[index] != null) {
//			index = (index + 1) % eng.length;
//			index = 4;
//			System.out.println("Fail");
//			return;
//			
//		}
		
		
		size++;
		fr[index] = key;
		eng[index] = value;
////		
		System.out.println("Putting " + value + " is successful.");
				
	}
	
	public String get (String key) {
		
		//use hash function to convert key to hash index
		int index = hashFunction(key);
//		String value = "";
//		return eng[index];
//		System.out.println(fr[index] + " fr[index]");
//		System.out.println(key + " key");
		
		while (fr[index] != null) {
//			index = (index + 1) % eng.length;
			
//			if (index == size) { // this is for collision
//				return eng[index];
//				
//			}
			
			if (fr[index].equals(key)) {
				return eng[index];
				
			}
			
			index = (index + 1) % eng.length;
			
		}
		
		return "N/A";
//		return fr[index];
		
//		
//		size++;

//		return eng[index]; // saved value here
		
	}
	
	public int getSize() { //getter
		return size;
		
	}
	
	public int hashFunction(String key) {
//		System.out.println(key);
//		System.out.println(eng.length);
//		System.out.println();
		
		int hash = (key.hashCode() & 0x7FFFFFFF) % eng.length;
//		System.out.println("hash " + hash);
		return hash;
		
	}
	
	public void printHashTable() {
		System.out.println("--- Hash Table ---");
		
		for (int i = 0; i < fr.length; i++) {
			System.out.println(i + " " + fr[i] + " " + eng[i]);
			
		}
		
	}

}













