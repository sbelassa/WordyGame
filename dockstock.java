import java.util.ArrayList;

// represents a means of stockage for words
public class dockstock {

	/*********** variables **************/
	private ArrayList<word> wordList;


	/*********** methods **************/
	public ArrayList<word> getWordList() {
		return wordList;
	}

	public void setWordList(ArrayList<word> wordList) {
		this.wordList = wordList;
	}
}
