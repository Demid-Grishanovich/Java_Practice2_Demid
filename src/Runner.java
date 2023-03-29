import test.Material;
import test.Subject;

public class Runner {

    public static void main(String[] args) {

        // create a steel wire object with volume 0.03 cubic meters
        Subject wire = new Subject("wire", Material.STEEL, 0.03);

        // output the object content using toString method
        System.out.println(wire);

        // update the wire material to copper
        wire.setMaterial(Material.COPPER);

        // output the wire mass
        System.out.println("The wire mass is " + wire.getMass() + " kg.");
    }
}
