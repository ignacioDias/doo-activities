package remotecontrol.remote;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class RemoteTests {
    public static void main(String args[]) {
        PlayStation playStation = new PlayStation("2.0");
        RemoteControl remoteControl = new RemoteControl();
        Command turnOnPS = new PlayStationOnCommand(playStation);
        Command turnOffPS = new PlayStationOffCommand(playStation);
        remoteControl.setCommand(0, turnOnPS, turnOffPS);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
    }
}
