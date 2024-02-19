public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Он не совершеннолетний, нужно немного подождать");
        }

        //Задача2
        int temperature = 7;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без  шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, без шапки выходить нельзя");
        }

        //Задача3
        int speed = 48;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        //Задача4
        age = 44;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку" + age + " лет, то ему нужно ходить в садик");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в универ");
        }
        if (age > 24) {
            System.out.println("Если человеку " + age + " лет, то он вынужден ходить на работу");
        }

        //Задача5
        age = 15;
        if (age < 5) {
            System.out.println("Если человеку " + age + " лет, то ему нельзя кататься");
        }
        if (age > 5 && age < 14) {
            System.out.println("Усли человеку " + age + " лет, то он может кататься только со взрослыми");
        }
        if (age > 14) {
            System.out.println("Если человеку " + age + " лет, то ему можно кататься");
        }

        //Задача6
        int totalPeople = 70;
        if (totalPeople < 102) {
            System.out.println("Если в вагоне " + totalPeople + " человек, то места хватит");
        } else {
            System.out.println("Если в вагоне " + totalPeople + " человек, то места не хватит");
        }
        int totalSeats = 60;
        totalPeople = 102;
        if (totalSeats < 60 && totalPeople < 102) {
            System.out.println("В вагоне есть сидячие места");
        } else if (totalSeats > 60 && totalPeople <102) {
            System.out.println("В вагоне нет сидячих мест");
        }


        //Задача7
        int one = 5;
        int two = 17;
        int three = 12;
        if (two > one && two > three) {
            System.out.println("Второе число самое большое");
        }
        if (three > two && three > one) {
            System.out.println("Третье число самое большое");
        } else if (one > two && one > three) {
            System.out.println("Первое число самое большое");
        }












        




    }
}