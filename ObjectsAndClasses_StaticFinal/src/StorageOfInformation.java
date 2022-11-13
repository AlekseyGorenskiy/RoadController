public class StorageOfInformation {
    private final String typ;
    private final int memoryСapacity;
    private final double weight;

    public StorageOfInformation(String typ,int memoryСapacity, double weight){
        this.memoryСapacity=memoryСapacity;
        this.typ=typ;
        this.weight=weight;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "StorageOfInformation{" +
                "typ='" + typ + '\'' +
                ", memoryСapacity=" + memoryСapacity +
                ", weight=" + weight +
                '}';
    }
}
