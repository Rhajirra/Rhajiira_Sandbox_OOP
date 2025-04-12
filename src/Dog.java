public class Dog
{
    String name;
    String type;
    double weight;

    String getInfo()
    {
        return "Name: " + name + ".Type: " + type + ". Weight: " + weight + ".";
    }

    int speed;

    void run()
    {
        for(int i = 0; i < speed; i++)
        {
            System.out.println("Бегу");
        }
    }
}
