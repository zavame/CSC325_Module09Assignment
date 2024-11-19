package com.example.garmentsimulator;

// Interfaces for Tops, Pants, and Shoes
interface Tops {
    void display();
}

interface Pants {
    void display();
}

interface Shoes {
    void display();
}

// Implementations of Professional garments
class ProfessionalTops implements Tops {
    public void display() {
        System.out.println("Professional Top");
    }
}

class ProfessionalPants implements Pants {
    public void display() {
        System.out.println("Professional Pants");
    }
}

class ProfessionalShoes implements Shoes {
    public void display() {
        System.out.println("Professional Shoes");
    }
}

// Implementations of Casual garments
class CasualTops implements Tops {
    public void display() {
        System.out.println("Casual Top");
    }
}

class CasualPants implements Pants {
    public void display() {
        System.out.println("Casual Pants");
    }
}

class CasualShoes implements Shoes {
    public void display() {
        System.out.println("Casual Shoes");
    }
}

// Implementations of Party garments
class PartyTops implements Tops {
    public void display() {
        System.out.println("Party Top");
    }
}

class PartyPants implements Pants {
    public void display() {
        System.out.println("Party Pants");
    }
}

class PartyShoes implements Shoes {
    public void display() {
        System.out.println("Party Shoes");
    }
}
