public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int Age = 17;
        if (Age >= 18) {
            System.out.println("Ты совершеннолетний поздравляю");
        }else {
            System.out.println("Ты не совершенно летний пока что");

        }

        int Age2 = 5;

        if (Age2 >= 7 && Age2<=18)
        {
            System.out.println("Ты можешь идти в школу");
        }
        if (Age2 > 18 && Age2<=24)
        {
            System.out.println("Ты закончил школу иди в университет");
        }
        else
        {
            System.out.println("Пора искать первую работу");
        }


        int Capacity = 102;
        int SitPlace = 60;
        int StandPlace =  Capacity - SitPlace;
        int People = 75;

        if (Capacity > People) {
            System.out.println("Места есть!");
            if (SitPlace > People) {
                System.out.println("Есть сидячие места");
            }
            else {
                System.out.println("Есть стоячие места");
            }
        }
        else {
            System.out.println("Мест нет");
        }


        int Age3 = 31;
        boolean babyGarden = (Age3 >=2 && Age3 <=6);
        boolean school = (Age3 >=7 && Age3 <18);
        boolean univer = (Age3 >=18 && Age3 <24);
        boolean work =(Age3 >=24 );
        boolean baby =(Age3 < 2);

        if (babyGarden) {
            System.out.println("Если возраст человека равен " + Age3 + " то ему нужно ходить в дет сад ");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + Age3 + " то ему нужно ходить в школу ");
        }
        if (univer) {
            System.out.println("Если возраст человека равен " + Age3 + " то ему нужно ходить в университет ");
        }
        if (work) {
            System.out.println("Если возраст человека равен " + Age3 + " то ему нужно ходить на работу ");
        }
        if (baby) {
            System.out.println("Если возраст человека равен " + Age3 + " то ему нужно сидеть дома ");
        }

        int Age4 = 18;
        boolean adult = true;
        boolean junior = Age4 <5;
        boolean middle = (Age4 >=5 && Age4 <14);
        boolean senior = Age4 >=14;

        if (junior) {
            System.out.println("Нельзя кататься");
        }
        if (middle) {
            if (adult) {
                System.out.println("Взрослый есть кататься можно");
            }
            else {
                System.out.println("Взрослого нет кататься нельзя");
            }
        }
        if (senior) {
            System.out.println("Кататься можно");
        }

        int one = 211;
        int two = 25;
        int three = 33;
        //int max;

        /*if (two > one) {
            max = two;
            if (three > max) {
                max = three;
            }
        }
        else {
            if (one >three) {
                max = one;
            }
            else {
                max = three;
            }
        }*/

        if (one<two || one<three) {
            if (two < three) {
                System.out.println("максимум" + three);
            } else {
                System.out.println("максимум" + two);
            }
        }
            else {
                System.out.println("максимум" + one);
            }

    }


}