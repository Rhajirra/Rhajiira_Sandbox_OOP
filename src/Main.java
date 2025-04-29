public class Main {
    public static void main(String[] args)
    {
        Box current = new Box(10,10,10);
        Box another = current.copy();
        current.showVolume();
        another.showVolume();

        Box copyBox = new Box(current);

        Box incBox = current.increase();
        incBox.showVolume();



//        current.compare(another);

        int boxResult = current.intCompare(another);
        System.out.println(boxResult);
        current.intCompare(another);

//        System.out.println(current.getVolume());
//        System.out.println(another.getVolume());


//        Box box1 = new Box(10,10,10);
//        box1.showVolume();
////        box1.setDimens(10,10,10);
//        Box box2 = new Box(10,10,10);
//        box2.showVolume();
////        box2.setDimens(20,20,20);
////
////        box1.showVolume();
////        box2.showVolume();
////
//        Peon peon = new Peon("Daniel", "Engenier", 1000);
//        peon.PeonInfo();
//
//
//        Rectangle ret_rec = new Rectangle();
//        ret_rec.length = 10;
//        ret_rec.width = 10;
//        double area_ret_rec = ret_rec.ret_area();
//        System.out.println(area_ret_rec);
//
//        Rectangle par_ret_area = new Rectangle();
//        par_ret_area.par_ret_area(20,20);
//        System.out.println(par_ret_area.ret_area());

//        Box box1 = new Box();
//        double length = box1.length;
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
//        Dog dog = new Dog();
//        dog.name = "Bob";
//        dog.type = "Unhoming";
//        dog.weight = 5;
//        dog.speed = 5;
//
//        String my_dog = dog.getInfo();
//        System.out.println(my_dog);
//        dog.run();
////
//        double volume = box1.getVolume();//box1.height * box1.length * box1.width;
//        System.out.println(volume);
//        box1.showVolume();
//
//        double volume2 = box2.getVolume();
//        System.out.println(volume2);
//        box2.showVolume();
//
//        Human h1 = new Human();
//        h1.name = "John";
//        h1.age = 18;
//        h1.weight = 80;
//
//        Human h2 = new Human();
//        h2.name = "Nick";
//        h2.age = 30;
//        h2.weight = 75;
//
//        Human h3 = new Human();
//        h3.name = "Dan";
//        h3.age = 45;
//        h3.weight = 92;
//
//        Human h4 = new Human();
//        h4.name = "Lemmy";
//        h4.age = 72;
//        h4.weight = 85;
//
//        double sum = h1.age + h2.age + h3.age + h4.age;
//
//        System.out.println(sum / 4);

//        Test test = new Test();
//        System.out.println(test.square(20));
    }
}