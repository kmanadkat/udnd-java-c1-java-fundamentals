package genericExample;

import java.util.ArrayList;

public class GenericExercise {

  public static <T> void displayClassName(T variable) {
    System.out.println(variable.getClass().getName());
  }

  public static void main(String[] args) {
    ArrayList<Object> variables = new ArrayList<Object>();
    Double doubleNumber = 12.45;
    String name = "Sally";
    Integer intNumber = 25;
    Character letter = 'a';

    variables.add(doubleNumber);
    variables.add(name);
    variables.add(intNumber);
    variables.add(letter);

    for (int i = 0; i < variables.size(); i++) {
      displayClassName(variables.get(i));
    }

    System.out.println();

    for(Object variable: variables) {
      displayClassName(variable);
    }
  }
}
