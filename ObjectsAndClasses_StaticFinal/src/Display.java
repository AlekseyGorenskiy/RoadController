public class Display {
    private final int diagonal;
    private final String typScreen;
    private final int weight;

    public Display(int diagonal,String typScreen, int weight){
       this.diagonal=diagonal;
       this.typScreen=typScreen;
       this.weight=weight;
   }

    public int getWeight() {
        return weight;
    }
}
