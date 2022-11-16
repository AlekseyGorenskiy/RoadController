public class Main {
    public static void main (String[] args){

        Processor processor1=new Processor(500,200,500);
        StorageOfInformation storageOfInformation1=new StorageOfInformation("SSD",200,200);
        Keyboard keyboard1=new Keyboard("ппп",23,"220");
        Display display1=new Display(32,"HDD",25);
        Ram ram1=new Ram("DDR",256,200);

        Computer computer1=new Computer("LG","DNS",processor1,storageOfInformation1,keyboard1,ram1,display1);
        computer1.getTotalWeight();
        System.out.println(computer1);

    }
}
