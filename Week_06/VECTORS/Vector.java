package Week_06.VECTORS;

public class Vector {

    private int x, y, z;

    public Vector() { // null
        x = 1;
        y = 2;
        z = 3;
    }

    public Vector(int x, int y, int z) { // param..
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(Vector v) { // copy
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }

    @Override
    public String toString() { //TO STRING
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public Vector Add(Vector v) { // vector addition method "Vector" in the name after public is the return type
                                  // of this method

        int dx = this.x + v.x;
        int dy = this.y + v.y;
        int dz = this.z + v.z;

        return new Vector(dx, dy, dz); // using "new" so it create a new Vector instead of replacing/changing original
                                       // ones

    }

    public Vector Subtract(Vector v) {

        int dx = this.x - v.x;
        int dy = this.y - v.y;
        int dz = this.z - v.z;

        return new Vector(dx, dy, dz);
    }

    public Vector Mutiply(Vector v) {

        int dx = this.x * v.x;
        int dy = this.y * v.y;
        int dz = this.z * v.z;

        return new Vector(dx, dy, dz);
    }

    public Vector Divide(Vector v) {

        int dx = this.x / v.x;
        int dy = this.y / v.y;
        int dz = this.z / v.z;

        return new Vector(dx, dy, dz);
    }

    public int dotProduct(Vector v) {

        // DOTPRODUT = a1*a2 + b1*b2 + c1*c2

        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector crossProduct(Vector v) {

        /*
         * CROSS PRODUCT =
         *
         * | i j k |
         * | a1 b1 c1 |
         * | a2 b2 c2 |
         *
         * = i | b1 c1 | - j | a1 c1 | + k | a1 b1 |
         * ....| b2 c2 | ....| a2 c2 |.... | a2 b2 |
         *
         * = i(b1*c2 - c1*b2) - j(a1*c2 - c1*a2) + k(a1*b2 - b1*a2)
         * 
         */

        int dx = (this.y * v.z) - (this.z * v.y);
        int dy = -((this.x * v.z) - (this.z * v.x));
        int dz = (this.x * v.y) - (this.y * v.x);

        return new Vector(dx, dy, dz);
    }

}
