package inheritanceExample;

public class StudentEmployee extends Student {
  private String employeeId;
  private double rateOfPayPerHour;

  public StudentEmployee(
    String firstName,
    String lastName,
    String studentId,
    String employeeId,
    double rateOfPayPerHour
  ) {
    super(firstName, lastName, studentId);
    this.employeeId = employeeId;
    this.rateOfPayPerHour = rateOfPayPerHour;
  }
  
  // Getters
  public String getEmployeeId() {
    return employeeId;
  }
  public double getRateOfPayPerHour() {
    return rateOfPayPerHour;
  }

  // Setters
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }
  public void setRateOfPayPerHour(double rateOfPayPerHour) {
    this.rateOfPayPerHour = rateOfPayPerHour;
  }

  @Override
  public String toString() {
    return super.toString() + "\nEmployee Id: " + this.employeeId + "\nPay: " + this.rateOfPayPerHour;
  }
}
