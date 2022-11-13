public class Processor {
       private int frequency = 500; //гц
       private final int numberOfCores;
       private final double weight;

       public Processor(int frequency,int numberOfCores, double weight){
          this.frequency=frequency;
          this.numberOfCores=numberOfCores;
          this.weight=weight;
      }



    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", numberOfCores=" + numberOfCores +
                ", weight=" + weight +
                '}';
    }
}
