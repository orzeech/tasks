package pl.orzechsoft.course.takss;

import java.util.Scanner;
import rita.wordnet.WordnetPos;

public class Dictionary {

  public static void main(String[] args) {
    String word = new Scanner(System.in).nextLine();
    WordnetPos wordnetPos = WordnetPos.fromWordnet(word);
    System.out.println(wordnetPos.getExamples());
  }

}
