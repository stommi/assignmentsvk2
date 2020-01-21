package TDD;

public class Laskin {
    public int plussaa(int x, int y) {
        return x + y;
    }

    public int miinusta(int x, int y) {
        return x - y;
    }

    public int kerro(int x, int y) {
        return x * y;
    }

    public double jaa(int jaettava, int jakaja) throws ArithmeticException {
        return 1.0*jaettava / jakaja*1.0;
    }
}
