class Human{
    private int age;//=21;
    private String name;//="Sneya";

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    { this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args)
    {
        Human obj= new Human();
        obj.setName("Sneya");
        obj.setAge(21);
        //System.out.println(obj.name);
       // System.out.println(obj.age);
        //obj.setAge(a=21);
        System.out.println(obj.getName() +":" +obj.getAge());
    }
}
