import java.util.concurrent.CopyOnWriteArrayList;

public class Box
{
    double length;
    double width;
    double height;

    Box copy()
    {
        return new Box(this.length, this.width, this.height);
    }

    Box increase()
    {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

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


    void compare(Box another)
    {
        double currentvolume = getVolume();
        double anothervolume = another.getVolume();

        if(currentvolume > anothervolume)
        {
            System.out.println("Current > Another");
        }
        else if(currentvolume < anothervolume)
            {
                System.out.println("Current < Another");
            }
            else
            {
                System.out.println("Current == Another");
            }
    }

    int intCompare(Box another)
    {
        double currentvolume = getVolume();
        double anothervolume = another.getVolume();
        int result;
        if(currentvolume > anothervolume)
        {
            result = 1;
        }
        else if(currentvolume < anothervolume)
        {
            result = -1;
        }
        else
        {
            result = 0;
        }
        return result;
    }

    Box(Box another)
    {
        this(another.length,another.width,another.height);
    }

//
//    Box(double length, double width, double height)
//    {
//        this.length = length;
//        this.width = width;
//        this.height = height;
//    }

    double getSizeVolume()
    {
       double size = this.height * this.length * this.width;
       return size;
    }

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
