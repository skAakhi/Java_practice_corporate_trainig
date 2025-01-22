package MiniTasks_company;

public abstract class Pizza {
	protected String name;
    protected double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}

class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        super("Margherita Pizza", 149);
    }
}

class ChickenPizza extends Pizza {
    public ChickenPizza() {
        super("Chicken Pizza", 199);
    }
}

class VeggiePizza extends Pizza {
    public VeggiePizza() {
        super("Veggie Pizza", 139);
    }
}


class PannerPizza extends Pizza {
    public PannerPizza() {
        super("Panner Pizza", 189);
    }
}

