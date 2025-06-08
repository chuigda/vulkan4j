package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The set of gamepad button labels
///
/// This isn't a complete set, just the face buttons to make it easy to show
/// button prompts.
///
/// For a complete set, you should look at the button and gamepad type and have
/// a set of symbols that work well with your art style.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_GamepadButtonLabel {
    public static final int UNKNOWN = 0x0;
    public static final int A = 0x1;
    public static final int B = 0x2;
    public static final int X = 0x3;
    public static final int Y = 0x4;
    public static final int CROSS = 0x5;
    public static final int CIRCLE = 0x6;
    public static final int SQUARE = 0x7;
    public static final int TRIANGLE = 0x8;

    public static String explain(@EnumType(SDL_GamepadButtonLabel.class) int value) {
        return switch (value) {
            case SDL_GamepadButtonLabel.A -> "SDL_GAMEPAD_BUTTON_LABEL_A";
            case SDL_GamepadButtonLabel.B -> "SDL_GAMEPAD_BUTTON_LABEL_B";
            case SDL_GamepadButtonLabel.CIRCLE -> "SDL_GAMEPAD_BUTTON_LABEL_CIRCLE";
            case SDL_GamepadButtonLabel.CROSS -> "SDL_GAMEPAD_BUTTON_LABEL_CROSS";
            case SDL_GamepadButtonLabel.SQUARE -> "SDL_GAMEPAD_BUTTON_LABEL_SQUARE";
            case SDL_GamepadButtonLabel.TRIANGLE -> "SDL_GAMEPAD_BUTTON_LABEL_TRIANGLE";
            case SDL_GamepadButtonLabel.UNKNOWN -> "SDL_GAMEPAD_BUTTON_LABEL_UNKNOWN";
            case SDL_GamepadButtonLabel.X -> "SDL_GAMEPAD_BUTTON_LABEL_X";
            case SDL_GamepadButtonLabel.Y -> "SDL_GAMEPAD_BUTTON_LABEL_Y";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GamepadButtonLabel() {}
}
