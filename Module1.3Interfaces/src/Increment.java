public class Increment implements increaseByFactor{
    int value = 5;

    @Override
    public void getNext() {
        value += FACTOR;
    }

    @Override
    public void setStart(int x) {
        value = x;
    }
}
