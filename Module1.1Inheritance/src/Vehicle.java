public class Vehicle {
    public int registrationNumber;
    public Person owner;

    Vehicle(int registrationNumber, Person owner){
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    Vehicle(){
        registrationNumber = 0;
        owner = null;
    }

    public void honk(){
        System.out.println("beep");
    }
}
