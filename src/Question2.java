
public class Question2 {

	public static void main(String[] args) {
			
			String st = "Select name, city from Emp where age > 20 and city = 'New York' order By name";
			
			
			String[] words = st.split(" ");
			
			for (int i=2; i<words.length; i++) {
				System.out.println(words[i-1]);
				if (words[i].contains("from")) {
					System.exit(i);
				}

			}
			
		


	}

}
