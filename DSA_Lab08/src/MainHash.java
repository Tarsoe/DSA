
public class MainHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashTable hashTable = new HashTable(5);
//		String key1 = "pomme";
//		String value1 = "apple";
//		String key2 = "pain";
//		String value2 = "bread";
//		String key3 = "clavier";
//		String value3 = "keyboard";
//		
//		String key4 = "ordinateur";
//		String value4 = "computer";
//		String key5 = "lait";
//		String value5 = "milk";
//
//		//put keys and values to hashtable
//		hashTable.put(key1, value1);
//		hashTable.put(key2, value2);
//		hashTable.put(key3, value3);
//		
//		hashTable.put(key4, value4);
//		hashTable.put(key5, value5);
////		
//		System.out.println();
//
//		//show data and size of the hashtable
//		hashTable.printHashTable();
//		System.out.println("Table size = " + hashTable.getSize());
//		System.out.println();
//		
//		String s = "milk";
//		int hashCode = (s.hashCode() & 0x7FFFFFFF) % 5;
//		System.out.println(hashCode);
		
		HashTable2 hashTable = new HashTable2(5);
		String key1 = "pomme";
		String value1 = "apple";
		String key2 = "pain";
		String value2 = "bread";
		String key3 = "clavier";
		String value3 = "keyboard";
		String key4 = "ordinateur";
		String value4 = "computer";
		String key5 = "lait";
		String value5 = "milk";

		hashTable.put(key1, value1);
		hashTable.put(key2, value2);
		hashTable.put(key3, value3);
		hashTable.put(key4, value4);
		hashTable.put(key5, value5);
		System.out.println();

		hashTable.printHashTable();
		System.out.println("Table size = " + hashTable.getSize());
		System.out.println();
//
		System.out.println("--- Searching ---");
		System.out.println(key1 + "=" + hashTable.get(key1));
//		System.out.println();
		System.out.println(key2 + "=" + hashTable.get(key2));
//		System.out.println();
		System.out.println(key3 + "=" + hashTable.get(key3));
//		System.out.println();
		System.out.println(key4 + "=" + hashTable.get(key4));
//		System.out.println();
		System.out.println(key5 + "=" + hashTable.get(key5));

		


	}

}
