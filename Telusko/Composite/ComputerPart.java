package com.designpatterns;
import java.util.List;

import java.util.ArrayList;

interface Component{
    void showPrice();
}

class Leaf implements Component{
    String name;
    int price;

    public Leaf(String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : "+ price);
    }
}

class Composite implements Component {
    String name;
    List<Component> components = new ArrayList();

    public Composite(String name) {
        super();
        this.name = name;
    }

    public void addComponent(Component comp) {
        components.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c : components) {
           c.showPrice();
        }
    }
}
