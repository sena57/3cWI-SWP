package at.sena.oo;

public class Tire {
    private int size;
    private int position; //0 ist vorne links, 1 vorne rechts, 2 hinten links, 3 hinten rechts

    public Tire(int size, int position){
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
