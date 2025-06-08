package club.doki7.sdl3;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.sdl3.datatype.*;

public final class SDL3FunctionTypes {
    public static final FunctionDescriptor PFN_SDL_IOStreamInterface_close = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_IOStreamInterface_flush = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor PFN_SDL_IOStreamInterface_read = FunctionDescriptor.of(
        NativeLayout.C_SIZE_T,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor PFN_SDL_IOStreamInterface_seek = FunctionDescriptor.of(
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFN_SDL_IOStreamInterface_size = FunctionDescriptor.of(
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_IOStreamInterface_write = FunctionDescriptor.of(
        NativeLayout.C_SIZE_T,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_close = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_copy = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_enumerate = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_info = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(SDL_PathInfo.LAYOUT)
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_mkdir = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_read_file = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_ready = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_remove = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_rename = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_space_remaining = FunctionDescriptor.of(
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_StorageInterface_write_file = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_Cleanup = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_Rumble = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_SHORT,
        ValueLayout.JAVA_SHORT
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_RumbleTriggers = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_SHORT,
        ValueLayout.JAVA_SHORT
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_SendEffect = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_SetLED = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_BYTE
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_SetPlayerIndex = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_SetSensorsEnabled = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_BOOLEAN
    );

    public static final FunctionDescriptor PFN_SDL_VirtualJoystickDesc_Update = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_AppEvent_func = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(SDL_Event.LAYOUT)
    );

    public static final FunctionDescriptor SDL_AppInit_func = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
    );

    public static final FunctionDescriptor SDL_AppIterate_func = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_AppQuit_func = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor SDL_AudioPostmixCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(SDL_AudioSpec.LAYOUT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor SDL_AudioStreamCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor SDL_CleanupPropertyCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_ClipboardCleanupCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_ClipboardDataCallback = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T)
    );

    public static final FunctionDescriptor SDL_CompareCallback = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_CompareCallback_r = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_DialogFileCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor SDL_EGLAttribArrayCallback = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(NativeLayout.C_SIZE_T),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_EGLIntArrayCallback = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_EnumerateDirectoryCallback = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor SDL_EnumeratePropertiesCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor SDL_EventFilter = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(SDL_Event.LAYOUT)
    );

    public static final FunctionDescriptor SDL_FunctionPointer = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor SDL_HintCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor SDL_HitTest = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(SDL_Point.LAYOUT),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_KernelMemoryBarrierFunc = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor SDL_LogOutputFunction = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor SDL_MainThreadCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_NSTimerCallback = FunctionDescriptor.of(
        ValueLayout.JAVA_LONG,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor SDL_RequestAndroidPermissionCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_BOOLEAN
    );

    public static final FunctionDescriptor SDL_TLSDestructorCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_ThreadFunction = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_TimerCallback = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor SDL_TrayCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_WindowsMessageHook = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_X11EventHook = FunctionDescriptor.of(
        ValueLayout.JAVA_BOOLEAN,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_calloc_func = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T,
        NativeLayout.C_SIZE_T
    );

    public static final FunctionDescriptor SDL_free_func = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_iOSAnimationCallback = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor SDL_malloc_func = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T
    );

    public static final FunctionDescriptor SDL_realloc_func = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        NativeLayout.C_SIZE_T
    );

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL3FunctionTypes() {}
}
