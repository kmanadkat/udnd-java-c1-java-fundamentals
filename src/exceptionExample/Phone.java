package exceptionExample;

public class Phone {
  private String phoneType;
  private String phoneNumber;

  public Phone(String phoneType, String phoneNumber) {
    super();
    if(phoneType == null || phoneNumber == null) {
      throw new IllegalArgumentException("The type and number cannot be null");
    }
    this.phoneType = phoneType;
    this.phoneNumber = phoneNumber;
  }

  // Getters
  public String getPhoneType() {
    return phoneType;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }

  // Setters
  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Phone Type: " + this.phoneType + "\nPhone Number: " + this.phoneNumber + "\n";
  }
}
