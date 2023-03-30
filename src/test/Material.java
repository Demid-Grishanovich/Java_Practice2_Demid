package test;

public enum Material {
    STEEL("steel", 7850.0),
    COPPER("copper", 8900.0);

    private final String name;
    private final double density;

    Material(String name, double density) {
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
}