
public class Question4 {

	public static void main(String[] args) {
		String st = "Select name, city from Emp where age > 20 and city = 'New York' order By name";

		String[] words = st.split(" ");

		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("where")) {
				for (int j = i + 1; j < words.length; j++) {
					
					if (words[j].contains("order")) {
						System.exit(j-1);
					}
					System.out.println(words[j]);
				}
			}

		}


	}

}
