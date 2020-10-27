package pl.orzechsoft.course.takss;

import net.ricecode.similarity.JaroWinklerStrategy;
import net.ricecode.similarity.SimilarityStrategy;
import net.ricecode.similarity.StringSimilarityService;
import net.ricecode.similarity.StringSimilarityServiceImpl;

public class StringComparisonExample {

  public static void main(String[] args) {
    String target = "McDonalds";
    String source = "McDonhons";
    double similarity = getSimilarity(target, source);
    System.out.println(similarity);
    if (similarity > 0.7) {
      System.out.println("I'm sorry, your passwords are too similar");
    }
  }

  private static double getSimilarity(String target, String source) {
    SimilarityStrategy strategy = new JaroWinklerStrategy();
    StringSimilarityService service = new StringSimilarityServiceImpl(strategy);
    return service.score(source, target);
  }

}
