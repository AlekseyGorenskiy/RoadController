public class Dimensions {

    private final String lon;
    private final String width;
    private final String height;
    private final Boolean upheaval;
    private  final String ID;
    private final boolean fragile;



    public Dimensions(String lon, String width, String height, boolean upheaval, String ID,
                      boolean fragile) {
        this.lon=lon;
        this.fragile=fragile;
        this.width=width;
        this.height=height;
        this.upheaval=upheaval;
        this.ID=ID;
        


    }
       public  Dimensions setLon (String lon){
        return new Dimensions( lon, width, height, upheaval,ID, fragile);
       }
    public String getLon() {
        return lon;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public Boolean getUpheaval() {
        return upheaval;
    }

    public String getID() {
        return ID;
    }

    public boolean isFragile() {
        return fragile;
    }



    @Override
    public String toString() {
        return "Dimensions{" +
                "длина='" + lon + '\'' +
                ", ширина='" + width + '\'' +
                ", высота='" + height + '\'' +
                ", Возможность переворачивать:" + upheaval +
                ", ID='" + ID + '\'' +
                ", хрупкий" + fragile +
                '}';
    }
}

