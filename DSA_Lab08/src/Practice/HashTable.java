package Practice;

public class HashTable {
	
	private int size;
	private String[] fr;
	private String[] eng;
	
	public HashTable(int capacity) {
		this.fr = new String[capacity];
		this.eng = new String[capacity];
		
	}
	
	public void put(String key, String value) {
		if (size == fr.length) {
			System.out.println("Hashtable full");
			return;
			
		}
		
		int index = hashFunction(key);
		
		while (fr[index] != null) {
			index = (index + 1) % eng.length;
			System.out.println(index + " index + 1");
			
			if (index == size) {
				System.out.println("Putting " + value + " has collision!");
				
			}
			
			int fullNum = (eng.length - 1);
			if (index == fullNum) {
				System.out.println("Putting " + value + " is failed!");
				return;
				
			}
		}
		
		size++;
		fr[index] = key;
		eng[index] = value;
		System.out.println("Putting " + value + " is successful");
			
	}
	
	public String get(String key) {
		
		int index = hashFunction(key);
		
		System.out.println(index + " index before");
		
		while (fr[index] != null) {
			
			System.out.println();
			
			System.out.println(fr[index] + " fr[index]");
			System.out.println(key + " key");
			
			if (fr[index].equals(key)) {
				
				return eng[index];
				
			}
			
			index = (index + 1) % eng.length;
			System.out.println(index + " index after");
		}
		
		return "N/A";
		
	}
	
	public int getSize() {
		return size;
		
	}
	
	public int hashFunction(String key) {
		
		int hash = (key.hashCode() & 0x7FFFFFFF) % eng.length;
		return hash;
		
	}
	
	public void printHashTable() {
		System.out.println("---Hash Table---");
		
		for (int i = 0; i < fr.length; i++) {
			System.out.println(i + " " + fr[i] + " " + eng[i]);
			
		}
	}
	
	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable(5);
		hashTable.put("pomme", "apple");
		hashTable.put("pain", "bread");
		hashTable.put("clavier", "keyboard");
		hashTable.put("ordinateur", "computer");
		hashTable.put("lait", "mailk");
		System.out.println();
		
		hashTable.printHashTable();
		System.out.println("Table size = " + hashTable.getSize());
		System.out.println();
		
		System.out.println("---Searching---");
		System.out.println("pomme" + "=" + hashTable.get("pomme"));
		System.out.println("pain" + "=" + hashTable.get("pain"));
		System.out.println("clavier" + "=" + hashTable.get("clavier"));
		System.out.println("ordinateur" + "=" + hashTable.get("ordinateur"));
		System.out.println("lait" + "=" + hashTable.get("lait"));
		
		
	}
}


//public class HashTable {
//	
//	private HashNode[] buckets;
//	private int numOfBuckets; // capacity
//	private int size;
//	
//	public HashTable() {
//		this(10);
//		
//	}
//	
//	public HashTable(int capacity) {
//		this.numOfBuckets = capacity;
//		buckets = new HashNode[capacity];
//		
//	}
//	
//	private class HashNode {
//		private Integer key;
//		private String value;
//		private HashNode next;
//		
//		public HashNode(Integer key, String value) {
//			this.key = key;
//			this.value = value;
//			
//		}
//		
//	}
//	
//	public int size() {
//		return size;
//		
//	}
//	
//	public boolean isEmpty() {
//		return size == 0;
//				
//	}
//	
//	public void put(Integer key, String value) {
//		if (key == null || value == null) {
//			throw new IllegalArgumentException("Key or Value is null !!!");
//			
//		}
//		
//		int bucketIndex = getBucketIndex(key);
//		HashNode head = buckets[bucketIndex];
//		
//		while(head != null) {
//			if (head.key.equals(key)) {
//				head.value = value;
//				return;
//				
//			}
//			
//			System.out.println("Putting " + value + " has collision!");
//			head = head.next;
//			
//		}
//		
//		size++;
//		head = buckets[bucketIndex];
//		HashNode node = new HashNode(key, value);
//		node.next = head;
//		buckets[bucketIndex] = node;
////		System.out.println(key + " after % " + bucketIndex + " " + value);
//		System.out.println("Putting " + value + " is successful.");
//		
//	}
//	
//	private int getBucketIndex(Integer key) {
//		return key % numOfBuckets;
//		
//	}
//	
//	public static void main(String[] args) {
//		HashTable table = new HashTable(10);
//		table.put(105, "apple");
//		table.put(99, "bread");
//		table.put(21, "keyboard");
//		table.put(31, "computer");
//		table.put(11, "tome");
//		System.out.println(table.size());
//		
//	}
//
//}
















