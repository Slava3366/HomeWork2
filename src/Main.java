public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;

        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var commonWeight = firstFighterWeight + secondFighterWeight;
        System.out.println(commonWeight);
        var differenceWeight = firstFighterWeight - secondFighterWeight;
        System.out.println("Разница в весе " + differenceWeight + " кг");

        differenceWeight = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница в весе " + differenceWeight +" кг");

        var workingHours = 640;
        var spendingTime = 8;
        var quantityEmployers = workingHours / spendingTime;
        System.out.println("Всего работников в компании " + quantityEmployers + " человек");

        var posibleEmployers = quantityEmployers + 94;
        var posibleWorkingHours = posibleEmployers * spendingTime;
        System.out.println("Если в компании работает " + posibleEmployers + " человек" + " то всего " + posibleWorkingHours + " часов работы может быть поделено между сотрдниками");







    }
}