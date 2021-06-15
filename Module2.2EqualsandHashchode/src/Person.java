public class Person {
    int age;
    int id;
    String name;

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person other = (Person) obj;
            if(this.name.equals(other.name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "" + id;
    }
}
