package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The list of buttons available on a gamepad
///
/// For controllers that use a diamond pattern for the face buttons, the
/// south/east/west/north buttons below correspond to the locations in the
/// diamond pattern. For Xbox controllers, this would be A/B/X/Y, for Nintendo
/// Switch controllers, this would be B/A/Y/X, for PlayStation controllers this
/// would be Cross/Circle/Square/Triangle.
///
/// For controllers that don't use a diamond pattern for the face buttons, the
/// south/east/west/north buttons indicate the buttons labeled A, B, C, D, or
/// 1, 2, 3, 4, or for controllers that aren't labeled, they are the primary,
/// secondary, etc. buttons.
///
/// The activate action is often the south button and the cancel action is
/// often the east button, but in some regions this is reversed, so your game
/// should allow remapping actions based on user preferences.
///
/// You can query the labels for the face buttons using
/// SDL_GetGamepadButtonLabel()
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_GamepadButton {
    public static final int INVALID = 0xffffffff;
    public static final int SOUTH = 0x1;
    public static final int EAST = 0x2;
    public static final int WEST = 0x3;
    public static final int NORTH = 0x4;
    public static final int BACK = 0x5;
    public static final int GUIDE = 0x6;
    public static final int START = 0x7;
    public static final int LEFT_STICK = 0x8;
    public static final int RIGHT_STICK = 0x9;
    public static final int LEFT_SHOULDER = 0xa;
    public static final int RIGHT_SHOULDER = 0xb;
    public static final int DPAD_UP = 0xc;
    public static final int DPAD_DOWN = 0xd;
    public static final int DPAD_LEFT = 0xe;
    public static final int DPAD_RIGHT = 0xf;
    public static final int MISC1 = 0x10;
    public static final int RIGHT_PADDLE1 = 0x11;
    public static final int LEFT_PADDLE1 = 0x12;
    public static final int RIGHT_PADDLE2 = 0x13;
    public static final int LEFT_PADDLE2 = 0x14;
    public static final int TOUCHPAD = 0x15;
    public static final int MISC2 = 0x16;
    public static final int MISC3 = 0x17;
    public static final int MISC4 = 0x18;
    public static final int MISC5 = 0x19;
    public static final int MISC6 = 0x1a;
    public static final int COUNT = 0x1b;

    public static String explain(@EnumType(SDL_GamepadButton.class) int value) {
        return switch (value) {
            case SDL_GamepadButton.BACK -> "SDL_GAMEPAD_BUTTON_BACK";
            case SDL_GamepadButton.COUNT -> "SDL_GAMEPAD_BUTTON_COUNT";
            case SDL_GamepadButton.DPAD_DOWN -> "SDL_GAMEPAD_BUTTON_DPAD_DOWN";
            case SDL_GamepadButton.DPAD_LEFT -> "SDL_GAMEPAD_BUTTON_DPAD_LEFT";
            case SDL_GamepadButton.DPAD_RIGHT -> "SDL_GAMEPAD_BUTTON_DPAD_RIGHT";
            case SDL_GamepadButton.DPAD_UP -> "SDL_GAMEPAD_BUTTON_DPAD_UP";
            case SDL_GamepadButton.EAST -> "SDL_GAMEPAD_BUTTON_EAST";
            case SDL_GamepadButton.GUIDE -> "SDL_GAMEPAD_BUTTON_GUIDE";
            case SDL_GamepadButton.INVALID -> "SDL_GAMEPAD_BUTTON_INVALID";
            case SDL_GamepadButton.LEFT_PADDLE1 -> "SDL_GAMEPAD_BUTTON_LEFT_PADDLE1";
            case SDL_GamepadButton.LEFT_PADDLE2 -> "SDL_GAMEPAD_BUTTON_LEFT_PADDLE2";
            case SDL_GamepadButton.LEFT_SHOULDER -> "SDL_GAMEPAD_BUTTON_LEFT_SHOULDER";
            case SDL_GamepadButton.LEFT_STICK -> "SDL_GAMEPAD_BUTTON_LEFT_STICK";
            case SDL_GamepadButton.MISC1 -> "SDL_GAMEPAD_BUTTON_MISC1";
            case SDL_GamepadButton.MISC2 -> "SDL_GAMEPAD_BUTTON_MISC2";
            case SDL_GamepadButton.MISC3 -> "SDL_GAMEPAD_BUTTON_MISC3";
            case SDL_GamepadButton.MISC4 -> "SDL_GAMEPAD_BUTTON_MISC4";
            case SDL_GamepadButton.MISC5 -> "SDL_GAMEPAD_BUTTON_MISC5";
            case SDL_GamepadButton.MISC6 -> "SDL_GAMEPAD_BUTTON_MISC6";
            case SDL_GamepadButton.NORTH -> "SDL_GAMEPAD_BUTTON_NORTH";
            case SDL_GamepadButton.RIGHT_PADDLE1 -> "SDL_GAMEPAD_BUTTON_RIGHT_PADDLE1";
            case SDL_GamepadButton.RIGHT_PADDLE2 -> "SDL_GAMEPAD_BUTTON_RIGHT_PADDLE2";
            case SDL_GamepadButton.RIGHT_SHOULDER -> "SDL_GAMEPAD_BUTTON_RIGHT_SHOULDER";
            case SDL_GamepadButton.RIGHT_STICK -> "SDL_GAMEPAD_BUTTON_RIGHT_STICK";
            case SDL_GamepadButton.SOUTH -> "SDL_GAMEPAD_BUTTON_SOUTH";
            case SDL_GamepadButton.START -> "SDL_GAMEPAD_BUTTON_START";
            case SDL_GamepadButton.TOUCHPAD -> "SDL_GAMEPAD_BUTTON_TOUCHPAD";
            case SDL_GamepadButton.WEST -> "SDL_GAMEPAD_BUTTON_WEST";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GamepadButton() {}
}
