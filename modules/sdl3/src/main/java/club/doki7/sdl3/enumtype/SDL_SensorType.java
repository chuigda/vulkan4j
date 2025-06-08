package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The different sensors defined by SDL.
///
/// Additional sensors may be available, using platform dependent semantics.
///
/// Here are the additional Android sensors:
///
/// https://developer.android.com/reference/android/hardware/SensorEvent.html{@code values}
///
/// Accelerometer sensor notes:
///
/// The accelerometer returns the current acceleration in SI meters per second
/// squared. This measurement includes the force of gravity, so a device at
/// rest will have an value of SDL_STANDARD_GRAVITY away from the center of the
/// earth, which is a positive Y value.
///
/// - `values[0]`: Acceleration on the x axis
/// - `values[1]`: Acceleration on the y axis
/// - `values[2]`: Acceleration on the z axis
///
/// For phones and tablets held in natural orientation and game controllers
/// held in front of you, the axes are defined as follows:
///
/// - -X ... +X : left ... right
/// - -Y ... +Y : bottom ... top
/// - -Z ... +Z : farther ... closer
///
/// The accelerometer axis data is not changed when the device is rotated.
///
/// Gyroscope sensor notes:
///
/// The gyroscope returns the current rate of rotation in radians per second.
/// The rotation is positive in the counter-clockwise direction. That is, an
/// observer looking from a positive location on one of the axes would see
/// positive rotation on that axis when it appeared to be rotating
/// counter-clockwise.
///
/// - `values[0]`: Angular speed around the x axis (pitch)
/// - `values[1]`: Angular speed around the y axis (yaw)
/// - `values[2]`: Angular speed around the z axis (roll)
///
/// For phones and tablets held in natural orientation and game controllers
/// held in front of you, the axes are defined as follows:
///
/// - -X ... +X : left ... right
/// - -Y ... +Y : bottom ... top
/// - -Z ... +Z : farther ... closer
///
/// The gyroscope axis data is not changed when the device is rotated.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GetCurrentDisplayOrientation`
///
public final class SDL_SensorType {
    public static final int INVALID = 0xffffffff;
    public static final int UNKNOWN = 0x1;
    public static final int ACCEL = 0x2;
    public static final int GYRO = 0x3;
    public static final int ACCEL_L = 0x4;
    public static final int GYRO_L = 0x5;
    public static final int ACCEL_R = 0x6;
    public static final int GYRO_R = 0x7;

    public static String explain(@EnumType(SDL_SensorType.class) int value) {
        return switch (value) {
            case SDL_SensorType.ACCEL -> "SDL_SENSOR_ACCEL";
            case SDL_SensorType.ACCEL_L -> "SDL_SENSOR_ACCEL_L";
            case SDL_SensorType.ACCEL_R -> "SDL_SENSOR_ACCEL_R";
            case SDL_SensorType.GYRO -> "SDL_SENSOR_GYRO";
            case SDL_SensorType.GYRO_L -> "SDL_SENSOR_GYRO_L";
            case SDL_SensorType.GYRO_R -> "SDL_SENSOR_GYRO_R";
            case SDL_SensorType.INVALID -> "SDL_SENSOR_INVALID";
            case SDL_SensorType.UNKNOWN -> "SDL_SENSOR_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_SensorType() {}
}
