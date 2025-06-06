package club.doki7.openal;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.openal.handle.*;

public final class ALC implements ALCConstants {
    public ALC(RawFunctionLoader loader) {
        SEGMENT$alcCreateContext = loader.apply("alcCreateContext");
        HANDLE$alcCreateContext = RawFunctionLoader.link(SEGMENT$alcCreateContext, Descriptors.DESCRIPTOR$alcCreateContext);
        SEGMENT$alcMakeContextCurrent = loader.apply("alcMakeContextCurrent");
        HANDLE$alcMakeContextCurrent = RawFunctionLoader.link(SEGMENT$alcMakeContextCurrent, Descriptors.DESCRIPTOR$alcMakeContextCurrent);
        SEGMENT$alcProcessContext = loader.apply("alcProcessContext");
        HANDLE$alcProcessContext = RawFunctionLoader.link(SEGMENT$alcProcessContext, Descriptors.DESCRIPTOR$alcProcessContext);
        SEGMENT$alcSuspendContext = loader.apply("alcSuspendContext");
        HANDLE$alcSuspendContext = RawFunctionLoader.link(SEGMENT$alcSuspendContext, Descriptors.DESCRIPTOR$alcSuspendContext);
        SEGMENT$alcDestroyContext = loader.apply("alcDestroyContext");
        HANDLE$alcDestroyContext = RawFunctionLoader.link(SEGMENT$alcDestroyContext, Descriptors.DESCRIPTOR$alcDestroyContext);
        SEGMENT$alcGetCurrentContext = loader.apply("alcGetCurrentContext");
        HANDLE$alcGetCurrentContext = RawFunctionLoader.link(SEGMENT$alcGetCurrentContext, Descriptors.DESCRIPTOR$alcGetCurrentContext);
        SEGMENT$alcGetContextsDevice = loader.apply("alcGetContextsDevice");
        HANDLE$alcGetContextsDevice = RawFunctionLoader.link(SEGMENT$alcGetContextsDevice, Descriptors.DESCRIPTOR$alcGetContextsDevice);
        SEGMENT$alcOpenDevice = loader.apply("alcOpenDevice");
        HANDLE$alcOpenDevice = RawFunctionLoader.link(SEGMENT$alcOpenDevice, Descriptors.DESCRIPTOR$alcOpenDevice);
        SEGMENT$alcCloseDevice = loader.apply("alcCloseDevice");
        HANDLE$alcCloseDevice = RawFunctionLoader.link(SEGMENT$alcCloseDevice, Descriptors.DESCRIPTOR$alcCloseDevice);
        SEGMENT$alcGetError = loader.apply("alcGetError");
        HANDLE$alcGetError = RawFunctionLoader.link(SEGMENT$alcGetError, Descriptors.DESCRIPTOR$alcGetError);
        SEGMENT$alcIsExtensionPresent = loader.apply("alcIsExtensionPresent");
        HANDLE$alcIsExtensionPresent = RawFunctionLoader.link(SEGMENT$alcIsExtensionPresent, Descriptors.DESCRIPTOR$alcIsExtensionPresent);
        SEGMENT$alcGetProcAddress = loader.apply("alcGetProcAddress");
        HANDLE$alcGetProcAddress = RawFunctionLoader.link(SEGMENT$alcGetProcAddress, Descriptors.DESCRIPTOR$alcGetProcAddress);
        SEGMENT$alcGetEnumValue = loader.apply("alcGetEnumValue");
        HANDLE$alcGetEnumValue = RawFunctionLoader.link(SEGMENT$alcGetEnumValue, Descriptors.DESCRIPTOR$alcGetEnumValue);
        SEGMENT$alcGetString = loader.apply("alcGetString");
        HANDLE$alcGetString = RawFunctionLoader.link(SEGMENT$alcGetString, Descriptors.DESCRIPTOR$alcGetString);
        SEGMENT$alcGetIntegerv = loader.apply("alcGetIntegerv");
        HANDLE$alcGetIntegerv = RawFunctionLoader.link(SEGMENT$alcGetIntegerv, Descriptors.DESCRIPTOR$alcGetIntegerv);
        SEGMENT$alcCaptureOpenDevice = loader.apply("alcCaptureOpenDevice");
        HANDLE$alcCaptureOpenDevice = RawFunctionLoader.link(SEGMENT$alcCaptureOpenDevice, Descriptors.DESCRIPTOR$alcCaptureOpenDevice);
        SEGMENT$alcCaptureCloseDevice = loader.apply("alcCaptureCloseDevice");
        HANDLE$alcCaptureCloseDevice = RawFunctionLoader.link(SEGMENT$alcCaptureCloseDevice, Descriptors.DESCRIPTOR$alcCaptureCloseDevice);
        SEGMENT$alcCaptureStart = loader.apply("alcCaptureStart");
        HANDLE$alcCaptureStart = RawFunctionLoader.link(SEGMENT$alcCaptureStart, Descriptors.DESCRIPTOR$alcCaptureStart);
        SEGMENT$alcCaptureStop = loader.apply("alcCaptureStop");
        HANDLE$alcCaptureStop = RawFunctionLoader.link(SEGMENT$alcCaptureStop, Descriptors.DESCRIPTOR$alcCaptureStop);
        SEGMENT$alcCaptureSamples = loader.apply("alcCaptureSamples");
        HANDLE$alcCaptureSamples = RawFunctionLoader.link(SEGMENT$alcCaptureSamples, Descriptors.DESCRIPTOR$alcCaptureSamples);
        SEGMENT$alcSetThreadContext = loader.apply("alcSetThreadContext");
        HANDLE$alcSetThreadContext = RawFunctionLoader.link(SEGMENT$alcSetThreadContext, Descriptors.DESCRIPTOR$alcSetThreadContext);
        SEGMENT$alcGetThreadContext = loader.apply("alcGetThreadContext");
        HANDLE$alcGetThreadContext = RawFunctionLoader.link(SEGMENT$alcGetThreadContext, Descriptors.DESCRIPTOR$alcGetThreadContext);
        SEGMENT$alcLoopbackOpenDeviceSOFT = loader.apply("alcLoopbackOpenDeviceSOFT");
        HANDLE$alcLoopbackOpenDeviceSOFT = RawFunctionLoader.link(SEGMENT$alcLoopbackOpenDeviceSOFT, Descriptors.DESCRIPTOR$alcLoopbackOpenDeviceSOFT);
        SEGMENT$alcIsRenderFormatSupportedSOFT = loader.apply("alcIsRenderFormatSupportedSOFT");
        HANDLE$alcIsRenderFormatSupportedSOFT = RawFunctionLoader.link(SEGMENT$alcIsRenderFormatSupportedSOFT, Descriptors.DESCRIPTOR$alcIsRenderFormatSupportedSOFT);
        SEGMENT$alcRenderSamplesSOFT = loader.apply("alcRenderSamplesSOFT");
        HANDLE$alcRenderSamplesSOFT = RawFunctionLoader.link(SEGMENT$alcRenderSamplesSOFT, Descriptors.DESCRIPTOR$alcRenderSamplesSOFT);
        SEGMENT$alcDevicePauseSOFT = loader.apply("alcDevicePauseSOFT");
        HANDLE$alcDevicePauseSOFT = RawFunctionLoader.link(SEGMENT$alcDevicePauseSOFT, Descriptors.DESCRIPTOR$alcDevicePauseSOFT);
        SEGMENT$alcDeviceResumeSOFT = loader.apply("alcDeviceResumeSOFT");
        HANDLE$alcDeviceResumeSOFT = RawFunctionLoader.link(SEGMENT$alcDeviceResumeSOFT, Descriptors.DESCRIPTOR$alcDeviceResumeSOFT);
        SEGMENT$alcGetStringiSOFT = loader.apply("alcGetStringiSOFT");
        HANDLE$alcGetStringiSOFT = RawFunctionLoader.link(SEGMENT$alcGetStringiSOFT, Descriptors.DESCRIPTOR$alcGetStringiSOFT);
        SEGMENT$alcResetDeviceSOFT = loader.apply("alcResetDeviceSOFT");
        HANDLE$alcResetDeviceSOFT = RawFunctionLoader.link(SEGMENT$alcResetDeviceSOFT, Descriptors.DESCRIPTOR$alcResetDeviceSOFT);
        SEGMENT$alcGetInteger64vSOFT = loader.apply("alcGetInteger64vSOFT");
        HANDLE$alcGetInteger64vSOFT = RawFunctionLoader.link(SEGMENT$alcGetInteger64vSOFT, Descriptors.DESCRIPTOR$alcGetInteger64vSOFT);
        SEGMENT$alcReopenDeviceSOFT = loader.apply("alcReopenDeviceSOFT");
        HANDLE$alcReopenDeviceSOFT = RawFunctionLoader.link(SEGMENT$alcReopenDeviceSOFT, Descriptors.DESCRIPTOR$alcReopenDeviceSOFT);
        SEGMENT$alcEventIsSupportedSOFT = loader.apply("alcEventIsSupportedSOFT");
        HANDLE$alcEventIsSupportedSOFT = RawFunctionLoader.link(SEGMENT$alcEventIsSupportedSOFT, Descriptors.DESCRIPTOR$alcEventIsSupportedSOFT);
        SEGMENT$alcEventControlSOFT = loader.apply("alcEventControlSOFT");
        HANDLE$alcEventControlSOFT = RawFunctionLoader.link(SEGMENT$alcEventControlSOFT, Descriptors.DESCRIPTOR$alcEventControlSOFT);
        SEGMENT$alcEventCallbackSOFT = loader.apply("alcEventCallbackSOFT");
        HANDLE$alcEventCallbackSOFT = RawFunctionLoader.link(SEGMENT$alcEventCallbackSOFT, Descriptors.DESCRIPTOR$alcEventCallbackSOFT);
        SEGMENT$alcGetProcAddress2 = loader.apply("alcGetProcAddress2");
        HANDLE$alcGetProcAddress2 = RawFunctionLoader.link(SEGMENT$alcGetProcAddress2, Descriptors.DESCRIPTOR$alcGetProcAddress2);
    }

