// Task preamble was innaccurate (about course info etc - can be stripped out
public class Coffee {

    private String type;
    private String size;
    private boolean extraShot;
    private boolean milk;
    private String milkType;

    // no explicit constructor requested.
    public Coffee() {
        this.type = "Espresso";
        this.size = "Small";
        this.extraShot = false;
        this.milk = false;
        this.milkType = "None";
    }

    // requested constructor
    public Coffee(String type, String size, boolean extraShot, boolean milk, String milkType) {
        this.type = type;
        this.size = size;
        this.extraShot = extraShot;
        this.milk = milk;
        this.milkType = milkType;
    }

    public String printOrderDetails() {
        return "Your order today is a " + this.size + " " + this.type + " with " + this.milkType + " milk.";
    }

    // Did not access for getter setter methods explicitly - felt like it should give a skeleton code of the example?
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean getExtraShot() {
        return this.extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean getMilk() {
        return this.milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public String getMilkType() {
        return this.milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Your order today is a " + myCoffee.size + " " + myCoffee.type + " with " + myCoffee.milkType + " milk.");
        Coffee myCoffee2 = new Coffee("Latte", "Large", true, true, "Soy");
        System.out.println("Your order today is a " + myCoffee2.size + " " + myCoffee2.type + " with " + myCoffee2.milkType + " milk.");
        Coffee myCoffee3 = new Coffee("Cappuccino", "Medium", false, true, "Oat");
        System.out.println(myCoffee3.printOrderDetails());
    }
}
