package Models;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private  int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public String getStyle() {return style;}

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Style: " + style + "\n");
        build.append("Pillow: " + pillows + "\n");
        build.append("Sheets: " + sheets + "\n");
        build.append("Quilt: " + quilts + "\n");
        return build.toString();
    }
}
