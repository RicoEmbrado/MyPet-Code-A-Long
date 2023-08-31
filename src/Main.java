public class Main
{
    public static void main(String[] args)
    {
        Pet Blank = new Pet("gray", "Grayson", 10);
        Bunny Jeff = new Bunny("white", "Jeff", 4, 4, 5, 2.1);
        Pet Coco = new Bunny("gray", "Coco", 6, 3, 16, 3);  //polymorphic object instantiation
        Snake Mochi = new Snake("blue", "Mochi", 8, 10, true, "cobra");
        Pet Tommy = new Snake("pink", "Tommy", 3, 27, false, "none"); //polymorphic object instantiation



//        System.out.println(Mochi.feed());
//        System.out.println(Tommy.feed());
//
//        System.out.println(Jeff.toKilograms());
//        System.out.println(Coco.toKilograms());

//        Pet[] myPets = {Blank, Jeff, Coco, Mochi, Tommy};    //this is an example of polymorphism
//        for(int i = 0; i < myPets.length; i++)
//        {
//            System.out.println(myPets[i].toString() + "\n");
//        }
//        int i = 0;
//        for(Pet p : myPets)
//        {
//            System.out.println(p.toString() + "\n");
//        }
//        while (i < myPets.length)
//        {
//            System.out.println(myPets[i].toString() + "\n");
//            i++;
//        }

        //System.out.println("Jeff: " + Jeff.feed());
        //System.out.println("Mochi: " + Mochi.feed());
        //feed exists in both parent and child. The computer will determine which on to use
        //when we run it. This is late binding.
        //System.out.println("Jeff's weight in kgs: " + Jeff.toKilograms());
        //System.out.println("Mochi's weight in kgs: " + Mochi.toKilograms());
            //an early binding error: no method exists in either parent or child class.

        //System.out.println(Blank.toString());
        //System.out.println(Jeff.toString());
        //System.out.println(Mochi.toString());
    }
}