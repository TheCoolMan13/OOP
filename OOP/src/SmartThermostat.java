public class SmartThermostat extends SmartDevice {

    private double targetTemperature;

    public SmartThermostat(String name, String id, boolean isOn, double temperature) {
        super(name, id, isOn);
        this.targetTemperature = temperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void ShowStatus() {
        System.out.println("name:" + getName() + " id:" + getId() + " isOn:" + getIsOn() + " TargetTemp:" + targetTemperature);
    }
}
