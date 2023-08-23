package inheritanceExample;

public class Student extends Person {
  private String studentId;

  public Student(String firstName, String lastName, String studentId) {
    super(firstName, lastName);
    this.studentId = studentId;
  }

  // Getter
  public String getStudentId() {
    return studentId;
  }
  // Setter
  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  @Override
  public String toString() {
    return super.toString() + "\nStudent Id: " + this.studentId;
  }
}
