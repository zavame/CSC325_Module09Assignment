package com.example.garmentsimulator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Professional Garment Set:");
        GarmentSimulator professionalGarments = new GarmentSimulator(new ProfessionalFactory());
        professionalGarments.displayGarments();

        System.out.println("\nCasual Garment Set:");
        GarmentSimulator casualGarments = new GarmentSimulator(new CasualFactory());
        casualGarments.displayGarments();

        System.out.println("\nParty Garment Set:");
        GarmentSimulator partyGarments = new GarmentSimulator(new PartyFactory());
        partyGarments.displayGarments();
    }
}
