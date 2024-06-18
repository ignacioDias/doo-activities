package remotecontrol.remote;

public class PlayStationOnCommand implements Command {
    private PlayStation playStation;
    public PlayStationOnCommand(PlayStation playStation) {
        this.playStation = playStation;
    }
    public void execute() {
        playStation.on();
    }
}
