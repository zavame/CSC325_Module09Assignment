package com.example.garmentsimulator;

class GarmentSimulator {
    private Tops tops;
    private Pants pants;
    private Shoes shoes;

    // Constructor takes a factory to create a garment set
    public GarmentSimulator(GarmentFactory factory) {
        tops = factory.createTops();
        pants = factory.createPants();
        shoes = factory.createShoes();
    }

    // Display the garments in the set
    public void displayGarments() {
        tops.display();
        pants.display();
        shoes.display();
    }
}
