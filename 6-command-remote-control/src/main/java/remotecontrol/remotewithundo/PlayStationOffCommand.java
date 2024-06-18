package remotecontrol.remotewithundo;

public class PlayStationOffCommand implements Command {
    private PlayStation playStation;
    public void undo() {
        playStation.isOn = !playStation.isOn;
    }
    public PlayStationOffCommand(PlayStation playStation) {
        this.playStation = playStation;
    }
    public void execute() {
        playStation.off();
        playStation.isOn = false;
    }
}
