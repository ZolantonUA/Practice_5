public class Iphone extends Phone{
    private String model;

    public Iphone(String model){
        super(model);
    }

    @Override
    public void toCall() {
        System.out.println("Iphone call");
    }
}
