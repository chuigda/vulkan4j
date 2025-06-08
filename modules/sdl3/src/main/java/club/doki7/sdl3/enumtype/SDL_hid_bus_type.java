package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// HID underlying bus types.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_hid_bus_type {
    /// Unknown bus type
    public static final int UNKNOWN = 0x0;

    /// USB bus
    /// Specifications:
    /// https://usb.org/hid
    public static final int USB = 0x1;

    /// Bluetooth or Bluetooth LE bus
    /// Specifications:
    /// https://www.bluetooth.com/specifications/specs/human-interface-device-profile-1-1-1/
    /// https://www.bluetooth.com/specifications/specs/hid-service-1-0/
    /// https://www.bluetooth.com/specifications/specs/hid-over-gatt-profile-1-0/
    public static final int BLUETOOTH = 0x2;

    /// I2C bus
    /// Specifications:
    /// https://docs.microsoft.com/previous-versions/windows/hardware/design/dn642101(v=vs.85)
    public static final int I2C = 0x3;

    /// SPI bus
    /// Specifications:
    /// https://www.microsoft.com/download/details.aspx?id=103325
    public static final int SPI = 0x4;

    public static String explain(@EnumType(SDL_hid_bus_type.class) int value) {
        return switch (value) {
            case SDL_hid_bus_type.BLUETOOTH -> "SDL_HID_API_BUS_BLUETOOTH";
            case SDL_hid_bus_type.I2C -> "SDL_HID_API_BUS_I2C";
            case SDL_hid_bus_type.SPI -> "SDL_HID_API_BUS_SPI";
            case SDL_hid_bus_type.UNKNOWN -> "SDL_HID_API_BUS_UNKNOWN";
            case SDL_hid_bus_type.USB -> "SDL_HID_API_BUS_USB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_hid_bus_type() {}
}
