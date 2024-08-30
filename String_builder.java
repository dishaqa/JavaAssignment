package StringBuffer_StringBuilder;

public class String_builder {

	public static void main(String[] args) {
		String A = "test";
		A.concat("case");
		System.out.println(A);// string example
		
		StringBuilder s1 = new StringBuilder("Banglore");
		//StringBuffer s1 =new StringBuffer("Banglore");
		s1.append(" City"); // append in same string
		System.out.println(s1); 
		s1.insert(9, "is a ");
		System.out.println(s1);  // Insert in between
		s1.delete(0, 9); // Delete from index 0-9
		System.out.println(s1);
		
		
		StringBuilder s2 = new StringBuilder("Manish Tiwari");
		System.out.println(s2.substring(7)); // substring with one parameter
		System.out.println(s2.substring(1, 4)); // take a sub string with two parameter
		System.out.println(s2.replace(0, 5, "Abhishek")); // replace
		
		
		StringBuilder s3 = new StringBuilder("Disha");
		System.out.println(s3.reverse()); // reverse
		System.out.println(s3.charAt(3));
		System.out.println(s3.capacity());
		s3.ensureCapacity(50); // written type is void
	}

}
