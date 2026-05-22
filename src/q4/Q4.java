package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter owner's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter owner's phone number: ");
        String phone = scanner.nextLine();

        Owner owner = new Owner(name, phone);
        Bicycle bike = new Bicycle(owner);

        System.out.println("\n--- Bicycle Registration Details ---");
        System.out.println("Owner Name: " + bike.getOwner().getOwnerName());
        System.out.println("Phone Number: " + bike.getOwner().getPhoneNo());

        scanner.close();
    }
}

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}