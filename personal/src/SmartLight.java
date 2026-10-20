public class SmartLight extends SmartDevice{

    private int brightness;
    private String color;

    public SmartLight(String name, String id, boolean isOn, int brightness, String color) {
        super(name, id, isOn);
        this.brightness = brightness;
        this.color = color;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void ShowStatus()
    {
        System.out.println("name:" + getName() + " id:" + getId() + " isOn:" + getIsOn() + " brightness:" + brightness + " color:" + color);
    }
}
