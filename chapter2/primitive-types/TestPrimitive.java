public class TestPrimitive {
    boolean unboolean;
    byte unbyte;
    short unshort;
    int unint;
    long unlong;
    float unfloat;
    double undouble;
    char unchar;

    public static void main(String[] args) {
        TestPrimitive testPrimitive = new TestPrimitive();

	System.out.println(testPrimitive.unboolean);
	System.out.println(testPrimitive.unbyte);
	System.out.println(testPrimitive.unshort);
	System.out.println(testPrimitive.unint);
	System.out.println(testPrimitive.unlong);
	System.out.println(testPrimitive.unfloat);
	System.out.println(testPrimitive.undouble);
	System.out.println(testPrimitive.unchar);

	char otrochar = '\u0000';
	long otrolong = 1400;
	long otroint = 2_500_000_000L;
	float otrofloat = 2.5f;
	double otrodouble = 2.5;
	short otroshort = 32000;
	byte otrobyte = 14;

	System.out.println(otrochar);
	System.out.println(otrolong);
	System.out.println(otroint);
	System.out.println(otrofloat);
	System.out.println(otrodouble);
	System.out.println(otroshort);
	System.out.println(otrobyte);
    }
}
