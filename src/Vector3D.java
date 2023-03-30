public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(x - other.x, y - other.y, z - other.z);
    }

    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(x * scalar, y * scalar, z * scalar);
    }

    public boolean equals(Vector3D other) {
        return x == other.x && y == other.y && z == other.z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int compareTo(Vector3D other) {
        return Double.compare(this.length(), other.length());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        Vector3D v3 = v1.add(v2);
        System.out.println("v1 + v2 = " + v3);

        Vector3D v4 = v1.subtract(v2);
        System.out.println("v1 - v2 = " + v4);

        double dot = v1.dotProduct(v2);
        System.out.println("v1 . v2 = " + dot);

        Vector3D v5 = v1.multiply(2);
        System.out.println("2 * v1 = " + v5);

        boolean eq = v1.equals(v2);
        System.out.println("v1 == v2? " + eq);

        double len1 = v1.length();
        double len2 = v2.length();
        System.out.println("length(v1) = " + len1);
        System.out.println("length(v2) = " + len2);

        int cmp = v1.compareTo(v2);
        System.out.println("compare(v1, v2) = " + cmp);
    }
}
