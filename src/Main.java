import Models.*;
import emus.LampType;
import emus.PaintColor;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------bedroom--------");

        Bedroom bedroom = new Bedroom("first",
                new Wall("North"),
                new Wall("South"),
                new Wall("East"),
                new Wall("West"),
                new Ceiling(3, PaintColor.BLACK),
                new Lamp(LampType.WHITE, true, 3),
                new Bed("Double", 2, 1, 2, 2),
                new Wardrobe(2, 4, 50),
                new Carpet(3, 5, PaintColor.GREEN));

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println(bedroom);

        System.out.println(bedroom.getWall3());



    }
}