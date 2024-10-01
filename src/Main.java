public class Main {

    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        var frog = 3.5;
        frog = (frog * 10);
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var first = 78.2;
        var second = 82.7;
        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(second % first);


        var all_hours = 640;
        var all_worker = all_hours / 8;
        System.out.println("Всего работников в компании — " + all_hours / 8 + " человек");
        var all_works = (all_worker + 94) * 8;
        System.out.println("Если в компании работает " + (all_worker + 94) + " человек, то всего " + all_works + " часов");

    }
}