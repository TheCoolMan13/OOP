public class SmartSpeaker extends SmartDevice implements IsMutable {

    private int volume;

    public SmartSpeaker(String name, String id, boolean isOn, int volume) {
        super(name, id, isOn);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void mute()
    {
        //System.out.println("SmartSpeaker " + getName() + " is muted.");
        volume = 0;
    }

    @Override
    public void ShowStatus() {
        System.out.println("name:" + getName() + " id:" + getId() + " isOn:" + getIsOn() + " volume:" + volume);
    }
}
