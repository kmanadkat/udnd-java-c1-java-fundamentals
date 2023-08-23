package mapsExample;

public class Person {
  private String name;
  private String email;

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
  }
  
  public String getEmail() {
    return email;
  }
  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Name: " + this.name + " - Email: " + this.email; 
  }
}
