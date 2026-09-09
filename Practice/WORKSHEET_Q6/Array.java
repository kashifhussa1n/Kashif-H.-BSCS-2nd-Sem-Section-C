public class Array implements Cloneable { //WHEN CLONING ALL THE CLASS WILL BE IMPLEMENT CLONEABLE SO IT KNOWS THE OBJECT'S "CLONE" METHOD
    private int[] anArray;
    private int value;

    public Array() { // null constructor
        this.anArray = new int[] { 1, 2, 3, 4, 5, 6 };
        this.value = 0;
    }

    public void increment() {
        for (int i = 0; i < this.anArray.length; i++) {
            this.anArray[i]++;
        }
        this.value++;
    }

    @Override
    public String toString() {
        String print = ""; // empty string for concatenation
        for (int i = 0; i < this.anArray.length; i++) {
            print = print + this.anArray[i];
        }

        return "Array = [" + print + "] - Value = " + this.value;
    }

    @Override
    public Array clone() throws CloneNotSupportedException { //SHALLOW CLONE
        return (Array) super.clone(); 
    }

    @Override
    public Array clone() throws CloneNotSupportedException { // DEEP CLONE
        Array copy = (Array) super.clone(); // copy object
        copy.anArray = this.anArray.clone(); // copy array
        return copy;
    }
}
