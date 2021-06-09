public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Iphone("XR");
        Phone phone2 = new Samsung("S20");

        phone1.toCall();
        phone2.toCall();

        System.out.println(phone1.getModel());
        System.out.println(phone2.getModel());
    }
}
