public abstract class SmartDevice {
    private String name;
    private String id;
    private boolean isOn;

    public SmartDevice(String name, String id, boolean isOn) {
        this.name = name;
        this.id = id;
        this.isOn = isOn;
    }

    public void ShowStatus()
    {
        System.out.println("name:" + name + " id:" + id + " isOn:" + isOn);
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public boolean getIsOn()
    {
        return isOn;
    }

    public void turnOff()
    {
        isOn = false;
        //System.out.println("SmartDevice " + name + " is turned off.");
    }

}
