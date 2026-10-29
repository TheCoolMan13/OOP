public class Programmer {
    private int age;
    private String name;

    public Programmer(){
        age = 0;
        name = "";
    }
    public Programmer(int age , String name)
    {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age)
    {this.age = age;}

    public void setName(String name)
    {this.name = name;}
}
