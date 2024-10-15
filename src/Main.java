public class Main {
    public static void main(String[] args) {

// Task number one
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Task number two
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Task number three
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
// Task number four
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
// Task number five
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
// Task number six
        var firstBoxWeight = 78.2;
        var secondBoxWeight = 82.7;
        System.out.println(firstBoxWeight + secondBoxWeight);
        System.out.println(secondBoxWeight - firstBoxWeight);
// Task number seven
        System.out.println(secondBoxWeight % firstBoxWeight);
// Task number 8.1
        var hours = 640;
        var oneWorkerDay = 8;
        var quantityWorker = hours / oneWorkerDay;
        System.out.println("Всего работников в компании — " + quantityWorker + " человек");
// Task number 8.2
        quantityWorker = quantityWorker + 94;
        System.out.println("Если в компании работает " + quantityWorker + " человек, то всего " + oneWorkerDay * quantityWorker + " часов работы может быть поделено между сотрудниками");

    }
}