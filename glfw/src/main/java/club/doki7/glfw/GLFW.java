package club.doki7.glfw;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.RawFunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.glfw.datatype.*;
import tech.icey.glfw.handle.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public final class GLFW {
    public int glfwInit() {
        try {
            return (int) HANDLE$glfwInit.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwTerminate() {
        try {
            HANDLE$glfwTerminate.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwInitHint(
            int hint,
            int value
    ) {
        try {
            HANDLE$glfwInitHint.invokeExact(
                    hint,
                    value
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwInitAllocator(
            @Nullable @pointer(target=GLFWallocator.class) GLFWallocator allocator
    ) {
        try {
            HANDLE$glfwInitAllocator.invokeExact(
                    (MemorySegment) (allocator != null ? allocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwInitVulkanLoader(
            @pointer(comment="PFN_vkGetInstanceProcAddr") MemorySegment loader
    ) {
        try {
            HANDLE$glfwInitVulkanLoader.invokeExact(
                    loader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetVersion(
            @Nullable IntBuffer major,
            @Nullable IntBuffer minor,
            @Nullable IntBuffer rev
    ) {
        try {
            HANDLE$glfwGetVersion.invokeExact(
                    (MemorySegment) (major != null ? major.segment() : MemorySegment.NULL),
                    (MemorySegment) (minor != null ? minor.segment() : MemorySegment.NULL),
                    (MemorySegment) (rev != null ? rev.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetVersionString() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetVersionString.invokeExact();
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetError(
            @Nullable PointerBuffer description
    ) {
        try {
            return (int) HANDLE$glfwGetError.invokeExact(
                    (MemorySegment) (description != null ? description.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWerrorfun") MemorySegment glfwSetErrorCallback(
            @pointer(comment="GLFWerrorfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetErrorCallback.invokeExact(
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetPlatform() {
        try {
            return (int) HANDLE$glfwGetPlatform.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwPlatformSupported(
            int platform
    ) {
        try {
            return (int) HANDLE$glfwPlatformSupported.invokeExact(
                    platform
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable @pointer(target=GLFWmonitor.class) GLFWmonitor.Buffer glfwGetMonitors(
            @Nullable IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetMonitors.invokeExact(
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new GLFWmonitor.Buffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable GLFWmonitor glfwGetPrimaryMonitor() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetPrimaryMonitor.invokeExact();
            return s.address() == 0 ? null : new GLFWmonitor(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetMonitorPos(
            @Nullable GLFWmonitor monitor,
            @Nullable IntBuffer xpos,
            @Nullable IntBuffer ypos
    ) {
        try {
            HANDLE$glfwGetMonitorPos.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (xpos != null ? xpos.segment() : MemorySegment.NULL),
                    (MemorySegment) (ypos != null ? ypos.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetMonitorWorkarea(
            @Nullable GLFWmonitor monitor,
            @Nullable IntBuffer xpos,
            @Nullable IntBuffer ypos,
            @Nullable IntBuffer width,
            @Nullable IntBuffer height
    ) {
        try {
            HANDLE$glfwGetMonitorWorkarea.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (xpos != null ? xpos.segment() : MemorySegment.NULL),
                    (MemorySegment) (ypos != null ? ypos.segment() : MemorySegment.NULL),
                    (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                    (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetMonitorPhysicalSize(
            @Nullable GLFWmonitor monitor,
            @Nullable IntBuffer widthMM,
            @Nullable IntBuffer heightMM
    ) {
        try {
            HANDLE$glfwGetMonitorPhysicalSize.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (widthMM != null ? widthMM.segment() : MemorySegment.NULL),
                    (MemorySegment) (heightMM != null ? heightMM.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetMonitorContentScale(
            @Nullable GLFWmonitor monitor,
            @Nullable FloatBuffer xscale,
            @Nullable FloatBuffer yscale
    ) {
        try {
            HANDLE$glfwGetMonitorContentScale.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (xscale != null ? xscale.segment() : MemorySegment.NULL),
                    (MemorySegment) (yscale != null ? yscale.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetMonitorName(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetMonitorName.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetMonitorUserPointer(
            @Nullable GLFWmonitor monitor,
            @pointer(comment="void*") MemorySegment pointer
    ) {
        try {
            HANDLE$glfwSetMonitorUserPointer.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    pointer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetMonitorUserPointer(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetMonitorUserPointer.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWmonitorfun") MemorySegment glfwSetMonitorCallback(
            @pointer(comment="GLFWmonitorfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetMonitorCallback.invokeExact(
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable @pointer(target=GLFWvidmode.class) GLFWvidmode glfwGetVideoModes(
            @Nullable GLFWmonitor monitor,
            @Nullable IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetVideoModes.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new GLFWvidmode(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable @pointer(target=GLFWvidmode.class) GLFWvidmode glfwGetVideoMode(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetVideoMode.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new GLFWvidmode(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetGamma(
            @Nullable GLFWmonitor monitor,
            float gamma
    ) {
        try {
            HANDLE$glfwSetGamma.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    gamma
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable @pointer(target=GLFWgammaramp.class) GLFWgammaramp glfwGetGammaRamp(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetGammaRamp.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new GLFWgammaramp(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetGammaRamp(
            @Nullable GLFWmonitor monitor,
            @Nullable @pointer(target=GLFWgammaramp.class) GLFWgammaramp ramp
    ) {
        try {
            HANDLE$glfwSetGammaRamp.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (ramp != null ? ramp.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwDefaultWindowHints() {
        try {
            HANDLE$glfwDefaultWindowHints.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwWindowHint(
            int hint,
            int value
    ) {
        try {
            HANDLE$glfwWindowHint.invokeExact(
                    hint,
                    value
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwWindowHintString(
            int hint,
            @Nullable ByteBuffer value
    ) {
        try {
            HANDLE$glfwWindowHintString.invokeExact(
                    hint,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable GLFWwindow glfwCreateWindow(
            int width,
            int height,
            @Nullable ByteBuffer title,
            @Nullable GLFWmonitor monitor,
            @Nullable GLFWwindow share
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwCreateWindow.invokeExact(
                    width,
                    height,
                    (MemorySegment) (title != null ? title.segment() : MemorySegment.NULL),
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    (MemorySegment) (share != null ? share.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new GLFWwindow(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwDestroyWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwDestroyWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwWindowShouldClose(
            @Nullable GLFWwindow window
    ) {
        try {
            return (int) HANDLE$glfwWindowShouldClose.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowShouldClose(
            @Nullable GLFWwindow window,
            int value
    ) {
        try {
            HANDLE$glfwSetWindowShouldClose.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    value
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetWindowTitle(
            @Nullable GLFWwindow window
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWindowTitle.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowTitle(
            @Nullable GLFWwindow window,
            @Nullable ByteBuffer title
    ) {
        try {
            HANDLE$glfwSetWindowTitle.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (title != null ? title.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowIcon(
            @Nullable GLFWwindow window,
            int count,
            @Nullable @pointer(target=GLFWimage.class) GLFWimage images
    ) {
        try {
            HANDLE$glfwSetWindowIcon.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    count,
                    (MemorySegment) (images != null ? images.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetWindowPos(
            @Nullable GLFWwindow window,
            @Nullable IntBuffer xpos,
            @Nullable IntBuffer ypos
    ) {
        try {
            HANDLE$glfwGetWindowPos.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (xpos != null ? xpos.segment() : MemorySegment.NULL),
                    (MemorySegment) (ypos != null ? ypos.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowPos(
            @Nullable GLFWwindow window,
            int xpos,
            int ypos
    ) {
        try {
            HANDLE$glfwSetWindowPos.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    xpos,
                    ypos
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetWindowSize(
            @Nullable GLFWwindow window,
            @Nullable IntBuffer width,
            @Nullable IntBuffer height
    ) {
        try {
            HANDLE$glfwGetWindowSize.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                    (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowSizeLimits(
            @Nullable GLFWwindow window,
            int minwidth,
            int minheight,
            int maxwidth,
            int maxheight
    ) {
        try {
            HANDLE$glfwSetWindowSizeLimits.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    minwidth,
                    minheight,
                    maxwidth,
                    maxheight
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowAspectRatio(
            @Nullable GLFWwindow window,
            int numer,
            int denom
    ) {
        try {
            HANDLE$glfwSetWindowAspectRatio.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    numer,
                    denom
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowSize(
            @Nullable GLFWwindow window,
            int width,
            int height
    ) {
        try {
            HANDLE$glfwSetWindowSize.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    width,
                    height
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetFramebufferSize(
            @Nullable GLFWwindow window,
            @Nullable IntBuffer width,
            @Nullable IntBuffer height
    ) {
        try {
            HANDLE$glfwGetFramebufferSize.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                    (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetWindowFrameSize(
            @Nullable GLFWwindow window,
            @Nullable IntBuffer left,
            @Nullable IntBuffer top,
            @Nullable IntBuffer right,
            @Nullable IntBuffer bottom
    ) {
        try {
            HANDLE$glfwGetWindowFrameSize.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (left != null ? left.segment() : MemorySegment.NULL),
                    (MemorySegment) (top != null ? top.segment() : MemorySegment.NULL),
                    (MemorySegment) (right != null ? right.segment() : MemorySegment.NULL),
                    (MemorySegment) (bottom != null ? bottom.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetWindowContentScale(
            @Nullable GLFWwindow window,
            @Nullable FloatBuffer xscale,
            @Nullable FloatBuffer yscale
    ) {
        try {
            HANDLE$glfwGetWindowContentScale.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (xscale != null ? xscale.segment() : MemorySegment.NULL),
                    (MemorySegment) (yscale != null ? yscale.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public float glfwGetWindowOpacity(
            @Nullable GLFWwindow window
    ) {
        try {
            return (float) HANDLE$glfwGetWindowOpacity.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowOpacity(
            @Nullable GLFWwindow window,
            float opacity
    ) {
        try {
            HANDLE$glfwSetWindowOpacity.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    opacity
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwIconifyWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwIconifyWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwRestoreWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwRestoreWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwMaximizeWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwMaximizeWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwShowWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwShowWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwHideWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwHideWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwFocusWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwFocusWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwRequestWindowAttention(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwRequestWindowAttention.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable GLFWmonitor glfwGetWindowMonitor(
            @Nullable GLFWwindow window
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWindowMonitor.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new GLFWmonitor(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowMonitor(
            @Nullable GLFWwindow window,
            @Nullable GLFWmonitor monitor,
            int xpos,
            int ypos,
            int width,
            int height,
            int refreshRate
    ) {
        try {
            HANDLE$glfwSetWindowMonitor.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL),
                    xpos,
                    ypos,
                    width,
                    height,
                    refreshRate
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetWindowAttrib(
            @Nullable GLFWwindow window,
            int attrib
    ) {
        try {
            return (int) HANDLE$glfwGetWindowAttrib.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    attrib
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowAttrib(
            @Nullable GLFWwindow window,
            int attrib,
            int value
    ) {
        try {
            HANDLE$glfwSetWindowAttrib.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    attrib,
                    value
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetWindowUserPointer(
            @Nullable GLFWwindow window,
            @pointer(comment="void*") MemorySegment pointer
    ) {
        try {
            HANDLE$glfwSetWindowUserPointer.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    pointer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetWindowUserPointer(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetWindowUserPointer.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowposfun") MemorySegment glfwSetWindowPosCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowposfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowPosCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowsizefun") MemorySegment glfwSetWindowSizeCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowsizefun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowSizeCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowclosefun") MemorySegment glfwSetWindowCloseCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowclosefun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowCloseCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowrefreshfun") MemorySegment glfwSetWindowRefreshCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowrefreshfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowRefreshCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowfocusfun") MemorySegment glfwSetWindowFocusCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowfocusfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowFocusCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowiconifyfun") MemorySegment glfwSetWindowIconifyCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowiconifyfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowIconifyCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowmaximizefun") MemorySegment glfwSetWindowMaximizeCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowmaximizefun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowMaximizeCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWframebuffersizefun") MemorySegment glfwSetFramebufferSizeCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWframebuffersizefun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetFramebufferSizeCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWwindowcontentscalefun") MemorySegment glfwSetWindowContentScaleCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWwindowcontentscalefun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowContentScaleCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwPollEvents() {
        try {
            HANDLE$glfwPollEvents.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwWaitEvents() {
        try {
            HANDLE$glfwWaitEvents.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwWaitEventsTimeout(
            double timeout
    ) {
        try {
            HANDLE$glfwWaitEventsTimeout.invokeExact(
                    timeout
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwPostEmptyEvent() {
        try {
            HANDLE$glfwPostEmptyEvent.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetInputMode(
            @Nullable GLFWwindow window,
            int mode
    ) {
        try {
            return (int) HANDLE$glfwGetInputMode.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetInputMode(
            @Nullable GLFWwindow window,
            int mode,
            int value
    ) {
        try {
            HANDLE$glfwSetInputMode.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    mode,
                    value
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwRawMouseMotionSupported() {
        try {
            return (int) HANDLE$glfwRawMouseMotionSupported.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetKeyName(
            int key,
            int scancode
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetKeyName.invokeExact(
                    key,
                    scancode
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetKeyScancode(
            int key
    ) {
        try {
            return (int) HANDLE$glfwGetKeyScancode.invokeExact(
                    key
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetKey(
            @Nullable GLFWwindow window,
            int key
    ) {
        try {
            return (int) HANDLE$glfwGetKey.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    key
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetMouseButton(
            @Nullable GLFWwindow window,
            int button
    ) {
        try {
            return (int) HANDLE$glfwGetMouseButton.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    button
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetCursorPos(
            @Nullable GLFWwindow window,
            @Nullable DoubleBuffer xpos,
            @Nullable DoubleBuffer ypos
    ) {
        try {
            HANDLE$glfwGetCursorPos.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (xpos != null ? xpos.segment() : MemorySegment.NULL),
                    (MemorySegment) (ypos != null ? ypos.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetCursorPos(
            @Nullable GLFWwindow window,
            double xpos,
            double ypos
    ) {
        try {
            HANDLE$glfwSetCursorPos.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    xpos,
                    ypos
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable GLFWcursor glfwCreateCursor(
            @Nullable @pointer(target=GLFWimage.class) GLFWimage image,
            int xhot,
            int yhot
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwCreateCursor.invokeExact(
                    (MemorySegment) (image != null ? image.segment() : MemorySegment.NULL),
                    xhot,
                    yhot
            );
            return s.address() == 0 ? null : new GLFWcursor(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable GLFWcursor glfwCreateStandardCursor(
            int shape
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwCreateStandardCursor.invokeExact(
                    shape
            );
            return s.address() == 0 ? null : new GLFWcursor(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwDestroyCursor(
            @Nullable GLFWcursor cursor
    ) {
        try {
            HANDLE$glfwDestroyCursor.invokeExact(
                    (MemorySegment) (cursor != null ? cursor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetCursor(
            @Nullable GLFWwindow window,
            @Nullable GLFWcursor cursor
    ) {
        try {
            HANDLE$glfwSetCursor.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (cursor != null ? cursor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWkeyfun") MemorySegment glfwSetKeyCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWkeyfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetKeyCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWcharfun") MemorySegment glfwSetCharCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWcharfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetCharCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWcharmodsfun") MemorySegment glfwSetCharModsCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWcharmodsfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetCharModsCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWmousebuttonfun") MemorySegment glfwSetMouseButtonCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWmousebuttonfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetMouseButtonCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWcursorposfun") MemorySegment glfwSetCursorPosCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWcursorposfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetCursorPosCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWcursorenterfun") MemorySegment glfwSetCursorEnterCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWcursorenterfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetCursorEnterCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWscrollfun") MemorySegment glfwSetScrollCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWscrollfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetScrollCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWdropfun") MemorySegment glfwSetDropCallback(
            @Nullable GLFWwindow window,
            @pointer(comment="GLFWdropfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetDropCallback.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwJoystickPresent(
            int jid
    ) {
        try {
            return (int) HANDLE$glfwJoystickPresent.invokeExact(
                    jid
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable FloatBuffer glfwGetJoystickAxes(
            int jid,
            @Nullable IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetJoystickAxes.invokeExact(
                    jid,
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new FloatBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetJoystickButtons(
            int jid,
            @Nullable IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetJoystickButtons.invokeExact(
                    jid,
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetJoystickHats(
            int jid,
            @Nullable IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetJoystickHats.invokeExact(
                    jid,
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetJoystickName(
            int jid
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetJoystickName.invokeExact(
                    jid
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetJoystickGUID(
            int jid
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetJoystickGUID.invokeExact(
                    jid
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetJoystickUserPointer(
            int jid,
            @pointer(comment="void*") MemorySegment pointer
    ) {
        try {
            HANDLE$glfwSetJoystickUserPointer.invokeExact(
                    jid,
                    pointer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetJoystickUserPointer(
            int jid
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetJoystickUserPointer.invokeExact(
                    jid
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwJoystickIsGamepad(
            int jid
    ) {
        try {
            return (int) HANDLE$glfwJoystickIsGamepad.invokeExact(
                    jid
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWjoystickfun") MemorySegment glfwSetJoystickCallback(
            @pointer(comment="GLFWjoystickfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetJoystickCallback.invokeExact(
                    callback
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwUpdateGamepadMappings(
            @Nullable ByteBuffer string
    ) {
        try {
            return (int) HANDLE$glfwUpdateGamepadMappings.invokeExact(
                    (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetGamepadName(
            int jid
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetGamepadName.invokeExact(
                    jid
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetGamepadState(
            int jid,
            @Nullable @pointer(target=GLFWgamepadstate.class) GLFWgamepadstate state
    ) {
        try {
            return (int) HANDLE$glfwGetGamepadState.invokeExact(
                    jid,
                    (MemorySegment) (state != null ? state.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetClipboardString(
            @Nullable GLFWwindow window,
            @Nullable ByteBuffer string
    ) {
        try {
            HANDLE$glfwSetClipboardString.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetClipboardString(
            @Nullable GLFWwindow window
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetClipboardString.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public double glfwGetTime() {
        try {
            return (double) HANDLE$glfwGetTime.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetTime(
            double time
    ) {
        try {
            HANDLE$glfwSetTime.invokeExact(
                    time
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long glfwGetTimerValue() {
        try {
            return (long) HANDLE$glfwGetTimerValue.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned long glfwGetTimerFrequency() {
        try {
            return (long) HANDLE$glfwGetTimerFrequency.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwMakeContextCurrent(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwMakeContextCurrent.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable GLFWwindow glfwGetCurrentContext() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetCurrentContext.invokeExact();
            return s.address() == 0 ? null : new GLFWwindow(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSwapBuffers(
            @Nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwSwapBuffers.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSwapInterval(
            int interval
    ) {
        try {
            HANDLE$glfwSwapInterval.invokeExact(
                    interval
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwExtensionSupported(
            @Nullable ByteBuffer extension
    ) {
        try {
            return (int) HANDLE$glfwExtensionSupported.invokeExact(
                    (MemorySegment) (extension != null ? extension.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWglproc") MemorySegment glfwGetProcAddress(
            @Nullable ByteBuffer procname
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetProcAddress.invokeExact(
                    (MemorySegment) (procname != null ? procname.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwVulkanSupported() {
        try {
            return (int) HANDLE$glfwVulkanSupported.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable PointerBuffer glfwGetRequiredInstanceExtensions(
            @Nullable @unsigned IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetRequiredInstanceExtensions.invokeExact(
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new PointerBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="GLFWvkproc") MemorySegment glfwGetInstanceProcAddress(
            @Nullable VkInstance instance,
            @Nullable ByteBuffer procname
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetInstanceProcAddress.invokeExact(
                    (MemorySegment) (instance != null ? instance.segment() : MemorySegment.NULL),
                    (MemorySegment) (procname != null ? procname.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetPhysicalDevicePresentationSupport(
            @Nullable VkInstance instance,
            @Nullable VkPhysicalDevice device,
            @unsigned int queuefamily
    ) {
        try {
            return (int) HANDLE$glfwGetPhysicalDevicePresentationSupport.invokeExact(
                    (MemorySegment) (instance != null ? instance.segment() : MemorySegment.NULL),
                    (MemorySegment) (device != null ? device.segment() : MemorySegment.NULL),
                    queuefamily
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int glfwCreateWindowSurface(
            @Nullable VkInstance instance,
            @Nullable GLFWwindow window,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks allocator,
            @Nullable @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer surface
    ) {
        try {
            return (int) HANDLE$glfwCreateWindowSurface.invokeExact(
                    (MemorySegment) (instance != null ? instance.segment() : MemorySegment.NULL),
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (allocator != null ? allocator.segment() : MemorySegment.NULL),
                    (MemorySegment) (surface != null ? surface.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetWin32Adapter(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWin32Adapter.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetWin32Monitor(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWin32Monitor.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetWin32Window(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetWin32Window.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetWGLContext(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetWGLContext.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int glfwGetCocoaMonitor(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            return (int) HANDLE$glfwGetCocoaMonitor.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetCocoaWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetCocoaWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetCocoaView(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetCocoaView.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetNSGLContext(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetNSGLContext.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable PointerBuffer glfwGetX11Display() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetX11Display.invokeExact();
            return s.address() == 0 ? null : new PointerBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public long glfwGetX11Adapter(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            return (long) HANDLE$glfwGetX11Adapter.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public long glfwGetX11Monitor(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            return (long) HANDLE$glfwGetX11Monitor.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public long glfwGetX11Window(
            @Nullable GLFWwindow window
    ) {
        try {
            return (long) HANDLE$glfwGetX11Window.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSetX11SelectionString(
            @Nullable ByteBuffer string
    ) {
        try {
            HANDLE$glfwSetX11SelectionString.invokeExact(
                    (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable ByteBuffer glfwGetX11SelectionString() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetX11SelectionString.invokeExact();
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetGLXContext(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetGLXContext.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public long glfwGetGLXWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            return (long) HANDLE$glfwGetGLXWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable PointerBuffer glfwGetWaylandDisplay() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWaylandDisplay.invokeExact();
            return s.address() == 0 ? null : new PointerBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetWaylandMonitor(
            @Nullable GLFWmonitor monitor
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetWaylandMonitor.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable PointerBuffer glfwGetWaylandWindow(
            @Nullable GLFWwindow window
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWaylandWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
            return s.address() == 0 ? null : new PointerBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetEGLDisplay() {
        try {
            return (MemorySegment) HANDLE$glfwGetEGLDisplay.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetEGLContext(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetEGLContext.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetEGLSurface(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetEGLSurface.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetOSMesaColorBuffer(
            @Nullable GLFWwindow window,
            @Nullable IntBuffer width,
            @Nullable IntBuffer height,
            @Nullable IntBuffer format,
            @Nullable PointerBuffer buffer
    ) {
        try {
            return (int) HANDLE$glfwGetOSMesaColorBuffer.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                    (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                    (MemorySegment) (format != null ? format.segment() : MemorySegment.NULL),
                    (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetOSMesaDepthBuffer(
            @Nullable GLFWwindow window,
            @Nullable IntBuffer width,
            @Nullable IntBuffer height,
            @Nullable IntBuffer bytesPerValue,
            @Nullable PointerBuffer buffer
    ) {
        try {
            return (int) HANDLE$glfwGetOSMesaDepthBuffer.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL),
                    (MemorySegment) (width != null ? width.segment() : MemorySegment.NULL),
                    (MemorySegment) (height != null ? height.segment() : MemorySegment.NULL),
                    (MemorySegment) (bytesPerValue != null ? bytesPerValue.segment() : MemorySegment.NULL),
                    (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetOSMesaContext(
            @Nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetOSMesaContext.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static final FunctionDescriptor DESCRIPTOR$glfwInit = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwTerminate = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwInitHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwInitAllocator = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(GLFWallocator.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwInitVulkanLoader = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetVersion = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetVersionString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetError = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetErrorCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetPlatform = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwPlatformSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitors = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetPrimaryMonitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorWorkarea = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorPhysicalSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorContentScale = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetMonitorUserPointer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorUserPointer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetMonitorCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetVideoModes = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(GLFWvidmode.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetVideoMode = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(GLFWvidmode.LAYOUT),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetGamma = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetGammaRamp = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(GLFWgammaramp.LAYOUT),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetGammaRamp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(GLFWgammaramp.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwDefaultWindowHints = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwWindowHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwWindowHintString = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwCreateWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwDestroyWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwWindowShouldClose = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowShouldClose = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowTitle = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowTitle = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowIcon = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(GLFWimage.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowSizeLimits = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowAspectRatio = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetFramebufferSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowFrameSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowContentScale = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowOpacity = FunctionDescriptor.of(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowOpacity = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwIconifyWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwRestoreWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwMaximizeWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwShowWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwHideWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwFocusWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwRequestWindowAttention = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowMonitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowMonitor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowAttrib = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowAttrib = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowUserPointer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowUserPointer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowPosCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowSizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowCloseCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowRefreshCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowFocusCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowIconifyCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowMaximizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetFramebufferSizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowContentScaleCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwPollEvents = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwWaitEvents = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwWaitEventsTimeout = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_DOUBLE
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwPostEmptyEvent = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwGetInputMode = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetInputMode = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwRawMouseMotionSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetKeyName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetKeyScancode = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetKey = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetMouseButton = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetCursorPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetCursorPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_DOUBLE,
            ValueLayout.JAVA_DOUBLE
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwCreateCursor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(GLFWimage.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwCreateStandardCursor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwDestroyCursor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetCursor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetKeyCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetCharCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetCharModsCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetMouseButtonCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetCursorPosCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetCursorEnterCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetScrollCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetDropCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwJoystickPresent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickAxes = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickButtons = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickHats = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickGUID = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetJoystickUserPointer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickUserPointer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwJoystickIsGamepad = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetJoystickCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwUpdateGamepadMappings = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetGamepadName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetGamepadState = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(GLFWgamepadstate.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetClipboardString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetClipboardString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetTime = FunctionDescriptor.of(
            ValueLayout.JAVA_DOUBLE
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetTime = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_DOUBLE
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetTimerValue = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetTimerFrequency = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwMakeContextCurrent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetCurrentContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSwapBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSwapInterval = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwExtensionSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetProcAddress = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwVulkanSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetRequiredInstanceExtensions = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetInstanceProcAddress = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetPhysicalDevicePresentationSupport = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwCreateWindowSurface = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWin32Adapter = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWin32Monitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWin32Window = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWGLContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetCocoaMonitor = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetCocoaWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetCocoaView = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetNSGLContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Display = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Adapter = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Monitor = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Window = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetX11SelectionString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetX11SelectionString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetGLXContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetGLXWindow = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWaylandDisplay = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWaylandMonitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetWaylandWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetEGLDisplay = FunctionDescriptor.of(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetEGLContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetEGLSurface = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetOSMesaColorBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetOSMesaDepthBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetOSMesaContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public final @Nullable MemorySegment SEGMENT$glfwInit;
    public final @Nullable MemorySegment SEGMENT$glfwTerminate;
    public final @Nullable MemorySegment SEGMENT$glfwInitHint;
    public final @Nullable MemorySegment SEGMENT$glfwInitAllocator;
    public final @Nullable MemorySegment SEGMENT$glfwInitVulkanLoader;
    public final @Nullable MemorySegment SEGMENT$glfwGetVersion;
    public final @Nullable MemorySegment SEGMENT$glfwGetVersionString;
    public final @Nullable MemorySegment SEGMENT$glfwGetError;
    public final @Nullable MemorySegment SEGMENT$glfwSetErrorCallback;
    public final @Nullable MemorySegment SEGMENT$glfwGetPlatform;
    public final @Nullable MemorySegment SEGMENT$glfwPlatformSupported;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitors;
    public final @Nullable MemorySegment SEGMENT$glfwGetPrimaryMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorPos;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorWorkarea;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorPhysicalSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorContentScale;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorName;
    public final @Nullable MemorySegment SEGMENT$glfwSetMonitorUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwSetMonitorCallback;
    public final @Nullable MemorySegment SEGMENT$glfwGetVideoModes;
    public final @Nullable MemorySegment SEGMENT$glfwGetVideoMode;
    public final @Nullable MemorySegment SEGMENT$glfwSetGamma;
    public final @Nullable MemorySegment SEGMENT$glfwGetGammaRamp;
    public final @Nullable MemorySegment SEGMENT$glfwSetGammaRamp;
    public final @Nullable MemorySegment SEGMENT$glfwDefaultWindowHints;
    public final @Nullable MemorySegment SEGMENT$glfwWindowHint;
    public final @Nullable MemorySegment SEGMENT$glfwWindowHintString;
    public final @Nullable MemorySegment SEGMENT$glfwCreateWindow;
    public final @Nullable MemorySegment SEGMENT$glfwDestroyWindow;
    public final @Nullable MemorySegment SEGMENT$glfwWindowShouldClose;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowShouldClose;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowTitle;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowTitle;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowIcon;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowPos;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowPos;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowSize;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowSizeLimits;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowAspectRatio;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetFramebufferSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowFrameSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowContentScale;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowOpacity;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowOpacity;
    public final @Nullable MemorySegment SEGMENT$glfwIconifyWindow;
    public final @Nullable MemorySegment SEGMENT$glfwRestoreWindow;
    public final @Nullable MemorySegment SEGMENT$glfwMaximizeWindow;
    public final @Nullable MemorySegment SEGMENT$glfwShowWindow;
    public final @Nullable MemorySegment SEGMENT$glfwHideWindow;
    public final @Nullable MemorySegment SEGMENT$glfwFocusWindow;
    public final @Nullable MemorySegment SEGMENT$glfwRequestWindowAttention;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowAttrib;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowAttrib;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowPosCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowSizeCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowCloseCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowRefreshCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowFocusCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowIconifyCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowMaximizeCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetFramebufferSizeCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowContentScaleCallback;
    public final @Nullable MemorySegment SEGMENT$glfwPollEvents;
    public final @Nullable MemorySegment SEGMENT$glfwWaitEvents;
    public final @Nullable MemorySegment SEGMENT$glfwWaitEventsTimeout;
    public final @Nullable MemorySegment SEGMENT$glfwPostEmptyEvent;
    public final @Nullable MemorySegment SEGMENT$glfwGetInputMode;
    public final @Nullable MemorySegment SEGMENT$glfwSetInputMode;
    public final @Nullable MemorySegment SEGMENT$glfwRawMouseMotionSupported;
    public final @Nullable MemorySegment SEGMENT$glfwGetKeyName;
    public final @Nullable MemorySegment SEGMENT$glfwGetKeyScancode;
    public final @Nullable MemorySegment SEGMENT$glfwGetKey;
    public final @Nullable MemorySegment SEGMENT$glfwGetMouseButton;
    public final @Nullable MemorySegment SEGMENT$glfwGetCursorPos;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursorPos;
    public final @Nullable MemorySegment SEGMENT$glfwCreateCursor;
    public final @Nullable MemorySegment SEGMENT$glfwCreateStandardCursor;
    public final @Nullable MemorySegment SEGMENT$glfwDestroyCursor;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursor;
    public final @Nullable MemorySegment SEGMENT$glfwSetKeyCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetCharCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetCharModsCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetMouseButtonCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursorPosCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursorEnterCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetScrollCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetDropCallback;
    public final @Nullable MemorySegment SEGMENT$glfwJoystickPresent;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickAxes;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickButtons;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickHats;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickName;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickGUID;
    public final @Nullable MemorySegment SEGMENT$glfwSetJoystickUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwJoystickIsGamepad;
    public final @Nullable MemorySegment SEGMENT$glfwSetJoystickCallback;
    public final @Nullable MemorySegment SEGMENT$glfwUpdateGamepadMappings;
    public final @Nullable MemorySegment SEGMENT$glfwGetGamepadName;
    public final @Nullable MemorySegment SEGMENT$glfwGetGamepadState;
    public final @Nullable MemorySegment SEGMENT$glfwSetClipboardString;
    public final @Nullable MemorySegment SEGMENT$glfwGetClipboardString;
    public final @Nullable MemorySegment SEGMENT$glfwGetTime;
    public final @Nullable MemorySegment SEGMENT$glfwSetTime;
    public final @Nullable MemorySegment SEGMENT$glfwGetTimerValue;
    public final @Nullable MemorySegment SEGMENT$glfwGetTimerFrequency;
    public final @Nullable MemorySegment SEGMENT$glfwMakeContextCurrent;
    public final @Nullable MemorySegment SEGMENT$glfwGetCurrentContext;
    public final @Nullable MemorySegment SEGMENT$glfwSwapBuffers;
    public final @Nullable MemorySegment SEGMENT$glfwSwapInterval;
    public final @Nullable MemorySegment SEGMENT$glfwExtensionSupported;
    public final @Nullable MemorySegment SEGMENT$glfwGetProcAddress;
    public final @Nullable MemorySegment SEGMENT$glfwVulkanSupported;
    public final @Nullable MemorySegment SEGMENT$glfwGetRequiredInstanceExtensions;
    public final @Nullable MemorySegment SEGMENT$glfwGetInstanceProcAddress;
    public final @Nullable MemorySegment SEGMENT$glfwGetPhysicalDevicePresentationSupport;
    public final @Nullable MemorySegment SEGMENT$glfwCreateWindowSurface;
    public final @Nullable MemorySegment SEGMENT$glfwGetWin32Adapter;
    public final @Nullable MemorySegment SEGMENT$glfwGetWin32Monitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetWin32Window;
    public final @Nullable MemorySegment SEGMENT$glfwGetWGLContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetCocoaMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetCocoaWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetCocoaView;
    public final @Nullable MemorySegment SEGMENT$glfwGetNSGLContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Display;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Adapter;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Monitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Window;
    public final @Nullable MemorySegment SEGMENT$glfwSetX11SelectionString;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11SelectionString;
    public final @Nullable MemorySegment SEGMENT$glfwGetGLXContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetGLXWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetWaylandDisplay;
    public final @Nullable MemorySegment SEGMENT$glfwGetWaylandMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetWaylandWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetEGLDisplay;
    public final @Nullable MemorySegment SEGMENT$glfwGetEGLContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetEGLSurface;
    public final @Nullable MemorySegment SEGMENT$glfwGetOSMesaColorBuffer;
    public final @Nullable MemorySegment SEGMENT$glfwGetOSMesaDepthBuffer;
    public final @Nullable MemorySegment SEGMENT$glfwGetOSMesaContext;

    public final @Nullable MethodHandle HANDLE$glfwInit;
    public final @Nullable MethodHandle HANDLE$glfwTerminate;
    public final @Nullable MethodHandle HANDLE$glfwInitHint;
    public final @Nullable MethodHandle HANDLE$glfwInitAllocator;
    public final @Nullable MethodHandle HANDLE$glfwInitVulkanLoader;
    public final @Nullable MethodHandle HANDLE$glfwGetVersion;
    public final @Nullable MethodHandle HANDLE$glfwGetVersionString;
    public final @Nullable MethodHandle HANDLE$glfwGetError;
    public final @Nullable MethodHandle HANDLE$glfwSetErrorCallback;
    public final @Nullable MethodHandle HANDLE$glfwGetPlatform;
    public final @Nullable MethodHandle HANDLE$glfwPlatformSupported;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitors;
    public final @Nullable MethodHandle HANDLE$glfwGetPrimaryMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorPos;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorWorkarea;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorPhysicalSize;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorContentScale;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorName;
    public final @Nullable MethodHandle HANDLE$glfwSetMonitorUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwSetMonitorCallback;
    public final @Nullable MethodHandle HANDLE$glfwGetVideoModes;
    public final @Nullable MethodHandle HANDLE$glfwGetVideoMode;
    public final @Nullable MethodHandle HANDLE$glfwSetGamma;
    public final @Nullable MethodHandle HANDLE$glfwGetGammaRamp;
    public final @Nullable MethodHandle HANDLE$glfwSetGammaRamp;
    public final @Nullable MethodHandle HANDLE$glfwDefaultWindowHints;
    public final @Nullable MethodHandle HANDLE$glfwWindowHint;
    public final @Nullable MethodHandle HANDLE$glfwWindowHintString;
    public final @Nullable MethodHandle HANDLE$glfwCreateWindow;
    public final @Nullable MethodHandle HANDLE$glfwDestroyWindow;
    public final @Nullable MethodHandle HANDLE$glfwWindowShouldClose;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowShouldClose;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowTitle;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowTitle;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowIcon;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowPos;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowPos;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowSize;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowSizeLimits;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowAspectRatio;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowSize;
    public final @Nullable MethodHandle HANDLE$glfwGetFramebufferSize;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowFrameSize;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowContentScale;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowOpacity;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowOpacity;
    public final @Nullable MethodHandle HANDLE$glfwIconifyWindow;
    public final @Nullable MethodHandle HANDLE$glfwRestoreWindow;
    public final @Nullable MethodHandle HANDLE$glfwMaximizeWindow;
    public final @Nullable MethodHandle HANDLE$glfwShowWindow;
    public final @Nullable MethodHandle HANDLE$glfwHideWindow;
    public final @Nullable MethodHandle HANDLE$glfwFocusWindow;
    public final @Nullable MethodHandle HANDLE$glfwRequestWindowAttention;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowMonitor;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowAttrib;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowAttrib;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowPosCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowSizeCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowCloseCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowRefreshCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowFocusCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowIconifyCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowMaximizeCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetFramebufferSizeCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowContentScaleCallback;
    public final @Nullable MethodHandle HANDLE$glfwPollEvents;
    public final @Nullable MethodHandle HANDLE$glfwWaitEvents;
    public final @Nullable MethodHandle HANDLE$glfwWaitEventsTimeout;
    public final @Nullable MethodHandle HANDLE$glfwPostEmptyEvent;
    public final @Nullable MethodHandle HANDLE$glfwGetInputMode;
    public final @Nullable MethodHandle HANDLE$glfwSetInputMode;
    public final @Nullable MethodHandle HANDLE$glfwRawMouseMotionSupported;
    public final @Nullable MethodHandle HANDLE$glfwGetKeyName;
    public final @Nullable MethodHandle HANDLE$glfwGetKeyScancode;
    public final @Nullable MethodHandle HANDLE$glfwGetKey;
    public final @Nullable MethodHandle HANDLE$glfwGetMouseButton;
    public final @Nullable MethodHandle HANDLE$glfwGetCursorPos;
    public final @Nullable MethodHandle HANDLE$glfwSetCursorPos;
    public final @Nullable MethodHandle HANDLE$glfwCreateCursor;
    public final @Nullable MethodHandle HANDLE$glfwCreateStandardCursor;
    public final @Nullable MethodHandle HANDLE$glfwDestroyCursor;
    public final @Nullable MethodHandle HANDLE$glfwSetCursor;
    public final @Nullable MethodHandle HANDLE$glfwSetKeyCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetCharCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetCharModsCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetMouseButtonCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetCursorPosCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetCursorEnterCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetScrollCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetDropCallback;
    public final @Nullable MethodHandle HANDLE$glfwJoystickPresent;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickAxes;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickButtons;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickHats;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickName;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickGUID;
    public final @Nullable MethodHandle HANDLE$glfwSetJoystickUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwJoystickIsGamepad;
    public final @Nullable MethodHandle HANDLE$glfwSetJoystickCallback;
    public final @Nullable MethodHandle HANDLE$glfwUpdateGamepadMappings;
    public final @Nullable MethodHandle HANDLE$glfwGetGamepadName;
    public final @Nullable MethodHandle HANDLE$glfwGetGamepadState;
    public final @Nullable MethodHandle HANDLE$glfwSetClipboardString;
    public final @Nullable MethodHandle HANDLE$glfwGetClipboardString;
    public final @Nullable MethodHandle HANDLE$glfwGetTime;
    public final @Nullable MethodHandle HANDLE$glfwSetTime;
    public final @Nullable MethodHandle HANDLE$glfwGetTimerValue;
    public final @Nullable MethodHandle HANDLE$glfwGetTimerFrequency;
    public final @Nullable MethodHandle HANDLE$glfwMakeContextCurrent;
    public final @Nullable MethodHandle HANDLE$glfwGetCurrentContext;
    public final @Nullable MethodHandle HANDLE$glfwSwapBuffers;
    public final @Nullable MethodHandle HANDLE$glfwSwapInterval;
    public final @Nullable MethodHandle HANDLE$glfwExtensionSupported;
    public final @Nullable MethodHandle HANDLE$glfwGetProcAddress;
    public final @Nullable MethodHandle HANDLE$glfwVulkanSupported;
    public final @Nullable MethodHandle HANDLE$glfwGetRequiredInstanceExtensions;
    public final @Nullable MethodHandle HANDLE$glfwGetInstanceProcAddress;
    public final @Nullable MethodHandle HANDLE$glfwGetPhysicalDevicePresentationSupport;
    public final @Nullable MethodHandle HANDLE$glfwCreateWindowSurface;
    public final @Nullable MethodHandle HANDLE$glfwGetWin32Adapter;
    public final @Nullable MethodHandle HANDLE$glfwGetWin32Monitor;
    public final @Nullable MethodHandle HANDLE$glfwGetWin32Window;
    public final @Nullable MethodHandle HANDLE$glfwGetWGLContext;
    public final @Nullable MethodHandle HANDLE$glfwGetCocoaMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetCocoaWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetCocoaView;
    public final @Nullable MethodHandle HANDLE$glfwGetNSGLContext;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Display;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Adapter;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Monitor;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Window;
    public final @Nullable MethodHandle HANDLE$glfwSetX11SelectionString;
    public final @Nullable MethodHandle HANDLE$glfwGetX11SelectionString;
    public final @Nullable MethodHandle HANDLE$glfwGetGLXContext;
    public final @Nullable MethodHandle HANDLE$glfwGetGLXWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetWaylandDisplay;
    public final @Nullable MethodHandle HANDLE$glfwGetWaylandMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetWaylandWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetEGLDisplay;
    public final @Nullable MethodHandle HANDLE$glfwGetEGLContext;
    public final @Nullable MethodHandle HANDLE$glfwGetEGLSurface;
    public final @Nullable MethodHandle HANDLE$glfwGetOSMesaColorBuffer;
    public final @Nullable MethodHandle HANDLE$glfwGetOSMesaDepthBuffer;
    public final @Nullable MethodHandle HANDLE$glfwGetOSMesaContext;

    public GLFW(RawFunctionLoader loader) {
        SEGMENT$glfwInit = loader.apply("glfwInit");
        HANDLE$glfwInit = RawFunctionLoader.link(SEGMENT$glfwInit, DESCRIPTOR$glfwInit);
        SEGMENT$glfwTerminate = loader.apply("glfwTerminate");
        HANDLE$glfwTerminate = RawFunctionLoader.link(SEGMENT$glfwTerminate, DESCRIPTOR$glfwTerminate);
        SEGMENT$glfwInitHint = loader.apply("glfwInitHint");
        HANDLE$glfwInitHint = RawFunctionLoader.link(SEGMENT$glfwInitHint, DESCRIPTOR$glfwInitHint);
        SEGMENT$glfwInitAllocator = loader.apply("glfwInitAllocator");
        HANDLE$glfwInitAllocator = RawFunctionLoader.link(SEGMENT$glfwInitAllocator, DESCRIPTOR$glfwInitAllocator);
        SEGMENT$glfwInitVulkanLoader = loader.apply("glfwInitVulkanLoader");
        HANDLE$glfwInitVulkanLoader = RawFunctionLoader.link(SEGMENT$glfwInitVulkanLoader, DESCRIPTOR$glfwInitVulkanLoader);
        SEGMENT$glfwGetVersion = loader.apply("glfwGetVersion");
        HANDLE$glfwGetVersion = RawFunctionLoader.link(SEGMENT$glfwGetVersion, DESCRIPTOR$glfwGetVersion);
        SEGMENT$glfwGetVersionString = loader.apply("glfwGetVersionString");
        HANDLE$glfwGetVersionString = RawFunctionLoader.link(SEGMENT$glfwGetVersionString, DESCRIPTOR$glfwGetVersionString);
        SEGMENT$glfwGetError = loader.apply("glfwGetError");
        HANDLE$glfwGetError = RawFunctionLoader.link(SEGMENT$glfwGetError, DESCRIPTOR$glfwGetError);
        SEGMENT$glfwSetErrorCallback = loader.apply("glfwSetErrorCallback");
        HANDLE$glfwSetErrorCallback = RawFunctionLoader.link(SEGMENT$glfwSetErrorCallback, DESCRIPTOR$glfwSetErrorCallback);
        SEGMENT$glfwGetPlatform = loader.apply("glfwGetPlatform");
        HANDLE$glfwGetPlatform = RawFunctionLoader.link(SEGMENT$glfwGetPlatform, DESCRIPTOR$glfwGetPlatform);
        SEGMENT$glfwPlatformSupported = loader.apply("glfwPlatformSupported");
        HANDLE$glfwPlatformSupported = RawFunctionLoader.link(SEGMENT$glfwPlatformSupported, DESCRIPTOR$glfwPlatformSupported);
        SEGMENT$glfwGetMonitors = loader.apply("glfwGetMonitors");
        HANDLE$glfwGetMonitors = RawFunctionLoader.link(SEGMENT$glfwGetMonitors, DESCRIPTOR$glfwGetMonitors);
        SEGMENT$glfwGetPrimaryMonitor = loader.apply("glfwGetPrimaryMonitor");
        HANDLE$glfwGetPrimaryMonitor = RawFunctionLoader.link(SEGMENT$glfwGetPrimaryMonitor, DESCRIPTOR$glfwGetPrimaryMonitor);
        SEGMENT$glfwGetMonitorPos = loader.apply("glfwGetMonitorPos");
        HANDLE$glfwGetMonitorPos = RawFunctionLoader.link(SEGMENT$glfwGetMonitorPos, DESCRIPTOR$glfwGetMonitorPos);
        SEGMENT$glfwGetMonitorWorkarea = loader.apply("glfwGetMonitorWorkarea");
        HANDLE$glfwGetMonitorWorkarea = RawFunctionLoader.link(SEGMENT$glfwGetMonitorWorkarea, DESCRIPTOR$glfwGetMonitorWorkarea);
        SEGMENT$glfwGetMonitorPhysicalSize = loader.apply("glfwGetMonitorPhysicalSize");
        HANDLE$glfwGetMonitorPhysicalSize = RawFunctionLoader.link(SEGMENT$glfwGetMonitorPhysicalSize, DESCRIPTOR$glfwGetMonitorPhysicalSize);
        SEGMENT$glfwGetMonitorContentScale = loader.apply("glfwGetMonitorContentScale");
        HANDLE$glfwGetMonitorContentScale = RawFunctionLoader.link(SEGMENT$glfwGetMonitorContentScale, DESCRIPTOR$glfwGetMonitorContentScale);
        SEGMENT$glfwGetMonitorName = loader.apply("glfwGetMonitorName");
        HANDLE$glfwGetMonitorName = RawFunctionLoader.link(SEGMENT$glfwGetMonitorName, DESCRIPTOR$glfwGetMonitorName);
        SEGMENT$glfwSetMonitorUserPointer = loader.apply("glfwSetMonitorUserPointer");
        HANDLE$glfwSetMonitorUserPointer = RawFunctionLoader.link(SEGMENT$glfwSetMonitorUserPointer, DESCRIPTOR$glfwSetMonitorUserPointer);
        SEGMENT$glfwGetMonitorUserPointer = loader.apply("glfwGetMonitorUserPointer");
        HANDLE$glfwGetMonitorUserPointer = RawFunctionLoader.link(SEGMENT$glfwGetMonitorUserPointer, DESCRIPTOR$glfwGetMonitorUserPointer);
        SEGMENT$glfwSetMonitorCallback = loader.apply("glfwSetMonitorCallback");
        HANDLE$glfwSetMonitorCallback = RawFunctionLoader.link(SEGMENT$glfwSetMonitorCallback, DESCRIPTOR$glfwSetMonitorCallback);
        SEGMENT$glfwGetVideoModes = loader.apply("glfwGetVideoModes");
        HANDLE$glfwGetVideoModes = RawFunctionLoader.link(SEGMENT$glfwGetVideoModes, DESCRIPTOR$glfwGetVideoModes);
        SEGMENT$glfwGetVideoMode = loader.apply("glfwGetVideoMode");
        HANDLE$glfwGetVideoMode = RawFunctionLoader.link(SEGMENT$glfwGetVideoMode, DESCRIPTOR$glfwGetVideoMode);
        SEGMENT$glfwSetGamma = loader.apply("glfwSetGamma");
        HANDLE$glfwSetGamma = RawFunctionLoader.link(SEGMENT$glfwSetGamma, DESCRIPTOR$glfwSetGamma);
        SEGMENT$glfwGetGammaRamp = loader.apply("glfwGetGammaRamp");
        HANDLE$glfwGetGammaRamp = RawFunctionLoader.link(SEGMENT$glfwGetGammaRamp, DESCRIPTOR$glfwGetGammaRamp);
        SEGMENT$glfwSetGammaRamp = loader.apply("glfwSetGammaRamp");
        HANDLE$glfwSetGammaRamp = RawFunctionLoader.link(SEGMENT$glfwSetGammaRamp, DESCRIPTOR$glfwSetGammaRamp);
        SEGMENT$glfwDefaultWindowHints = loader.apply("glfwDefaultWindowHints");
        HANDLE$glfwDefaultWindowHints = RawFunctionLoader.link(SEGMENT$glfwDefaultWindowHints, DESCRIPTOR$glfwDefaultWindowHints);
        SEGMENT$glfwWindowHint = loader.apply("glfwWindowHint");
        HANDLE$glfwWindowHint = RawFunctionLoader.link(SEGMENT$glfwWindowHint, DESCRIPTOR$glfwWindowHint);
        SEGMENT$glfwWindowHintString = loader.apply("glfwWindowHintString");
        HANDLE$glfwWindowHintString = RawFunctionLoader.link(SEGMENT$glfwWindowHintString, DESCRIPTOR$glfwWindowHintString);
        SEGMENT$glfwCreateWindow = loader.apply("glfwCreateWindow");
        HANDLE$glfwCreateWindow = RawFunctionLoader.link(SEGMENT$glfwCreateWindow, DESCRIPTOR$glfwCreateWindow);
        SEGMENT$glfwDestroyWindow = loader.apply("glfwDestroyWindow");
        HANDLE$glfwDestroyWindow = RawFunctionLoader.link(SEGMENT$glfwDestroyWindow, DESCRIPTOR$glfwDestroyWindow);
        SEGMENT$glfwWindowShouldClose = loader.apply("glfwWindowShouldClose");
        HANDLE$glfwWindowShouldClose = RawFunctionLoader.link(SEGMENT$glfwWindowShouldClose, DESCRIPTOR$glfwWindowShouldClose);
        SEGMENT$glfwSetWindowShouldClose = loader.apply("glfwSetWindowShouldClose");
        HANDLE$glfwSetWindowShouldClose = RawFunctionLoader.link(SEGMENT$glfwSetWindowShouldClose, DESCRIPTOR$glfwSetWindowShouldClose);
        SEGMENT$glfwGetWindowTitle = loader.apply("glfwGetWindowTitle");
        HANDLE$glfwGetWindowTitle = RawFunctionLoader.link(SEGMENT$glfwGetWindowTitle, DESCRIPTOR$glfwGetWindowTitle);
        SEGMENT$glfwSetWindowTitle = loader.apply("glfwSetWindowTitle");
        HANDLE$glfwSetWindowTitle = RawFunctionLoader.link(SEGMENT$glfwSetWindowTitle, DESCRIPTOR$glfwSetWindowTitle);
        SEGMENT$glfwSetWindowIcon = loader.apply("glfwSetWindowIcon");
        HANDLE$glfwSetWindowIcon = RawFunctionLoader.link(SEGMENT$glfwSetWindowIcon, DESCRIPTOR$glfwSetWindowIcon);
        SEGMENT$glfwGetWindowPos = loader.apply("glfwGetWindowPos");
        HANDLE$glfwGetWindowPos = RawFunctionLoader.link(SEGMENT$glfwGetWindowPos, DESCRIPTOR$glfwGetWindowPos);
        SEGMENT$glfwSetWindowPos = loader.apply("glfwSetWindowPos");
        HANDLE$glfwSetWindowPos = RawFunctionLoader.link(SEGMENT$glfwSetWindowPos, DESCRIPTOR$glfwSetWindowPos);
        SEGMENT$glfwGetWindowSize = loader.apply("glfwGetWindowSize");
        HANDLE$glfwGetWindowSize = RawFunctionLoader.link(SEGMENT$glfwGetWindowSize, DESCRIPTOR$glfwGetWindowSize);
        SEGMENT$glfwSetWindowSizeLimits = loader.apply("glfwSetWindowSizeLimits");
        HANDLE$glfwSetWindowSizeLimits = RawFunctionLoader.link(SEGMENT$glfwSetWindowSizeLimits, DESCRIPTOR$glfwSetWindowSizeLimits);
        SEGMENT$glfwSetWindowAspectRatio = loader.apply("glfwSetWindowAspectRatio");
        HANDLE$glfwSetWindowAspectRatio = RawFunctionLoader.link(SEGMENT$glfwSetWindowAspectRatio, DESCRIPTOR$glfwSetWindowAspectRatio);
        SEGMENT$glfwSetWindowSize = loader.apply("glfwSetWindowSize");
        HANDLE$glfwSetWindowSize = RawFunctionLoader.link(SEGMENT$glfwSetWindowSize, DESCRIPTOR$glfwSetWindowSize);
        SEGMENT$glfwGetFramebufferSize = loader.apply("glfwGetFramebufferSize");
        HANDLE$glfwGetFramebufferSize = RawFunctionLoader.link(SEGMENT$glfwGetFramebufferSize, DESCRIPTOR$glfwGetFramebufferSize);
        SEGMENT$glfwGetWindowFrameSize = loader.apply("glfwGetWindowFrameSize");
        HANDLE$glfwGetWindowFrameSize = RawFunctionLoader.link(SEGMENT$glfwGetWindowFrameSize, DESCRIPTOR$glfwGetWindowFrameSize);
        SEGMENT$glfwGetWindowContentScale = loader.apply("glfwGetWindowContentScale");
        HANDLE$glfwGetWindowContentScale = RawFunctionLoader.link(SEGMENT$glfwGetWindowContentScale, DESCRIPTOR$glfwGetWindowContentScale);
        SEGMENT$glfwGetWindowOpacity = loader.apply("glfwGetWindowOpacity");
        HANDLE$glfwGetWindowOpacity = RawFunctionLoader.link(SEGMENT$glfwGetWindowOpacity, DESCRIPTOR$glfwGetWindowOpacity);
        SEGMENT$glfwSetWindowOpacity = loader.apply("glfwSetWindowOpacity");
        HANDLE$glfwSetWindowOpacity = RawFunctionLoader.link(SEGMENT$glfwSetWindowOpacity, DESCRIPTOR$glfwSetWindowOpacity);
        SEGMENT$glfwIconifyWindow = loader.apply("glfwIconifyWindow");
        HANDLE$glfwIconifyWindow = RawFunctionLoader.link(SEGMENT$glfwIconifyWindow, DESCRIPTOR$glfwIconifyWindow);
        SEGMENT$glfwRestoreWindow = loader.apply("glfwRestoreWindow");
        HANDLE$glfwRestoreWindow = RawFunctionLoader.link(SEGMENT$glfwRestoreWindow, DESCRIPTOR$glfwRestoreWindow);
        SEGMENT$glfwMaximizeWindow = loader.apply("glfwMaximizeWindow");
        HANDLE$glfwMaximizeWindow = RawFunctionLoader.link(SEGMENT$glfwMaximizeWindow, DESCRIPTOR$glfwMaximizeWindow);
        SEGMENT$glfwShowWindow = loader.apply("glfwShowWindow");
        HANDLE$glfwShowWindow = RawFunctionLoader.link(SEGMENT$glfwShowWindow, DESCRIPTOR$glfwShowWindow);
        SEGMENT$glfwHideWindow = loader.apply("glfwHideWindow");
        HANDLE$glfwHideWindow = RawFunctionLoader.link(SEGMENT$glfwHideWindow, DESCRIPTOR$glfwHideWindow);
        SEGMENT$glfwFocusWindow = loader.apply("glfwFocusWindow");
        HANDLE$glfwFocusWindow = RawFunctionLoader.link(SEGMENT$glfwFocusWindow, DESCRIPTOR$glfwFocusWindow);
        SEGMENT$glfwRequestWindowAttention = loader.apply("glfwRequestWindowAttention");
        HANDLE$glfwRequestWindowAttention = RawFunctionLoader.link(SEGMENT$glfwRequestWindowAttention, DESCRIPTOR$glfwRequestWindowAttention);
        SEGMENT$glfwGetWindowMonitor = loader.apply("glfwGetWindowMonitor");
        HANDLE$glfwGetWindowMonitor = RawFunctionLoader.link(SEGMENT$glfwGetWindowMonitor, DESCRIPTOR$glfwGetWindowMonitor);
        SEGMENT$glfwSetWindowMonitor = loader.apply("glfwSetWindowMonitor");
        HANDLE$glfwSetWindowMonitor = RawFunctionLoader.link(SEGMENT$glfwSetWindowMonitor, DESCRIPTOR$glfwSetWindowMonitor);
        SEGMENT$glfwGetWindowAttrib = loader.apply("glfwGetWindowAttrib");
        HANDLE$glfwGetWindowAttrib = RawFunctionLoader.link(SEGMENT$glfwGetWindowAttrib, DESCRIPTOR$glfwGetWindowAttrib);
        SEGMENT$glfwSetWindowAttrib = loader.apply("glfwSetWindowAttrib");
        HANDLE$glfwSetWindowAttrib = RawFunctionLoader.link(SEGMENT$glfwSetWindowAttrib, DESCRIPTOR$glfwSetWindowAttrib);
        SEGMENT$glfwSetWindowUserPointer = loader.apply("glfwSetWindowUserPointer");
        HANDLE$glfwSetWindowUserPointer = RawFunctionLoader.link(SEGMENT$glfwSetWindowUserPointer, DESCRIPTOR$glfwSetWindowUserPointer);
        SEGMENT$glfwGetWindowUserPointer = loader.apply("glfwGetWindowUserPointer");
        HANDLE$glfwGetWindowUserPointer = RawFunctionLoader.link(SEGMENT$glfwGetWindowUserPointer, DESCRIPTOR$glfwGetWindowUserPointer);
        SEGMENT$glfwSetWindowPosCallback = loader.apply("glfwSetWindowPosCallback");
        HANDLE$glfwSetWindowPosCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowPosCallback, DESCRIPTOR$glfwSetWindowPosCallback);
        SEGMENT$glfwSetWindowSizeCallback = loader.apply("glfwSetWindowSizeCallback");
        HANDLE$glfwSetWindowSizeCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowSizeCallback, DESCRIPTOR$glfwSetWindowSizeCallback);
        SEGMENT$glfwSetWindowCloseCallback = loader.apply("glfwSetWindowCloseCallback");
        HANDLE$glfwSetWindowCloseCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowCloseCallback, DESCRIPTOR$glfwSetWindowCloseCallback);
        SEGMENT$glfwSetWindowRefreshCallback = loader.apply("glfwSetWindowRefreshCallback");
        HANDLE$glfwSetWindowRefreshCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowRefreshCallback, DESCRIPTOR$glfwSetWindowRefreshCallback);
        SEGMENT$glfwSetWindowFocusCallback = loader.apply("glfwSetWindowFocusCallback");
        HANDLE$glfwSetWindowFocusCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowFocusCallback, DESCRIPTOR$glfwSetWindowFocusCallback);
        SEGMENT$glfwSetWindowIconifyCallback = loader.apply("glfwSetWindowIconifyCallback");
        HANDLE$glfwSetWindowIconifyCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowIconifyCallback, DESCRIPTOR$glfwSetWindowIconifyCallback);
        SEGMENT$glfwSetWindowMaximizeCallback = loader.apply("glfwSetWindowMaximizeCallback");
        HANDLE$glfwSetWindowMaximizeCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowMaximizeCallback, DESCRIPTOR$glfwSetWindowMaximizeCallback);
        SEGMENT$glfwSetFramebufferSizeCallback = loader.apply("glfwSetFramebufferSizeCallback");
        HANDLE$glfwSetFramebufferSizeCallback = RawFunctionLoader.link(SEGMENT$glfwSetFramebufferSizeCallback, DESCRIPTOR$glfwSetFramebufferSizeCallback);
        SEGMENT$glfwSetWindowContentScaleCallback = loader.apply("glfwSetWindowContentScaleCallback");
        HANDLE$glfwSetWindowContentScaleCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowContentScaleCallback, DESCRIPTOR$glfwSetWindowContentScaleCallback);
        SEGMENT$glfwPollEvents = loader.apply("glfwPollEvents");
        HANDLE$glfwPollEvents = RawFunctionLoader.link(SEGMENT$glfwPollEvents, DESCRIPTOR$glfwPollEvents);
        SEGMENT$glfwWaitEvents = loader.apply("glfwWaitEvents");
        HANDLE$glfwWaitEvents = RawFunctionLoader.link(SEGMENT$glfwWaitEvents, DESCRIPTOR$glfwWaitEvents);
        SEGMENT$glfwWaitEventsTimeout = loader.apply("glfwWaitEventsTimeout");
        HANDLE$glfwWaitEventsTimeout = RawFunctionLoader.link(SEGMENT$glfwWaitEventsTimeout, DESCRIPTOR$glfwWaitEventsTimeout);
        SEGMENT$glfwPostEmptyEvent = loader.apply("glfwPostEmptyEvent");
        HANDLE$glfwPostEmptyEvent = RawFunctionLoader.link(SEGMENT$glfwPostEmptyEvent, DESCRIPTOR$glfwPostEmptyEvent);
        SEGMENT$glfwGetInputMode = loader.apply("glfwGetInputMode");
        HANDLE$glfwGetInputMode = RawFunctionLoader.link(SEGMENT$glfwGetInputMode, DESCRIPTOR$glfwGetInputMode);
        SEGMENT$glfwSetInputMode = loader.apply("glfwSetInputMode");
        HANDLE$glfwSetInputMode = RawFunctionLoader.link(SEGMENT$glfwSetInputMode, DESCRIPTOR$glfwSetInputMode);
        SEGMENT$glfwRawMouseMotionSupported = loader.apply("glfwRawMouseMotionSupported");
        HANDLE$glfwRawMouseMotionSupported = RawFunctionLoader.link(SEGMENT$glfwRawMouseMotionSupported, DESCRIPTOR$glfwRawMouseMotionSupported);
        SEGMENT$glfwGetKeyName = loader.apply("glfwGetKeyName");
        HANDLE$glfwGetKeyName = RawFunctionLoader.link(SEGMENT$glfwGetKeyName, DESCRIPTOR$glfwGetKeyName);
        SEGMENT$glfwGetKeyScancode = loader.apply("glfwGetKeyScancode");
        HANDLE$glfwGetKeyScancode = RawFunctionLoader.link(SEGMENT$glfwGetKeyScancode, DESCRIPTOR$glfwGetKeyScancode);
        SEGMENT$glfwGetKey = loader.apply("glfwGetKey");
        HANDLE$glfwGetKey = RawFunctionLoader.link(SEGMENT$glfwGetKey, DESCRIPTOR$glfwGetKey);
        SEGMENT$glfwGetMouseButton = loader.apply("glfwGetMouseButton");
        HANDLE$glfwGetMouseButton = RawFunctionLoader.link(SEGMENT$glfwGetMouseButton, DESCRIPTOR$glfwGetMouseButton);
        SEGMENT$glfwGetCursorPos = loader.apply("glfwGetCursorPos");
        HANDLE$glfwGetCursorPos = RawFunctionLoader.link(SEGMENT$glfwGetCursorPos, DESCRIPTOR$glfwGetCursorPos);
        SEGMENT$glfwSetCursorPos = loader.apply("glfwSetCursorPos");
        HANDLE$glfwSetCursorPos = RawFunctionLoader.link(SEGMENT$glfwSetCursorPos, DESCRIPTOR$glfwSetCursorPos);
        SEGMENT$glfwCreateCursor = loader.apply("glfwCreateCursor");
        HANDLE$glfwCreateCursor = RawFunctionLoader.link(SEGMENT$glfwCreateCursor, DESCRIPTOR$glfwCreateCursor);
        SEGMENT$glfwCreateStandardCursor = loader.apply("glfwCreateStandardCursor");
        HANDLE$glfwCreateStandardCursor = RawFunctionLoader.link(SEGMENT$glfwCreateStandardCursor, DESCRIPTOR$glfwCreateStandardCursor);
        SEGMENT$glfwDestroyCursor = loader.apply("glfwDestroyCursor");
        HANDLE$glfwDestroyCursor = RawFunctionLoader.link(SEGMENT$glfwDestroyCursor, DESCRIPTOR$glfwDestroyCursor);
        SEGMENT$glfwSetCursor = loader.apply("glfwSetCursor");
        HANDLE$glfwSetCursor = RawFunctionLoader.link(SEGMENT$glfwSetCursor, DESCRIPTOR$glfwSetCursor);
        SEGMENT$glfwSetKeyCallback = loader.apply("glfwSetKeyCallback");
        HANDLE$glfwSetKeyCallback = RawFunctionLoader.link(SEGMENT$glfwSetKeyCallback, DESCRIPTOR$glfwSetKeyCallback);
        SEGMENT$glfwSetCharCallback = loader.apply("glfwSetCharCallback");
        HANDLE$glfwSetCharCallback = RawFunctionLoader.link(SEGMENT$glfwSetCharCallback, DESCRIPTOR$glfwSetCharCallback);
        SEGMENT$glfwSetCharModsCallback = loader.apply("glfwSetCharModsCallback");
        HANDLE$glfwSetCharModsCallback = RawFunctionLoader.link(SEGMENT$glfwSetCharModsCallback, DESCRIPTOR$glfwSetCharModsCallback);
        SEGMENT$glfwSetMouseButtonCallback = loader.apply("glfwSetMouseButtonCallback");
        HANDLE$glfwSetMouseButtonCallback = RawFunctionLoader.link(SEGMENT$glfwSetMouseButtonCallback, DESCRIPTOR$glfwSetMouseButtonCallback);
        SEGMENT$glfwSetCursorPosCallback = loader.apply("glfwSetCursorPosCallback");
        HANDLE$glfwSetCursorPosCallback = RawFunctionLoader.link(SEGMENT$glfwSetCursorPosCallback, DESCRIPTOR$glfwSetCursorPosCallback);
        SEGMENT$glfwSetCursorEnterCallback = loader.apply("glfwSetCursorEnterCallback");
        HANDLE$glfwSetCursorEnterCallback = RawFunctionLoader.link(SEGMENT$glfwSetCursorEnterCallback, DESCRIPTOR$glfwSetCursorEnterCallback);
        SEGMENT$glfwSetScrollCallback = loader.apply("glfwSetScrollCallback");
        HANDLE$glfwSetScrollCallback = RawFunctionLoader.link(SEGMENT$glfwSetScrollCallback, DESCRIPTOR$glfwSetScrollCallback);
        SEGMENT$glfwSetDropCallback = loader.apply("glfwSetDropCallback");
        HANDLE$glfwSetDropCallback = RawFunctionLoader.link(SEGMENT$glfwSetDropCallback, DESCRIPTOR$glfwSetDropCallback);
        SEGMENT$glfwJoystickPresent = loader.apply("glfwJoystickPresent");
        HANDLE$glfwJoystickPresent = RawFunctionLoader.link(SEGMENT$glfwJoystickPresent, DESCRIPTOR$glfwJoystickPresent);
        SEGMENT$glfwGetJoystickAxes = loader.apply("glfwGetJoystickAxes");
        HANDLE$glfwGetJoystickAxes = RawFunctionLoader.link(SEGMENT$glfwGetJoystickAxes, DESCRIPTOR$glfwGetJoystickAxes);
        SEGMENT$glfwGetJoystickButtons = loader.apply("glfwGetJoystickButtons");
        HANDLE$glfwGetJoystickButtons = RawFunctionLoader.link(SEGMENT$glfwGetJoystickButtons, DESCRIPTOR$glfwGetJoystickButtons);
        SEGMENT$glfwGetJoystickHats = loader.apply("glfwGetJoystickHats");
        HANDLE$glfwGetJoystickHats = RawFunctionLoader.link(SEGMENT$glfwGetJoystickHats, DESCRIPTOR$glfwGetJoystickHats);
        SEGMENT$glfwGetJoystickName = loader.apply("glfwGetJoystickName");
        HANDLE$glfwGetJoystickName = RawFunctionLoader.link(SEGMENT$glfwGetJoystickName, DESCRIPTOR$glfwGetJoystickName);
        SEGMENT$glfwGetJoystickGUID = loader.apply("glfwGetJoystickGUID");
        HANDLE$glfwGetJoystickGUID = RawFunctionLoader.link(SEGMENT$glfwGetJoystickGUID, DESCRIPTOR$glfwGetJoystickGUID);
        SEGMENT$glfwSetJoystickUserPointer = loader.apply("glfwSetJoystickUserPointer");
        HANDLE$glfwSetJoystickUserPointer = RawFunctionLoader.link(SEGMENT$glfwSetJoystickUserPointer, DESCRIPTOR$glfwSetJoystickUserPointer);
        SEGMENT$glfwGetJoystickUserPointer = loader.apply("glfwGetJoystickUserPointer");
        HANDLE$glfwGetJoystickUserPointer = RawFunctionLoader.link(SEGMENT$glfwGetJoystickUserPointer, DESCRIPTOR$glfwGetJoystickUserPointer);
        SEGMENT$glfwJoystickIsGamepad = loader.apply("glfwJoystickIsGamepad");
        HANDLE$glfwJoystickIsGamepad = RawFunctionLoader.link(SEGMENT$glfwJoystickIsGamepad, DESCRIPTOR$glfwJoystickIsGamepad);
        SEGMENT$glfwSetJoystickCallback = loader.apply("glfwSetJoystickCallback");
        HANDLE$glfwSetJoystickCallback = RawFunctionLoader.link(SEGMENT$glfwSetJoystickCallback, DESCRIPTOR$glfwSetJoystickCallback);
        SEGMENT$glfwUpdateGamepadMappings = loader.apply("glfwUpdateGamepadMappings");
        HANDLE$glfwUpdateGamepadMappings = RawFunctionLoader.link(SEGMENT$glfwUpdateGamepadMappings, DESCRIPTOR$glfwUpdateGamepadMappings);
        SEGMENT$glfwGetGamepadName = loader.apply("glfwGetGamepadName");
        HANDLE$glfwGetGamepadName = RawFunctionLoader.link(SEGMENT$glfwGetGamepadName, DESCRIPTOR$glfwGetGamepadName);
        SEGMENT$glfwGetGamepadState = loader.apply("glfwGetGamepadState");
        HANDLE$glfwGetGamepadState = RawFunctionLoader.link(SEGMENT$glfwGetGamepadState, DESCRIPTOR$glfwGetGamepadState);
        SEGMENT$glfwSetClipboardString = loader.apply("glfwSetClipboardString");
        HANDLE$glfwSetClipboardString = RawFunctionLoader.link(SEGMENT$glfwSetClipboardString, DESCRIPTOR$glfwSetClipboardString);
        SEGMENT$glfwGetClipboardString = loader.apply("glfwGetClipboardString");
        HANDLE$glfwGetClipboardString = RawFunctionLoader.link(SEGMENT$glfwGetClipboardString, DESCRIPTOR$glfwGetClipboardString);
        SEGMENT$glfwGetTime = loader.apply("glfwGetTime");
        HANDLE$glfwGetTime = RawFunctionLoader.link(SEGMENT$glfwGetTime, DESCRIPTOR$glfwGetTime);
        SEGMENT$glfwSetTime = loader.apply("glfwSetTime");
        HANDLE$glfwSetTime = RawFunctionLoader.link(SEGMENT$glfwSetTime, DESCRIPTOR$glfwSetTime);
        SEGMENT$glfwGetTimerValue = loader.apply("glfwGetTimerValue");
        HANDLE$glfwGetTimerValue = RawFunctionLoader.link(SEGMENT$glfwGetTimerValue, DESCRIPTOR$glfwGetTimerValue);
        SEGMENT$glfwGetTimerFrequency = loader.apply("glfwGetTimerFrequency");
        HANDLE$glfwGetTimerFrequency = RawFunctionLoader.link(SEGMENT$glfwGetTimerFrequency, DESCRIPTOR$glfwGetTimerFrequency);
        SEGMENT$glfwMakeContextCurrent = loader.apply("glfwMakeContextCurrent");
        HANDLE$glfwMakeContextCurrent = RawFunctionLoader.link(SEGMENT$glfwMakeContextCurrent, DESCRIPTOR$glfwMakeContextCurrent);
        SEGMENT$glfwGetCurrentContext = loader.apply("glfwGetCurrentContext");
        HANDLE$glfwGetCurrentContext = RawFunctionLoader.link(SEGMENT$glfwGetCurrentContext, DESCRIPTOR$glfwGetCurrentContext);
        SEGMENT$glfwSwapBuffers = loader.apply("glfwSwapBuffers");
        HANDLE$glfwSwapBuffers = RawFunctionLoader.link(SEGMENT$glfwSwapBuffers, DESCRIPTOR$glfwSwapBuffers);
        SEGMENT$glfwSwapInterval = loader.apply("glfwSwapInterval");
        HANDLE$glfwSwapInterval = RawFunctionLoader.link(SEGMENT$glfwSwapInterval, DESCRIPTOR$glfwSwapInterval);
        SEGMENT$glfwExtensionSupported = loader.apply("glfwExtensionSupported");
        HANDLE$glfwExtensionSupported = RawFunctionLoader.link(SEGMENT$glfwExtensionSupported, DESCRIPTOR$glfwExtensionSupported);
        SEGMENT$glfwGetProcAddress = loader.apply("glfwGetProcAddress");
        HANDLE$glfwGetProcAddress = RawFunctionLoader.link(SEGMENT$glfwGetProcAddress, DESCRIPTOR$glfwGetProcAddress);
        SEGMENT$glfwVulkanSupported = loader.apply("glfwVulkanSupported");
        HANDLE$glfwVulkanSupported = RawFunctionLoader.link(SEGMENT$glfwVulkanSupported, DESCRIPTOR$glfwVulkanSupported);
        SEGMENT$glfwGetRequiredInstanceExtensions = loader.apply("glfwGetRequiredInstanceExtensions");
        HANDLE$glfwGetRequiredInstanceExtensions = RawFunctionLoader.link(SEGMENT$glfwGetRequiredInstanceExtensions, DESCRIPTOR$glfwGetRequiredInstanceExtensions);
        SEGMENT$glfwGetInstanceProcAddress = loader.apply("glfwGetInstanceProcAddress");
        HANDLE$glfwGetInstanceProcAddress = RawFunctionLoader.link(SEGMENT$glfwGetInstanceProcAddress, DESCRIPTOR$glfwGetInstanceProcAddress);
        SEGMENT$glfwGetPhysicalDevicePresentationSupport = loader.apply("glfwGetPhysicalDevicePresentationSupport");
        HANDLE$glfwGetPhysicalDevicePresentationSupport = RawFunctionLoader.link(SEGMENT$glfwGetPhysicalDevicePresentationSupport, DESCRIPTOR$glfwGetPhysicalDevicePresentationSupport);
        SEGMENT$glfwCreateWindowSurface = loader.apply("glfwCreateWindowSurface");
        HANDLE$glfwCreateWindowSurface = RawFunctionLoader.link(SEGMENT$glfwCreateWindowSurface, DESCRIPTOR$glfwCreateWindowSurface);
        SEGMENT$glfwGetWin32Adapter = loader.apply("glfwGetWin32Adapter");
        HANDLE$glfwGetWin32Adapter = RawFunctionLoader.link(SEGMENT$glfwGetWin32Adapter, DESCRIPTOR$glfwGetWin32Adapter);
        SEGMENT$glfwGetWin32Monitor = loader.apply("glfwGetWin32Monitor");
        HANDLE$glfwGetWin32Monitor = RawFunctionLoader.link(SEGMENT$glfwGetWin32Monitor, DESCRIPTOR$glfwGetWin32Monitor);
        SEGMENT$glfwGetWin32Window = loader.apply("glfwGetWin32Window");
        HANDLE$glfwGetWin32Window = RawFunctionLoader.link(SEGMENT$glfwGetWin32Window, DESCRIPTOR$glfwGetWin32Window);
        SEGMENT$glfwGetWGLContext = loader.apply("glfwGetWGLContext");
        HANDLE$glfwGetWGLContext = RawFunctionLoader.link(SEGMENT$glfwGetWGLContext, DESCRIPTOR$glfwGetWGLContext);
        SEGMENT$glfwGetCocoaMonitor = loader.apply("glfwGetCocoaMonitor");
        HANDLE$glfwGetCocoaMonitor = RawFunctionLoader.link(SEGMENT$glfwGetCocoaMonitor, DESCRIPTOR$glfwGetCocoaMonitor);
        SEGMENT$glfwGetCocoaWindow = loader.apply("glfwGetCocoaWindow");
        HANDLE$glfwGetCocoaWindow = RawFunctionLoader.link(SEGMENT$glfwGetCocoaWindow, DESCRIPTOR$glfwGetCocoaWindow);
        SEGMENT$glfwGetCocoaView = loader.apply("glfwGetCocoaView");
        HANDLE$glfwGetCocoaView = RawFunctionLoader.link(SEGMENT$glfwGetCocoaView, DESCRIPTOR$glfwGetCocoaView);
        SEGMENT$glfwGetNSGLContext = loader.apply("glfwGetNSGLContext");
        HANDLE$glfwGetNSGLContext = RawFunctionLoader.link(SEGMENT$glfwGetNSGLContext, DESCRIPTOR$glfwGetNSGLContext);
        SEGMENT$glfwGetX11Display = loader.apply("glfwGetX11Display");
        HANDLE$glfwGetX11Display = RawFunctionLoader.link(SEGMENT$glfwGetX11Display, DESCRIPTOR$glfwGetX11Display);
        SEGMENT$glfwGetX11Adapter = loader.apply("glfwGetX11Adapter");
        HANDLE$glfwGetX11Adapter = RawFunctionLoader.link(SEGMENT$glfwGetX11Adapter, DESCRIPTOR$glfwGetX11Adapter);
        SEGMENT$glfwGetX11Monitor = loader.apply("glfwGetX11Monitor");
        HANDLE$glfwGetX11Monitor = RawFunctionLoader.link(SEGMENT$glfwGetX11Monitor, DESCRIPTOR$glfwGetX11Monitor);
        SEGMENT$glfwGetX11Window = loader.apply("glfwGetX11Window");
        HANDLE$glfwGetX11Window = RawFunctionLoader.link(SEGMENT$glfwGetX11Window, DESCRIPTOR$glfwGetX11Window);
        SEGMENT$glfwSetX11SelectionString = loader.apply("glfwSetX11SelectionString");
        HANDLE$glfwSetX11SelectionString = RawFunctionLoader.link(SEGMENT$glfwSetX11SelectionString, DESCRIPTOR$glfwSetX11SelectionString);
        SEGMENT$glfwGetX11SelectionString = loader.apply("glfwGetX11SelectionString");
        HANDLE$glfwGetX11SelectionString = RawFunctionLoader.link(SEGMENT$glfwGetX11SelectionString, DESCRIPTOR$glfwGetX11SelectionString);
        SEGMENT$glfwGetGLXContext = loader.apply("glfwGetGLXContext");
        HANDLE$glfwGetGLXContext = RawFunctionLoader.link(SEGMENT$glfwGetGLXContext, DESCRIPTOR$glfwGetGLXContext);
        SEGMENT$glfwGetGLXWindow = loader.apply("glfwGetGLXWindow");
        HANDLE$glfwGetGLXWindow = RawFunctionLoader.link(SEGMENT$glfwGetGLXWindow, DESCRIPTOR$glfwGetGLXWindow);
        SEGMENT$glfwGetWaylandDisplay = loader.apply("glfwGetWaylandDisplay");
        HANDLE$glfwGetWaylandDisplay = RawFunctionLoader.link(SEGMENT$glfwGetWaylandDisplay, DESCRIPTOR$glfwGetWaylandDisplay);
        SEGMENT$glfwGetWaylandMonitor = loader.apply("glfwGetWaylandMonitor");
        HANDLE$glfwGetWaylandMonitor = RawFunctionLoader.link(SEGMENT$glfwGetWaylandMonitor, DESCRIPTOR$glfwGetWaylandMonitor);
        SEGMENT$glfwGetWaylandWindow = loader.apply("glfwGetWaylandWindow");
        HANDLE$glfwGetWaylandWindow = RawFunctionLoader.link(SEGMENT$glfwGetWaylandWindow, DESCRIPTOR$glfwGetWaylandWindow);
        SEGMENT$glfwGetEGLDisplay = loader.apply("glfwGetEGLDisplay");
        HANDLE$glfwGetEGLDisplay = RawFunctionLoader.link(SEGMENT$glfwGetEGLDisplay, DESCRIPTOR$glfwGetEGLDisplay);
        SEGMENT$glfwGetEGLContext = loader.apply("glfwGetEGLContext");
        HANDLE$glfwGetEGLContext = RawFunctionLoader.link(SEGMENT$glfwGetEGLContext, DESCRIPTOR$glfwGetEGLContext);
        SEGMENT$glfwGetEGLSurface = loader.apply("glfwGetEGLSurface");
        HANDLE$glfwGetEGLSurface = RawFunctionLoader.link(SEGMENT$glfwGetEGLSurface, DESCRIPTOR$glfwGetEGLSurface);
        SEGMENT$glfwGetOSMesaColorBuffer = loader.apply("glfwGetOSMesaColorBuffer");
        HANDLE$glfwGetOSMesaColorBuffer = RawFunctionLoader.link(SEGMENT$glfwGetOSMesaColorBuffer, DESCRIPTOR$glfwGetOSMesaColorBuffer);
        SEGMENT$glfwGetOSMesaDepthBuffer = loader.apply("glfwGetOSMesaDepthBuffer");
        HANDLE$glfwGetOSMesaDepthBuffer = RawFunctionLoader.link(SEGMENT$glfwGetOSMesaDepthBuffer, DESCRIPTOR$glfwGetOSMesaDepthBuffer);
        SEGMENT$glfwGetOSMesaContext = loader.apply("glfwGetOSMesaContext");
        HANDLE$glfwGetOSMesaContext = RawFunctionLoader.link(SEGMENT$glfwGetOSMesaContext, DESCRIPTOR$glfwGetOSMesaContext);
    }
}
