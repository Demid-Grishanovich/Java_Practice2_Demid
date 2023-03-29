package test;

public class Material {

    private String name;
    private  double density;

    public Material() {
        // no-arg constructor
    }

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name + ";" + density;
    }

    // constants for specific materials
    public static final Material STEEL = new Material("steel", 7850.0);
    public static final  Material COPPER = new Material("copper", 8900.0);
}