public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temp = 10;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 66;
        if (speed > 60) {
            System.out.println("скорость превышена");
        }
        if (speed < 60) {
            System.out.println("превышения скорости нет");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 16;
        boolean goToSchool = age >= 7 && age <=18;
        if (age >= 2 && age <= 6) {
            System.out.println("нужно ходить в детский сад");
        }
        if (goToSchool) {
            System.out.println("нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        boolean num = age < 5;
        boolean num1 = age >= 5 && age < 14;
        boolean num2 = age >= 14;
        if (num) {
            System.out.println("не может кататься на аттракционе");
        }
        if (num1) {
            System.out.println("можно кататься в сопровождении взрослого");
        }
        if (num2) {
            System.out.println("можно кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int all = 102;
        int seat = 60;
        int stand = all - seat;

        int seatCount = 59;
        int standUp = 40;
        if (seatCount < seat) {
            System.out.println("есть " +(seat - seatCount)+ " сидячее место");
        }
        if (standUp < stand) {
            System.out.println("есть " +(stand - standUp)+ " стоячее место");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        if (two > one && two > three) {
            System.out.println(two);
        }
        if (three > one && three > two) {
            System.out.println(three);
        }
    }
}



