public class Processor {
    public  int frequency = 500; //гц
       final int numberOfCores;
       final double weight;
      public Processor(int frequency,int numberOfCores, double weight){
          this.frequency=frequency;
          this.numberOfCores=numberOfCores;
          this.weight=weight;
      }



    public double getWeight() {
        return weight;
    }

}
