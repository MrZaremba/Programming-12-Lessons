public class Motorcycle extends Vehicle{
    public boolean hasSideCar;

    Motorcycle(int registrationNumber, Person owner, boolean hasSideCar){
        super(registrationNumber,owner);
        this.hasSideCar = hasSideCar;
    }

    Motorcycle(boolean hasSideCar){
        this.hasSideCar = hasSideCar;
    }

    public String toString(){
        return "Motorcucle, Owner: " + owner;
    }


    public void honk(){
        System.out.println("motorcycle goes vroom");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Motorcycle){
            Motorcycle other = (Motorcycle)obj;
            if(this.owner.equals(other.owner)) {
                return true;
            }
        }
        return false;
    }

}
