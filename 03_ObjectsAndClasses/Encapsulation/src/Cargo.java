public class Cargo {
    private Dimensions dimensions;
    private String name;

        public Cargo (String name,Dimensions dimensions){
            this.name=name;
            this.dimensions=dimensions;

        }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Груз{" +
                "Размеры=" + dimensions +
                ", name='" + name + '\'' +
                '}';
    }
}
