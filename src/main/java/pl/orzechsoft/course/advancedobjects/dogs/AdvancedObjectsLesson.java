package pl.orzechsoft.course.advancedobjects.dogs;

import java.util.List;
import pl.orzechsoft.course.advancedobjects.figures.Circle;
import pl.orzechsoft.course.advancedobjects.figures.Figure;
import pl.orzechsoft.course.advancedobjects.figures.Rectangle;
import pl.orzechsoft.course.advancedobjects.figures.Square;

public class AdvancedObjectsLesson {

  public static void main(String[] args) {
    Figure figure1 = new Rectangle(5, 25);
    Figure figure2 = new Rectangle(65.54, 2.1);
    Figure figure3 = new Circle(5);
    Circle figure4 = new Circle(1.6);
    Figure figure5 = new Square(5);

    List<Figure> figures = List.of(figure1, figure2, figure3, figure4, figure5);

    for (Figure figure : figures) {
      System.out.println("Area is " + figure.calculateArea());
    }
  }
}
