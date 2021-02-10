
public class Question5 {

	public static void main(String[] args) {
		String st = "Select name, city from Emp where age > 20 and city = 'New York' order By name";

		String[] words = st.split(" ");

		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("and")) {

				System.out.println(words[i]);
			}
		}
	}
}
