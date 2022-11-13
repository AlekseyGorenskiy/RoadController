public class Computer {
   private Processor processor;
   private Ram ram;
   private StorageOfInformation storageOfInformation;
   private Display display;
   private Keyboard keyboard;
   private final String vendor;
   private final String name;
   double totalWeight;

  public Computer(String vendor, String name, Processor processor,
                  StorageOfInformation storageOfInformation, Keyboard keyboard,Ram ram,Display display){
    this.vendor=vendor;
    this.name=name;
    this.processor=processor;
    this.keyboard=keyboard;
    this.storageOfInformation=storageOfInformation;
    this.ram=ram;
    this.display=display;



  }
  public double getTotalWeight() {
    return processor.getWeight()+ ram.getWeight()+storageOfInformation.getWeight()+display.getWeight()+keyboard.getWeightBoard();
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
            ", totalWeight=" + getTotalWeight() +
            '}';
  }
}
