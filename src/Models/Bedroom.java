package Models;

public class Bedroom {

    public String name;
    public Wall wall1, wall2, wall3, wall4;
    public Ceiling ceiling;
    public Carpet carpet;
    public Wardrobe wardrobe;
    public Bed bed;
    public Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Carpet carpet, Wardrobe wardrobe, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.carpet = carpet;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Bedroom(String first, Wall north, Wall south, Wall east, Wall west, Ceiling ceiling, Lamp lamp, Bed aDouble, Wardrobe wardrobe, Carpet carpet) {
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Bedroom:" + "\n");
        build.append("\n" + "Name: " + getName() + "\n");
        build.append("Wall1: " + getWall1() + "\n");
        build.append("Wall2: " + getWall2() + "\n");
        build.append("Wall3: " + getWall3() + "\n");
        build.append("Wall4: " + getWall4() + "\n");
        build.append("Ceiling: " + getCeiling() + "\n");
        build.append("Bed: " + bed + "\n");
        build.append("Lamp: " + lamp + "\n");
        build.append("Wardrobe: " + wardrobe + "\n");
        build.append("Carpet: " + carpet + "\n");
        return build.toString();
    }
}
