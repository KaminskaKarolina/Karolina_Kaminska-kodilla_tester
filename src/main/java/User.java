import javax.xml.namespace.QName;

public class User {
   String name;
   int age;

    public User(String name, int age) {

        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }
    int getAge(){

        return this.age;
    }

        public static void main (String[]args){
            User Kasia = new User("Kasia", 25);
            User Basia = new User("Basia", 28);
            User Marek = new User("Marek", 23);
            User Robert = new User("Robert", 33);
            User Wojtek = new User("Wojtek", 58);
            User Oliwia = new User("Oliwia", 45);
            User Majka = new User("Majka", 19);
            User[] users = {Kasia, Basia, Marek, Robert, Wojtek, Oliwia, Majka};


            int sumAge = 0;

            for (int i = 0; i < users.length ; i++) {
                sumAge = sumAge + users[i].getAge();
                System.out.println(sumAge);
            }
            double averageSum;
            averageSum = sumAge/users.length;
            System.out.println(averageSum);

            double belowAverage = averageSum;
            for (int i = 0; i < users.length; i++) {
                if ( users[i].age < averageSum) {
                    System.out.println(users[i].name);
                }
            }

        }
    }







