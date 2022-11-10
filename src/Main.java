public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Результат первой задачи");
        double dog = 8;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);

        //Задача 2
        System.out.println("Результат второй задачи");
        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println (cat);
        paper = paper + 4;
        System.out.println (paper);

        //Задача 3
        System.out.println("Результат третьей задачи");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4
        System.out.println("Результат четвёртой задачи");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        System.out.println("Результат пятой задачи");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Результат шестой задачи");
        var firstBoxer = 78.2;
        System.out.println("Вес первого боксера: " + firstBoxer + "кг");
        var secondBoxer = 82.7;
        System.out.println("Вес второго боксера: " + secondBoxer + "кг");
        var weightTotal = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов: " + weightTotal + "кг");
        var weightDifference = secondBoxer % firstBoxer;
        System.out.println("Разница в весе: " + weightDifference + "кг");

        //Задача 7
        System.out.println("Результат седьмой задачи");
        var firstWay = secondBoxer - firstBoxer;
        System.out.println("Первый способ: " + firstWay);
        var secondWay = secondBoxer % firstBoxer;
        System.out.println("Второй способ: " + secondWay);

        //Задача 8
        System.out.println("Результат восьмой задачи");
        var totalTime = 640;
        System.out.println("Общее время: " + totalTime + " часов");
        var personalTime = 8;
        System.out.println("Личное время: " + personalTime + " часов");
        var peopleCorp = totalTime / personalTime;
        System.out.println("Всего в компании — " + peopleCorp + " человек");






    }
}