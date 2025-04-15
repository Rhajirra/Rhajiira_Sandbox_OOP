public class Box
{
    double length;
    double width;
    double height;

    Box( double length,double width,double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void setDimens(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
//
//    Box(double length, double width, double height)
//    {
//        this.length = length;
//        this.width = width;
//        this.height = height;
//    }

    double getVolume()
    {
        double volume = length * width * height;
        return volume;
    }

    double showVolume() //also using void without return
    {
        double volume = getVolume();//length * width * height;
        System.out.println(volume);
        return volume;
    }
}
