package Org.Stream_Collection_Example.Injection_Refrence_Type;

public class B {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B() {
      super();
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}


