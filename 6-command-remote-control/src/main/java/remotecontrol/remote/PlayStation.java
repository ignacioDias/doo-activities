package remotecontrol.remote;

public class PlayStation {
    String version = "";

    public PlayStation(String version) {
        this.version = version;
    }
    public void on() {
        System.out.println("PS is on");
    }
    public void off() {
        System.out.println("PS is off");
    }
}
