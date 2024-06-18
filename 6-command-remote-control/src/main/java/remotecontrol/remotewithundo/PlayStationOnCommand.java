package remotecontrol.remotewithundo;

public class PlayStationOnCommand implements Command {
    private PlayStation playStation;
    public PlayStationOnCommand(PlayStation playStation) {
        this.playStation = playStation;
    }
    public void undo() {
        playStation.isOn = !playStation.isOn;
    }
    public void execute() {
        playStation.on();
        playStation.isOn = true;
    }
}
