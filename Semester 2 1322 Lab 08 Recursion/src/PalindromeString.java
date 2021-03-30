
public class PalindromeString {
	public static String reverse(String reverseInput, String userInput, int length) {

		if (length == -1) {
			return reverseInput;
		} else {

			reverseInput += userInput.charAt(length);
			System.out.println(length);
			return reverse(reverseInput, userInput, length - 1);
		}

	}

	public static String isPalindrome(String userInput, String reverseString) {

		String judgement = "";

		if (userInput.equals(reverseString)) {
			judgement = "a palindrome.";
		} else {
			judgement = "not a palindrome.";
		}

		return judgement;
	}

	public static void main(String[] args) {

		String judgement;
		String reverseInput = "";
		String userInput = "";
		int length = 0;

		// example
		userInput = "tacocat";
		length = userInput.length() - 1;

		String reverseString = reverse(reverseInput, userInput, length);
		judgement = isPalindrome(userInput, reverseString);

		System.out.print("Recieved " + userInput + " ");
		System.out.println("which is " + judgement);

		// using another example
		userInput = "haha";
		length = userInput.length() - 1;

		reverseString = reverse(reverseInput, userInput, length);
		judgement = isPalindrome(userInput, reverseString);

		System.out.print("Recieved " + userInput + " ");
		System.out.println("which is " + judgement);

	}
}

/*
 * things the cool homie mentioned: its good practice to have a base case on the
 * top. doing a -- when you did
 */