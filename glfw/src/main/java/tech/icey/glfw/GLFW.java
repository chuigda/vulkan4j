package tech.icey.glfw;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.RawFunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.glfw.datatype.*;
import tech.icey.glfw.handle.*;
import tech.icey.vk4j.datatype.*;
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
            @nullable @pointer(target=GLFWallocator.class) GLFWallocator allocator
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
            @nullable IntBuffer major,
            @nullable IntBuffer minor,
            @nullable IntBuffer rev
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

    public @nullable ByteBuffer glfwGetVersionString() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetVersionString.invokeExact();
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glfwGetError(
            @nullable PointerBuffer description
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

    public @nullable @pointer(target=GLFWmonitor.class) GLFWmonitor.Buffer glfwGetMonitors(
            @nullable IntBuffer count
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

    public @nullable GLFWmonitor glfwGetPrimaryMonitor() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetPrimaryMonitor.invokeExact();
            return s.address() == 0 ? null : new GLFWmonitor(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwGetMonitorPos(
            @nullable GLFWmonitor monitor,
            @nullable IntBuffer xpos,
            @nullable IntBuffer ypos
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
            @nullable GLFWmonitor monitor,
            @nullable IntBuffer xpos,
            @nullable IntBuffer ypos,
            @nullable IntBuffer width,
            @nullable IntBuffer height
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
            @nullable GLFWmonitor monitor,
            @nullable IntBuffer widthMM,
            @nullable IntBuffer heightMM
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
            @nullable GLFWmonitor monitor,
            @nullable FloatBuffer xscale,
            @nullable FloatBuffer yscale
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

    public @nullable ByteBuffer glfwGetMonitorName(
            @nullable GLFWmonitor monitor
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
            @nullable GLFWmonitor monitor,
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
            @nullable GLFWmonitor monitor
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

    public @nullable @pointer(target=GLFWvidmode.class) GLFWvidmode glfwGetVideoModes(
            @nullable GLFWmonitor monitor,
            @nullable IntBuffer count
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

    public @nullable @pointer(target=GLFWvidmode.class) GLFWvidmode glfwGetVideoMode(
            @nullable GLFWmonitor monitor
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
            @nullable GLFWmonitor monitor,
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

    public @nullable @pointer(target=GLFWgammaramp.class) GLFWgammaramp glfwGetGammaRamp(
            @nullable GLFWmonitor monitor
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
            @nullable GLFWmonitor monitor,
            @nullable @pointer(target=GLFWgammaramp.class) GLFWgammaramp ramp
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
            @nullable ByteBuffer value
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

    public @nullable GLFWwindow glfwCreateWindow(
            int width,
            int height,
            @nullable ByteBuffer title,
            @nullable GLFWmonitor monitor,
            @nullable GLFWwindow share
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window,
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

    public @nullable ByteBuffer glfwGetWindowTitle(
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window,
            @nullable ByteBuffer title
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
            @nullable GLFWwindow window,
            int count,
            @nullable @pointer(target=GLFWimage.class) GLFWimage images
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
            @nullable GLFWwindow window,
            @nullable IntBuffer xpos,
            @nullable IntBuffer ypos
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
            @nullable IntBuffer width,
            @nullable IntBuffer height
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
            @nullable IntBuffer width,
            @nullable IntBuffer height
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
            @nullable GLFWwindow window,
            @nullable IntBuffer left,
            @nullable IntBuffer top,
            @nullable IntBuffer right,
            @nullable IntBuffer bottom
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
            @nullable GLFWwindow window,
            @nullable FloatBuffer xscale,
            @nullable FloatBuffer yscale
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwRequestWindowAttention.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable GLFWmonitor glfwGetWindowMonitor(
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window,
            @nullable GLFWmonitor monitor,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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

    public @nullable ByteBuffer glfwGetKeyName(
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
            @nullable DoubleBuffer xpos,
            @nullable DoubleBuffer ypos
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
            @nullable GLFWwindow window,
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

    public @nullable GLFWcursor glfwCreateCursor(
            @nullable @pointer(target=GLFWimage.class) GLFWimage image,
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

    public @nullable GLFWcursor glfwCreateStandardCursor(
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
            @nullable GLFWcursor cursor
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
            @nullable GLFWwindow window,
            @nullable GLFWcursor cursor
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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
            @nullable GLFWwindow window,
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

    public @nullable FloatBuffer glfwGetJoystickAxes(
            int jid,
            @nullable IntBuffer count
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

    public @nullable ByteBuffer glfwGetJoystickButtons(
            int jid,
            @nullable IntBuffer count
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

    public @nullable ByteBuffer glfwGetJoystickHats(
            int jid,
            @nullable IntBuffer count
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

    public @nullable ByteBuffer glfwGetJoystickName(
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

    public @nullable ByteBuffer glfwGetJoystickGUID(
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
            @nullable ByteBuffer string
    ) {
        try {
            return (int) HANDLE$glfwUpdateGamepadMappings.invokeExact(
                    (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable ByteBuffer glfwGetGamepadName(
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
            @nullable @pointer(target=GLFWgamepadstate.class) GLFWgamepadstate state
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
            @nullable GLFWwindow window,
            @nullable ByteBuffer string
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

    public @nullable ByteBuffer glfwGetClipboardString(
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
    ) {
        try {
            HANDLE$glfwMakeContextCurrent.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable GLFWwindow glfwGetCurrentContext() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetCurrentContext.invokeExact();
            return s.address() == 0 ? null : new GLFWwindow(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glfwSwapBuffers(
            @nullable GLFWwindow window
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
            @nullable ByteBuffer extension
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
            @nullable ByteBuffer procname
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

    public @nullable PointerBuffer glfwGetRequiredInstanceExtensions(
            @nullable @unsigned IntBuffer count
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
            @nullable VkInstance instance,
            @nullable ByteBuffer procname
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
            @nullable VkInstance instance,
            @nullable VkPhysicalDevice device,
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

    public int glfwCreateWindowSurface(
            @nullable VkInstance instance,
            @nullable GLFWwindow window,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks allocator,
            @nullable @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer surface
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

    public @nullable ByteBuffer glfwGetWin32Adapter(
            @nullable GLFWmonitor monitor
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

    public @nullable ByteBuffer glfwGetWin32Monitor(
            @nullable GLFWmonitor monitor
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWmonitor monitor
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetNSGLContext.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable PointerBuffer glfwGetX11Display() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetX11Display.invokeExact();
            return s.address() == 0 ? null : new PointerBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public long glfwGetX11Adapter(
            @nullable GLFWmonitor monitor
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
            @nullable GLFWmonitor monitor
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
            @nullable GLFWwindow window
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
            @nullable ByteBuffer string
    ) {
        try {
            HANDLE$glfwSetX11SelectionString.invokeExact(
                    (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable ByteBuffer glfwGetX11SelectionString() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetX11SelectionString.invokeExact();
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetGLXContext(
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
    ) {
        try {
            return (long) HANDLE$glfwGetGLXWindow.invokeExact(
                    (MemorySegment) (window != null ? window.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable PointerBuffer glfwGetWaylandDisplay() {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetWaylandDisplay.invokeExact();
            return s.address() == 0 ? null : new PointerBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="void*") MemorySegment glfwGetWaylandMonitor(
            @nullable GLFWmonitor monitor
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetWaylandMonitor.invokeExact(
                    (MemorySegment) (monitor != null ? monitor.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @nullable PointerBuffer glfwGetWaylandWindow(
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window
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
            @nullable GLFWwindow window,
            @nullable IntBuffer width,
            @nullable IntBuffer height,
            @nullable IntBuffer format,
            @nullable PointerBuffer buffer
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
            @nullable GLFWwindow window,
            @nullable IntBuffer width,
            @nullable IntBuffer height,
            @nullable IntBuffer bytesPerValue,
            @nullable PointerBuffer buffer
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
            @nullable GLFWwindow window
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

    public final @nullable MemorySegment SEGMENT$glfwInit;
    public final @nullable MemorySegment SEGMENT$glfwTerminate;
    public final @nullable MemorySegment SEGMENT$glfwInitHint;
    public final @nullable MemorySegment SEGMENT$glfwInitAllocator;
    public final @nullable MemorySegment SEGMENT$glfwInitVulkanLoader;
    public final @nullable MemorySegment SEGMENT$glfwGetVersion;
    public final @nullable MemorySegment SEGMENT$glfwGetVersionString;
    public final @nullable MemorySegment SEGMENT$glfwGetError;
    public final @nullable MemorySegment SEGMENT$glfwSetErrorCallback;
    public final @nullable MemorySegment SEGMENT$glfwGetPlatform;
    public final @nullable MemorySegment SEGMENT$glfwPlatformSupported;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitors;
    public final @nullable MemorySegment SEGMENT$glfwGetPrimaryMonitor;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitorPos;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitorWorkarea;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitorPhysicalSize;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitorContentScale;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitorName;
    public final @nullable MemorySegment SEGMENT$glfwSetMonitorUserPointer;
    public final @nullable MemorySegment SEGMENT$glfwGetMonitorUserPointer;
    public final @nullable MemorySegment SEGMENT$glfwSetMonitorCallback;
    public final @nullable MemorySegment SEGMENT$glfwGetVideoModes;
    public final @nullable MemorySegment SEGMENT$glfwGetVideoMode;
    public final @nullable MemorySegment SEGMENT$glfwSetGamma;
    public final @nullable MemorySegment SEGMENT$glfwGetGammaRamp;
    public final @nullable MemorySegment SEGMENT$glfwSetGammaRamp;
    public final @nullable MemorySegment SEGMENT$glfwDefaultWindowHints;
    public final @nullable MemorySegment SEGMENT$glfwWindowHint;
    public final @nullable MemorySegment SEGMENT$glfwWindowHintString;
    public final @nullable MemorySegment SEGMENT$glfwCreateWindow;
    public final @nullable MemorySegment SEGMENT$glfwDestroyWindow;
    public final @nullable MemorySegment SEGMENT$glfwWindowShouldClose;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowShouldClose;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowTitle;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowTitle;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowIcon;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowPos;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowPos;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowSize;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowSizeLimits;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowAspectRatio;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowSize;
    public final @nullable MemorySegment SEGMENT$glfwGetFramebufferSize;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowFrameSize;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowContentScale;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowOpacity;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowOpacity;
    public final @nullable MemorySegment SEGMENT$glfwIconifyWindow;
    public final @nullable MemorySegment SEGMENT$glfwRestoreWindow;
    public final @nullable MemorySegment SEGMENT$glfwMaximizeWindow;
    public final @nullable MemorySegment SEGMENT$glfwShowWindow;
    public final @nullable MemorySegment SEGMENT$glfwHideWindow;
    public final @nullable MemorySegment SEGMENT$glfwFocusWindow;
    public final @nullable MemorySegment SEGMENT$glfwRequestWindowAttention;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowMonitor;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowMonitor;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowAttrib;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowAttrib;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowUserPointer;
    public final @nullable MemorySegment SEGMENT$glfwGetWindowUserPointer;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowPosCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowSizeCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowCloseCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowRefreshCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowFocusCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowIconifyCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowMaximizeCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetFramebufferSizeCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetWindowContentScaleCallback;
    public final @nullable MemorySegment SEGMENT$glfwPollEvents;
    public final @nullable MemorySegment SEGMENT$glfwWaitEvents;
    public final @nullable MemorySegment SEGMENT$glfwWaitEventsTimeout;
    public final @nullable MemorySegment SEGMENT$glfwPostEmptyEvent;
    public final @nullable MemorySegment SEGMENT$glfwGetInputMode;
    public final @nullable MemorySegment SEGMENT$glfwSetInputMode;
    public final @nullable MemorySegment SEGMENT$glfwRawMouseMotionSupported;
    public final @nullable MemorySegment SEGMENT$glfwGetKeyName;
    public final @nullable MemorySegment SEGMENT$glfwGetKeyScancode;
    public final @nullable MemorySegment SEGMENT$glfwGetKey;
    public final @nullable MemorySegment SEGMENT$glfwGetMouseButton;
    public final @nullable MemorySegment SEGMENT$glfwGetCursorPos;
    public final @nullable MemorySegment SEGMENT$glfwSetCursorPos;
    public final @nullable MemorySegment SEGMENT$glfwCreateCursor;
    public final @nullable MemorySegment SEGMENT$glfwCreateStandardCursor;
    public final @nullable MemorySegment SEGMENT$glfwDestroyCursor;
    public final @nullable MemorySegment SEGMENT$glfwSetCursor;
    public final @nullable MemorySegment SEGMENT$glfwSetKeyCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetCharCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetCharModsCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetMouseButtonCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetCursorPosCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetCursorEnterCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetScrollCallback;
    public final @nullable MemorySegment SEGMENT$glfwSetDropCallback;
    public final @nullable MemorySegment SEGMENT$glfwJoystickPresent;
    public final @nullable MemorySegment SEGMENT$glfwGetJoystickAxes;
    public final @nullable MemorySegment SEGMENT$glfwGetJoystickButtons;
    public final @nullable MemorySegment SEGMENT$glfwGetJoystickHats;
    public final @nullable MemorySegment SEGMENT$glfwGetJoystickName;
    public final @nullable MemorySegment SEGMENT$glfwGetJoystickGUID;
    public final @nullable MemorySegment SEGMENT$glfwSetJoystickUserPointer;
    public final @nullable MemorySegment SEGMENT$glfwGetJoystickUserPointer;
    public final @nullable MemorySegment SEGMENT$glfwJoystickIsGamepad;
    public final @nullable MemorySegment SEGMENT$glfwSetJoystickCallback;
    public final @nullable MemorySegment SEGMENT$glfwUpdateGamepadMappings;
    public final @nullable MemorySegment SEGMENT$glfwGetGamepadName;
    public final @nullable MemorySegment SEGMENT$glfwGetGamepadState;
    public final @nullable MemorySegment SEGMENT$glfwSetClipboardString;
    public final @nullable MemorySegment SEGMENT$glfwGetClipboardString;
    public final @nullable MemorySegment SEGMENT$glfwGetTime;
    public final @nullable MemorySegment SEGMENT$glfwSetTime;
    public final @nullable MemorySegment SEGMENT$glfwGetTimerValue;
    public final @nullable MemorySegment SEGMENT$glfwGetTimerFrequency;
    public final @nullable MemorySegment SEGMENT$glfwMakeContextCurrent;
    public final @nullable MemorySegment SEGMENT$glfwGetCurrentContext;
    public final @nullable MemorySegment SEGMENT$glfwSwapBuffers;
    public final @nullable MemorySegment SEGMENT$glfwSwapInterval;
    public final @nullable MemorySegment SEGMENT$glfwExtensionSupported;
    public final @nullable MemorySegment SEGMENT$glfwGetProcAddress;
    public final @nullable MemorySegment SEGMENT$glfwVulkanSupported;
    public final @nullable MemorySegment SEGMENT$glfwGetRequiredInstanceExtensions;
    public final @nullable MemorySegment SEGMENT$glfwGetInstanceProcAddress;
    public final @nullable MemorySegment SEGMENT$glfwGetPhysicalDevicePresentationSupport;
    public final @nullable MemorySegment SEGMENT$glfwCreateWindowSurface;
    public final @nullable MemorySegment SEGMENT$glfwGetWin32Adapter;
    public final @nullable MemorySegment SEGMENT$glfwGetWin32Monitor;
    public final @nullable MemorySegment SEGMENT$glfwGetWin32Window;
    public final @nullable MemorySegment SEGMENT$glfwGetWGLContext;
    public final @nullable MemorySegment SEGMENT$glfwGetCocoaMonitor;
    public final @nullable MemorySegment SEGMENT$glfwGetCocoaWindow;
    public final @nullable MemorySegment SEGMENT$glfwGetCocoaView;
    public final @nullable MemorySegment SEGMENT$glfwGetNSGLContext;
    public final @nullable MemorySegment SEGMENT$glfwGetX11Display;
    public final @nullable MemorySegment SEGMENT$glfwGetX11Adapter;
    public final @nullable MemorySegment SEGMENT$glfwGetX11Monitor;
    public final @nullable MemorySegment SEGMENT$glfwGetX11Window;
    public final @nullable MemorySegment SEGMENT$glfwSetX11SelectionString;
    public final @nullable MemorySegment SEGMENT$glfwGetX11SelectionString;
    public final @nullable MemorySegment SEGMENT$glfwGetGLXContext;
    public final @nullable MemorySegment SEGMENT$glfwGetGLXWindow;
    public final @nullable MemorySegment SEGMENT$glfwGetWaylandDisplay;
    public final @nullable MemorySegment SEGMENT$glfwGetWaylandMonitor;
    public final @nullable MemorySegment SEGMENT$glfwGetWaylandWindow;
    public final @nullable MemorySegment SEGMENT$glfwGetEGLDisplay;
    public final @nullable MemorySegment SEGMENT$glfwGetEGLContext;
    public final @nullable MemorySegment SEGMENT$glfwGetEGLSurface;
    public final @nullable MemorySegment SEGMENT$glfwGetOSMesaColorBuffer;
    public final @nullable MemorySegment SEGMENT$glfwGetOSMesaDepthBuffer;
    public final @nullable MemorySegment SEGMENT$glfwGetOSMesaContext;

    public final @nullable MethodHandle HANDLE$glfwInit;
    public final @nullable MethodHandle HANDLE$glfwTerminate;
    public final @nullable MethodHandle HANDLE$glfwInitHint;
    public final @nullable MethodHandle HANDLE$glfwInitAllocator;
    public final @nullable MethodHandle HANDLE$glfwInitVulkanLoader;
    public final @nullable MethodHandle HANDLE$glfwGetVersion;
    public final @nullable MethodHandle HANDLE$glfwGetVersionString;
    public final @nullable MethodHandle HANDLE$glfwGetError;
    public final @nullable MethodHandle HANDLE$glfwSetErrorCallback;
    public final @nullable MethodHandle HANDLE$glfwGetPlatform;
    public final @nullable MethodHandle HANDLE$glfwPlatformSupported;
    public final @nullable MethodHandle HANDLE$glfwGetMonitors;
    public final @nullable MethodHandle HANDLE$glfwGetPrimaryMonitor;
    public final @nullable MethodHandle HANDLE$glfwGetMonitorPos;
    public final @nullable MethodHandle HANDLE$glfwGetMonitorWorkarea;
    public final @nullable MethodHandle HANDLE$glfwGetMonitorPhysicalSize;
    public final @nullable MethodHandle HANDLE$glfwGetMonitorContentScale;
    public final @nullable MethodHandle HANDLE$glfwGetMonitorName;
    public final @nullable MethodHandle HANDLE$glfwSetMonitorUserPointer;
    public final @nullable MethodHandle HANDLE$glfwGetMonitorUserPointer;
    public final @nullable MethodHandle HANDLE$glfwSetMonitorCallback;
    public final @nullable MethodHandle HANDLE$glfwGetVideoModes;
    public final @nullable MethodHandle HANDLE$glfwGetVideoMode;
    public final @nullable MethodHandle HANDLE$glfwSetGamma;
    public final @nullable MethodHandle HANDLE$glfwGetGammaRamp;
    public final @nullable MethodHandle HANDLE$glfwSetGammaRamp;
    public final @nullable MethodHandle HANDLE$glfwDefaultWindowHints;
    public final @nullable MethodHandle HANDLE$glfwWindowHint;
    public final @nullable MethodHandle HANDLE$glfwWindowHintString;
    public final @nullable MethodHandle HANDLE$glfwCreateWindow;
    public final @nullable MethodHandle HANDLE$glfwDestroyWindow;
    public final @nullable MethodHandle HANDLE$glfwWindowShouldClose;
    public final @nullable MethodHandle HANDLE$glfwSetWindowShouldClose;
    public final @nullable MethodHandle HANDLE$glfwGetWindowTitle;
    public final @nullable MethodHandle HANDLE$glfwSetWindowTitle;
    public final @nullable MethodHandle HANDLE$glfwSetWindowIcon;
    public final @nullable MethodHandle HANDLE$glfwGetWindowPos;
    public final @nullable MethodHandle HANDLE$glfwSetWindowPos;
    public final @nullable MethodHandle HANDLE$glfwGetWindowSize;
    public final @nullable MethodHandle HANDLE$glfwSetWindowSizeLimits;
    public final @nullable MethodHandle HANDLE$glfwSetWindowAspectRatio;
    public final @nullable MethodHandle HANDLE$glfwSetWindowSize;
    public final @nullable MethodHandle HANDLE$glfwGetFramebufferSize;
    public final @nullable MethodHandle HANDLE$glfwGetWindowFrameSize;
    public final @nullable MethodHandle HANDLE$glfwGetWindowContentScale;
    public final @nullable MethodHandle HANDLE$glfwGetWindowOpacity;
    public final @nullable MethodHandle HANDLE$glfwSetWindowOpacity;
    public final @nullable MethodHandle HANDLE$glfwIconifyWindow;
    public final @nullable MethodHandle HANDLE$glfwRestoreWindow;
    public final @nullable MethodHandle HANDLE$glfwMaximizeWindow;
    public final @nullable MethodHandle HANDLE$glfwShowWindow;
    public final @nullable MethodHandle HANDLE$glfwHideWindow;
    public final @nullable MethodHandle HANDLE$glfwFocusWindow;
    public final @nullable MethodHandle HANDLE$glfwRequestWindowAttention;
    public final @nullable MethodHandle HANDLE$glfwGetWindowMonitor;
    public final @nullable MethodHandle HANDLE$glfwSetWindowMonitor;
    public final @nullable MethodHandle HANDLE$glfwGetWindowAttrib;
    public final @nullable MethodHandle HANDLE$glfwSetWindowAttrib;
    public final @nullable MethodHandle HANDLE$glfwSetWindowUserPointer;
    public final @nullable MethodHandle HANDLE$glfwGetWindowUserPointer;
    public final @nullable MethodHandle HANDLE$glfwSetWindowPosCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowSizeCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowCloseCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowRefreshCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowFocusCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowIconifyCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowMaximizeCallback;
    public final @nullable MethodHandle HANDLE$glfwSetFramebufferSizeCallback;
    public final @nullable MethodHandle HANDLE$glfwSetWindowContentScaleCallback;
    public final @nullable MethodHandle HANDLE$glfwPollEvents;
    public final @nullable MethodHandle HANDLE$glfwWaitEvents;
    public final @nullable MethodHandle HANDLE$glfwWaitEventsTimeout;
    public final @nullable MethodHandle HANDLE$glfwPostEmptyEvent;
    public final @nullable MethodHandle HANDLE$glfwGetInputMode;
    public final @nullable MethodHandle HANDLE$glfwSetInputMode;
    public final @nullable MethodHandle HANDLE$glfwRawMouseMotionSupported;
    public final @nullable MethodHandle HANDLE$glfwGetKeyName;
    public final @nullable MethodHandle HANDLE$glfwGetKeyScancode;
    public final @nullable MethodHandle HANDLE$glfwGetKey;
    public final @nullable MethodHandle HANDLE$glfwGetMouseButton;
    public final @nullable MethodHandle HANDLE$glfwGetCursorPos;
    public final @nullable MethodHandle HANDLE$glfwSetCursorPos;
    public final @nullable MethodHandle HANDLE$glfwCreateCursor;
    public final @nullable MethodHandle HANDLE$glfwCreateStandardCursor;
    public final @nullable MethodHandle HANDLE$glfwDestroyCursor;
    public final @nullable MethodHandle HANDLE$glfwSetCursor;
    public final @nullable MethodHandle HANDLE$glfwSetKeyCallback;
    public final @nullable MethodHandle HANDLE$glfwSetCharCallback;
    public final @nullable MethodHandle HANDLE$glfwSetCharModsCallback;
    public final @nullable MethodHandle HANDLE$glfwSetMouseButtonCallback;
    public final @nullable MethodHandle HANDLE$glfwSetCursorPosCallback;
    public final @nullable MethodHandle HANDLE$glfwSetCursorEnterCallback;
    public final @nullable MethodHandle HANDLE$glfwSetScrollCallback;
    public final @nullable MethodHandle HANDLE$glfwSetDropCallback;
    public final @nullable MethodHandle HANDLE$glfwJoystickPresent;
    public final @nullable MethodHandle HANDLE$glfwGetJoystickAxes;
    public final @nullable MethodHandle HANDLE$glfwGetJoystickButtons;
    public final @nullable MethodHandle HANDLE$glfwGetJoystickHats;
    public final @nullable MethodHandle HANDLE$glfwGetJoystickName;
    public final @nullable MethodHandle HANDLE$glfwGetJoystickGUID;
    public final @nullable MethodHandle HANDLE$glfwSetJoystickUserPointer;
    public final @nullable MethodHandle HANDLE$glfwGetJoystickUserPointer;
    public final @nullable MethodHandle HANDLE$glfwJoystickIsGamepad;
    public final @nullable MethodHandle HANDLE$glfwSetJoystickCallback;
    public final @nullable MethodHandle HANDLE$glfwUpdateGamepadMappings;
    public final @nullable MethodHandle HANDLE$glfwGetGamepadName;
    public final @nullable MethodHandle HANDLE$glfwGetGamepadState;
    public final @nullable MethodHandle HANDLE$glfwSetClipboardString;
    public final @nullable MethodHandle HANDLE$glfwGetClipboardString;
    public final @nullable MethodHandle HANDLE$glfwGetTime;
    public final @nullable MethodHandle HANDLE$glfwSetTime;
    public final @nullable MethodHandle HANDLE$glfwGetTimerValue;
    public final @nullable MethodHandle HANDLE$glfwGetTimerFrequency;
    public final @nullable MethodHandle HANDLE$glfwMakeContextCurrent;
    public final @nullable MethodHandle HANDLE$glfwGetCurrentContext;
    public final @nullable MethodHandle HANDLE$glfwSwapBuffers;
    public final @nullable MethodHandle HANDLE$glfwSwapInterval;
    public final @nullable MethodHandle HANDLE$glfwExtensionSupported;
    public final @nullable MethodHandle HANDLE$glfwGetProcAddress;
    public final @nullable MethodHandle HANDLE$glfwVulkanSupported;
    public final @nullable MethodHandle HANDLE$glfwGetRequiredInstanceExtensions;
    public final @nullable MethodHandle HANDLE$glfwGetInstanceProcAddress;
    public final @nullable MethodHandle HANDLE$glfwGetPhysicalDevicePresentationSupport;
    public final @nullable MethodHandle HANDLE$glfwCreateWindowSurface;
    public final @nullable MethodHandle HANDLE$glfwGetWin32Adapter;
    public final @nullable MethodHandle HANDLE$glfwGetWin32Monitor;
    public final @nullable MethodHandle HANDLE$glfwGetWin32Window;
    public final @nullable MethodHandle HANDLE$glfwGetWGLContext;
    public final @nullable MethodHandle HANDLE$glfwGetCocoaMonitor;
    public final @nullable MethodHandle HANDLE$glfwGetCocoaWindow;
    public final @nullable MethodHandle HANDLE$glfwGetCocoaView;
    public final @nullable MethodHandle HANDLE$glfwGetNSGLContext;
    public final @nullable MethodHandle HANDLE$glfwGetX11Display;
    public final @nullable MethodHandle HANDLE$glfwGetX11Adapter;
    public final @nullable MethodHandle HANDLE$glfwGetX11Monitor;
    public final @nullable MethodHandle HANDLE$glfwGetX11Window;
    public final @nullable MethodHandle HANDLE$glfwSetX11SelectionString;
    public final @nullable MethodHandle HANDLE$glfwGetX11SelectionString;
    public final @nullable MethodHandle HANDLE$glfwGetGLXContext;
    public final @nullable MethodHandle HANDLE$glfwGetGLXWindow;
    public final @nullable MethodHandle HANDLE$glfwGetWaylandDisplay;
    public final @nullable MethodHandle HANDLE$glfwGetWaylandMonitor;
    public final @nullable MethodHandle HANDLE$glfwGetWaylandWindow;
    public final @nullable MethodHandle HANDLE$glfwGetEGLDisplay;
    public final @nullable MethodHandle HANDLE$glfwGetEGLContext;
    public final @nullable MethodHandle HANDLE$glfwGetEGLSurface;
    public final @nullable MethodHandle HANDLE$glfwGetOSMesaColorBuffer;
    public final @nullable MethodHandle HANDLE$glfwGetOSMesaDepthBuffer;
    public final @nullable MethodHandle HANDLE$glfwGetOSMesaContext;

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
