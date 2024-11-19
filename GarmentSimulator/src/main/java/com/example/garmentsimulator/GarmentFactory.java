package com.example.garmentsimulator;

// interface to create garment families
interface GarmentFactory {
    Tops createTops();
    Pants createPants();
    Shoes createShoes();
}

// Professional garments
class ProfessionalFactory implements GarmentFactory {
    public Tops createTops() {
        return new ProfessionalTops();
    }
    public Pants createPants() {
        return new ProfessionalPants();
    }
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}

//  Casual garments
class CasualFactory implements GarmentFactory {
    public Tops createTops() {
        return new CasualTops();
    }
    public Pants createPants() {
        return new CasualPants();
    }
    public Shoes createShoes() {
        return new CasualShoes();
    }
}

//  Party garments
class PartyFactory implements GarmentFactory {
    public Tops createTops() {
        return new PartyTops();
    }
    public Pants createPants() {
        return new PartyPants();
    }
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
