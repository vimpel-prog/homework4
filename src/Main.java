public class Main {
    public static void main(String[] args) {
//        Task 1
        int age = 35;
        if (age >= 18) System.out.println("Ты совершеннолетний");
        if (age < 18) System.out.println("Тебе ещё нет 18");
//        Task 2
        int age1 = 35;
        if (age1 >= 7) System.out.println("Ты ходишь в школу");
        if (age1 >= 18) System.out.println("Ты закончил школу и ходиш в универ");
        if (age1 >= 24) System.out.println("Ты окончил универ и тебе пора искать работу");
//        Task 3
        int passengers = 78;
        if (passengers <= 59) System.out.println("В вагоне есть сидячее место");
        if (passengers <= 101 && passengers >= 60) System.out.println("В вагоне есть стоячее место");
        if (passengers >= 102) System.out.println("В поезде больше нету мест");
//        Task 4
        if (age >= 18) System.out.println("18 мне уже!");
        else System.out.println("Ещё расти и расти");
//        Task 5
        if (age1 >= 24) System.out.println("Человек окончил универ и может искать работу");
        else if (age1 >= 18) System.out.println("Человек закончил школу и может отпраляться в универ");
        else if (age1 >= 7) System.out.println("ребёнок может отправляться в школу");
//        Task 6
        if (passengers >= 102) System.out.println("В вагоне нет мест");
        else if (passengers >= 60) System.out.println("В вагоне есть стоячее место");
        else System.out.println("В вагоне есть сидячее место");
//        Task 7
        int age7 = 11;
        if (age7 >= 2 && age7 <= 6)
            System.out.println("Если возраст человека равен " + age7 + " , то ему нужно ходить в детский сад");
        else if (age7 >= 7 && age7 <= 18)
            System.out.println("Если возраст человека равен " + age7 + " , то ему нужно ходить в школу");
        else if (age7 > 18 && age7 < 24)
            System.out.println("Если возраст человека равен " + age7 + " , то ему нужно ходить в университет");
        else if (age7 >= 24)
            System.out.println("Если возраст человека равен " + age7 + " , то ему нужно ходить на работу");
//        Task 8
        int age8 = 12;
        boolean olderManWithChild = true;
        if (age8 < 5) System.out.println("Ребёнку нельзя на атракцион");
        else if (age8 >= 5 && age7 < 14 && olderManWithChild)
            System.out.println("Ребёнку можно на атракцион в сопровождении взрослого");
        else System.out.println("Ребёнку можно на атракцион");
//        Task 9
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) System.out.println("Самое большое число " + one);
        else if (two > one && two > three) System.out.println("Самое больщое число " + two);
        else System.out.println("Самое больщое число " + three);
    }
}