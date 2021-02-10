
public class Question3 {

	public static void main(String[] args) {
		String st = "Select name, city from Emp where age > 20 and city = 'New York' order By name";
		
		
		String[] words = st.split(" ");
		
		for (int i=2; i<words.length; i++) {
			
			if (words[i].contains("from")) {
				System.out.println(words[i+1]);
				System.exit(i);
			}

		}


	}

}
