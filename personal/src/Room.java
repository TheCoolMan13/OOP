import java.util.List;

public class Room {

    private String name;
    private List<SmartDevice> devices;

    public Room(String name, List<SmartDevice> devices) {
        this.name = name;
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public List<SmartDevice> getDevices() {
        return devices;
    }

    public void showStatus() {
        System.out.println("Room: " + name);
        for (SmartDevice device : devices) {
            device.ShowStatus();
        }
    }

    public void turnOffRoom()
    {
        for(SmartDevice device : devices)
            device.turnOff();
    }

    public void addDevice(SmartDevice device)
    {
        devices.add(device);
        System.out.println("Device " + device.getName() + " added to room " + name);
    }

}
