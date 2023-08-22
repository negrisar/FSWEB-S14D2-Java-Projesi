package Models;


import emus.PaintColor;

public class Ceiling {

   private int height;
   private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println("height: "+ getHeight() + " paintedColor: " + getPaintedColor());
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Height: " + height + "\n");
        build.append("Painted Color: " + paintedColor + "\n");
        return build.toString();
    }
}
