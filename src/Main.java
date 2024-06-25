import java.awt.print.Paper;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Вес собаки " + dog + " кг!");
        System.out.println("Вес кошки " + cat + " кг!");
        System.out.println("Количество бумаги " + paper + " шт.!");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Собака стала весить " + dog + "кг!" );
        System.out.println("Кошка сатала весить " + cat + "кг!");
        System.out.println("Бумаги стало " + paper + " шт.!");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Собака стала весить " + dog + "кг!" );
        System.out.println("Кошка сатала весить " + cat + "кг!");
        System.out.println("Бумаги стало " + paper + " шт.!");


        var friends = 19;
        System.out.println("Друзей было "+friends);

        friends = friends +2;
        System.out.println("Друзей стало "+friends);

        friends = friends/7;
        System.out.println("Друзей осталось "+ friends);

        var frog = 3.5;
        System.out.println("Лягушка весит " + frog + " г.!");

        frog = frog * 10;
        System.out.println("Вес лягушки стал " + frog + " г.!");

        frog = frog/3.5;
        System.out.println("Вес лягушки стал " + frog + " г.!");

        frog = frog + 4;
        System.out.println("Вес лягушки стал " + frog + "г.!");

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeightBoxers + " кг.!");

        var differenceWeightBoxers = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе боксеров " + differenceWeightBoxers + " кг.!");

        var weightFirst = 10;
        var weightSecond = 15;
        var defferenceWeight = weightSecond % weightFirst;
        System.out.println("Разница в весе " + defferenceWeight + " кг.!");

        var totalHours = 640;
        var hoursEmployee = 8;
        var totalEmployees = totalHours/hoursEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees*hoursEmployee;
        System.out.println("Если в компании работает " + totalEmployees+ " человека, то всего " + totalHours + " часа работы может быть поделено между сотрудниками.");


    }
}