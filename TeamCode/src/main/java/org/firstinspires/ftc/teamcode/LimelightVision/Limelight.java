import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


public class Limelight extends OpMode {

    @Override
      public void runOpMode() throws Interrupted Exception{
                       limelight = hardwareMap.get(Limelight3A.class, "limelight");    }
}