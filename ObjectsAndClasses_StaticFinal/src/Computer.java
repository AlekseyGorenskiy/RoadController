public class Computer {
  private Processor processor;
  private Ram ram;
  private StorageOfInformation storageOfInformation;
  private Display display;
  private Keyboard keyboard;
  private final String vendor;
  private final String name;
  private double totalWeight;

  public Computer(String vendor, String name){
    this.vendor=vendor;
    this.name=name;
  }



  public double getTotalWeight() {
    return processor.getWeight()+ ram.getWeight();
  }


}
