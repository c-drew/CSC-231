import java.util.Scanner;
public class WordsDemo {

	public static void main(String[] args) {
		
		System.out.println("This program displays the number of words inputted and "
				+ "uppercases the first character of each word.\n\n");
		
		Scanner sc = new Scanner(System.in);
		String wordInput = sc.nextLine();
		sc.close();
		System.out.println();
		
		String [] wordList = wordInput.split(" ");
		
		for (int i = 0; i < wordList.length; i++) {
			System.out.print(Words.upperFirst(wordList[i]) + ' ');
		}
		
		System.out.println("\n\nNumber of words: " + wordList.length);
	}
		
}
