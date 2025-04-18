package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        TwoWheelConstants.forwardTicksToInches = .001989436789;
        TwoWheelConstants.strafeTicksToInches = .001989436789;
        // If you are having accuracy issues, you may have to come remeasure these values:
        TwoWheelConstants.forwardY = -4;
        TwoWheelConstants.strafeX = 1.75;
        TwoWheelConstants.forwardEncoder_HardwareMapName = "leftFront";
        TwoWheelConstants.strafeEncoder_HardwareMapName = "rightBack";
        TwoWheelConstants.forwardEncoderDirection = Encoder.REVERSE;
        TwoWheelConstants.strafeEncoderDirection = Encoder.FORWARD;
        TwoWheelConstants.IMU_HardwareMapName = "imu";
        TwoWheelConstants.IMU_Orientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.DOWN, RevHubOrientationOnRobot.UsbFacingDirection.LEFT);

//        ThreeWheelConstants.forwardTicksToInches = .001989436789;
//        ThreeWheelConstants.strafeTicksToInches = .001989436789;
//        ThreeWheelConstants.turnTicksToInches = .001989436789;
//        ThreeWheelConstants.leftY = 1;
//        ThreeWheelConstants.rightY = -1;
//        ThreeWheelConstants.strafeX = -2.5;
//        ThreeWheelConstants.leftEncoder_HardwareMapName = "leftFront";
//        ThreeWheelConstants.rightEncoder_HardwareMapName = "rightRear";
//        ThreeWheelConstants.strafeEncoder_HardwareMapName = "rightFront";
//        ThreeWheelConstants.leftEncoderDirection = Encoder.REVERSE;
//        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
//        ThreeWheelConstants.strafeEncoderDirection = Encoder.FORWARD;
    }
}




