public class Peon
{
    String name;
    String job;
    double salary;

    Peon(String name, String job, double salary)
    {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    void PeonInfo()
    {
        System.out.println("Name is: " + name + ". Job is: " + job + ". Salary is: " + salary + "."); ;
    }
}
