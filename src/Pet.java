public class Pet
{
    //instance variables

    private String color;
    protected String name;
    //protected access modifier; Private to all clients except Children.
    //It is public to children classes
    private int age; //in years

    //constructor

    public Pet (String color, String name, int age)
    {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    //brain methods

    public String feed()
    {
        return "Feed Daily";
    }

    //getters and setters

    public String getName()
    {
        return name;
    }

    //toString

    public String toString()
    {
        String output = "Name: " + name +
                        "\nColor: " + color +
                        "\nAge (years): " + age;
        return output;
    }
}
