public class Ram {
   private String typ;
   private int volume;
    final double weight;

   public Ram(String typ,int volume, double weight){
      this.weight=weight;
      this.typ=typ;
      this.volume=volume;
   }

   public double getWeight() {
      return weight;
   }

   @Override
   public String toString() {
      return "Ram{" +
              "typ='" + typ + '\'' +
              ", volume=" + volume +
              ", weight=" + weight +
              '}';
   }
}
