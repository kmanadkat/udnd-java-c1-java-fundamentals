package datesAndCalendars;

import java.util.Calendar;
import java.util.Date;

public class DatesAnadCalendar {
  public static void main(String[] args) {
    // displayCurrentDate();
    displaySetDate();
  }

  public static void displayCurrentDate() {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar + "\n");
    Date date = new Date();
    calendar.setTime(date);
    System.out.println(calendar.getTime() + "\n");
  }

  public static void displaySetDate() {
    Calendar calendar = Calendar.getInstance();
		calendar.set(2031, 12, 02);
		Date date = calendar.getTime();

		System.out.println(date);
  }
}
