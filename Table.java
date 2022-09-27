import java.util.ArrayList;

public class Table {
    private double heightInMeters;
    private double widthInMeters;
    private double depthInMeters;
    private int nLegs;
    private String color;
    private double capacity;
    private double weightUsed;

    public Table() {
        this.weightUsed = 0;
    }
    public void addObject(double weight) {
        this.weightUsed += weight;
        boolean isCapable = this.weightUsed <= this.capacity;
        if (isCapable) {
            System.out.println("Objeto adicionado com sucesso!");
        } else {
            System.out.println("Overload.");
            this.weightUsed -= weight;
        }
    }

    public double getHeightInMeters() { return this.heightInMeters; }
    public void setHeightInMeters(double heightInMeters) { 
        this.heightInMeters = heightInMeters;
        this.recalculateCapacity();
    }
    public double getWidthInMeters() { return this.widthInMeters; }
    public void setWidthInMeters(double widthInMeters) { 
        this.widthInMeters = widthInMeters;
        this.recalculateCapacity();
    }
    public double getDepthInMeters() { return this.depthInMeters; }
    public void setDepthInMeters(double depthInMeters) { 
        this.depthInMeters = depthInMeters;
        this.recalculateCapacity();
    }
    public int getNLegs() { return this.nLegs; }
    public void setNLegs(int nLegs) { 
        this.nLegs = nLegs;
    }
    public String getColor() { return this.color; }
    public void setColor(String color) { 
        this.color = color;
    }
    public double getCapacity() { return this.capacity; }
    public void setCapacity(double capacity) { 
        this.capacity = capacity;
        this.recalculateCapacity();
    }
    private void recalculateCapacity() {
        double factor = 300;
        this.capacity = this.widthInMeters * this.heightInMeters * this.depthInMeters * factor;
        System.out.println("Nova capacidade:");
        System.out.println(this.capacity);
    }

    public static void main(String[] args) {
        Table table = new Table();
        table.setWidthInMeters(1.2);
        table.setDepthInMeters(0.8);
        table.setHeightInMeters(0.8);
        table.setColor("Grey");
        table.setNLegs(2);
        table.addObject(330);
        table.addObject(0.4);
    }

}