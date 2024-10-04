import java.util.Scanner;

public class VehicleTaxCalculator {
    public  void CalculateTaxes(String vehicleType, double cif, int seatingCapacity, double grossWeight, int engineCapacity, int age, String transportationMode, int bondDays) {
        double infrastructureLevy = 150000;
        double stampDuty = 35000;
        double formFees = 20000;
        double exciseDuty = 200000;
        double registrationFee = 0;


        double importDuty = 0.25 * cif;
        double vat = 0.18 * cif;
        double withholdingTax = 0.06 * cif;
        double seatingTax = 0;
        double grossWeightTax = 0;
        double engineCapacityTax = 0;
        double ageTax = 0;
        double roadToll = 0;

        if (vehicleType.equals("Ambulance")) {
            registrationFee = 700000;
            stampDuty = 35000;
            formFees = 20000;
            exciseDuty = 200000;

            registrationFee = 700000;

            System.out.println("Is required to fit a Digital Plate Systems");

            if (age > 10) {
                infrastructureLevy = 0.15 * cif;
            } else {
                infrastructureLevy = 150000;
            }
        }

        if (vehicleType.equals("Estate")) {
            importDuty = 0.25 * cif;
            vat = 0.18 * cif;
            withholdingTax = 0.06 * cif;
            infrastructureLevy = 150000;
            stampDuty = 35000;
            formFees = 20000;
            exciseDuty = 200000;

            registrationFee = 300000;
            System.out.println("Is required to fit a Digital Plate Systems or APS");

            if (seatingCapacity > 5) {
                seatingTax = (seatingCapacity - 5) * 250000;
            }
            if (grossWeight >= 1500 && grossWeight <= 2000) {
                grossWeightTax = 0.05 * cif;
            }
            if (grossWeight > 2000) {
                grossWeightTax = 0.10 * cif;
            }
            if (grossWeight < 1500) {
                grossWeightTax = 0.02 * cif;
            }
            if (engineCapacity > 1800) {
                engineCapacityTax = 0.05 * cif;
            }
            if (engineCapacity < 1800) {
                engineCapacityTax = 0.025 * cif;
            }
            if (age >= 1 && age <= 5) {
                ageTax = 0.01 * cif;
            }
            if (age > 5 && age < 10) {
                ageTax = 0.05 * cif;
            }
            if (age > 10) {
                ageTax = 0.15 * cif;
            }
        }


        if (vehicleType.equals("sedan")) {
            importDuty = 0.25 * cif;
            vat = 0.18 * cif;
            withholdingTax = 0.06 * cif;
            infrastructureLevy = 150000;
            stampDuty = 35000;
            formFees = 20000;
            exciseDuty = 200000;

            registrationFee = 700000;
            System.out.println("Is required to fit a Digital Plate Systems");


            if (grossWeight > 1500 && grossWeight <= 2000) {
                grossWeightTax = 0.10 * cif;
            }
            if (grossWeight > 2000) {
                grossWeightTax = 0.15 * cif;
            }
            if (grossWeight < 1500) {
                grossWeightTax = 0.02 * cif;
            }
            if (engineCapacity > 2000) {
                engineCapacityTax = 0.10 * cif;
            }
            if (engineCapacity > 1500 && engineCapacity < 2000) {
                engineCapacityTax = 0.05 * cif;
            }
            if (engineCapacity < 1500) {
                engineCapacityTax = 0.025 * cif;
            }
            if (age > 15) {
                System.out.println("Cannot be imported into the Country");
            }
            if (age > 10 && age < 15) {
                ageTax = 0.10 * cif;
            }
            if (age > 5 && age < 10) {
                ageTax = 0.05 * cif;
            }
            if (age < 5) {
                ageTax = 0.015 * cif;
            }
        }

        if (vehicleType.equals("SUV")) {
            importDuty = 0.25 * cif;
            vat = 0.18 * cif;
            withholdingTax = 0.06 * cif;
            infrastructureLevy = 150000;
            stampDuty = 35000;
            formFees = 20000;
            exciseDuty = 200000;

            registrationFee = 300000;
            System.out.println("Is required to fit APS");

            if (seatingCapacity > 5) {
                seatingTax = (seatingCapacity - 5) * 350000;
            }
            if (grossWeight > 5000) {
                grossWeightTax = 0.15 * cif;
            }
            if (grossWeight < 5000) {
                System.out.println("Vehicle wont pay anything");
            }
            if (age > 1 && age < 5) {
                ageTax = 0.01 * cif;
            }
            if (age > 5 && age < 10) {
                ageTax = 0.15 * cif;
            }
            if (age > 10) {
                ageTax = 0.25 * cif;
            }
        }

        if (vehicleType.equals("Trailer")) {
            importDuty = 0.25 * cif;
            vat = 0.18 * cif;
            withholdingTax = 0.06 * cif;
            infrastructureLevy = 150000;
            stampDuty = 35000;
            formFees = 20000;
            exciseDuty = 200000;

            registrationFee = 300000;
            System.out.println("Is required to fit a Digital Plate Systems or APS");

            if (grossWeight > 15000 && grossWeight <= 20000) {
                grossWeightTax = 0.15 * cif;
            }
            if (grossWeight > 20000) {
                grossWeightTax = 0.25 * cif;
            }
            if (grossWeight < 15000) {
                grossWeightTax = 0.05 * cif;
            }
            if (engineCapacity > 20000) {
                engineCapacityTax = 0.10 * cif;
            }
            if (engineCapacity > 15000 && engineCapacity < 20000) {
                engineCapacityTax = 0.05 * cif;
            }
            if (engineCapacity < 15000) {
                engineCapacityTax = 0.025 * cif;
            }
            if (age > 15) {
                System.out.println("Cannot be imported into the Country");
            }
            if (age < 15 && age >= 10) {
                ageTax = 0.10 * cif;
            }
            if (age < 10 && age >= 5) {
                ageTax = 0.05 * cif;
            }
            if (age < 5) {
                ageTax = 0.015 * cif;
            }
        } else if (vehicleType.equals("Any Car that is not an Ambulance,Estate,Sedan,Sports Utility Vehicle,Trailer")) {
            importDuty = 0.25 * cif;
            vat = 0.18 * cif;
            withholdingTax = 0.06 * cif;
            infrastructureLevy = 150000;
            stampDuty = 35000;
            formFees = 20000;
            exciseDuty = 200000;

            System.out.println("Is required to fit an APS or DPS");
        }

        if (transportationMode.equals("Carrier")) {
            roadToll = 0.005 * cif;
        } else if (transportationMode.equals("Driven")) {
            roadToll = 0.015 * cif;
        }

        double parkingFee = bondDays * 15000;

        double totalTaxes = importDuty + vat + withholdingTax + infrastructureLevy + stampDuty + formFees + exciseDuty + registrationFee + grossWeight + engineCapacityTax + seatingTax + ageTax + roadToll + parkingFee;

        System.out.println("totalTaxes" + totalTaxes);
        System.out.println("importDuty" + importDuty);
        System.out.println("vat" + vat);
        System.out.println("withholdingTax" + withholdingTax);
        System.out.println("infrastructureLevy" + infrastructureLevy);
        System.out.println("stampDuty" + stampDuty);
        System.out.println("formFees" + formFees);
        System.out.println("exciseDuty" + exciseDuty);
        System.out.println("registrationFee" + registrationFee);
        System.out.println("ageTax" + ageTax);
        System.out.println("roadToll" + roadToll);
        System.out.println("parkingFee" + parkingFee);
        System.out.println("engineCapacityTax" + engineCapacityTax);
        System.out.println("seatingTax" + seatingTax);
        System.out.println("grossWeightTax" + grossWeightTax);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type");
        String vehicleType = sc.nextLine();

        System.out.println("Enter Cif Value");
        double cif = sc.nextDouble();

        System.out.println(" Enter grossWeight(tons)");
        double grossWeight = sc.nextDouble();

        System.out.println("Enter seating Capacity");
        int seatingCapacity = sc.nextInt();

        System.out.println("Enter engine Capacity(CC)");
        int engineCapacity = sc.nextInt();

        System.out.println("Enter  vehicle age (years)");
        int age = sc.nextInt();

        System.out.println("Enter  vehicle transportation mode");
       String transportationMode = sc.nextLine();

       System.out.println("Enter number of days in bond");
       int bondDays = sc.nextInt();

        }

}
