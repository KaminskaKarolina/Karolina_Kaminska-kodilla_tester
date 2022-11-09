public class LeapYear {
    public static void main(String[]args) {
        int year = 2024;
        if (year%4 == 0){
            System.out.println("Leap year");
        }
        else if  (year % 100==0){
            System.out.println("Not leap year");

        }
        else if (year% 400 == 0){
            System.out.println("Leap year");
        }
    }
}