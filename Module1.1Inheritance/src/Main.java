public class Main {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(1, new Person(), true);
        Motorcycle motorcycle1 = new Motorcycle(1,new Person(),false);
        System.out.println(motorcycle.equals(motorcycle1));

    }
}
