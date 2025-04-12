public class Box
{
    double length;
    double width;
    double height;

    double getVolume()
    {
        double volume = length * width * height;
        return volume;
    }

    void showVolume() //also using void without return
    {
        double volume = getVolume();//length * width * height;
        System.out.println(volume);
        //return volume;
    }
}
