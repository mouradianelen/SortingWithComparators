package Sorting;

public class Test implements Comparable<Test>{
    private int value;

    public Test(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Test o) {
        return this.value-o.getValue();
    }

    @Override
    public String toString() {
        return
                ""+value;

    }
}
