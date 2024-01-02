public class Main {
    public static void main(String[] args) {
        // задача 1
        var dog = 8.0;
        var cat = 3.6;
        var papper = 763789;
        System.out.println("Задача 1\nПеременная dog = " + dog + "\nПеременная cat = " + cat + "\nПеременная papper = " + papper );
        //задача 2
        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        System.out.println ("Задача 2\nПеременная dog = " + dog + "\nПеременная cat = " + cat + "\nПеременная papper = " + papper );
        //задача 3
         dog = dog - 3.5;
          cat = cat - 1.6;
         papper = papper - 7639;
        System.out.println ("Задача 3\nПеременная dog = " + dog + "\nПеременная cat = " + cat + "\nПеременная papper = " + papper );
        //Задача 4
        var friend = 19;
        System.out.println ("Задача 4\n" + friend);
        friend = friend +2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);
        //задача 5
        var frog = 3.5;
        System.out.println("Задача 5\n" + frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);
        //Задача 6
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightTwoBoxers = weightOneBoxer + weightSecondBoxer;
        System.out.println ("Задача 6\nОбшая масса двух бойцов = " + weightTwoBoxers + " кг");
        //метод вычитания к заданию 7
        var differenceBoxers = weightSecondBoxer - weightOneBoxer;
        System.out.println ("Разница в весе боксеров = " + differenceBoxers + " кг");
        //Задача 7
        System.out.println ( differenceBoxers );
        //метод деления к заданию 7
        differenceBoxers = weightSecondBoxer % weightOneBoxer;
        System.out.println ( differenceBoxers );
        //Задача 8
        var workHour = 640;
        var workTime = 8;
        var workers = workHour / workTime;
        System.out.println ("Задача 8\nВсего работников в компании - " + workers + " человек.");
        workers = workers + 94;
        workHour = workers * workTime;
        System.out.println ("Если в компании работает " + workers + " человек,то всего " + workHour + " часов работы может быть поделено между работниками.");




    }


}