    // region command wrappers

    ///  Create and attach a context to the given device.
    public ALCcontext createContext(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCint") IntPtr attrlist
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCreateContext);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (attrlist != null ? attrlist.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCcontext(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// Makes the given context the active process-wide context. Passing NULL clears
    /// the active context.
    public @NativeType("ALCboolean") byte makeContextCurrent(
        @Nullable ALCcontext context
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcMakeContextCurrent);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (context != null ? context.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Resumes processing updates for the given context.
    public void processContext(
        @Nullable ALCcontext context
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcProcessContext);
        try {
            hFunction.invokeExact(
                (MemorySegment) (context != null ? context.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Suspends updates for the given context.
    public void suspendContext(
        @Nullable ALCcontext context
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcSuspendContext);
        try {
            hFunction.invokeExact(
                (MemorySegment) (context != null ? context.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Remove a context from its device and destroys it.
    public void destroyContext(
        @Nullable ALCcontext context
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcDestroyContext);
        try {
            hFunction.invokeExact(
                (MemorySegment) (context != null ? context.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Returns the currently active context.
    public ALCcontext getCurrentContext() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetCurrentContext);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCcontext(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Returns the device that a particular context is attached to.
    public ALCdevice getContextsDevice(
        @Nullable ALCcontext context
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetContextsDevice);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (context != null ? context.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCdevice(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Opens the named playback device.
    public ALCdevice openDevice(
        @Nullable @Pointer(comment="ALCchar") BytePtr devicename
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcOpenDevice);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (devicename != null ? devicename.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCdevice(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Closes the given playback device.
    public @NativeType("ALCboolean") byte closeDevice(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCloseDevice);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Obtain the most recent Device error.
    public @NativeType("ALCenum") int getError(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetError);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// Query for the presence of an extension on the device. Pass a NULL device to
    /// query a device-inspecific extension.
    public @NativeType("ALCboolean") byte isExtensionPresent(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCchar") BytePtr extname
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcIsExtensionPresent);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (extname != null ? extname.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// Retrieve the address of a function. Given a non-NULL device, the returned
    /// function may be device-specific.
    public @Pointer(comment="void*") MemorySegment getProcAddress(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCchar") BytePtr funcname
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetProcAddress);
        try {
            return (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (funcname != null ? funcname.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// Retrieve the value of an enum. Given a non-NULL device, the returned value
    /// may be device-specific.
    public @NativeType("ALCenum") int getEnumValue(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCchar") BytePtr enumname
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetEnumValue);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (enumname != null ? enumname.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Returns information about the device, and error strings.
    public @Pointer(comment="ALCchar") BytePtr getString(
        @Nullable ALCdevice device,
        @NativeType("ALCenum") int param
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetString);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                param
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Returns information about the device and the version of OpenAL.
    public void getIntegerv(
        @Nullable ALCdevice device,
        @NativeType("ALCenum") int param,
        @NativeType("ALCsizei") int size,
        @Nullable @Pointer(comment="ALCint") IntPtr values
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetIntegerv);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                param,
                size,
                (MemorySegment) (values != null ? values.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// Opens the named capture device with the given frequency, format, and buffer
    /// size.
    public ALCdevice captureOpenDevice(
        @Nullable @Pointer(comment="ALCchar") BytePtr devicename,
        @NativeType("ALCuint") int frequency,
        @NativeType("ALCenum") int format,
        @NativeType("ALCsizei") int buffersize
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCaptureOpenDevice);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (devicename != null ? devicename.segment() : MemorySegment.NULL),
                frequency,
                format,
                buffersize
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCdevice(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Closes the given capture device.
    public @NativeType("ALCboolean") byte captureCloseDevice(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCaptureCloseDevice);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Starts capturing samples into the device buffer.
    public void captureStart(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCaptureStart);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Stops capturing samples. Samples in the device buffer remain available.
    public void captureStop(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCaptureStop);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    ///  Reads samples from the device buffer.
    public void captureSamples(
        @Nullable ALCdevice device,
        @Pointer(comment="void*") MemorySegment buffer,
        @NativeType("ALCsizei") int samples
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcCaptureSamples);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                buffer,
                samples
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("ALCboolean") byte setThreadContext(
        @Nullable ALCcontext context
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcSetThreadContext);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (context != null ? context.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ALCcontext getThreadContext() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetThreadContext);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCcontext(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public ALCdevice loopbackOpenDeviceSOFT(
        @Nullable @Pointer(comment="ALCchar") BytePtr deviceName
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcLoopbackOpenDeviceSOFT);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (deviceName != null ? deviceName.segment() : MemorySegment.NULL)
            );
            return s.equals(MemorySegment.NULL) ? null : new ALCdevice(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("ALCboolean") byte isRenderFormatSupportedSOFT(
        @Nullable ALCdevice device,
        @NativeType("ALCsizei") int freq,
        @NativeType("ALCenum") int channels,
        @NativeType("ALCenum") int type
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcIsRenderFormatSupportedSOFT);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                freq,
                channels,
                type
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void renderSamplesSOFT(
        @Nullable ALCdevice device,
        @Pointer(comment="void*") MemorySegment buffer,
        @NativeType("ALCsizei") int samples
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcRenderSamplesSOFT);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                buffer,
                samples
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void devicePauseSOFT(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcDevicePauseSOFT);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void deviceResumeSOFT(
        @Nullable ALCdevice device
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcDeviceResumeSOFT);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="ALCchar") BytePtr getStringiSOFT(
        @Nullable ALCdevice device,
        @NativeType("ALCenum") int paramName,
        @NativeType("ALCsizei") int index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetStringiSOFT);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                paramName,
                index
            );
            return s.equals(MemorySegment.NULL) ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("ALCboolean") byte resetDeviceSOFT(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCint") IntPtr attribs
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcResetDeviceSOFT);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (attribs != null ? attribs.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getInteger64vSOFT(
        @Nullable ALCdevice device,
        @NativeType("ALCenum") int pname,
        @NativeType("ALsizei") int size,
        @Nullable @Pointer(comment="ALCint64SOFT") LongPtr values
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetInteger64vSOFT);
        try {
            hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                pname,
                size,
                (MemorySegment) (values != null ? values.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("ALCboolean") byte reopenDeviceSOFT(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCchar") BytePtr deviceName,
        @Nullable @Pointer(comment="ALCint") IntPtr attribs
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcReopenDeviceSOFT);
        try {
            return (byte) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (deviceName != null ? deviceName.segment() : MemorySegment.NULL),
                (MemorySegment) (attribs != null ? attribs.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("ALCenum") int eventIsSupportedSOFT(
        @NativeType("ALCenum") int eventType,
        @NativeType("ALCenum") int deviceType
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcEventIsSupportedSOFT);
        try {
            return (int) hFunction.invokeExact(
                eventType,
                deviceType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("ALCboolean") byte eventControlSOFT(
        @NativeType("ALCsizei") int count,
        @Nullable @Pointer(comment="ALCenum") IntPtr events,
        @NativeType("ALCboolean") byte enable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcEventControlSOFT);
        try {
            return (byte) hFunction.invokeExact(
                count,
                (MemorySegment) (events != null ? events.segment() : MemorySegment.NULL),
                enable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void eventCallbackSOFT(
        @Pointer(comment="ALCEVENTPROCTYPESOFT") MemorySegment callback,
        @Pointer(comment="void*") MemorySegment userParam
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcEventCallbackSOFT);
        try {
            hFunction.invokeExact(
                callback,
                userParam
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") MemorySegment getProcAddress2(
        @Nullable ALCdevice device,
        @Nullable @Pointer(comment="ALCchar") BytePtr funcName
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$alcGetProcAddress2);
        try {
            return (MemorySegment) hFunction.invokeExact(
                (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                (MemorySegment) (funcName != null ? funcName.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$alcCreateContext;
    public final @Nullable MemorySegment SEGMENT$alcMakeContextCurrent;
    public final @Nullable MemorySegment SEGMENT$alcProcessContext;
    public final @Nullable MemorySegment SEGMENT$alcSuspendContext;
    public final @Nullable MemorySegment SEGMENT$alcDestroyContext;
    public final @Nullable MemorySegment SEGMENT$alcGetCurrentContext;
    public final @Nullable MemorySegment SEGMENT$alcGetContextsDevice;
    public final @Nullable MemorySegment SEGMENT$alcOpenDevice;
    public final @Nullable MemorySegment SEGMENT$alcCloseDevice;
    public final @Nullable MemorySegment SEGMENT$alcGetError;
    public final @Nullable MemorySegment SEGMENT$alcIsExtensionPresent;
    public final @Nullable MemorySegment SEGMENT$alcGetProcAddress;
    public final @Nullable MemorySegment SEGMENT$alcGetEnumValue;
    public final @Nullable MemorySegment SEGMENT$alcGetString;
    public final @Nullable MemorySegment SEGMENT$alcGetIntegerv;
    public final @Nullable MemorySegment SEGMENT$alcCaptureOpenDevice;
    public final @Nullable MemorySegment SEGMENT$alcCaptureCloseDevice;
    public final @Nullable MemorySegment SEGMENT$alcCaptureStart;
    public final @Nullable MemorySegment SEGMENT$alcCaptureStop;
    public final @Nullable MemorySegment SEGMENT$alcCaptureSamples;
    public final @Nullable MemorySegment SEGMENT$alcSetThreadContext;
    public final @Nullable MemorySegment SEGMENT$alcGetThreadContext;
    public final @Nullable MemorySegment SEGMENT$alcLoopbackOpenDeviceSOFT;
    public final @Nullable MemorySegment SEGMENT$alcIsRenderFormatSupportedSOFT;
    public final @Nullable MemorySegment SEGMENT$alcRenderSamplesSOFT;
    public final @Nullable MemorySegment SEGMENT$alcDevicePauseSOFT;
    public final @Nullable MemorySegment SEGMENT$alcDeviceResumeSOFT;
    public final @Nullable MemorySegment SEGMENT$alcGetStringiSOFT;
    public final @Nullable MemorySegment SEGMENT$alcResetDeviceSOFT;
    public final @Nullable MemorySegment SEGMENT$alcGetInteger64vSOFT;
    public final @Nullable MemorySegment SEGMENT$alcReopenDeviceSOFT;
    public final @Nullable MemorySegment SEGMENT$alcEventIsSupportedSOFT;
    public final @Nullable MemorySegment SEGMENT$alcEventControlSOFT;
    public final @Nullable MemorySegment SEGMENT$alcEventCallbackSOFT;
    public final @Nullable MemorySegment SEGMENT$alcGetProcAddress2;
    public final @Nullable MethodHandle HANDLE$alcCreateContext;
    public final @Nullable MethodHandle HANDLE$alcMakeContextCurrent;
    public final @Nullable MethodHandle HANDLE$alcProcessContext;
    public final @Nullable MethodHandle HANDLE$alcSuspendContext;
    public final @Nullable MethodHandle HANDLE$alcDestroyContext;
    public final @Nullable MethodHandle HANDLE$alcGetCurrentContext;
    public final @Nullable MethodHandle HANDLE$alcGetContextsDevice;
    public final @Nullable MethodHandle HANDLE$alcOpenDevice;
    public final @Nullable MethodHandle HANDLE$alcCloseDevice;
    public final @Nullable MethodHandle HANDLE$alcGetError;
    public final @Nullable MethodHandle HANDLE$alcIsExtensionPresent;
    public final @Nullable MethodHandle HANDLE$alcGetProcAddress;
    public final @Nullable MethodHandle HANDLE$alcGetEnumValue;
    public final @Nullable MethodHandle HANDLE$alcGetString;
    public final @Nullable MethodHandle HANDLE$alcGetIntegerv;
    public final @Nullable MethodHandle HANDLE$alcCaptureOpenDevice;
    public final @Nullable MethodHandle HANDLE$alcCaptureCloseDevice;
    public final @Nullable MethodHandle HANDLE$alcCaptureStart;
    public final @Nullable MethodHandle HANDLE$alcCaptureStop;
    public final @Nullable MethodHandle HANDLE$alcCaptureSamples;
    public final @Nullable MethodHandle HANDLE$alcSetThreadContext;
    public final @Nullable MethodHandle HANDLE$alcGetThreadContext;
    public final @Nullable MethodHandle HANDLE$alcLoopbackOpenDeviceSOFT;
    public final @Nullable MethodHandle HANDLE$alcIsRenderFormatSupportedSOFT;
    public final @Nullable MethodHandle HANDLE$alcRenderSamplesSOFT;
    public final @Nullable MethodHandle HANDLE$alcDevicePauseSOFT;
    public final @Nullable MethodHandle HANDLE$alcDeviceResumeSOFT;
    public final @Nullable MethodHandle HANDLE$alcGetStringiSOFT;
    public final @Nullable MethodHandle HANDLE$alcResetDeviceSOFT;
    public final @Nullable MethodHandle HANDLE$alcGetInteger64vSOFT;
    public final @Nullable MethodHandle HANDLE$alcReopenDeviceSOFT;
    public final @Nullable MethodHandle HANDLE$alcEventIsSupportedSOFT;
    public final @Nullable MethodHandle HANDLE$alcEventControlSOFT;
    public final @Nullable MethodHandle HANDLE$alcEventCallbackSOFT;
    public final @Nullable MethodHandle HANDLE$alcGetProcAddress2;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$alcCreateContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcMakeContextCurrent = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcProcessContext = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcSuspendContext = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcDestroyContext = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetCurrentContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetContextsDevice = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcOpenDevice = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcCloseDevice = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetError = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcIsExtensionPresent = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetProcAddress = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetEnumValue = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetIntegerv = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcCaptureOpenDevice = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcCaptureCloseDevice = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcCaptureStart = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcCaptureStop = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcCaptureSamples = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcSetThreadContext = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetThreadContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcLoopbackOpenDeviceSOFT = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcIsRenderFormatSupportedSOFT = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcRenderSamplesSOFT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcDevicePauseSOFT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcDeviceResumeSOFT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetStringiSOFT = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcResetDeviceSOFT = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetInteger64vSOFT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcReopenDeviceSOFT = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$alcEventIsSupportedSOFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$alcEventControlSOFT = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_BYTE
        );

        public static final FunctionDescriptor DESCRIPTOR$alcEventCallbackSOFT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$alcGetProcAddress2 = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
