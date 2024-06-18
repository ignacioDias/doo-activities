package remotecontrol.remote;

public class PlayStationOffCommand implements Command {
    private PlayStation playStation;
    public PlayStationOffCommand(PlayStation playStation) {
        this.playStation = playStation;
    }
    public void execute() {
        playStation.off();
    }
}
