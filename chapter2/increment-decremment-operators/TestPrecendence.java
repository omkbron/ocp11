public class TestPrecendence {

    public static void main(String... args) {
        int lion = 4;
        int tiger = ++lion * 6 / lion--;
        System.out.println("lion is "  + lion);
        System.out.println("tiger is " + tiger);

        int lion2 = 5;
        int tiger2 = ++lion + lion--;
        System.out.println("lion2 is "  + lion2);
        System.out.println("tiger2 is " + tiger2);
    }

}
