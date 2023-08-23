package inheritanceExample;

public class Person {
  private String firstName;
  private String lastname;

  public Person(String firstName, String lastName) {
    super();
    this.firstName = firstName;
    this.lastname = lastName;
  }

  // Getters
  public String getFirstName() {
    return firstName;
  }
  public String getLastname() {
    return lastname;
  }

  // Setters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Override
  public String toString() {
    return "Name: " + this.firstName + " " + this.lastname;
  }
}
