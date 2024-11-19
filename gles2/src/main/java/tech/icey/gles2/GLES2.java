package tech.icey.gles2;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.RawFunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;

public final class GLES2 {
    public void glActiveTexture(
            int texture
    ) {
        try {
            HANDLE$glActiveTexture.invokeExact(
                    texture
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glAttachShader(
            @unsigned int program,
            @unsigned int shader
    ) {
        try {
            HANDLE$glAttachShader.invokeExact(
                    program,
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBindAttribLocation(
            @unsigned int program,
            @unsigned int index,
            @Nullable ByteBuffer name
    ) {
        try {
            HANDLE$glBindAttribLocation.invokeExact(
                    program,
                    index,
                    (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBindBuffer(
            int target,
            @unsigned int buffer
    ) {
        try {
            HANDLE$glBindBuffer.invokeExact(
                    target,
                    buffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBindFramebuffer(
            int target,
            @unsigned int framebuffer
    ) {
        try {
            HANDLE$glBindFramebuffer.invokeExact(
                    target,
                    framebuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBindRenderbuffer(
            int target,
            @unsigned int renderbuffer
    ) {
        try {
            HANDLE$glBindRenderbuffer.invokeExact(
                    target,
                    renderbuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBindTexture(
            int target,
            @unsigned int texture
    ) {
        try {
            HANDLE$glBindTexture.invokeExact(
                    target,
                    texture
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBlendColor(
            float red,
            float green,
            float blue,
            float alpha
    ) {
        try {
            HANDLE$glBlendColor.invokeExact(
                    red,
                    green,
                    blue,
                    alpha
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBlendEquation(
            int mode
    ) {
        try {
            HANDLE$glBlendEquation.invokeExact(
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBlendEquationSeparate(
            int modeRGB,
            int modeAlpha
    ) {
        try {
            HANDLE$glBlendEquationSeparate.invokeExact(
                    modeRGB,
                    modeAlpha
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBlendFunc(
            int sfactor,
            int dfactor
    ) {
        try {
            HANDLE$glBlendFunc.invokeExact(
                    sfactor,
                    dfactor
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBlendFuncSeparate(
            int sfactorRGB,
            int dfactorRGB,
            int sfactorAlpha,
            int dfactorAlpha
    ) {
        try {
            HANDLE$glBlendFuncSeparate.invokeExact(
                    sfactorRGB,
                    dfactorRGB,
                    sfactorAlpha,
                    dfactorAlpha
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBufferData(
            int target,
            long size,
            @pointer(comment="void*") MemorySegment data,
            int usage
    ) {
        try {
            HANDLE$glBufferData.invokeExact(
                    target,
                    MemorySegment.ofAddress(size),
                    data,
                    usage
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glBufferSubData(
            int target,
            long offset,
            long size,
            @pointer(comment="void*") MemorySegment data
    ) {
        try {
            HANDLE$glBufferSubData.invokeExact(
                    target,
                    MemorySegment.ofAddress(offset),
                    MemorySegment.ofAddress(size),
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glCheckFramebufferStatus(
            int target
    ) {
        try {
            return (int) HANDLE$glCheckFramebufferStatus.invokeExact(
                    target
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glClear(
            @unsigned int mask
    ) {
        try {
            HANDLE$glClear.invokeExact(
                    mask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glClearColor(
            float red,
            float green,
            float blue,
            float alpha
    ) {
        try {
            HANDLE$glClearColor.invokeExact(
                    red,
                    green,
                    blue,
                    alpha
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glClearDepthf(
            float d
    ) {
        try {
            HANDLE$glClearDepthf.invokeExact(
                    d
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glClearStencil(
            int s
    ) {
        try {
            HANDLE$glClearStencil.invokeExact(
                    s
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glColorMask(
            @unsigned byte red,
            @unsigned byte green,
            @unsigned byte blue,
            @unsigned byte alpha
    ) {
        try {
            HANDLE$glColorMask.invokeExact(
                    red,
                    green,
                    blue,
                    alpha
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glCompileShader(
            @unsigned int shader
    ) {
        try {
            HANDLE$glCompileShader.invokeExact(
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glCompressedTexImage2D(
            int target,
            int level,
            int internalformat,
            int width,
            int height,
            int border,
            int imageSize,
            @pointer(comment="void*") MemorySegment data
    ) {
        try {
            HANDLE$glCompressedTexImage2D.invokeExact(
                    target,
                    level,
                    internalformat,
                    width,
                    height,
                    border,
                    imageSize,
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glCompressedTexSubImage2D(
            int target,
            int level,
            int xoffset,
            int yoffset,
            int width,
            int height,
            int format,
            int imageSize,
            @pointer(comment="void*") MemorySegment data
    ) {
        try {
            HANDLE$glCompressedTexSubImage2D.invokeExact(
                    target,
                    level,
                    xoffset,
                    yoffset,
                    width,
                    height,
                    format,
                    imageSize,
                    data
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glCopyTexImage2D(
            int target,
            int level,
            int internalformat,
            int x,
            int y,
            int width,
            int height,
            int border
    ) {
        try {
            HANDLE$glCopyTexImage2D.invokeExact(
                    target,
                    level,
                    internalformat,
                    x,
                    y,
                    width,
                    height,
                    border
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glCopyTexSubImage2D(
            int target,
            int level,
            int xoffset,
            int yoffset,
            int x,
            int y,
            int width,
            int height
    ) {
        try {
            HANDLE$glCopyTexSubImage2D.invokeExact(
                    target,
                    level,
                    xoffset,
                    yoffset,
                    x,
                    y,
                    width,
                    height
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int glCreateProgram() {
        try {
            return (int) HANDLE$glCreateProgram.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int glCreateShader(
            int type
    ) {
        try {
            return (int) HANDLE$glCreateShader.invokeExact(
                    type
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glCullFace(
            int mode
    ) {
        try {
            HANDLE$glCullFace.invokeExact(
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDeleteBuffers(
            int n,
            @Nullable @unsigned IntBuffer buffers
    ) {
        try {
            HANDLE$glDeleteBuffers.invokeExact(
                    n,
                    (MemorySegment) (buffers != null ? buffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDeleteFramebuffers(
            int n,
            @Nullable @unsigned IntBuffer framebuffers
    ) {
        try {
            HANDLE$glDeleteFramebuffers.invokeExact(
                    n,
                    (MemorySegment) (framebuffers != null ? framebuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDeleteProgram(
            @unsigned int program
    ) {
        try {
            HANDLE$glDeleteProgram.invokeExact(
                    program
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDeleteRenderbuffers(
            int n,
            @Nullable @unsigned IntBuffer renderbuffers
    ) {
        try {
            HANDLE$glDeleteRenderbuffers.invokeExact(
                    n,
                    (MemorySegment) (renderbuffers != null ? renderbuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDeleteShader(
            @unsigned int shader
    ) {
        try {
            HANDLE$glDeleteShader.invokeExact(
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDeleteTextures(
            int n,
            @Nullable @unsigned IntBuffer textures
    ) {
        try {
            HANDLE$glDeleteTextures.invokeExact(
                    n,
                    (MemorySegment) (textures != null ? textures.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDepthFunc(
            int func
    ) {
        try {
            HANDLE$glDepthFunc.invokeExact(
                    func
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDepthMask(
            @unsigned byte flag
    ) {
        try {
            HANDLE$glDepthMask.invokeExact(
                    flag
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDepthRangef(
            float n,
            float f
    ) {
        try {
            HANDLE$glDepthRangef.invokeExact(
                    n,
                    f
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDetachShader(
            @unsigned int program,
            @unsigned int shader
    ) {
        try {
            HANDLE$glDetachShader.invokeExact(
                    program,
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDisable(
            int cap
    ) {
        try {
            HANDLE$glDisable.invokeExact(
                    cap
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDisableVertexAttribArray(
            @unsigned int index
    ) {
        try {
            HANDLE$glDisableVertexAttribArray.invokeExact(
                    index
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDrawArrays(
            int mode,
            int first,
            int count
    ) {
        try {
            HANDLE$glDrawArrays.invokeExact(
                    mode,
                    first,
                    count
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glDrawElements(
            int mode,
            int count,
            int type,
            @pointer(comment="void*") MemorySegment indices
    ) {
        try {
            HANDLE$glDrawElements.invokeExact(
                    mode,
                    count,
                    type,
                    indices
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glEnable(
            int cap
    ) {
        try {
            HANDLE$glEnable.invokeExact(
                    cap
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glEnableVertexAttribArray(
            @unsigned int index
    ) {
        try {
            HANDLE$glEnableVertexAttribArray.invokeExact(
                    index
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glFinish() {
        try {
            HANDLE$glFinish.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glFlush() {
        try {
            HANDLE$glFlush.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glFramebufferRenderbuffer(
            int target,
            int attachment,
            int renderbuffertarget,
            @unsigned int renderbuffer
    ) {
        try {
            HANDLE$glFramebufferRenderbuffer.invokeExact(
                    target,
                    attachment,
                    renderbuffertarget,
                    renderbuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glFramebufferTexture2D(
            int target,
            int attachment,
            int textarget,
            @unsigned int texture,
            int level
    ) {
        try {
            HANDLE$glFramebufferTexture2D.invokeExact(
                    target,
                    attachment,
                    textarget,
                    texture,
                    level
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glFrontFace(
            int mode
    ) {
        try {
            HANDLE$glFrontFace.invokeExact(
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGenBuffers(
            int n,
            @Nullable @unsigned IntBuffer buffers
    ) {
        try {
            HANDLE$glGenBuffers.invokeExact(
                    n,
                    (MemorySegment) (buffers != null ? buffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGenerateMipmap(
            int target
    ) {
        try {
            HANDLE$glGenerateMipmap.invokeExact(
                    target
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGenFramebuffers(
            int n,
            @Nullable @unsigned IntBuffer framebuffers
    ) {
        try {
            HANDLE$glGenFramebuffers.invokeExact(
                    n,
                    (MemorySegment) (framebuffers != null ? framebuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGenRenderbuffers(
            int n,
            @Nullable @unsigned IntBuffer renderbuffers
    ) {
        try {
            HANDLE$glGenRenderbuffers.invokeExact(
                    n,
                    (MemorySegment) (renderbuffers != null ? renderbuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGenTextures(
            int n,
            @Nullable @unsigned IntBuffer textures
    ) {
        try {
            HANDLE$glGenTextures.invokeExact(
                    n,
                    (MemorySegment) (textures != null ? textures.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetActiveAttrib(
            @unsigned int program,
            @unsigned int index,
            int bufSize,
            @Nullable IntBuffer length,
            @Nullable IntBuffer size,
            @Nullable IntBuffer type,
            @Nullable ByteBuffer name
    ) {
        try {
            HANDLE$glGetActiveAttrib.invokeExact(
                    program,
                    index,
                    bufSize,
                    (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                    (MemorySegment) (size != null ? size.segment() : MemorySegment.NULL),
                    (MemorySegment) (type != null ? type.segment() : MemorySegment.NULL),
                    (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetActiveUniform(
            @unsigned int program,
            @unsigned int index,
            int bufSize,
            @Nullable IntBuffer length,
            @Nullable IntBuffer size,
            @Nullable IntBuffer type,
            @Nullable ByteBuffer name
    ) {
        try {
            HANDLE$glGetActiveUniform.invokeExact(
                    program,
                    index,
                    bufSize,
                    (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                    (MemorySegment) (size != null ? size.segment() : MemorySegment.NULL),
                    (MemorySegment) (type != null ? type.segment() : MemorySegment.NULL),
                    (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetAttachedShaders(
            @unsigned int program,
            int maxCount,
            @Nullable IntBuffer count,
            @Nullable @unsigned IntBuffer shaders
    ) {
        try {
            HANDLE$glGetAttachedShaders.invokeExact(
                    program,
                    maxCount,
                    (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL),
                    (MemorySegment) (shaders != null ? shaders.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glGetAttribLocation(
            @unsigned int program,
            @Nullable ByteBuffer name
    ) {
        try {
            return (int) HANDLE$glGetAttribLocation.invokeExact(
                    program,
                    (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetBooleanv(
            int pname,
            @Nullable @unsigned ByteBuffer data
    ) {
        try {
            HANDLE$glGetBooleanv.invokeExact(
                    pname,
                    (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetBufferParameteriv(
            int target,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetBufferParameteriv.invokeExact(
                    target,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glGetError() {
        try {
            return (int) HANDLE$glGetError.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetFloatv(
            int pname,
            @Nullable FloatBuffer data
    ) {
        try {
            HANDLE$glGetFloatv.invokeExact(
                    pname,
                    (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetFramebufferAttachmentParameteriv(
            int target,
            int attachment,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetFramebufferAttachmentParameteriv.invokeExact(
                    target,
                    attachment,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetIntegerv(
            int pname,
            @Nullable IntBuffer data
    ) {
        try {
            HANDLE$glGetIntegerv.invokeExact(
                    pname,
                    (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetProgramiv(
            @unsigned int program,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetProgramiv.invokeExact(
                    program,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetProgramInfoLog(
            @unsigned int program,
            int bufSize,
            @Nullable IntBuffer length,
            @Nullable ByteBuffer infoLog
    ) {
        try {
            HANDLE$glGetProgramInfoLog.invokeExact(
                    program,
                    bufSize,
                    (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                    (MemorySegment) (infoLog != null ? infoLog.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetRenderbufferParameteriv(
            int target,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetRenderbufferParameteriv.invokeExact(
                    target,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetShaderiv(
            @unsigned int shader,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetShaderiv.invokeExact(
                    shader,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetShaderInfoLog(
            @unsigned int shader,
            int bufSize,
            @Nullable IntBuffer length,
            @Nullable ByteBuffer infoLog
    ) {
        try {
            HANDLE$glGetShaderInfoLog.invokeExact(
                    shader,
                    bufSize,
                    (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                    (MemorySegment) (infoLog != null ? infoLog.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetShaderPrecisionFormat(
            int shadertype,
            int precisiontype,
            @Nullable IntBuffer range,
            @Nullable IntBuffer precision
    ) {
        try {
            HANDLE$glGetShaderPrecisionFormat.invokeExact(
                    shadertype,
                    precisiontype,
                    (MemorySegment) (range != null ? range.segment() : MemorySegment.NULL),
                    (MemorySegment) (precision != null ? precision.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetShaderSource(
            @unsigned int shader,
            int bufSize,
            @Nullable IntBuffer length,
            @Nullable ByteBuffer source
    ) {
        try {
            HANDLE$glGetShaderSource.invokeExact(
                    shader,
                    bufSize,
                    (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                    (MemorySegment) (source != null ? source.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @Nullable @unsigned ByteBuffer glGetString(
            int name
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glGetString.invokeExact(
                    name
            );
            return s.address() == 0 ? null : new ByteBuffer(s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetTexParameterfv(
            int target,
            int pname,
            @Nullable FloatBuffer params
    ) {
        try {
            HANDLE$glGetTexParameterfv.invokeExact(
                    target,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetTexParameteriv(
            int target,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetTexParameteriv.invokeExact(
                    target,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetUniformfv(
            @unsigned int program,
            int location,
            @Nullable FloatBuffer params
    ) {
        try {
            HANDLE$glGetUniformfv.invokeExact(
                    program,
                    location,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetUniformiv(
            @unsigned int program,
            int location,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetUniformiv.invokeExact(
                    program,
                    location,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int glGetUniformLocation(
            @unsigned int program,
            @Nullable ByteBuffer name
    ) {
        try {
            return (int) HANDLE$glGetUniformLocation.invokeExact(
                    program,
                    (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetVertexAttribfv(
            @unsigned int index,
            int pname,
            @Nullable FloatBuffer params
    ) {
        try {
            HANDLE$glGetVertexAttribfv.invokeExact(
                    index,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetVertexAttribiv(
            @unsigned int index,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glGetVertexAttribiv.invokeExact(
                    index,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glGetVertexAttribPointerv(
            @unsigned int index,
            int pname,
            @Nullable PointerBuffer pointer
    ) {
        try {
            HANDLE$glGetVertexAttribPointerv.invokeExact(
                    index,
                    pname,
                    (MemorySegment) (pointer != null ? pointer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glHint(
            int target,
            int mode
    ) {
        try {
            HANDLE$glHint.invokeExact(
                    target,
                    mode
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsBuffer(
            @unsigned int buffer
    ) {
        try {
            return (byte) HANDLE$glIsBuffer.invokeExact(
                    buffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsEnabled(
            int cap
    ) {
        try {
            return (byte) HANDLE$glIsEnabled.invokeExact(
                    cap
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsFramebuffer(
            @unsigned int framebuffer
    ) {
        try {
            return (byte) HANDLE$glIsFramebuffer.invokeExact(
                    framebuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsProgram(
            @unsigned int program
    ) {
        try {
            return (byte) HANDLE$glIsProgram.invokeExact(
                    program
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsRenderbuffer(
            @unsigned int renderbuffer
    ) {
        try {
            return (byte) HANDLE$glIsRenderbuffer.invokeExact(
                    renderbuffer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsShader(
            @unsigned int shader
    ) {
        try {
            return (byte) HANDLE$glIsShader.invokeExact(
                    shader
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned byte glIsTexture(
            @unsigned int texture
    ) {
        try {
            return (byte) HANDLE$glIsTexture.invokeExact(
                    texture
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glLineWidth(
            float width
    ) {
        try {
            HANDLE$glLineWidth.invokeExact(
                    width
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glLinkProgram(
            @unsigned int program
    ) {
        try {
            HANDLE$glLinkProgram.invokeExact(
                    program
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glPixelStorei(
            int pname,
            int param
    ) {
        try {
            HANDLE$glPixelStorei.invokeExact(
                    pname,
                    param
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glPolygonOffset(
            float factor,
            float units
    ) {
        try {
            HANDLE$glPolygonOffset.invokeExact(
                    factor,
                    units
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glReadPixels(
            int x,
            int y,
            int width,
            int height,
            int format,
            int type,
            @pointer(comment="void*") MemorySegment pixels
    ) {
        try {
            HANDLE$glReadPixels.invokeExact(
                    x,
                    y,
                    width,
                    height,
                    format,
                    type,
                    pixels
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glReleaseShaderCompiler() {
        try {
            HANDLE$glReleaseShaderCompiler.invokeExact();
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glRenderbufferStorage(
            int target,
            int internalformat,
            int width,
            int height
    ) {
        try {
            HANDLE$glRenderbufferStorage.invokeExact(
                    target,
                    internalformat,
                    width,
                    height
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glSampleCoverage(
            float value,
            @unsigned byte invert
    ) {
        try {
            HANDLE$glSampleCoverage.invokeExact(
                    value,
                    invert
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glScissor(
            int x,
            int y,
            int width,
            int height
    ) {
        try {
            HANDLE$glScissor.invokeExact(
                    x,
                    y,
                    width,
                    height
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glShaderBinary(
            int count,
            @Nullable @unsigned IntBuffer shaders,
            int binaryFormat,
            @pointer(comment="void*") MemorySegment binary,
            int length
    ) {
        try {
            HANDLE$glShaderBinary.invokeExact(
                    count,
                    (MemorySegment) (shaders != null ? shaders.segment() : MemorySegment.NULL),
                    binaryFormat,
                    binary,
                    length
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glShaderSource(
            @unsigned int shader,
            int count,
            @Nullable PointerBuffer string,
            @Nullable IntBuffer length
    ) {
        try {
            HANDLE$glShaderSource.invokeExact(
                    shader,
                    count,
                    (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL),
                    (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glStencilFunc(
            int func,
            int ref,
            @unsigned int mask
    ) {
        try {
            HANDLE$glStencilFunc.invokeExact(
                    func,
                    ref,
                    mask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glStencilFuncSeparate(
            int face,
            int func,
            int ref,
            @unsigned int mask
    ) {
        try {
            HANDLE$glStencilFuncSeparate.invokeExact(
                    face,
                    func,
                    ref,
                    mask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glStencilMask(
            @unsigned int mask
    ) {
        try {
            HANDLE$glStencilMask.invokeExact(
                    mask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glStencilMaskSeparate(
            int face,
            @unsigned int mask
    ) {
        try {
            HANDLE$glStencilMaskSeparate.invokeExact(
                    face,
                    mask
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glStencilOp(
            int fail,
            int zfail,
            int zpass
    ) {
        try {
            HANDLE$glStencilOp.invokeExact(
                    fail,
                    zfail,
                    zpass
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glStencilOpSeparate(
            int face,
            int sfail,
            int dpfail,
            int dppass
    ) {
        try {
            HANDLE$glStencilOpSeparate.invokeExact(
                    face,
                    sfail,
                    dpfail,
                    dppass
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glTexImage2D(
            int target,
            int level,
            int internalformat,
            int width,
            int height,
            int border,
            int format,
            int type,
            @pointer(comment="void*") MemorySegment pixels
    ) {
        try {
            HANDLE$glTexImage2D.invokeExact(
                    target,
                    level,
                    internalformat,
                    width,
                    height,
                    border,
                    format,
                    type,
                    pixels
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glTexParameterf(
            int target,
            int pname,
            float param
    ) {
        try {
            HANDLE$glTexParameterf.invokeExact(
                    target,
                    pname,
                    param
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glTexParameterfv(
            int target,
            int pname,
            @Nullable FloatBuffer params
    ) {
        try {
            HANDLE$glTexParameterfv.invokeExact(
                    target,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glTexParameteri(
            int target,
            int pname,
            int param
    ) {
        try {
            HANDLE$glTexParameteri.invokeExact(
                    target,
                    pname,
                    param
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glTexParameteriv(
            int target,
            int pname,
            @Nullable IntBuffer params
    ) {
        try {
            HANDLE$glTexParameteriv.invokeExact(
                    target,
                    pname,
                    (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glTexSubImage2D(
            int target,
            int level,
            int xoffset,
            int yoffset,
            int width,
            int height,
            int format,
            int type,
            @pointer(comment="void*") MemorySegment pixels
    ) {
        try {
            HANDLE$glTexSubImage2D.invokeExact(
                    target,
                    level,
                    xoffset,
                    yoffset,
                    width,
                    height,
                    format,
                    type,
                    pixels
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform1f(
            int location,
            float v0
    ) {
        try {
            HANDLE$glUniform1f.invokeExact(
                    location,
                    v0
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform1fv(
            int location,
            int count,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniform1fv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform1i(
            int location,
            int v0
    ) {
        try {
            HANDLE$glUniform1i.invokeExact(
                    location,
                    v0
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform1iv(
            int location,
            int count,
            @Nullable IntBuffer value
    ) {
        try {
            HANDLE$glUniform1iv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform2f(
            int location,
            float v0,
            float v1
    ) {
        try {
            HANDLE$glUniform2f.invokeExact(
                    location,
                    v0,
                    v1
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform2fv(
            int location,
            int count,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniform2fv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform2i(
            int location,
            int v0,
            int v1
    ) {
        try {
            HANDLE$glUniform2i.invokeExact(
                    location,
                    v0,
                    v1
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform2iv(
            int location,
            int count,
            @Nullable IntBuffer value
    ) {
        try {
            HANDLE$glUniform2iv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform3f(
            int location,
            float v0,
            float v1,
            float v2
    ) {
        try {
            HANDLE$glUniform3f.invokeExact(
                    location,
                    v0,
                    v1,
                    v2
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform3fv(
            int location,
            int count,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniform3fv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform3i(
            int location,
            int v0,
            int v1,
            int v2
    ) {
        try {
            HANDLE$glUniform3i.invokeExact(
                    location,
                    v0,
                    v1,
                    v2
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform3iv(
            int location,
            int count,
            @Nullable IntBuffer value
    ) {
        try {
            HANDLE$glUniform3iv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform4f(
            int location,
            float v0,
            float v1,
            float v2,
            float v3
    ) {
        try {
            HANDLE$glUniform4f.invokeExact(
                    location,
                    v0,
                    v1,
                    v2,
                    v3
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform4fv(
            int location,
            int count,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniform4fv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform4i(
            int location,
            int v0,
            int v1,
            int v2,
            int v3
    ) {
        try {
            HANDLE$glUniform4i.invokeExact(
                    location,
                    v0,
                    v1,
                    v2,
                    v3
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniform4iv(
            int location,
            int count,
            @Nullable IntBuffer value
    ) {
        try {
            HANDLE$glUniform4iv.invokeExact(
                    location,
                    count,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniformMatrix2fv(
            int location,
            int count,
            @unsigned byte transpose,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniformMatrix2fv.invokeExact(
                    location,
                    count,
                    transpose,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniformMatrix3fv(
            int location,
            int count,
            @unsigned byte transpose,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniformMatrix3fv.invokeExact(
                    location,
                    count,
                    transpose,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUniformMatrix4fv(
            int location,
            int count,
            @unsigned byte transpose,
            @Nullable FloatBuffer value
    ) {
        try {
            HANDLE$glUniformMatrix4fv.invokeExact(
                    location,
                    count,
                    transpose,
                    (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glUseProgram(
            @unsigned int program
    ) {
        try {
            HANDLE$glUseProgram.invokeExact(
                    program
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glValidateProgram(
            @unsigned int program
    ) {
        try {
            HANDLE$glValidateProgram.invokeExact(
                    program
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib1f(
            @unsigned int index,
            float x
    ) {
        try {
            HANDLE$glVertexAttrib1f.invokeExact(
                    index,
                    x
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib1fv(
            @unsigned int index,
            @Nullable FloatBuffer v
    ) {
        try {
            HANDLE$glVertexAttrib1fv.invokeExact(
                    index,
                    (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib2f(
            @unsigned int index,
            float x,
            float y
    ) {
        try {
            HANDLE$glVertexAttrib2f.invokeExact(
                    index,
                    x,
                    y
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib2fv(
            @unsigned int index,
            @Nullable FloatBuffer v
    ) {
        try {
            HANDLE$glVertexAttrib2fv.invokeExact(
                    index,
                    (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib3f(
            @unsigned int index,
            float x,
            float y,
            float z
    ) {
        try {
            HANDLE$glVertexAttrib3f.invokeExact(
                    index,
                    x,
                    y,
                    z
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib3fv(
            @unsigned int index,
            @Nullable FloatBuffer v
    ) {
        try {
            HANDLE$glVertexAttrib3fv.invokeExact(
                    index,
                    (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib4f(
            @unsigned int index,
            float x,
            float y,
            float z,
            float w
    ) {
        try {
            HANDLE$glVertexAttrib4f.invokeExact(
                    index,
                    x,
                    y,
                    z,
                    w
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttrib4fv(
            @unsigned int index,
            @Nullable FloatBuffer v
    ) {
        try {
            HANDLE$glVertexAttrib4fv.invokeExact(
                    index,
                    (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glVertexAttribPointer(
            @unsigned int index,
            int size,
            int type,
            @unsigned byte normalized,
            int stride,
            @pointer(comment="void*") MemorySegment pointer
    ) {
        try {
            HANDLE$glVertexAttribPointer.invokeExact(
                    index,
                    size,
                    type,
                    normalized,
                    stride,
                    pointer
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void glViewport(
            int x,
            int y,
            int width,
            int height
    ) {
        try {
            HANDLE$glViewport.invokeExact(
                    x,
                    y,
                    width,
                    height
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static final FunctionDescriptor DESCRIPTOR$glActiveTexture = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glAttachShader = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBindAttribLocation = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glBindBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBindFramebuffer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBindRenderbuffer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBindTexture = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBlendColor = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBlendEquation = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBlendEquationSeparate = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBlendFunc = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBlendFuncSeparate = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBufferData = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glBufferSubData = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glCheckFramebufferStatus = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glClear = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glClearColor = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glClearDepthf = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glClearStencil = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glColorMask = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_BYTE
    );
    public static final FunctionDescriptor DESCRIPTOR$glCompileShader = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glCompressedTexImage2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glCompressedTexSubImage2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glCopyTexImage2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glCopyTexSubImage2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glCreateProgram = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glCreateShader = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glCullFace = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDeleteBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glDeleteFramebuffers = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glDeleteProgram = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDeleteRenderbuffers = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glDeleteShader = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDeleteTextures = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glDepthFunc = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDepthMask = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_BYTE
    );
    public static final FunctionDescriptor DESCRIPTOR$glDepthRangef = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDetachShader = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDisable = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDisableVertexAttribArray = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDrawArrays = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glDrawElements = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glEnable = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glEnableVertexAttribArray = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glFinish = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glFlush = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glFramebufferRenderbuffer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glFramebufferTexture2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glFrontFace = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glGenBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGenerateMipmap = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glGenFramebuffers = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGenRenderbuffers = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGenTextures = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetActiveAttrib = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetActiveUniform = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetAttachedShaders = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetAttribLocation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetBooleanv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetBufferParameteriv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetError = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetFloatv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetFramebufferAttachmentParameteriv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetIntegerv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetProgramiv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetProgramInfoLog = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetRenderbufferParameteriv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetShaderiv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetShaderInfoLog = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetShaderPrecisionFormat = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetShaderSource = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetTexParameterfv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetTexParameteriv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetUniformfv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetUniformiv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetUniformLocation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetVertexAttribfv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetVertexAttribiv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glGetVertexAttribPointerv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsEnabled = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsFramebuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsProgram = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsRenderbuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsShader = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glIsTexture = FunctionDescriptor.of(
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glLineWidth = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glLinkProgram = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glPixelStorei = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glPolygonOffset = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glReadPixels = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glReleaseShaderCompiler = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glRenderbufferStorage = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glSampleCoverage = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_BYTE
    );
    public static final FunctionDescriptor DESCRIPTOR$glScissor = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glShaderBinary = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glShaderSource = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glStencilFunc = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glStencilFuncSeparate = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glStencilMask = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glStencilMaskSeparate = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glStencilOp = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glStencilOpSeparate = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glTexImage2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glTexParameterf = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glTexParameterfv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glTexParameteri = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glTexParameteriv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glTexSubImage2D = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform1f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform1fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform1i = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform1iv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform2f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform2fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform2i = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform2iv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform3f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform3fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform3i = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform3iv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform4f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform4fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform4i = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniform4iv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniformMatrix2fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniformMatrix3fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUniformMatrix4fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_BYTE,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glUseProgram = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glValidateProgram = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib1f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib1fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib2f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib2fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib3f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib3fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib4f = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT,
            ValueLayout.JAVA_FLOAT
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttrib4fv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glVertexAttribPointer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_BYTE,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glViewport = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public final @Nullable MemorySegment SEGMENT$glActiveTexture;
    public final @Nullable MemorySegment SEGMENT$glAttachShader;
    public final @Nullable MemorySegment SEGMENT$glBindAttribLocation;
    public final @Nullable MemorySegment SEGMENT$glBindBuffer;
    public final @Nullable MemorySegment SEGMENT$glBindFramebuffer;
    public final @Nullable MemorySegment SEGMENT$glBindRenderbuffer;
    public final @Nullable MemorySegment SEGMENT$glBindTexture;
    public final @Nullable MemorySegment SEGMENT$glBlendColor;
    public final @Nullable MemorySegment SEGMENT$glBlendEquation;
    public final @Nullable MemorySegment SEGMENT$glBlendEquationSeparate;
    public final @Nullable MemorySegment SEGMENT$glBlendFunc;
    public final @Nullable MemorySegment SEGMENT$glBlendFuncSeparate;
    public final @Nullable MemorySegment SEGMENT$glBufferData;
    public final @Nullable MemorySegment SEGMENT$glBufferSubData;
    public final @Nullable MemorySegment SEGMENT$glCheckFramebufferStatus;
    public final @Nullable MemorySegment SEGMENT$glClear;
    public final @Nullable MemorySegment SEGMENT$glClearColor;
    public final @Nullable MemorySegment SEGMENT$glClearDepthf;
    public final @Nullable MemorySegment SEGMENT$glClearStencil;
    public final @Nullable MemorySegment SEGMENT$glColorMask;
    public final @Nullable MemorySegment SEGMENT$glCompileShader;
    public final @Nullable MemorySegment SEGMENT$glCompressedTexImage2D;
    public final @Nullable MemorySegment SEGMENT$glCompressedTexSubImage2D;
    public final @Nullable MemorySegment SEGMENT$glCopyTexImage2D;
    public final @Nullable MemorySegment SEGMENT$glCopyTexSubImage2D;
    public final @Nullable MemorySegment SEGMENT$glCreateProgram;
    public final @Nullable MemorySegment SEGMENT$glCreateShader;
    public final @Nullable MemorySegment SEGMENT$glCullFace;
    public final @Nullable MemorySegment SEGMENT$glDeleteBuffers;
    public final @Nullable MemorySegment SEGMENT$glDeleteFramebuffers;
    public final @Nullable MemorySegment SEGMENT$glDeleteProgram;
    public final @Nullable MemorySegment SEGMENT$glDeleteRenderbuffers;
    public final @Nullable MemorySegment SEGMENT$glDeleteShader;
    public final @Nullable MemorySegment SEGMENT$glDeleteTextures;
    public final @Nullable MemorySegment SEGMENT$glDepthFunc;
    public final @Nullable MemorySegment SEGMENT$glDepthMask;
    public final @Nullable MemorySegment SEGMENT$glDepthRangef;
    public final @Nullable MemorySegment SEGMENT$glDetachShader;
    public final @Nullable MemorySegment SEGMENT$glDisable;
    public final @Nullable MemorySegment SEGMENT$glDisableVertexAttribArray;
    public final @Nullable MemorySegment SEGMENT$glDrawArrays;
    public final @Nullable MemorySegment SEGMENT$glDrawElements;
    public final @Nullable MemorySegment SEGMENT$glEnable;
    public final @Nullable MemorySegment SEGMENT$glEnableVertexAttribArray;
    public final @Nullable MemorySegment SEGMENT$glFinish;
    public final @Nullable MemorySegment SEGMENT$glFlush;
    public final @Nullable MemorySegment SEGMENT$glFramebufferRenderbuffer;
    public final @Nullable MemorySegment SEGMENT$glFramebufferTexture2D;
    public final @Nullable MemorySegment SEGMENT$glFrontFace;
    public final @Nullable MemorySegment SEGMENT$glGenBuffers;
    public final @Nullable MemorySegment SEGMENT$glGenerateMipmap;
    public final @Nullable MemorySegment SEGMENT$glGenFramebuffers;
    public final @Nullable MemorySegment SEGMENT$glGenRenderbuffers;
    public final @Nullable MemorySegment SEGMENT$glGenTextures;
    public final @Nullable MemorySegment SEGMENT$glGetActiveAttrib;
    public final @Nullable MemorySegment SEGMENT$glGetActiveUniform;
    public final @Nullable MemorySegment SEGMENT$glGetAttachedShaders;
    public final @Nullable MemorySegment SEGMENT$glGetAttribLocation;
    public final @Nullable MemorySegment SEGMENT$glGetBooleanv;
    public final @Nullable MemorySegment SEGMENT$glGetBufferParameteriv;
    public final @Nullable MemorySegment SEGMENT$glGetError;
    public final @Nullable MemorySegment SEGMENT$glGetFloatv;
    public final @Nullable MemorySegment SEGMENT$glGetFramebufferAttachmentParameteriv;
    public final @Nullable MemorySegment SEGMENT$glGetIntegerv;
    public final @Nullable MemorySegment SEGMENT$glGetProgramiv;
    public final @Nullable MemorySegment SEGMENT$glGetProgramInfoLog;
    public final @Nullable MemorySegment SEGMENT$glGetRenderbufferParameteriv;
    public final @Nullable MemorySegment SEGMENT$glGetShaderiv;
    public final @Nullable MemorySegment SEGMENT$glGetShaderInfoLog;
    public final @Nullable MemorySegment SEGMENT$glGetShaderPrecisionFormat;
    public final @Nullable MemorySegment SEGMENT$glGetShaderSource;
    public final @Nullable MemorySegment SEGMENT$glGetString;
    public final @Nullable MemorySegment SEGMENT$glGetTexParameterfv;
    public final @Nullable MemorySegment SEGMENT$glGetTexParameteriv;
    public final @Nullable MemorySegment SEGMENT$glGetUniformfv;
    public final @Nullable MemorySegment SEGMENT$glGetUniformiv;
    public final @Nullable MemorySegment SEGMENT$glGetUniformLocation;
    public final @Nullable MemorySegment SEGMENT$glGetVertexAttribfv;
    public final @Nullable MemorySegment SEGMENT$glGetVertexAttribiv;
    public final @Nullable MemorySegment SEGMENT$glGetVertexAttribPointerv;
    public final @Nullable MemorySegment SEGMENT$glHint;
    public final @Nullable MemorySegment SEGMENT$glIsBuffer;
    public final @Nullable MemorySegment SEGMENT$glIsEnabled;
    public final @Nullable MemorySegment SEGMENT$glIsFramebuffer;
    public final @Nullable MemorySegment SEGMENT$glIsProgram;
    public final @Nullable MemorySegment SEGMENT$glIsRenderbuffer;
    public final @Nullable MemorySegment SEGMENT$glIsShader;
    public final @Nullable MemorySegment SEGMENT$glIsTexture;
    public final @Nullable MemorySegment SEGMENT$glLineWidth;
    public final @Nullable MemorySegment SEGMENT$glLinkProgram;
    public final @Nullable MemorySegment SEGMENT$glPixelStorei;
    public final @Nullable MemorySegment SEGMENT$glPolygonOffset;
    public final @Nullable MemorySegment SEGMENT$glReadPixels;
    public final @Nullable MemorySegment SEGMENT$glReleaseShaderCompiler;
    public final @Nullable MemorySegment SEGMENT$glRenderbufferStorage;
    public final @Nullable MemorySegment SEGMENT$glSampleCoverage;
    public final @Nullable MemorySegment SEGMENT$glScissor;
    public final @Nullable MemorySegment SEGMENT$glShaderBinary;
    public final @Nullable MemorySegment SEGMENT$glShaderSource;
    public final @Nullable MemorySegment SEGMENT$glStencilFunc;
    public final @Nullable MemorySegment SEGMENT$glStencilFuncSeparate;
    public final @Nullable MemorySegment SEGMENT$glStencilMask;
    public final @Nullable MemorySegment SEGMENT$glStencilMaskSeparate;
    public final @Nullable MemorySegment SEGMENT$glStencilOp;
    public final @Nullable MemorySegment SEGMENT$glStencilOpSeparate;
    public final @Nullable MemorySegment SEGMENT$glTexImage2D;
    public final @Nullable MemorySegment SEGMENT$glTexParameterf;
    public final @Nullable MemorySegment SEGMENT$glTexParameterfv;
    public final @Nullable MemorySegment SEGMENT$glTexParameteri;
    public final @Nullable MemorySegment SEGMENT$glTexParameteriv;
    public final @Nullable MemorySegment SEGMENT$glTexSubImage2D;
    public final @Nullable MemorySegment SEGMENT$glUniform1f;
    public final @Nullable MemorySegment SEGMENT$glUniform1fv;
    public final @Nullable MemorySegment SEGMENT$glUniform1i;
    public final @Nullable MemorySegment SEGMENT$glUniform1iv;
    public final @Nullable MemorySegment SEGMENT$glUniform2f;
    public final @Nullable MemorySegment SEGMENT$glUniform2fv;
    public final @Nullable MemorySegment SEGMENT$glUniform2i;
    public final @Nullable MemorySegment SEGMENT$glUniform2iv;
    public final @Nullable MemorySegment SEGMENT$glUniform3f;
    public final @Nullable MemorySegment SEGMENT$glUniform3fv;
    public final @Nullable MemorySegment SEGMENT$glUniform3i;
    public final @Nullable MemorySegment SEGMENT$glUniform3iv;
    public final @Nullable MemorySegment SEGMENT$glUniform4f;
    public final @Nullable MemorySegment SEGMENT$glUniform4fv;
    public final @Nullable MemorySegment SEGMENT$glUniform4i;
    public final @Nullable MemorySegment SEGMENT$glUniform4iv;
    public final @Nullable MemorySegment SEGMENT$glUniformMatrix2fv;
    public final @Nullable MemorySegment SEGMENT$glUniformMatrix3fv;
    public final @Nullable MemorySegment SEGMENT$glUniformMatrix4fv;
    public final @Nullable MemorySegment SEGMENT$glUseProgram;
    public final @Nullable MemorySegment SEGMENT$glValidateProgram;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib1f;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib1fv;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib2f;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib2fv;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib3f;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib3fv;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib4f;
    public final @Nullable MemorySegment SEGMENT$glVertexAttrib4fv;
    public final @Nullable MemorySegment SEGMENT$glVertexAttribPointer;
    public final @Nullable MemorySegment SEGMENT$glViewport;

    public final @Nullable MethodHandle HANDLE$glActiveTexture;
    public final @Nullable MethodHandle HANDLE$glAttachShader;
    public final @Nullable MethodHandle HANDLE$glBindAttribLocation;
    public final @Nullable MethodHandle HANDLE$glBindBuffer;
    public final @Nullable MethodHandle HANDLE$glBindFramebuffer;
    public final @Nullable MethodHandle HANDLE$glBindRenderbuffer;
    public final @Nullable MethodHandle HANDLE$glBindTexture;
    public final @Nullable MethodHandle HANDLE$glBlendColor;
    public final @Nullable MethodHandle HANDLE$glBlendEquation;
    public final @Nullable MethodHandle HANDLE$glBlendEquationSeparate;
    public final @Nullable MethodHandle HANDLE$glBlendFunc;
    public final @Nullable MethodHandle HANDLE$glBlendFuncSeparate;
    public final @Nullable MethodHandle HANDLE$glBufferData;
    public final @Nullable MethodHandle HANDLE$glBufferSubData;
    public final @Nullable MethodHandle HANDLE$glCheckFramebufferStatus;
    public final @Nullable MethodHandle HANDLE$glClear;
    public final @Nullable MethodHandle HANDLE$glClearColor;
    public final @Nullable MethodHandle HANDLE$glClearDepthf;
    public final @Nullable MethodHandle HANDLE$glClearStencil;
    public final @Nullable MethodHandle HANDLE$glColorMask;
    public final @Nullable MethodHandle HANDLE$glCompileShader;
    public final @Nullable MethodHandle HANDLE$glCompressedTexImage2D;
    public final @Nullable MethodHandle HANDLE$glCompressedTexSubImage2D;
    public final @Nullable MethodHandle HANDLE$glCopyTexImage2D;
    public final @Nullable MethodHandle HANDLE$glCopyTexSubImage2D;
    public final @Nullable MethodHandle HANDLE$glCreateProgram;
    public final @Nullable MethodHandle HANDLE$glCreateShader;
    public final @Nullable MethodHandle HANDLE$glCullFace;
    public final @Nullable MethodHandle HANDLE$glDeleteBuffers;
    public final @Nullable MethodHandle HANDLE$glDeleteFramebuffers;
    public final @Nullable MethodHandle HANDLE$glDeleteProgram;
    public final @Nullable MethodHandle HANDLE$glDeleteRenderbuffers;
    public final @Nullable MethodHandle HANDLE$glDeleteShader;
    public final @Nullable MethodHandle HANDLE$glDeleteTextures;
    public final @Nullable MethodHandle HANDLE$glDepthFunc;
    public final @Nullable MethodHandle HANDLE$glDepthMask;
    public final @Nullable MethodHandle HANDLE$glDepthRangef;
    public final @Nullable MethodHandle HANDLE$glDetachShader;
    public final @Nullable MethodHandle HANDLE$glDisable;
    public final @Nullable MethodHandle HANDLE$glDisableVertexAttribArray;
    public final @Nullable MethodHandle HANDLE$glDrawArrays;
    public final @Nullable MethodHandle HANDLE$glDrawElements;
    public final @Nullable MethodHandle HANDLE$glEnable;
    public final @Nullable MethodHandle HANDLE$glEnableVertexAttribArray;
    public final @Nullable MethodHandle HANDLE$glFinish;
    public final @Nullable MethodHandle HANDLE$glFlush;
    public final @Nullable MethodHandle HANDLE$glFramebufferRenderbuffer;
    public final @Nullable MethodHandle HANDLE$glFramebufferTexture2D;
    public final @Nullable MethodHandle HANDLE$glFrontFace;
    public final @Nullable MethodHandle HANDLE$glGenBuffers;
    public final @Nullable MethodHandle HANDLE$glGenerateMipmap;
    public final @Nullable MethodHandle HANDLE$glGenFramebuffers;
    public final @Nullable MethodHandle HANDLE$glGenRenderbuffers;
    public final @Nullable MethodHandle HANDLE$glGenTextures;
    public final @Nullable MethodHandle HANDLE$glGetActiveAttrib;
    public final @Nullable MethodHandle HANDLE$glGetActiveUniform;
    public final @Nullable MethodHandle HANDLE$glGetAttachedShaders;
    public final @Nullable MethodHandle HANDLE$glGetAttribLocation;
    public final @Nullable MethodHandle HANDLE$glGetBooleanv;
    public final @Nullable MethodHandle HANDLE$glGetBufferParameteriv;
    public final @Nullable MethodHandle HANDLE$glGetError;
    public final @Nullable MethodHandle HANDLE$glGetFloatv;
    public final @Nullable MethodHandle HANDLE$glGetFramebufferAttachmentParameteriv;
    public final @Nullable MethodHandle HANDLE$glGetIntegerv;
    public final @Nullable MethodHandle HANDLE$glGetProgramiv;
    public final @Nullable MethodHandle HANDLE$glGetProgramInfoLog;
    public final @Nullable MethodHandle HANDLE$glGetRenderbufferParameteriv;
    public final @Nullable MethodHandle HANDLE$glGetShaderiv;
    public final @Nullable MethodHandle HANDLE$glGetShaderInfoLog;
    public final @Nullable MethodHandle HANDLE$glGetShaderPrecisionFormat;
    public final @Nullable MethodHandle HANDLE$glGetShaderSource;
    public final @Nullable MethodHandle HANDLE$glGetString;
    public final @Nullable MethodHandle HANDLE$glGetTexParameterfv;
    public final @Nullable MethodHandle HANDLE$glGetTexParameteriv;
    public final @Nullable MethodHandle HANDLE$glGetUniformfv;
    public final @Nullable MethodHandle HANDLE$glGetUniformiv;
    public final @Nullable MethodHandle HANDLE$glGetUniformLocation;
    public final @Nullable MethodHandle HANDLE$glGetVertexAttribfv;
    public final @Nullable MethodHandle HANDLE$glGetVertexAttribiv;
    public final @Nullable MethodHandle HANDLE$glGetVertexAttribPointerv;
    public final @Nullable MethodHandle HANDLE$glHint;
    public final @Nullable MethodHandle HANDLE$glIsBuffer;
    public final @Nullable MethodHandle HANDLE$glIsEnabled;
    public final @Nullable MethodHandle HANDLE$glIsFramebuffer;
    public final @Nullable MethodHandle HANDLE$glIsProgram;
    public final @Nullable MethodHandle HANDLE$glIsRenderbuffer;
    public final @Nullable MethodHandle HANDLE$glIsShader;
    public final @Nullable MethodHandle HANDLE$glIsTexture;
    public final @Nullable MethodHandle HANDLE$glLineWidth;
    public final @Nullable MethodHandle HANDLE$glLinkProgram;
    public final @Nullable MethodHandle HANDLE$glPixelStorei;
    public final @Nullable MethodHandle HANDLE$glPolygonOffset;
    public final @Nullable MethodHandle HANDLE$glReadPixels;
    public final @Nullable MethodHandle HANDLE$glReleaseShaderCompiler;
    public final @Nullable MethodHandle HANDLE$glRenderbufferStorage;
    public final @Nullable MethodHandle HANDLE$glSampleCoverage;
    public final @Nullable MethodHandle HANDLE$glScissor;
    public final @Nullable MethodHandle HANDLE$glShaderBinary;
    public final @Nullable MethodHandle HANDLE$glShaderSource;
    public final @Nullable MethodHandle HANDLE$glStencilFunc;
    public final @Nullable MethodHandle HANDLE$glStencilFuncSeparate;
    public final @Nullable MethodHandle HANDLE$glStencilMask;
    public final @Nullable MethodHandle HANDLE$glStencilMaskSeparate;
    public final @Nullable MethodHandle HANDLE$glStencilOp;
    public final @Nullable MethodHandle HANDLE$glStencilOpSeparate;
    public final @Nullable MethodHandle HANDLE$glTexImage2D;
    public final @Nullable MethodHandle HANDLE$glTexParameterf;
    public final @Nullable MethodHandle HANDLE$glTexParameterfv;
    public final @Nullable MethodHandle HANDLE$glTexParameteri;
    public final @Nullable MethodHandle HANDLE$glTexParameteriv;
    public final @Nullable MethodHandle HANDLE$glTexSubImage2D;
    public final @Nullable MethodHandle HANDLE$glUniform1f;
    public final @Nullable MethodHandle HANDLE$glUniform1fv;
    public final @Nullable MethodHandle HANDLE$glUniform1i;
    public final @Nullable MethodHandle HANDLE$glUniform1iv;
    public final @Nullable MethodHandle HANDLE$glUniform2f;
    public final @Nullable MethodHandle HANDLE$glUniform2fv;
    public final @Nullable MethodHandle HANDLE$glUniform2i;
    public final @Nullable MethodHandle HANDLE$glUniform2iv;
    public final @Nullable MethodHandle HANDLE$glUniform3f;
    public final @Nullable MethodHandle HANDLE$glUniform3fv;
    public final @Nullable MethodHandle HANDLE$glUniform3i;
    public final @Nullable MethodHandle HANDLE$glUniform3iv;
    public final @Nullable MethodHandle HANDLE$glUniform4f;
    public final @Nullable MethodHandle HANDLE$glUniform4fv;
    public final @Nullable MethodHandle HANDLE$glUniform4i;
    public final @Nullable MethodHandle HANDLE$glUniform4iv;
    public final @Nullable MethodHandle HANDLE$glUniformMatrix2fv;
    public final @Nullable MethodHandle HANDLE$glUniformMatrix3fv;
    public final @Nullable MethodHandle HANDLE$glUniformMatrix4fv;
    public final @Nullable MethodHandle HANDLE$glUseProgram;
    public final @Nullable MethodHandle HANDLE$glValidateProgram;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib1f;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib1fv;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib2f;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib2fv;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib3f;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib3fv;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib4f;
    public final @Nullable MethodHandle HANDLE$glVertexAttrib4fv;
    public final @Nullable MethodHandle HANDLE$glVertexAttribPointer;
    public final @Nullable MethodHandle HANDLE$glViewport;

    public GLES2(RawFunctionLoader loader) {
        SEGMENT$glActiveTexture = loader.apply("glActiveTexture");
        HANDLE$glActiveTexture = RawFunctionLoader.link(SEGMENT$glActiveTexture, DESCRIPTOR$glActiveTexture);
        SEGMENT$glAttachShader = loader.apply("glAttachShader");
        HANDLE$glAttachShader = RawFunctionLoader.link(SEGMENT$glAttachShader, DESCRIPTOR$glAttachShader);
        SEGMENT$glBindAttribLocation = loader.apply("glBindAttribLocation");
        HANDLE$glBindAttribLocation = RawFunctionLoader.link(SEGMENT$glBindAttribLocation, DESCRIPTOR$glBindAttribLocation);
        SEGMENT$glBindBuffer = loader.apply("glBindBuffer");
        HANDLE$glBindBuffer = RawFunctionLoader.link(SEGMENT$glBindBuffer, DESCRIPTOR$glBindBuffer);
        SEGMENT$glBindFramebuffer = loader.apply("glBindFramebuffer");
        HANDLE$glBindFramebuffer = RawFunctionLoader.link(SEGMENT$glBindFramebuffer, DESCRIPTOR$glBindFramebuffer);
        SEGMENT$glBindRenderbuffer = loader.apply("glBindRenderbuffer");
        HANDLE$glBindRenderbuffer = RawFunctionLoader.link(SEGMENT$glBindRenderbuffer, DESCRIPTOR$glBindRenderbuffer);
        SEGMENT$glBindTexture = loader.apply("glBindTexture");
        HANDLE$glBindTexture = RawFunctionLoader.link(SEGMENT$glBindTexture, DESCRIPTOR$glBindTexture);
        SEGMENT$glBlendColor = loader.apply("glBlendColor");
        HANDLE$glBlendColor = RawFunctionLoader.link(SEGMENT$glBlendColor, DESCRIPTOR$glBlendColor);
        SEGMENT$glBlendEquation = loader.apply("glBlendEquation");
        HANDLE$glBlendEquation = RawFunctionLoader.link(SEGMENT$glBlendEquation, DESCRIPTOR$glBlendEquation);
        SEGMENT$glBlendEquationSeparate = loader.apply("glBlendEquationSeparate");
        HANDLE$glBlendEquationSeparate = RawFunctionLoader.link(SEGMENT$glBlendEquationSeparate, DESCRIPTOR$glBlendEquationSeparate);
        SEGMENT$glBlendFunc = loader.apply("glBlendFunc");
        HANDLE$glBlendFunc = RawFunctionLoader.link(SEGMENT$glBlendFunc, DESCRIPTOR$glBlendFunc);
        SEGMENT$glBlendFuncSeparate = loader.apply("glBlendFuncSeparate");
        HANDLE$glBlendFuncSeparate = RawFunctionLoader.link(SEGMENT$glBlendFuncSeparate, DESCRIPTOR$glBlendFuncSeparate);
        SEGMENT$glBufferData = loader.apply("glBufferData");
        HANDLE$glBufferData = RawFunctionLoader.link(SEGMENT$glBufferData, DESCRIPTOR$glBufferData);
        SEGMENT$glBufferSubData = loader.apply("glBufferSubData");
        HANDLE$glBufferSubData = RawFunctionLoader.link(SEGMENT$glBufferSubData, DESCRIPTOR$glBufferSubData);
        SEGMENT$glCheckFramebufferStatus = loader.apply("glCheckFramebufferStatus");
        HANDLE$glCheckFramebufferStatus = RawFunctionLoader.link(SEGMENT$glCheckFramebufferStatus, DESCRIPTOR$glCheckFramebufferStatus);
        SEGMENT$glClear = loader.apply("glClear");
        HANDLE$glClear = RawFunctionLoader.link(SEGMENT$glClear, DESCRIPTOR$glClear);
        SEGMENT$glClearColor = loader.apply("glClearColor");
        HANDLE$glClearColor = RawFunctionLoader.link(SEGMENT$glClearColor, DESCRIPTOR$glClearColor);
        SEGMENT$glClearDepthf = loader.apply("glClearDepthf");
        HANDLE$glClearDepthf = RawFunctionLoader.link(SEGMENT$glClearDepthf, DESCRIPTOR$glClearDepthf);
        SEGMENT$glClearStencil = loader.apply("glClearStencil");
        HANDLE$glClearStencil = RawFunctionLoader.link(SEGMENT$glClearStencil, DESCRIPTOR$glClearStencil);
        SEGMENT$glColorMask = loader.apply("glColorMask");
        HANDLE$glColorMask = RawFunctionLoader.link(SEGMENT$glColorMask, DESCRIPTOR$glColorMask);
        SEGMENT$glCompileShader = loader.apply("glCompileShader");
        HANDLE$glCompileShader = RawFunctionLoader.link(SEGMENT$glCompileShader, DESCRIPTOR$glCompileShader);
        SEGMENT$glCompressedTexImage2D = loader.apply("glCompressedTexImage2D");
        HANDLE$glCompressedTexImage2D = RawFunctionLoader.link(SEGMENT$glCompressedTexImage2D, DESCRIPTOR$glCompressedTexImage2D);
        SEGMENT$glCompressedTexSubImage2D = loader.apply("glCompressedTexSubImage2D");
        HANDLE$glCompressedTexSubImage2D = RawFunctionLoader.link(SEGMENT$glCompressedTexSubImage2D, DESCRIPTOR$glCompressedTexSubImage2D);
        SEGMENT$glCopyTexImage2D = loader.apply("glCopyTexImage2D");
        HANDLE$glCopyTexImage2D = RawFunctionLoader.link(SEGMENT$glCopyTexImage2D, DESCRIPTOR$glCopyTexImage2D);
        SEGMENT$glCopyTexSubImage2D = loader.apply("glCopyTexSubImage2D");
        HANDLE$glCopyTexSubImage2D = RawFunctionLoader.link(SEGMENT$glCopyTexSubImage2D, DESCRIPTOR$glCopyTexSubImage2D);
        SEGMENT$glCreateProgram = loader.apply("glCreateProgram");
        HANDLE$glCreateProgram = RawFunctionLoader.link(SEGMENT$glCreateProgram, DESCRIPTOR$glCreateProgram);
        SEGMENT$glCreateShader = loader.apply("glCreateShader");
        HANDLE$glCreateShader = RawFunctionLoader.link(SEGMENT$glCreateShader, DESCRIPTOR$glCreateShader);
        SEGMENT$glCullFace = loader.apply("glCullFace");
        HANDLE$glCullFace = RawFunctionLoader.link(SEGMENT$glCullFace, DESCRIPTOR$glCullFace);
        SEGMENT$glDeleteBuffers = loader.apply("glDeleteBuffers");
        HANDLE$glDeleteBuffers = RawFunctionLoader.link(SEGMENT$glDeleteBuffers, DESCRIPTOR$glDeleteBuffers);
        SEGMENT$glDeleteFramebuffers = loader.apply("glDeleteFramebuffers");
        HANDLE$glDeleteFramebuffers = RawFunctionLoader.link(SEGMENT$glDeleteFramebuffers, DESCRIPTOR$glDeleteFramebuffers);
        SEGMENT$glDeleteProgram = loader.apply("glDeleteProgram");
        HANDLE$glDeleteProgram = RawFunctionLoader.link(SEGMENT$glDeleteProgram, DESCRIPTOR$glDeleteProgram);
        SEGMENT$glDeleteRenderbuffers = loader.apply("glDeleteRenderbuffers");
        HANDLE$glDeleteRenderbuffers = RawFunctionLoader.link(SEGMENT$glDeleteRenderbuffers, DESCRIPTOR$glDeleteRenderbuffers);
        SEGMENT$glDeleteShader = loader.apply("glDeleteShader");
        HANDLE$glDeleteShader = RawFunctionLoader.link(SEGMENT$glDeleteShader, DESCRIPTOR$glDeleteShader);
        SEGMENT$glDeleteTextures = loader.apply("glDeleteTextures");
        HANDLE$glDeleteTextures = RawFunctionLoader.link(SEGMENT$glDeleteTextures, DESCRIPTOR$glDeleteTextures);
        SEGMENT$glDepthFunc = loader.apply("glDepthFunc");
        HANDLE$glDepthFunc = RawFunctionLoader.link(SEGMENT$glDepthFunc, DESCRIPTOR$glDepthFunc);
        SEGMENT$glDepthMask = loader.apply("glDepthMask");
        HANDLE$glDepthMask = RawFunctionLoader.link(SEGMENT$glDepthMask, DESCRIPTOR$glDepthMask);
        SEGMENT$glDepthRangef = loader.apply("glDepthRangef");
        HANDLE$glDepthRangef = RawFunctionLoader.link(SEGMENT$glDepthRangef, DESCRIPTOR$glDepthRangef);
        SEGMENT$glDetachShader = loader.apply("glDetachShader");
        HANDLE$glDetachShader = RawFunctionLoader.link(SEGMENT$glDetachShader, DESCRIPTOR$glDetachShader);
        SEGMENT$glDisable = loader.apply("glDisable");
        HANDLE$glDisable = RawFunctionLoader.link(SEGMENT$glDisable, DESCRIPTOR$glDisable);
        SEGMENT$glDisableVertexAttribArray = loader.apply("glDisableVertexAttribArray");
        HANDLE$glDisableVertexAttribArray = RawFunctionLoader.link(SEGMENT$glDisableVertexAttribArray, DESCRIPTOR$glDisableVertexAttribArray);
        SEGMENT$glDrawArrays = loader.apply("glDrawArrays");
        HANDLE$glDrawArrays = RawFunctionLoader.link(SEGMENT$glDrawArrays, DESCRIPTOR$glDrawArrays);
        SEGMENT$glDrawElements = loader.apply("glDrawElements");
        HANDLE$glDrawElements = RawFunctionLoader.link(SEGMENT$glDrawElements, DESCRIPTOR$glDrawElements);
        SEGMENT$glEnable = loader.apply("glEnable");
        HANDLE$glEnable = RawFunctionLoader.link(SEGMENT$glEnable, DESCRIPTOR$glEnable);
        SEGMENT$glEnableVertexAttribArray = loader.apply("glEnableVertexAttribArray");
        HANDLE$glEnableVertexAttribArray = RawFunctionLoader.link(SEGMENT$glEnableVertexAttribArray, DESCRIPTOR$glEnableVertexAttribArray);
        SEGMENT$glFinish = loader.apply("glFinish");
        HANDLE$glFinish = RawFunctionLoader.link(SEGMENT$glFinish, DESCRIPTOR$glFinish);
        SEGMENT$glFlush = loader.apply("glFlush");
        HANDLE$glFlush = RawFunctionLoader.link(SEGMENT$glFlush, DESCRIPTOR$glFlush);
        SEGMENT$glFramebufferRenderbuffer = loader.apply("glFramebufferRenderbuffer");
        HANDLE$glFramebufferRenderbuffer = RawFunctionLoader.link(SEGMENT$glFramebufferRenderbuffer, DESCRIPTOR$glFramebufferRenderbuffer);
        SEGMENT$glFramebufferTexture2D = loader.apply("glFramebufferTexture2D");
        HANDLE$glFramebufferTexture2D = RawFunctionLoader.link(SEGMENT$glFramebufferTexture2D, DESCRIPTOR$glFramebufferTexture2D);
        SEGMENT$glFrontFace = loader.apply("glFrontFace");
        HANDLE$glFrontFace = RawFunctionLoader.link(SEGMENT$glFrontFace, DESCRIPTOR$glFrontFace);
        SEGMENT$glGenBuffers = loader.apply("glGenBuffers");
        HANDLE$glGenBuffers = RawFunctionLoader.link(SEGMENT$glGenBuffers, DESCRIPTOR$glGenBuffers);
        SEGMENT$glGenerateMipmap = loader.apply("glGenerateMipmap");
        HANDLE$glGenerateMipmap = RawFunctionLoader.link(SEGMENT$glGenerateMipmap, DESCRIPTOR$glGenerateMipmap);
        SEGMENT$glGenFramebuffers = loader.apply("glGenFramebuffers");
        HANDLE$glGenFramebuffers = RawFunctionLoader.link(SEGMENT$glGenFramebuffers, DESCRIPTOR$glGenFramebuffers);
        SEGMENT$glGenRenderbuffers = loader.apply("glGenRenderbuffers");
        HANDLE$glGenRenderbuffers = RawFunctionLoader.link(SEGMENT$glGenRenderbuffers, DESCRIPTOR$glGenRenderbuffers);
        SEGMENT$glGenTextures = loader.apply("glGenTextures");
        HANDLE$glGenTextures = RawFunctionLoader.link(SEGMENT$glGenTextures, DESCRIPTOR$glGenTextures);
        SEGMENT$glGetActiveAttrib = loader.apply("glGetActiveAttrib");
        HANDLE$glGetActiveAttrib = RawFunctionLoader.link(SEGMENT$glGetActiveAttrib, DESCRIPTOR$glGetActiveAttrib);
        SEGMENT$glGetActiveUniform = loader.apply("glGetActiveUniform");
        HANDLE$glGetActiveUniform = RawFunctionLoader.link(SEGMENT$glGetActiveUniform, DESCRIPTOR$glGetActiveUniform);
        SEGMENT$glGetAttachedShaders = loader.apply("glGetAttachedShaders");
        HANDLE$glGetAttachedShaders = RawFunctionLoader.link(SEGMENT$glGetAttachedShaders, DESCRIPTOR$glGetAttachedShaders);
        SEGMENT$glGetAttribLocation = loader.apply("glGetAttribLocation");
        HANDLE$glGetAttribLocation = RawFunctionLoader.link(SEGMENT$glGetAttribLocation, DESCRIPTOR$glGetAttribLocation);
        SEGMENT$glGetBooleanv = loader.apply("glGetBooleanv");
        HANDLE$glGetBooleanv = RawFunctionLoader.link(SEGMENT$glGetBooleanv, DESCRIPTOR$glGetBooleanv);
        SEGMENT$glGetBufferParameteriv = loader.apply("glGetBufferParameteriv");
        HANDLE$glGetBufferParameteriv = RawFunctionLoader.link(SEGMENT$glGetBufferParameteriv, DESCRIPTOR$glGetBufferParameteriv);
        SEGMENT$glGetError = loader.apply("glGetError");
        HANDLE$glGetError = RawFunctionLoader.link(SEGMENT$glGetError, DESCRIPTOR$glGetError);
        SEGMENT$glGetFloatv = loader.apply("glGetFloatv");
        HANDLE$glGetFloatv = RawFunctionLoader.link(SEGMENT$glGetFloatv, DESCRIPTOR$glGetFloatv);
        SEGMENT$glGetFramebufferAttachmentParameteriv = loader.apply("glGetFramebufferAttachmentParameteriv");
        HANDLE$glGetFramebufferAttachmentParameteriv = RawFunctionLoader.link(SEGMENT$glGetFramebufferAttachmentParameteriv, DESCRIPTOR$glGetFramebufferAttachmentParameteriv);
        SEGMENT$glGetIntegerv = loader.apply("glGetIntegerv");
        HANDLE$glGetIntegerv = RawFunctionLoader.link(SEGMENT$glGetIntegerv, DESCRIPTOR$glGetIntegerv);
        SEGMENT$glGetProgramiv = loader.apply("glGetProgramiv");
        HANDLE$glGetProgramiv = RawFunctionLoader.link(SEGMENT$glGetProgramiv, DESCRIPTOR$glGetProgramiv);
        SEGMENT$glGetProgramInfoLog = loader.apply("glGetProgramInfoLog");
        HANDLE$glGetProgramInfoLog = RawFunctionLoader.link(SEGMENT$glGetProgramInfoLog, DESCRIPTOR$glGetProgramInfoLog);
        SEGMENT$glGetRenderbufferParameteriv = loader.apply("glGetRenderbufferParameteriv");
        HANDLE$glGetRenderbufferParameteriv = RawFunctionLoader.link(SEGMENT$glGetRenderbufferParameteriv, DESCRIPTOR$glGetRenderbufferParameteriv);
        SEGMENT$glGetShaderiv = loader.apply("glGetShaderiv");
        HANDLE$glGetShaderiv = RawFunctionLoader.link(SEGMENT$glGetShaderiv, DESCRIPTOR$glGetShaderiv);
        SEGMENT$glGetShaderInfoLog = loader.apply("glGetShaderInfoLog");
        HANDLE$glGetShaderInfoLog = RawFunctionLoader.link(SEGMENT$glGetShaderInfoLog, DESCRIPTOR$glGetShaderInfoLog);
        SEGMENT$glGetShaderPrecisionFormat = loader.apply("glGetShaderPrecisionFormat");
        HANDLE$glGetShaderPrecisionFormat = RawFunctionLoader.link(SEGMENT$glGetShaderPrecisionFormat, DESCRIPTOR$glGetShaderPrecisionFormat);
        SEGMENT$glGetShaderSource = loader.apply("glGetShaderSource");
        HANDLE$glGetShaderSource = RawFunctionLoader.link(SEGMENT$glGetShaderSource, DESCRIPTOR$glGetShaderSource);
        SEGMENT$glGetString = loader.apply("glGetString");
        HANDLE$glGetString = RawFunctionLoader.link(SEGMENT$glGetString, DESCRIPTOR$glGetString);
        SEGMENT$glGetTexParameterfv = loader.apply("glGetTexParameterfv");
        HANDLE$glGetTexParameterfv = RawFunctionLoader.link(SEGMENT$glGetTexParameterfv, DESCRIPTOR$glGetTexParameterfv);
        SEGMENT$glGetTexParameteriv = loader.apply("glGetTexParameteriv");
        HANDLE$glGetTexParameteriv = RawFunctionLoader.link(SEGMENT$glGetTexParameteriv, DESCRIPTOR$glGetTexParameteriv);
        SEGMENT$glGetUniformfv = loader.apply("glGetUniformfv");
        HANDLE$glGetUniformfv = RawFunctionLoader.link(SEGMENT$glGetUniformfv, DESCRIPTOR$glGetUniformfv);
        SEGMENT$glGetUniformiv = loader.apply("glGetUniformiv");
        HANDLE$glGetUniformiv = RawFunctionLoader.link(SEGMENT$glGetUniformiv, DESCRIPTOR$glGetUniformiv);
        SEGMENT$glGetUniformLocation = loader.apply("glGetUniformLocation");
        HANDLE$glGetUniformLocation = RawFunctionLoader.link(SEGMENT$glGetUniformLocation, DESCRIPTOR$glGetUniformLocation);
        SEGMENT$glGetVertexAttribfv = loader.apply("glGetVertexAttribfv");
        HANDLE$glGetVertexAttribfv = RawFunctionLoader.link(SEGMENT$glGetVertexAttribfv, DESCRIPTOR$glGetVertexAttribfv);
        SEGMENT$glGetVertexAttribiv = loader.apply("glGetVertexAttribiv");
        HANDLE$glGetVertexAttribiv = RawFunctionLoader.link(SEGMENT$glGetVertexAttribiv, DESCRIPTOR$glGetVertexAttribiv);
        SEGMENT$glGetVertexAttribPointerv = loader.apply("glGetVertexAttribPointerv");
        HANDLE$glGetVertexAttribPointerv = RawFunctionLoader.link(SEGMENT$glGetVertexAttribPointerv, DESCRIPTOR$glGetVertexAttribPointerv);
        SEGMENT$glHint = loader.apply("glHint");
        HANDLE$glHint = RawFunctionLoader.link(SEGMENT$glHint, DESCRIPTOR$glHint);
        SEGMENT$glIsBuffer = loader.apply("glIsBuffer");
        HANDLE$glIsBuffer = RawFunctionLoader.link(SEGMENT$glIsBuffer, DESCRIPTOR$glIsBuffer);
        SEGMENT$glIsEnabled = loader.apply("glIsEnabled");
        HANDLE$glIsEnabled = RawFunctionLoader.link(SEGMENT$glIsEnabled, DESCRIPTOR$glIsEnabled);
        SEGMENT$glIsFramebuffer = loader.apply("glIsFramebuffer");
        HANDLE$glIsFramebuffer = RawFunctionLoader.link(SEGMENT$glIsFramebuffer, DESCRIPTOR$glIsFramebuffer);
        SEGMENT$glIsProgram = loader.apply("glIsProgram");
        HANDLE$glIsProgram = RawFunctionLoader.link(SEGMENT$glIsProgram, DESCRIPTOR$glIsProgram);
        SEGMENT$glIsRenderbuffer = loader.apply("glIsRenderbuffer");
        HANDLE$glIsRenderbuffer = RawFunctionLoader.link(SEGMENT$glIsRenderbuffer, DESCRIPTOR$glIsRenderbuffer);
        SEGMENT$glIsShader = loader.apply("glIsShader");
        HANDLE$glIsShader = RawFunctionLoader.link(SEGMENT$glIsShader, DESCRIPTOR$glIsShader);
        SEGMENT$glIsTexture = loader.apply("glIsTexture");
        HANDLE$glIsTexture = RawFunctionLoader.link(SEGMENT$glIsTexture, DESCRIPTOR$glIsTexture);
        SEGMENT$glLineWidth = loader.apply("glLineWidth");
        HANDLE$glLineWidth = RawFunctionLoader.link(SEGMENT$glLineWidth, DESCRIPTOR$glLineWidth);
        SEGMENT$glLinkProgram = loader.apply("glLinkProgram");
        HANDLE$glLinkProgram = RawFunctionLoader.link(SEGMENT$glLinkProgram, DESCRIPTOR$glLinkProgram);
        SEGMENT$glPixelStorei = loader.apply("glPixelStorei");
        HANDLE$glPixelStorei = RawFunctionLoader.link(SEGMENT$glPixelStorei, DESCRIPTOR$glPixelStorei);
        SEGMENT$glPolygonOffset = loader.apply("glPolygonOffset");
        HANDLE$glPolygonOffset = RawFunctionLoader.link(SEGMENT$glPolygonOffset, DESCRIPTOR$glPolygonOffset);
        SEGMENT$glReadPixels = loader.apply("glReadPixels");
        HANDLE$glReadPixels = RawFunctionLoader.link(SEGMENT$glReadPixels, DESCRIPTOR$glReadPixels);
        SEGMENT$glReleaseShaderCompiler = loader.apply("glReleaseShaderCompiler");
        HANDLE$glReleaseShaderCompiler = RawFunctionLoader.link(SEGMENT$glReleaseShaderCompiler, DESCRIPTOR$glReleaseShaderCompiler);
        SEGMENT$glRenderbufferStorage = loader.apply("glRenderbufferStorage");
        HANDLE$glRenderbufferStorage = RawFunctionLoader.link(SEGMENT$glRenderbufferStorage, DESCRIPTOR$glRenderbufferStorage);
        SEGMENT$glSampleCoverage = loader.apply("glSampleCoverage");
        HANDLE$glSampleCoverage = RawFunctionLoader.link(SEGMENT$glSampleCoverage, DESCRIPTOR$glSampleCoverage);
        SEGMENT$glScissor = loader.apply("glScissor");
        HANDLE$glScissor = RawFunctionLoader.link(SEGMENT$glScissor, DESCRIPTOR$glScissor);
        SEGMENT$glShaderBinary = loader.apply("glShaderBinary");
        HANDLE$glShaderBinary = RawFunctionLoader.link(SEGMENT$glShaderBinary, DESCRIPTOR$glShaderBinary);
        SEGMENT$glShaderSource = loader.apply("glShaderSource");
        HANDLE$glShaderSource = RawFunctionLoader.link(SEGMENT$glShaderSource, DESCRIPTOR$glShaderSource);
        SEGMENT$glStencilFunc = loader.apply("glStencilFunc");
        HANDLE$glStencilFunc = RawFunctionLoader.link(SEGMENT$glStencilFunc, DESCRIPTOR$glStencilFunc);
        SEGMENT$glStencilFuncSeparate = loader.apply("glStencilFuncSeparate");
        HANDLE$glStencilFuncSeparate = RawFunctionLoader.link(SEGMENT$glStencilFuncSeparate, DESCRIPTOR$glStencilFuncSeparate);
        SEGMENT$glStencilMask = loader.apply("glStencilMask");
        HANDLE$glStencilMask = RawFunctionLoader.link(SEGMENT$glStencilMask, DESCRIPTOR$glStencilMask);
        SEGMENT$glStencilMaskSeparate = loader.apply("glStencilMaskSeparate");
        HANDLE$glStencilMaskSeparate = RawFunctionLoader.link(SEGMENT$glStencilMaskSeparate, DESCRIPTOR$glStencilMaskSeparate);
        SEGMENT$glStencilOp = loader.apply("glStencilOp");
        HANDLE$glStencilOp = RawFunctionLoader.link(SEGMENT$glStencilOp, DESCRIPTOR$glStencilOp);
        SEGMENT$glStencilOpSeparate = loader.apply("glStencilOpSeparate");
        HANDLE$glStencilOpSeparate = RawFunctionLoader.link(SEGMENT$glStencilOpSeparate, DESCRIPTOR$glStencilOpSeparate);
        SEGMENT$glTexImage2D = loader.apply("glTexImage2D");
        HANDLE$glTexImage2D = RawFunctionLoader.link(SEGMENT$glTexImage2D, DESCRIPTOR$glTexImage2D);
        SEGMENT$glTexParameterf = loader.apply("glTexParameterf");
        HANDLE$glTexParameterf = RawFunctionLoader.link(SEGMENT$glTexParameterf, DESCRIPTOR$glTexParameterf);
        SEGMENT$glTexParameterfv = loader.apply("glTexParameterfv");
        HANDLE$glTexParameterfv = RawFunctionLoader.link(SEGMENT$glTexParameterfv, DESCRIPTOR$glTexParameterfv);
        SEGMENT$glTexParameteri = loader.apply("glTexParameteri");
        HANDLE$glTexParameteri = RawFunctionLoader.link(SEGMENT$glTexParameteri, DESCRIPTOR$glTexParameteri);
        SEGMENT$glTexParameteriv = loader.apply("glTexParameteriv");
        HANDLE$glTexParameteriv = RawFunctionLoader.link(SEGMENT$glTexParameteriv, DESCRIPTOR$glTexParameteriv);
        SEGMENT$glTexSubImage2D = loader.apply("glTexSubImage2D");
        HANDLE$glTexSubImage2D = RawFunctionLoader.link(SEGMENT$glTexSubImage2D, DESCRIPTOR$glTexSubImage2D);
        SEGMENT$glUniform1f = loader.apply("glUniform1f");
        HANDLE$glUniform1f = RawFunctionLoader.link(SEGMENT$glUniform1f, DESCRIPTOR$glUniform1f);
        SEGMENT$glUniform1fv = loader.apply("glUniform1fv");
        HANDLE$glUniform1fv = RawFunctionLoader.link(SEGMENT$glUniform1fv, DESCRIPTOR$glUniform1fv);
        SEGMENT$glUniform1i = loader.apply("glUniform1i");
        HANDLE$glUniform1i = RawFunctionLoader.link(SEGMENT$glUniform1i, DESCRIPTOR$glUniform1i);
        SEGMENT$glUniform1iv = loader.apply("glUniform1iv");
        HANDLE$glUniform1iv = RawFunctionLoader.link(SEGMENT$glUniform1iv, DESCRIPTOR$glUniform1iv);
        SEGMENT$glUniform2f = loader.apply("glUniform2f");
        HANDLE$glUniform2f = RawFunctionLoader.link(SEGMENT$glUniform2f, DESCRIPTOR$glUniform2f);
        SEGMENT$glUniform2fv = loader.apply("glUniform2fv");
        HANDLE$glUniform2fv = RawFunctionLoader.link(SEGMENT$glUniform2fv, DESCRIPTOR$glUniform2fv);
        SEGMENT$glUniform2i = loader.apply("glUniform2i");
        HANDLE$glUniform2i = RawFunctionLoader.link(SEGMENT$glUniform2i, DESCRIPTOR$glUniform2i);
        SEGMENT$glUniform2iv = loader.apply("glUniform2iv");
        HANDLE$glUniform2iv = RawFunctionLoader.link(SEGMENT$glUniform2iv, DESCRIPTOR$glUniform2iv);
        SEGMENT$glUniform3f = loader.apply("glUniform3f");
        HANDLE$glUniform3f = RawFunctionLoader.link(SEGMENT$glUniform3f, DESCRIPTOR$glUniform3f);
        SEGMENT$glUniform3fv = loader.apply("glUniform3fv");
        HANDLE$glUniform3fv = RawFunctionLoader.link(SEGMENT$glUniform3fv, DESCRIPTOR$glUniform3fv);
        SEGMENT$glUniform3i = loader.apply("glUniform3i");
        HANDLE$glUniform3i = RawFunctionLoader.link(SEGMENT$glUniform3i, DESCRIPTOR$glUniform3i);
        SEGMENT$glUniform3iv = loader.apply("glUniform3iv");
        HANDLE$glUniform3iv = RawFunctionLoader.link(SEGMENT$glUniform3iv, DESCRIPTOR$glUniform3iv);
        SEGMENT$glUniform4f = loader.apply("glUniform4f");
        HANDLE$glUniform4f = RawFunctionLoader.link(SEGMENT$glUniform4f, DESCRIPTOR$glUniform4f);
        SEGMENT$glUniform4fv = loader.apply("glUniform4fv");
        HANDLE$glUniform4fv = RawFunctionLoader.link(SEGMENT$glUniform4fv, DESCRIPTOR$glUniform4fv);
        SEGMENT$glUniform4i = loader.apply("glUniform4i");
        HANDLE$glUniform4i = RawFunctionLoader.link(SEGMENT$glUniform4i, DESCRIPTOR$glUniform4i);
        SEGMENT$glUniform4iv = loader.apply("glUniform4iv");
        HANDLE$glUniform4iv = RawFunctionLoader.link(SEGMENT$glUniform4iv, DESCRIPTOR$glUniform4iv);
        SEGMENT$glUniformMatrix2fv = loader.apply("glUniformMatrix2fv");
        HANDLE$glUniformMatrix2fv = RawFunctionLoader.link(SEGMENT$glUniformMatrix2fv, DESCRIPTOR$glUniformMatrix2fv);
        SEGMENT$glUniformMatrix3fv = loader.apply("glUniformMatrix3fv");
        HANDLE$glUniformMatrix3fv = RawFunctionLoader.link(SEGMENT$glUniformMatrix3fv, DESCRIPTOR$glUniformMatrix3fv);
        SEGMENT$glUniformMatrix4fv = loader.apply("glUniformMatrix4fv");
        HANDLE$glUniformMatrix4fv = RawFunctionLoader.link(SEGMENT$glUniformMatrix4fv, DESCRIPTOR$glUniformMatrix4fv);
        SEGMENT$glUseProgram = loader.apply("glUseProgram");
        HANDLE$glUseProgram = RawFunctionLoader.link(SEGMENT$glUseProgram, DESCRIPTOR$glUseProgram);
        SEGMENT$glValidateProgram = loader.apply("glValidateProgram");
        HANDLE$glValidateProgram = RawFunctionLoader.link(SEGMENT$glValidateProgram, DESCRIPTOR$glValidateProgram);
        SEGMENT$glVertexAttrib1f = loader.apply("glVertexAttrib1f");
        HANDLE$glVertexAttrib1f = RawFunctionLoader.link(SEGMENT$glVertexAttrib1f, DESCRIPTOR$glVertexAttrib1f);
        SEGMENT$glVertexAttrib1fv = loader.apply("glVertexAttrib1fv");
        HANDLE$glVertexAttrib1fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib1fv, DESCRIPTOR$glVertexAttrib1fv);
        SEGMENT$glVertexAttrib2f = loader.apply("glVertexAttrib2f");
        HANDLE$glVertexAttrib2f = RawFunctionLoader.link(SEGMENT$glVertexAttrib2f, DESCRIPTOR$glVertexAttrib2f);
        SEGMENT$glVertexAttrib2fv = loader.apply("glVertexAttrib2fv");
        HANDLE$glVertexAttrib2fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib2fv, DESCRIPTOR$glVertexAttrib2fv);
        SEGMENT$glVertexAttrib3f = loader.apply("glVertexAttrib3f");
        HANDLE$glVertexAttrib3f = RawFunctionLoader.link(SEGMENT$glVertexAttrib3f, DESCRIPTOR$glVertexAttrib3f);
        SEGMENT$glVertexAttrib3fv = loader.apply("glVertexAttrib3fv");
        HANDLE$glVertexAttrib3fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib3fv, DESCRIPTOR$glVertexAttrib3fv);
        SEGMENT$glVertexAttrib4f = loader.apply("glVertexAttrib4f");
        HANDLE$glVertexAttrib4f = RawFunctionLoader.link(SEGMENT$glVertexAttrib4f, DESCRIPTOR$glVertexAttrib4f);
        SEGMENT$glVertexAttrib4fv = loader.apply("glVertexAttrib4fv");
        HANDLE$glVertexAttrib4fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib4fv, DESCRIPTOR$glVertexAttrib4fv);
        SEGMENT$glVertexAttribPointer = loader.apply("glVertexAttribPointer");
        HANDLE$glVertexAttribPointer = RawFunctionLoader.link(SEGMENT$glVertexAttribPointer, DESCRIPTOR$glVertexAttribPointer);
        SEGMENT$glViewport = loader.apply("glViewport");
        HANDLE$glViewport = RawFunctionLoader.link(SEGMENT$glViewport, DESCRIPTOR$glViewport);
    }
}
