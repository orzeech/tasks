package pl.orzechsoft.course.advancedobjects.figures;

import pl.orzechsoft.course.advancedobjects.beverages.Beverage;
import pl.orzechsoft.course.advancedobjects.beverages.Cola;
import pl.orzechsoft.course.advancedobjects.beverages.FizzyDrink;
import pl.orzechsoft.course.advancedobjects.dogs.Dog;

public class WeirdClassDemo {

  public static void main(String[] args) {
    MyWeirdClass myWeirdClass = new MyWeirdClass();
    Dog dog = myWeirdClass;
    FizzyDrink drink = myWeirdClass;
    Figure figure = myWeirdClass;
    Cola cola = myWeirdClass;
    Beverage beverage = myWeirdClass;

    dog.woof();
    beverage.drink();
  }

}
