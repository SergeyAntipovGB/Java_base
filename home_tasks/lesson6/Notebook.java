package home_tasks.lesson6;

public class Notebook {
    
    private int ram;
    private int hdd;
    private String os;
    private String color;
    
    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public Notebook(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public Notebook() {
        this.ram = 0;
        this.hdd = 0;
        this.os = "none";
        this.color = "none";
    }


    @Override
    public String toString() {
        return "ram : " + ram + ", hdd : " + hdd + ", os : " + os + ", color : " + color;
    }

    @Override
    public int hashCode() {
        return 6 * ram + 12 * hdd + 3 * os.hashCode() + 8 * color.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Notebook)) return false;
        Notebook notebook = (Notebook)o;
        return ram == notebook.ram && hdd == notebook.hdd && os.equals(notebook.os) && color.equals(notebook.color);
    }

}
