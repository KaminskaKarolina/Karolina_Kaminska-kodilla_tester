public class LeapYear {
    public static void main(String[] args) {
        int year = 23679;
        if (year % 4 == 0) {
            System.out.println("Leap");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap");
        } else if (year%4 !=0 || year%400 !=0) {
            System.out.println("No Leap");
    }
}
    }