public class Computer {
  Processor processor;
   Ram ram;
   StorageOfInformation storageOfInformation;
   Display display;
   Keyboard keyboard;
   final String vendor;
   final String name;
   double totalWeight;

  public Computer(String vendor, String name, Processor processor,
                  StorageOfInformation storageOfInformation, Keyboard keyboard){
    this.vendor=vendor;
    this.name=name;
    this.processor=new Processor(int frequency,int numberOfCores, double weight);
    this.keyboard=keyboard;
    this.storageOfInformation=storageOfInformation;


  }
  public double getTotalWeight() {
    return processor.getWeight()+ ram.getWeight()+;
  }

  @Override
  public String toString() {
    return "Computer{" +
            "processor=" + processor +
            ", ram=" + ram +
            ", storageOfInformation=" + storageOfInformation +
            ", display=" + display +
            ", keyboard=" + keyboard +
            ", vendor='" + vendor + '\'' +
            ", name='" + name + '\'' +
            ", totalWeight=" + totalWeight +
            '}';
  }
}
