public class Rectangle
{
    double length;
    double width;

    void par_ret_area(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    double ret_area()
    {
        return length * width;
    }

}
