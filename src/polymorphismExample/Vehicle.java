package polymorphismExample;

public class Vehicle {
  private String start;
  private String stop;
  private String speed;
  private String direction;

  public Vehicle(String start, String stop, String speed, String direction) {
    this.start = start;
    this.stop = stop;
    this.speed = speed;
    this.direction = direction;
  }
  
  public void start() {
    System.out.println(this.start);
  }
  
  public void stop() {
    System.out.println(this.stop);
  }
  
  public void speed() {
    System.out.println(this.speed);
  }
  
  public void direction() {
    System.out.println(this.direction);
  }
}
