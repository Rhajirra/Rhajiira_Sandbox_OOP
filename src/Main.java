public class Main {
    public static void main(String[] args)
    {
//        Box box1 = new Box();
//        box1.height = 10;
//        box1.length = 10;
//        box1.width = 10;
//
//        Box box2 = new Box();
//        Box box3 = box2;
//        box2.height = 20;
//        box2.length = 20;
//        box2.width = 20;
//        box3.width = 0;
//
//        double volume = box1.height * box1.length * box1.width;
//        System.out.println(volume);
//
//        double volume2 = box2.height * box2.length * box2.width;
//        System.out.println(volume2);

        Human h1 = new Human();
        h1.name = "John";
        h1.age = 18;
        h1.weight = 80;

        Human h2 = new Human();
        h2.name = "Nick";
        h2.age = 30;
        h2.weight = 75;

        Human h3 = new Human();
        h3.name = "Dan";
        h3.age = 45;
        h3.weight = 92;

        double sum = h1.age + h2.age + h3.age;

        System.out.println(sum / 3);
    }
}