public class Keyboard {
    final String type;
    private final String backlight;
    private final double weightBoard;

    public Keyboard(String backlight, double weightBoard, String type) {
        this.backlight = backlight;
        this.weightBoard = weightBoard;
        this.type=type;
    }

    public double getWeightBoard() {
        return weightBoard;
    }
}
