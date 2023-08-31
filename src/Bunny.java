import java.text.DecimalFormat;

public class Bunny extends Pet
{
    //instance variables

    private int numLegs;
    private int weight; //lbs
    private double tailLength; //cm

    //constructor

    public Bunny(String color, String name, int age, int numLegs, int weight, double tailLength)
    {
        super(color, name, age);
        this.numLegs = numLegs;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    //brain methods

    public String nickname()
    {
        return "Nickname " + this.getName().substring(0, 3) + "y";
        //if name is private in the parent, we cannot access it in the child
    }

    public double toKilograms()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");

        double kilograms = weight * 0.45359237;

        return Double.parseDouble((fmt.format(kilograms)));
    }

    //getters and setters



    //toString

    public String toString()
    {
        String output = super.toString() +
                "\nNumber of bunny legs: " + numLegs +
                "\nWeight in pounds: " + weight +
                "\nLength of tail in cm: " + tailLength;
        return output;
    }
}
