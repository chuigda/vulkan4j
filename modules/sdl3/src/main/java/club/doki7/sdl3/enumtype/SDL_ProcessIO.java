package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Description of where standard I/O should be directed when creating a
/// process.
///
/// If a standard I/O stream is set to SDL_PROCESS_STDIO_INHERITED, it will go
/// to the same place as the application's I/O stream. This is the default for
/// standard output and standard error.
///
/// If a standard I/O stream is set to SDL_PROCESS_STDIO_NULL, it is connected
/// to `NUL:` on Windows and `/dev/null` on POSIX systems. This is the default
/// for standard input.
///
/// If a standard I/O stream is set to SDL_PROCESS_STDIO_APP, it is connected
/// to a new SDL_IOStream that is available to the application. Standard input
/// will be available as `SDL_PROP_PROCESS_STDIN_POINTER` and allows
/// SDL_GetProcessInput(), standard output will be available as
/// `SDL_PROP_PROCESS_STDOUT_POINTER` and allows SDL_ReadProcess() and
/// SDL_GetProcessOutput(), and standard error will be available as
/// `SDL_PROP_PROCESS_STDERR_POINTER` in the properties for the created
/// process.
///
/// If a standard I/O stream is set to SDL_PROCESS_STDIO_REDIRECT, it is
/// connected to an existing SDL_IOStream provided by the application. Standard
/// input is provided using `SDL_PROP_PROCESS_CREATE_STDIN_POINTER`, standard
/// output is provided using `SDL_PROP_PROCESS_CREATE_STDOUT_POINTER`, and
/// standard error is provided using `SDL_PROP_PROCESS_CREATE_STDERR_POINTER`
/// in the creation properties. These existing streams should be closed by the
/// application once the new process is created.
///
/// In order to use an SDL_IOStream with SDL_PROCESS_STDIO_REDIRECT, it must
/// have `SDL_PROP_IOSTREAM_WINDOWS_HANDLE_POINTER` or
/// `SDL_PROP_IOSTREAM_FILE_DESCRIPTOR_NUMBER` set. This is true for streams
/// representing files and process I/O.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateProcessWithProperties
/// \sa SDL_GetProcessProperties
/// \sa SDL_ReadProcess
/// \sa SDL_GetProcessInput
/// \sa SDL_GetProcessOutput
///
public final class SDL_ProcessIO {
    public static final int SDL_PROCESS_STDIO_INHERITED = 0x0;
    public static final int SDL_PROCESS_STDIO_NULL = 0x1;
    public static final int SDL_PROCESS_STDIO_APP = 0x2;
    public static final int SDL_PROCESS_STDIO_REDIRECT = 0x3;

    public static String explain(@EnumType(SDL_ProcessIO.class) int value) {
        return switch (value) {
            case SDL_ProcessIO.SDL_PROCESS_STDIO_APP -> "SDL_PROCESS_STDIO_APP";
            case SDL_ProcessIO.SDL_PROCESS_STDIO_INHERITED -> "SDL_PROCESS_STDIO_INHERITED";
            case SDL_ProcessIO.SDL_PROCESS_STDIO_NULL -> "SDL_PROCESS_STDIO_NULL";
            case SDL_ProcessIO.SDL_PROCESS_STDIO_REDIRECT -> "SDL_PROCESS_STDIO_REDIRECT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ProcessIO() {}
}
