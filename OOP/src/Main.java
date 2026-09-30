import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        SmartLight bec1 = new SmartLight("Bec1", "1", true, 100, "red");
        //bec1.ShowStatus();

        SmartThermostat termostat1 = new SmartThermostat("Termostat1", "2", false, 22.5);
        //termostat1.ShowStatus();

        SmartSpeaker speaker1 = new SmartSpeaker("Speaker1", "3", true, 50);
        //speaker1.ShowStatus();

        Room cameraMea = new Room("Camera Mea", new ArrayList<SmartDevice>());
        cameraMea.addDevice(bec1);
        cameraMea.addDevice(termostat1);
        cameraMea.addDevice(speaker1);

        cameraMea.showStatus();

        cameraMea.turnOffRoom();
        cameraMea.showStatus();

        speaker1.mute();
        cameraMea.showStatus();

    }
}
