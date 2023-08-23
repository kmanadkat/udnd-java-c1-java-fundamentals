package inheritanceExample;

public class PersonTester {
  public static void main(String[] args) {
    Person sally = new Person("Sally", "Phillips");
    Student mike = new Student("Mike", "Thompson", "12345");
    StudentEmployee jeff = new StudentEmployee("jeff", "sam", "4567", "#1234", 20.5);

    System.out.println(sally + "\n");
    System.out.println(mike + "\n");
    System.out.println(jeff + "\n");
  }
}
