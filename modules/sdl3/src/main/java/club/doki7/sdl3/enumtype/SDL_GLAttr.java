package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// An enumeration of OpenGL configuration attributes.
///
/// While you can set most OpenGL attributes normally, the attributes listed
/// above must be known before SDL creates the window that will be used with
/// the OpenGL context. These attributes are set and read with
/// SDL_GL_SetAttribute() and SDL_GL_GetAttribute().
///
/// In some cases, these attributes are minimum requests; the GL does not
/// promise to give you exactly what you asked for. It's possible to ask for a
/// 16-bit depth buffer and get a 24-bit one instead, for example, or to ask
/// for no stencil buffer and still have one available. Context creation should
/// fail if the GL can't provide your requested attributes at a minimum, but
/// you should check to see exactly what you got.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_GLAttr {
    public static final int SDL_GL_RED_SIZE = 0x0;
    public static final int SDL_GL_GREEN_SIZE = 0x1;
    public static final int SDL_GL_BLUE_SIZE = 0x2;
    public static final int SDL_GL_ALPHA_SIZE = 0x3;
    public static final int SDL_GL_BUFFER_SIZE = 0x4;
    public static final int SDL_GL_DOUBLEBUFFER = 0x5;
    public static final int SDL_GL_DEPTH_SIZE = 0x6;
    public static final int SDL_GL_STENCIL_SIZE = 0x7;
    public static final int SDL_GL_ACCUM_RED_SIZE = 0x8;
    public static final int SDL_GL_ACCUM_GREEN_SIZE = 0x9;
    public static final int SDL_GL_ACCUM_BLUE_SIZE = 0xa;
    public static final int SDL_GL_ACCUM_ALPHA_SIZE = 0xb;
    public static final int SDL_GL_STEREO = 0xc;
    public static final int SDL_GL_MULTISAMPLEBUFFERS = 0xd;
    public static final int SDL_GL_MULTISAMPLESAMPLES = 0xe;
    public static final int SDL_GL_ACCELERATED_VISUAL = 0xf;
    public static final int SDL_GL_RETAINED_BACKING = 0x10;
    public static final int SDL_GL_CONTEXT_MAJOR_VERSION = 0x11;
    public static final int SDL_GL_CONTEXT_MINOR_VERSION = 0x12;
    public static final int SDL_GL_CONTEXT_FLAGS = 0x13;
    public static final int SDL_GL_CONTEXT_PROFILE_MASK = 0x14;
    public static final int SDL_GL_SHARE_WITH_CURRENT_CONTEXT = 0x15;
    public static final int SDL_GL_FRAMEBUFFER_SRGB_CAPABLE = 0x16;
    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR = 0x17;
    public static final int SDL_GL_CONTEXT_RESET_NOTIFICATION = 0x18;
    public static final int SDL_GL_CONTEXT_NO_ERROR = 0x19;
    public static final int SDL_GL_FLOATBUFFERS = 0x1a;
    public static final int SDL_GL_EGL_PLATFORM = 0x1b;

    public static String explain(@EnumType(SDL_GLAttr.class) int value) {
        return switch (value) {
            case SDL_GLAttr.SDL_GL_ACCELERATED_VISUAL -> "SDL_GL_ACCELERATED_VISUAL";
            case SDL_GLAttr.SDL_GL_ACCUM_ALPHA_SIZE -> "SDL_GL_ACCUM_ALPHA_SIZE";
            case SDL_GLAttr.SDL_GL_ACCUM_BLUE_SIZE -> "SDL_GL_ACCUM_BLUE_SIZE";
            case SDL_GLAttr.SDL_GL_ACCUM_GREEN_SIZE -> "SDL_GL_ACCUM_GREEN_SIZE";
            case SDL_GLAttr.SDL_GL_ACCUM_RED_SIZE -> "SDL_GL_ACCUM_RED_SIZE";
            case SDL_GLAttr.SDL_GL_ALPHA_SIZE -> "SDL_GL_ALPHA_SIZE";
            case SDL_GLAttr.SDL_GL_BLUE_SIZE -> "SDL_GL_BLUE_SIZE";
            case SDL_GLAttr.SDL_GL_BUFFER_SIZE -> "SDL_GL_BUFFER_SIZE";
            case SDL_GLAttr.SDL_GL_CONTEXT_FLAGS -> "SDL_GL_CONTEXT_FLAGS";
            case SDL_GLAttr.SDL_GL_CONTEXT_MAJOR_VERSION -> "SDL_GL_CONTEXT_MAJOR_VERSION";
            case SDL_GLAttr.SDL_GL_CONTEXT_MINOR_VERSION -> "SDL_GL_CONTEXT_MINOR_VERSION";
            case SDL_GLAttr.SDL_GL_CONTEXT_NO_ERROR -> "SDL_GL_CONTEXT_NO_ERROR";
            case SDL_GLAttr.SDL_GL_CONTEXT_PROFILE_MASK -> "SDL_GL_CONTEXT_PROFILE_MASK";
            case SDL_GLAttr.SDL_GL_CONTEXT_RELEASE_BEHAVIOR -> "SDL_GL_CONTEXT_RELEASE_BEHAVIOR";
            case SDL_GLAttr.SDL_GL_CONTEXT_RESET_NOTIFICATION -> "SDL_GL_CONTEXT_RESET_NOTIFICATION";
            case SDL_GLAttr.SDL_GL_DEPTH_SIZE -> "SDL_GL_DEPTH_SIZE";
            case SDL_GLAttr.SDL_GL_DOUBLEBUFFER -> "SDL_GL_DOUBLEBUFFER";
            case SDL_GLAttr.SDL_GL_EGL_PLATFORM -> "SDL_GL_EGL_PLATFORM";
            case SDL_GLAttr.SDL_GL_FLOATBUFFERS -> "SDL_GL_FLOATBUFFERS";
            case SDL_GLAttr.SDL_GL_FRAMEBUFFER_SRGB_CAPABLE -> "SDL_GL_FRAMEBUFFER_SRGB_CAPABLE";
            case SDL_GLAttr.SDL_GL_GREEN_SIZE -> "SDL_GL_GREEN_SIZE";
            case SDL_GLAttr.SDL_GL_MULTISAMPLEBUFFERS -> "SDL_GL_MULTISAMPLEBUFFERS";
            case SDL_GLAttr.SDL_GL_MULTISAMPLESAMPLES -> "SDL_GL_MULTISAMPLESAMPLES";
            case SDL_GLAttr.SDL_GL_RED_SIZE -> "SDL_GL_RED_SIZE";
            case SDL_GLAttr.SDL_GL_RETAINED_BACKING -> "SDL_GL_RETAINED_BACKING";
            case SDL_GLAttr.SDL_GL_SHARE_WITH_CURRENT_CONTEXT -> "SDL_GL_SHARE_WITH_CURRENT_CONTEXT";
            case SDL_GLAttr.SDL_GL_STENCIL_SIZE -> "SDL_GL_STENCIL_SIZE";
            case SDL_GLAttr.SDL_GL_STEREO -> "SDL_GL_STEREO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GLAttr() {}
}
