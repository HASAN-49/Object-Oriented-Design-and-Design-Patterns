package BuilderPattern;

class Mojo extends ColdDrink {
    @Override
    public float price() {
        return 20.0f;
    }
    @Override
    public String name() {
        return "Mojo";
    }
}
