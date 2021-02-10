
public class QueryExtract {
	
	public static void main (String[] args) {
	
	String st = "Select name, city from Emp where age > 20 and city = 'New York' order By name";
	
	
	String[] words = st.split(" ");
	
	for (String word : words) {
	System.out.println(word);


	}


		
	}
	
}

	


