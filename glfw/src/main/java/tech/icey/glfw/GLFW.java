package tech.icey.glfw;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.FunctionLoader;
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

    public GLFW(FunctionLoader loader) {
        HANDLE$glfwInit = loader.apply("glfwInit", DESCRIPTOR$glfwInit);
        HANDLE$glfwTerminate = loader.apply("glfwTerminate", DESCRIPTOR$glfwTerminate);
        HANDLE$glfwInitHint = loader.apply("glfwInitHint", DESCRIPTOR$glfwInitHint);
        HANDLE$glfwInitAllocator = loader.apply("glfwInitAllocator", DESCRIPTOR$glfwInitAllocator);
        HANDLE$glfwInitVulkanLoader = loader.apply("glfwInitVulkanLoader", DESCRIPTOR$glfwInitVulkanLoader);
        HANDLE$glfwGetVersion = loader.apply("glfwGetVersion", DESCRIPTOR$glfwGetVersion);
        HANDLE$glfwGetVersionString = loader.apply("glfwGetVersionString", DESCRIPTOR$glfwGetVersionString);
        HANDLE$glfwGetError = loader.apply("glfwGetError", DESCRIPTOR$glfwGetError);
        HANDLE$glfwSetErrorCallback = loader.apply("glfwSetErrorCallback", DESCRIPTOR$glfwSetErrorCallback);
        HANDLE$glfwGetPlatform = loader.apply("glfwGetPlatform", DESCRIPTOR$glfwGetPlatform);
        HANDLE$glfwPlatformSupported = loader.apply("glfwPlatformSupported", DESCRIPTOR$glfwPlatformSupported);
        HANDLE$glfwGetMonitors = loader.apply("glfwGetMonitors", DESCRIPTOR$glfwGetMonitors);
        HANDLE$glfwGetPrimaryMonitor = loader.apply("glfwGetPrimaryMonitor", DESCRIPTOR$glfwGetPrimaryMonitor);
        HANDLE$glfwGetMonitorPos = loader.apply("glfwGetMonitorPos", DESCRIPTOR$glfwGetMonitorPos);
        HANDLE$glfwGetMonitorWorkarea = loader.apply("glfwGetMonitorWorkarea", DESCRIPTOR$glfwGetMonitorWorkarea);
        HANDLE$glfwGetMonitorPhysicalSize = loader.apply("glfwGetMonitorPhysicalSize", DESCRIPTOR$glfwGetMonitorPhysicalSize);
        HANDLE$glfwGetMonitorContentScale = loader.apply("glfwGetMonitorContentScale", DESCRIPTOR$glfwGetMonitorContentScale);
        HANDLE$glfwGetMonitorName = loader.apply("glfwGetMonitorName", DESCRIPTOR$glfwGetMonitorName);
        HANDLE$glfwSetMonitorUserPointer = loader.apply("glfwSetMonitorUserPointer", DESCRIPTOR$glfwSetMonitorUserPointer);
        HANDLE$glfwGetMonitorUserPointer = loader.apply("glfwGetMonitorUserPointer", DESCRIPTOR$glfwGetMonitorUserPointer);
        HANDLE$glfwSetMonitorCallback = loader.apply("glfwSetMonitorCallback", DESCRIPTOR$glfwSetMonitorCallback);
        HANDLE$glfwGetVideoModes = loader.apply("glfwGetVideoModes", DESCRIPTOR$glfwGetVideoModes);
        HANDLE$glfwGetVideoMode = loader.apply("glfwGetVideoMode", DESCRIPTOR$glfwGetVideoMode);
        HANDLE$glfwSetGamma = loader.apply("glfwSetGamma", DESCRIPTOR$glfwSetGamma);
        HANDLE$glfwGetGammaRamp = loader.apply("glfwGetGammaRamp", DESCRIPTOR$glfwGetGammaRamp);
        HANDLE$glfwSetGammaRamp = loader.apply("glfwSetGammaRamp", DESCRIPTOR$glfwSetGammaRamp);
        HANDLE$glfwDefaultWindowHints = loader.apply("glfwDefaultWindowHints", DESCRIPTOR$glfwDefaultWindowHints);
        HANDLE$glfwWindowHint = loader.apply("glfwWindowHint", DESCRIPTOR$glfwWindowHint);
        HANDLE$glfwWindowHintString = loader.apply("glfwWindowHintString", DESCRIPTOR$glfwWindowHintString);
        HANDLE$glfwCreateWindow = loader.apply("glfwCreateWindow", DESCRIPTOR$glfwCreateWindow);
        HANDLE$glfwDestroyWindow = loader.apply("glfwDestroyWindow", DESCRIPTOR$glfwDestroyWindow);
        HANDLE$glfwWindowShouldClose = loader.apply("glfwWindowShouldClose", DESCRIPTOR$glfwWindowShouldClose);
        HANDLE$glfwSetWindowShouldClose = loader.apply("glfwSetWindowShouldClose", DESCRIPTOR$glfwSetWindowShouldClose);
        HANDLE$glfwGetWindowTitle = loader.apply("glfwGetWindowTitle", DESCRIPTOR$glfwGetWindowTitle);
        HANDLE$glfwSetWindowTitle = loader.apply("glfwSetWindowTitle", DESCRIPTOR$glfwSetWindowTitle);
        HANDLE$glfwSetWindowIcon = loader.apply("glfwSetWindowIcon", DESCRIPTOR$glfwSetWindowIcon);
        HANDLE$glfwGetWindowPos = loader.apply("glfwGetWindowPos", DESCRIPTOR$glfwGetWindowPos);
        HANDLE$glfwSetWindowPos = loader.apply("glfwSetWindowPos", DESCRIPTOR$glfwSetWindowPos);
        HANDLE$glfwGetWindowSize = loader.apply("glfwGetWindowSize", DESCRIPTOR$glfwGetWindowSize);
        HANDLE$glfwSetWindowSizeLimits = loader.apply("glfwSetWindowSizeLimits", DESCRIPTOR$glfwSetWindowSizeLimits);
        HANDLE$glfwSetWindowAspectRatio = loader.apply("glfwSetWindowAspectRatio", DESCRIPTOR$glfwSetWindowAspectRatio);
        HANDLE$glfwSetWindowSize = loader.apply("glfwSetWindowSize", DESCRIPTOR$glfwSetWindowSize);
        HANDLE$glfwGetFramebufferSize = loader.apply("glfwGetFramebufferSize", DESCRIPTOR$glfwGetFramebufferSize);
        HANDLE$glfwGetWindowFrameSize = loader.apply("glfwGetWindowFrameSize", DESCRIPTOR$glfwGetWindowFrameSize);
        HANDLE$glfwGetWindowContentScale = loader.apply("glfwGetWindowContentScale", DESCRIPTOR$glfwGetWindowContentScale);
        HANDLE$glfwGetWindowOpacity = loader.apply("glfwGetWindowOpacity", DESCRIPTOR$glfwGetWindowOpacity);
        HANDLE$glfwSetWindowOpacity = loader.apply("glfwSetWindowOpacity", DESCRIPTOR$glfwSetWindowOpacity);
        HANDLE$glfwIconifyWindow = loader.apply("glfwIconifyWindow", DESCRIPTOR$glfwIconifyWindow);
        HANDLE$glfwRestoreWindow = loader.apply("glfwRestoreWindow", DESCRIPTOR$glfwRestoreWindow);
        HANDLE$glfwMaximizeWindow = loader.apply("glfwMaximizeWindow", DESCRIPTOR$glfwMaximizeWindow);
        HANDLE$glfwShowWindow = loader.apply("glfwShowWindow", DESCRIPTOR$glfwShowWindow);
        HANDLE$glfwHideWindow = loader.apply("glfwHideWindow", DESCRIPTOR$glfwHideWindow);
        HANDLE$glfwFocusWindow = loader.apply("glfwFocusWindow", DESCRIPTOR$glfwFocusWindow);
        HANDLE$glfwRequestWindowAttention = loader.apply("glfwRequestWindowAttention", DESCRIPTOR$glfwRequestWindowAttention);
        HANDLE$glfwGetWindowMonitor = loader.apply("glfwGetWindowMonitor", DESCRIPTOR$glfwGetWindowMonitor);
        HANDLE$glfwSetWindowMonitor = loader.apply("glfwSetWindowMonitor", DESCRIPTOR$glfwSetWindowMonitor);
        HANDLE$glfwGetWindowAttrib = loader.apply("glfwGetWindowAttrib", DESCRIPTOR$glfwGetWindowAttrib);
        HANDLE$glfwSetWindowAttrib = loader.apply("glfwSetWindowAttrib", DESCRIPTOR$glfwSetWindowAttrib);
        HANDLE$glfwSetWindowUserPointer = loader.apply("glfwSetWindowUserPointer", DESCRIPTOR$glfwSetWindowUserPointer);
        HANDLE$glfwGetWindowUserPointer = loader.apply("glfwGetWindowUserPointer", DESCRIPTOR$glfwGetWindowUserPointer);
        HANDLE$glfwSetWindowPosCallback = loader.apply("glfwSetWindowPosCallback", DESCRIPTOR$glfwSetWindowPosCallback);
        HANDLE$glfwSetWindowSizeCallback = loader.apply("glfwSetWindowSizeCallback", DESCRIPTOR$glfwSetWindowSizeCallback);
        HANDLE$glfwSetWindowCloseCallback = loader.apply("glfwSetWindowCloseCallback", DESCRIPTOR$glfwSetWindowCloseCallback);
        HANDLE$glfwSetWindowRefreshCallback = loader.apply("glfwSetWindowRefreshCallback", DESCRIPTOR$glfwSetWindowRefreshCallback);
        HANDLE$glfwSetWindowFocusCallback = loader.apply("glfwSetWindowFocusCallback", DESCRIPTOR$glfwSetWindowFocusCallback);
        HANDLE$glfwSetWindowIconifyCallback = loader.apply("glfwSetWindowIconifyCallback", DESCRIPTOR$glfwSetWindowIconifyCallback);
        HANDLE$glfwSetWindowMaximizeCallback = loader.apply("glfwSetWindowMaximizeCallback", DESCRIPTOR$glfwSetWindowMaximizeCallback);
        HANDLE$glfwSetFramebufferSizeCallback = loader.apply("glfwSetFramebufferSizeCallback", DESCRIPTOR$glfwSetFramebufferSizeCallback);
        HANDLE$glfwSetWindowContentScaleCallback = loader.apply("glfwSetWindowContentScaleCallback", DESCRIPTOR$glfwSetWindowContentScaleCallback);
        HANDLE$glfwPollEvents = loader.apply("glfwPollEvents", DESCRIPTOR$glfwPollEvents);
        HANDLE$glfwWaitEvents = loader.apply("glfwWaitEvents", DESCRIPTOR$glfwWaitEvents);
        HANDLE$glfwWaitEventsTimeout = loader.apply("glfwWaitEventsTimeout", DESCRIPTOR$glfwWaitEventsTimeout);
        HANDLE$glfwPostEmptyEvent = loader.apply("glfwPostEmptyEvent", DESCRIPTOR$glfwPostEmptyEvent);
        HANDLE$glfwGetInputMode = loader.apply("glfwGetInputMode", DESCRIPTOR$glfwGetInputMode);
        HANDLE$glfwSetInputMode = loader.apply("glfwSetInputMode", DESCRIPTOR$glfwSetInputMode);
        HANDLE$glfwRawMouseMotionSupported = loader.apply("glfwRawMouseMotionSupported", DESCRIPTOR$glfwRawMouseMotionSupported);
        HANDLE$glfwGetKeyName = loader.apply("glfwGetKeyName", DESCRIPTOR$glfwGetKeyName);
        HANDLE$glfwGetKeyScancode = loader.apply("glfwGetKeyScancode", DESCRIPTOR$glfwGetKeyScancode);
        HANDLE$glfwGetKey = loader.apply("glfwGetKey", DESCRIPTOR$glfwGetKey);
        HANDLE$glfwGetMouseButton = loader.apply("glfwGetMouseButton", DESCRIPTOR$glfwGetMouseButton);
        HANDLE$glfwGetCursorPos = loader.apply("glfwGetCursorPos", DESCRIPTOR$glfwGetCursorPos);
        HANDLE$glfwSetCursorPos = loader.apply("glfwSetCursorPos", DESCRIPTOR$glfwSetCursorPos);
        HANDLE$glfwCreateCursor = loader.apply("glfwCreateCursor", DESCRIPTOR$glfwCreateCursor);
        HANDLE$glfwCreateStandardCursor = loader.apply("glfwCreateStandardCursor", DESCRIPTOR$glfwCreateStandardCursor);
        HANDLE$glfwDestroyCursor = loader.apply("glfwDestroyCursor", DESCRIPTOR$glfwDestroyCursor);
        HANDLE$glfwSetCursor = loader.apply("glfwSetCursor", DESCRIPTOR$glfwSetCursor);
        HANDLE$glfwSetKeyCallback = loader.apply("glfwSetKeyCallback", DESCRIPTOR$glfwSetKeyCallback);
        HANDLE$glfwSetCharCallback = loader.apply("glfwSetCharCallback", DESCRIPTOR$glfwSetCharCallback);
        HANDLE$glfwSetCharModsCallback = loader.apply("glfwSetCharModsCallback", DESCRIPTOR$glfwSetCharModsCallback);
        HANDLE$glfwSetMouseButtonCallback = loader.apply("glfwSetMouseButtonCallback", DESCRIPTOR$glfwSetMouseButtonCallback);
        HANDLE$glfwSetCursorPosCallback = loader.apply("glfwSetCursorPosCallback", DESCRIPTOR$glfwSetCursorPosCallback);
        HANDLE$glfwSetCursorEnterCallback = loader.apply("glfwSetCursorEnterCallback", DESCRIPTOR$glfwSetCursorEnterCallback);
        HANDLE$glfwSetScrollCallback = loader.apply("glfwSetScrollCallback", DESCRIPTOR$glfwSetScrollCallback);
        HANDLE$glfwSetDropCallback = loader.apply("glfwSetDropCallback", DESCRIPTOR$glfwSetDropCallback);
        HANDLE$glfwJoystickPresent = loader.apply("glfwJoystickPresent", DESCRIPTOR$glfwJoystickPresent);
        HANDLE$glfwGetJoystickAxes = loader.apply("glfwGetJoystickAxes", DESCRIPTOR$glfwGetJoystickAxes);
        HANDLE$glfwGetJoystickButtons = loader.apply("glfwGetJoystickButtons", DESCRIPTOR$glfwGetJoystickButtons);
        HANDLE$glfwGetJoystickHats = loader.apply("glfwGetJoystickHats", DESCRIPTOR$glfwGetJoystickHats);
        HANDLE$glfwGetJoystickName = loader.apply("glfwGetJoystickName", DESCRIPTOR$glfwGetJoystickName);
        HANDLE$glfwGetJoystickGUID = loader.apply("glfwGetJoystickGUID", DESCRIPTOR$glfwGetJoystickGUID);
        HANDLE$glfwSetJoystickUserPointer = loader.apply("glfwSetJoystickUserPointer", DESCRIPTOR$glfwSetJoystickUserPointer);
        HANDLE$glfwGetJoystickUserPointer = loader.apply("glfwGetJoystickUserPointer", DESCRIPTOR$glfwGetJoystickUserPointer);
        HANDLE$glfwJoystickIsGamepad = loader.apply("glfwJoystickIsGamepad", DESCRIPTOR$glfwJoystickIsGamepad);
        HANDLE$glfwSetJoystickCallback = loader.apply("glfwSetJoystickCallback", DESCRIPTOR$glfwSetJoystickCallback);
        HANDLE$glfwUpdateGamepadMappings = loader.apply("glfwUpdateGamepadMappings", DESCRIPTOR$glfwUpdateGamepadMappings);
        HANDLE$glfwGetGamepadName = loader.apply("glfwGetGamepadName", DESCRIPTOR$glfwGetGamepadName);
        HANDLE$glfwGetGamepadState = loader.apply("glfwGetGamepadState", DESCRIPTOR$glfwGetGamepadState);
        HANDLE$glfwSetClipboardString = loader.apply("glfwSetClipboardString", DESCRIPTOR$glfwSetClipboardString);
        HANDLE$glfwGetClipboardString = loader.apply("glfwGetClipboardString", DESCRIPTOR$glfwGetClipboardString);
        HANDLE$glfwGetTime = loader.apply("glfwGetTime", DESCRIPTOR$glfwGetTime);
        HANDLE$glfwSetTime = loader.apply("glfwSetTime", DESCRIPTOR$glfwSetTime);
        HANDLE$glfwGetTimerValue = loader.apply("glfwGetTimerValue", DESCRIPTOR$glfwGetTimerValue);
        HANDLE$glfwGetTimerFrequency = loader.apply("glfwGetTimerFrequency", DESCRIPTOR$glfwGetTimerFrequency);
        HANDLE$glfwMakeContextCurrent = loader.apply("glfwMakeContextCurrent", DESCRIPTOR$glfwMakeContextCurrent);
        HANDLE$glfwGetCurrentContext = loader.apply("glfwGetCurrentContext", DESCRIPTOR$glfwGetCurrentContext);
        HANDLE$glfwSwapBuffers = loader.apply("glfwSwapBuffers", DESCRIPTOR$glfwSwapBuffers);
        HANDLE$glfwSwapInterval = loader.apply("glfwSwapInterval", DESCRIPTOR$glfwSwapInterval);
        HANDLE$glfwExtensionSupported = loader.apply("glfwExtensionSupported", DESCRIPTOR$glfwExtensionSupported);
        HANDLE$glfwGetProcAddress = loader.apply("glfwGetProcAddress", DESCRIPTOR$glfwGetProcAddress);
        HANDLE$glfwVulkanSupported = loader.apply("glfwVulkanSupported", DESCRIPTOR$glfwVulkanSupported);
        HANDLE$glfwGetRequiredInstanceExtensions = loader.apply("glfwGetRequiredInstanceExtensions", DESCRIPTOR$glfwGetRequiredInstanceExtensions);
        HANDLE$glfwGetInstanceProcAddress = loader.apply("glfwGetInstanceProcAddress", DESCRIPTOR$glfwGetInstanceProcAddress);
        HANDLE$glfwGetPhysicalDevicePresentationSupport = loader.apply("glfwGetPhysicalDevicePresentationSupport", DESCRIPTOR$glfwGetPhysicalDevicePresentationSupport);
        HANDLE$glfwCreateWindowSurface = loader.apply("glfwCreateWindowSurface", DESCRIPTOR$glfwCreateWindowSurface);
        HANDLE$glfwGetWin32Adapter = loader.apply("glfwGetWin32Adapter", DESCRIPTOR$glfwGetWin32Adapter);
        HANDLE$glfwGetWin32Monitor = loader.apply("glfwGetWin32Monitor", DESCRIPTOR$glfwGetWin32Monitor);
        HANDLE$glfwGetWin32Window = loader.apply("glfwGetWin32Window", DESCRIPTOR$glfwGetWin32Window);
        HANDLE$glfwGetWGLContext = loader.apply("glfwGetWGLContext", DESCRIPTOR$glfwGetWGLContext);
        HANDLE$glfwGetCocoaMonitor = loader.apply("glfwGetCocoaMonitor", DESCRIPTOR$glfwGetCocoaMonitor);
        HANDLE$glfwGetCocoaWindow = loader.apply("glfwGetCocoaWindow", DESCRIPTOR$glfwGetCocoaWindow);
        HANDLE$glfwGetCocoaView = loader.apply("glfwGetCocoaView", DESCRIPTOR$glfwGetCocoaView);
        HANDLE$glfwGetNSGLContext = loader.apply("glfwGetNSGLContext", DESCRIPTOR$glfwGetNSGLContext);
        HANDLE$glfwGetX11Display = loader.apply("glfwGetX11Display", DESCRIPTOR$glfwGetX11Display);
        HANDLE$glfwGetX11Adapter = loader.apply("glfwGetX11Adapter", DESCRIPTOR$glfwGetX11Adapter);
        HANDLE$glfwGetX11Monitor = loader.apply("glfwGetX11Monitor", DESCRIPTOR$glfwGetX11Monitor);
        HANDLE$glfwGetX11Window = loader.apply("glfwGetX11Window", DESCRIPTOR$glfwGetX11Window);
        HANDLE$glfwSetX11SelectionString = loader.apply("glfwSetX11SelectionString", DESCRIPTOR$glfwSetX11SelectionString);
        HANDLE$glfwGetX11SelectionString = loader.apply("glfwGetX11SelectionString", DESCRIPTOR$glfwGetX11SelectionString);
        HANDLE$glfwGetGLXContext = loader.apply("glfwGetGLXContext", DESCRIPTOR$glfwGetGLXContext);
        HANDLE$glfwGetGLXWindow = loader.apply("glfwGetGLXWindow", DESCRIPTOR$glfwGetGLXWindow);
        HANDLE$glfwGetWaylandDisplay = loader.apply("glfwGetWaylandDisplay", DESCRIPTOR$glfwGetWaylandDisplay);
        HANDLE$glfwGetWaylandMonitor = loader.apply("glfwGetWaylandMonitor", DESCRIPTOR$glfwGetWaylandMonitor);
        HANDLE$glfwGetWaylandWindow = loader.apply("glfwGetWaylandWindow", DESCRIPTOR$glfwGetWaylandWindow);
        HANDLE$glfwGetEGLDisplay = loader.apply("glfwGetEGLDisplay", DESCRIPTOR$glfwGetEGLDisplay);
        HANDLE$glfwGetEGLContext = loader.apply("glfwGetEGLContext", DESCRIPTOR$glfwGetEGLContext);
        HANDLE$glfwGetEGLSurface = loader.apply("glfwGetEGLSurface", DESCRIPTOR$glfwGetEGLSurface);
        HANDLE$glfwGetOSMesaColorBuffer = loader.apply("glfwGetOSMesaColorBuffer", DESCRIPTOR$glfwGetOSMesaColorBuffer);
        HANDLE$glfwGetOSMesaDepthBuffer = loader.apply("glfwGetOSMesaDepthBuffer", DESCRIPTOR$glfwGetOSMesaDepthBuffer);
        HANDLE$glfwGetOSMesaContext = loader.apply("glfwGetOSMesaContext", DESCRIPTOR$glfwGetOSMesaContext);
    }
}
