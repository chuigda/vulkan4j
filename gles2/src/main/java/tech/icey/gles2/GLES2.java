package tech.icey.gles2;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.FunctionLoader;
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
            @nullable ByteBuffer name
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
                    size,
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
                    offset,
                    size,
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
            @nullable @unsigned IntBuffer buffers
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
            @nullable @unsigned IntBuffer framebuffers
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
            @nullable @unsigned IntBuffer renderbuffers
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
            @nullable @unsigned IntBuffer textures
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
            @nullable @unsigned IntBuffer buffers
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
            @nullable @unsigned IntBuffer framebuffers
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
            @nullable @unsigned IntBuffer renderbuffers
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
            @nullable @unsigned IntBuffer textures
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
            @nullable IntBuffer length,
            @nullable IntBuffer size,
            @nullable IntBuffer type,
            @nullable ByteBuffer name
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
            @nullable IntBuffer length,
            @nullable IntBuffer size,
            @nullable IntBuffer type,
            @nullable ByteBuffer name
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
            @nullable IntBuffer count,
            @nullable @unsigned IntBuffer shaders
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
            @nullable ByteBuffer name
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
            @nullable @unsigned ByteBuffer data
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
            @nullable IntBuffer params
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
            @nullable FloatBuffer data
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
            @nullable IntBuffer params
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
            @nullable IntBuffer data
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
            @nullable IntBuffer params
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
            @nullable IntBuffer length,
            @nullable ByteBuffer infoLog
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
            @nullable IntBuffer params
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
            @nullable IntBuffer params
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
            @nullable IntBuffer length,
            @nullable ByteBuffer infoLog
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
            @nullable IntBuffer range,
            @nullable IntBuffer precision
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
            @nullable IntBuffer length,
            @nullable ByteBuffer source
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

    public @nullable @unsigned ByteBuffer glGetString(
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
            @nullable FloatBuffer params
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
            @nullable IntBuffer params
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
            @nullable FloatBuffer params
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
            @nullable IntBuffer params
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
            @nullable ByteBuffer name
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
            @nullable FloatBuffer params
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
            @nullable IntBuffer params
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
            @nullable PointerBuffer pointer
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
            @nullable @unsigned IntBuffer shaders,
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
            @nullable ByteBuffer string,
            @nullable IntBuffer length
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
            @nullable FloatBuffer params
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
            @nullable IntBuffer params
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
            @nullable FloatBuffer value
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
            @nullable IntBuffer value
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
            @nullable FloatBuffer value
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
            @nullable IntBuffer value
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
            @nullable FloatBuffer value
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
            @nullable IntBuffer value
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
            @nullable FloatBuffer value
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
            @nullable IntBuffer value
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
            @nullable FloatBuffer value
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
            @nullable FloatBuffer value
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
            @nullable FloatBuffer value
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
            @nullable FloatBuffer v
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
            @nullable FloatBuffer v
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
            @nullable FloatBuffer v
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
            @nullable FloatBuffer v
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
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
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

    public final @nullable MethodHandle HANDLE$glActiveTexture;
    public final @nullable MethodHandle HANDLE$glAttachShader;
    public final @nullable MethodHandle HANDLE$glBindAttribLocation;
    public final @nullable MethodHandle HANDLE$glBindBuffer;
    public final @nullable MethodHandle HANDLE$glBindFramebuffer;
    public final @nullable MethodHandle HANDLE$glBindRenderbuffer;
    public final @nullable MethodHandle HANDLE$glBindTexture;
    public final @nullable MethodHandle HANDLE$glBlendColor;
    public final @nullable MethodHandle HANDLE$glBlendEquation;
    public final @nullable MethodHandle HANDLE$glBlendEquationSeparate;
    public final @nullable MethodHandle HANDLE$glBlendFunc;
    public final @nullable MethodHandle HANDLE$glBlendFuncSeparate;
    public final @nullable MethodHandle HANDLE$glBufferData;
    public final @nullable MethodHandle HANDLE$glBufferSubData;
    public final @nullable MethodHandle HANDLE$glCheckFramebufferStatus;
    public final @nullable MethodHandle HANDLE$glClear;
    public final @nullable MethodHandle HANDLE$glClearColor;
    public final @nullable MethodHandle HANDLE$glClearDepthf;
    public final @nullable MethodHandle HANDLE$glClearStencil;
    public final @nullable MethodHandle HANDLE$glColorMask;
    public final @nullable MethodHandle HANDLE$glCompileShader;
    public final @nullable MethodHandle HANDLE$glCompressedTexImage2D;
    public final @nullable MethodHandle HANDLE$glCompressedTexSubImage2D;
    public final @nullable MethodHandle HANDLE$glCopyTexImage2D;
    public final @nullable MethodHandle HANDLE$glCopyTexSubImage2D;
    public final @nullable MethodHandle HANDLE$glCreateProgram;
    public final @nullable MethodHandle HANDLE$glCreateShader;
    public final @nullable MethodHandle HANDLE$glCullFace;
    public final @nullable MethodHandle HANDLE$glDeleteBuffers;
    public final @nullable MethodHandle HANDLE$glDeleteFramebuffers;
    public final @nullable MethodHandle HANDLE$glDeleteProgram;
    public final @nullable MethodHandle HANDLE$glDeleteRenderbuffers;
    public final @nullable MethodHandle HANDLE$glDeleteShader;
    public final @nullable MethodHandle HANDLE$glDeleteTextures;
    public final @nullable MethodHandle HANDLE$glDepthFunc;
    public final @nullable MethodHandle HANDLE$glDepthMask;
    public final @nullable MethodHandle HANDLE$glDepthRangef;
    public final @nullable MethodHandle HANDLE$glDetachShader;
    public final @nullable MethodHandle HANDLE$glDisable;
    public final @nullable MethodHandle HANDLE$glDisableVertexAttribArray;
    public final @nullable MethodHandle HANDLE$glDrawArrays;
    public final @nullable MethodHandle HANDLE$glDrawElements;
    public final @nullable MethodHandle HANDLE$glEnable;
    public final @nullable MethodHandle HANDLE$glEnableVertexAttribArray;
    public final @nullable MethodHandle HANDLE$glFinish;
    public final @nullable MethodHandle HANDLE$glFlush;
    public final @nullable MethodHandle HANDLE$glFramebufferRenderbuffer;
    public final @nullable MethodHandle HANDLE$glFramebufferTexture2D;
    public final @nullable MethodHandle HANDLE$glFrontFace;
    public final @nullable MethodHandle HANDLE$glGenBuffers;
    public final @nullable MethodHandle HANDLE$glGenerateMipmap;
    public final @nullable MethodHandle HANDLE$glGenFramebuffers;
    public final @nullable MethodHandle HANDLE$glGenRenderbuffers;
    public final @nullable MethodHandle HANDLE$glGenTextures;
    public final @nullable MethodHandle HANDLE$glGetActiveAttrib;
    public final @nullable MethodHandle HANDLE$glGetActiveUniform;
    public final @nullable MethodHandle HANDLE$glGetAttachedShaders;
    public final @nullable MethodHandle HANDLE$glGetAttribLocation;
    public final @nullable MethodHandle HANDLE$glGetBooleanv;
    public final @nullable MethodHandle HANDLE$glGetBufferParameteriv;
    public final @nullable MethodHandle HANDLE$glGetError;
    public final @nullable MethodHandle HANDLE$glGetFloatv;
    public final @nullable MethodHandle HANDLE$glGetFramebufferAttachmentParameteriv;
    public final @nullable MethodHandle HANDLE$glGetIntegerv;
    public final @nullable MethodHandle HANDLE$glGetProgramiv;
    public final @nullable MethodHandle HANDLE$glGetProgramInfoLog;
    public final @nullable MethodHandle HANDLE$glGetRenderbufferParameteriv;
    public final @nullable MethodHandle HANDLE$glGetShaderiv;
    public final @nullable MethodHandle HANDLE$glGetShaderInfoLog;
    public final @nullable MethodHandle HANDLE$glGetShaderPrecisionFormat;
    public final @nullable MethodHandle HANDLE$glGetShaderSource;
    public final @nullable MethodHandle HANDLE$glGetString;
    public final @nullable MethodHandle HANDLE$glGetTexParameterfv;
    public final @nullable MethodHandle HANDLE$glGetTexParameteriv;
    public final @nullable MethodHandle HANDLE$glGetUniformfv;
    public final @nullable MethodHandle HANDLE$glGetUniformiv;
    public final @nullable MethodHandle HANDLE$glGetUniformLocation;
    public final @nullable MethodHandle HANDLE$glGetVertexAttribfv;
    public final @nullable MethodHandle HANDLE$glGetVertexAttribiv;
    public final @nullable MethodHandle HANDLE$glGetVertexAttribPointerv;
    public final @nullable MethodHandle HANDLE$glHint;
    public final @nullable MethodHandle HANDLE$glIsBuffer;
    public final @nullable MethodHandle HANDLE$glIsEnabled;
    public final @nullable MethodHandle HANDLE$glIsFramebuffer;
    public final @nullable MethodHandle HANDLE$glIsProgram;
    public final @nullable MethodHandle HANDLE$glIsRenderbuffer;
    public final @nullable MethodHandle HANDLE$glIsShader;
    public final @nullable MethodHandle HANDLE$glIsTexture;
    public final @nullable MethodHandle HANDLE$glLineWidth;
    public final @nullable MethodHandle HANDLE$glLinkProgram;
    public final @nullable MethodHandle HANDLE$glPixelStorei;
    public final @nullable MethodHandle HANDLE$glPolygonOffset;
    public final @nullable MethodHandle HANDLE$glReadPixels;
    public final @nullable MethodHandle HANDLE$glReleaseShaderCompiler;
    public final @nullable MethodHandle HANDLE$glRenderbufferStorage;
    public final @nullable MethodHandle HANDLE$glSampleCoverage;
    public final @nullable MethodHandle HANDLE$glScissor;
    public final @nullable MethodHandle HANDLE$glShaderBinary;
    public final @nullable MethodHandle HANDLE$glShaderSource;
    public final @nullable MethodHandle HANDLE$glStencilFunc;
    public final @nullable MethodHandle HANDLE$glStencilFuncSeparate;
    public final @nullable MethodHandle HANDLE$glStencilMask;
    public final @nullable MethodHandle HANDLE$glStencilMaskSeparate;
    public final @nullable MethodHandle HANDLE$glStencilOp;
    public final @nullable MethodHandle HANDLE$glStencilOpSeparate;
    public final @nullable MethodHandle HANDLE$glTexImage2D;
    public final @nullable MethodHandle HANDLE$glTexParameterf;
    public final @nullable MethodHandle HANDLE$glTexParameterfv;
    public final @nullable MethodHandle HANDLE$glTexParameteri;
    public final @nullable MethodHandle HANDLE$glTexParameteriv;
    public final @nullable MethodHandle HANDLE$glTexSubImage2D;
    public final @nullable MethodHandle HANDLE$glUniform1f;
    public final @nullable MethodHandle HANDLE$glUniform1fv;
    public final @nullable MethodHandle HANDLE$glUniform1i;
    public final @nullable MethodHandle HANDLE$glUniform1iv;
    public final @nullable MethodHandle HANDLE$glUniform2f;
    public final @nullable MethodHandle HANDLE$glUniform2fv;
    public final @nullable MethodHandle HANDLE$glUniform2i;
    public final @nullable MethodHandle HANDLE$glUniform2iv;
    public final @nullable MethodHandle HANDLE$glUniform3f;
    public final @nullable MethodHandle HANDLE$glUniform3fv;
    public final @nullable MethodHandle HANDLE$glUniform3i;
    public final @nullable MethodHandle HANDLE$glUniform3iv;
    public final @nullable MethodHandle HANDLE$glUniform4f;
    public final @nullable MethodHandle HANDLE$glUniform4fv;
    public final @nullable MethodHandle HANDLE$glUniform4i;
    public final @nullable MethodHandle HANDLE$glUniform4iv;
    public final @nullable MethodHandle HANDLE$glUniformMatrix2fv;
    public final @nullable MethodHandle HANDLE$glUniformMatrix3fv;
    public final @nullable MethodHandle HANDLE$glUniformMatrix4fv;
    public final @nullable MethodHandle HANDLE$glUseProgram;
    public final @nullable MethodHandle HANDLE$glValidateProgram;
    public final @nullable MethodHandle HANDLE$glVertexAttrib1f;
    public final @nullable MethodHandle HANDLE$glVertexAttrib1fv;
    public final @nullable MethodHandle HANDLE$glVertexAttrib2f;
    public final @nullable MethodHandle HANDLE$glVertexAttrib2fv;
    public final @nullable MethodHandle HANDLE$glVertexAttrib3f;
    public final @nullable MethodHandle HANDLE$glVertexAttrib3fv;
    public final @nullable MethodHandle HANDLE$glVertexAttrib4f;
    public final @nullable MethodHandle HANDLE$glVertexAttrib4fv;
    public final @nullable MethodHandle HANDLE$glVertexAttribPointer;
    public final @nullable MethodHandle HANDLE$glViewport;

    public GLES2(FunctionLoader loader) {
        HANDLE$glActiveTexture = loader.apply("glActiveTexture", DESCRIPTOR$glActiveTexture);
        HANDLE$glAttachShader = loader.apply("glAttachShader", DESCRIPTOR$glAttachShader);
        HANDLE$glBindAttribLocation = loader.apply("glBindAttribLocation", DESCRIPTOR$glBindAttribLocation);
        HANDLE$glBindBuffer = loader.apply("glBindBuffer", DESCRIPTOR$glBindBuffer);
        HANDLE$glBindFramebuffer = loader.apply("glBindFramebuffer", DESCRIPTOR$glBindFramebuffer);
        HANDLE$glBindRenderbuffer = loader.apply("glBindRenderbuffer", DESCRIPTOR$glBindRenderbuffer);
        HANDLE$glBindTexture = loader.apply("glBindTexture", DESCRIPTOR$glBindTexture);
        HANDLE$glBlendColor = loader.apply("glBlendColor", DESCRIPTOR$glBlendColor);
        HANDLE$glBlendEquation = loader.apply("glBlendEquation", DESCRIPTOR$glBlendEquation);
        HANDLE$glBlendEquationSeparate = loader.apply("glBlendEquationSeparate", DESCRIPTOR$glBlendEquationSeparate);
        HANDLE$glBlendFunc = loader.apply("glBlendFunc", DESCRIPTOR$glBlendFunc);
        HANDLE$glBlendFuncSeparate = loader.apply("glBlendFuncSeparate", DESCRIPTOR$glBlendFuncSeparate);
        HANDLE$glBufferData = loader.apply("glBufferData", DESCRIPTOR$glBufferData);
        HANDLE$glBufferSubData = loader.apply("glBufferSubData", DESCRIPTOR$glBufferSubData);
        HANDLE$glCheckFramebufferStatus = loader.apply("glCheckFramebufferStatus", DESCRIPTOR$glCheckFramebufferStatus);
        HANDLE$glClear = loader.apply("glClear", DESCRIPTOR$glClear);
        HANDLE$glClearColor = loader.apply("glClearColor", DESCRIPTOR$glClearColor);
        HANDLE$glClearDepthf = loader.apply("glClearDepthf", DESCRIPTOR$glClearDepthf);
        HANDLE$glClearStencil = loader.apply("glClearStencil", DESCRIPTOR$glClearStencil);
        HANDLE$glColorMask = loader.apply("glColorMask", DESCRIPTOR$glColorMask);
        HANDLE$glCompileShader = loader.apply("glCompileShader", DESCRIPTOR$glCompileShader);
        HANDLE$glCompressedTexImage2D = loader.apply("glCompressedTexImage2D", DESCRIPTOR$glCompressedTexImage2D);
        HANDLE$glCompressedTexSubImage2D = loader.apply("glCompressedTexSubImage2D", DESCRIPTOR$glCompressedTexSubImage2D);
        HANDLE$glCopyTexImage2D = loader.apply("glCopyTexImage2D", DESCRIPTOR$glCopyTexImage2D);
        HANDLE$glCopyTexSubImage2D = loader.apply("glCopyTexSubImage2D", DESCRIPTOR$glCopyTexSubImage2D);
        HANDLE$glCreateProgram = loader.apply("glCreateProgram", DESCRIPTOR$glCreateProgram);
        HANDLE$glCreateShader = loader.apply("glCreateShader", DESCRIPTOR$glCreateShader);
        HANDLE$glCullFace = loader.apply("glCullFace", DESCRIPTOR$glCullFace);
        HANDLE$glDeleteBuffers = loader.apply("glDeleteBuffers", DESCRIPTOR$glDeleteBuffers);
        HANDLE$glDeleteFramebuffers = loader.apply("glDeleteFramebuffers", DESCRIPTOR$glDeleteFramebuffers);
        HANDLE$glDeleteProgram = loader.apply("glDeleteProgram", DESCRIPTOR$glDeleteProgram);
        HANDLE$glDeleteRenderbuffers = loader.apply("glDeleteRenderbuffers", DESCRIPTOR$glDeleteRenderbuffers);
        HANDLE$glDeleteShader = loader.apply("glDeleteShader", DESCRIPTOR$glDeleteShader);
        HANDLE$glDeleteTextures = loader.apply("glDeleteTextures", DESCRIPTOR$glDeleteTextures);
        HANDLE$glDepthFunc = loader.apply("glDepthFunc", DESCRIPTOR$glDepthFunc);
        HANDLE$glDepthMask = loader.apply("glDepthMask", DESCRIPTOR$glDepthMask);
        HANDLE$glDepthRangef = loader.apply("glDepthRangef", DESCRIPTOR$glDepthRangef);
        HANDLE$glDetachShader = loader.apply("glDetachShader", DESCRIPTOR$glDetachShader);
        HANDLE$glDisable = loader.apply("glDisable", DESCRIPTOR$glDisable);
        HANDLE$glDisableVertexAttribArray = loader.apply("glDisableVertexAttribArray", DESCRIPTOR$glDisableVertexAttribArray);
        HANDLE$glDrawArrays = loader.apply("glDrawArrays", DESCRIPTOR$glDrawArrays);
        HANDLE$glDrawElements = loader.apply("glDrawElements", DESCRIPTOR$glDrawElements);
        HANDLE$glEnable = loader.apply("glEnable", DESCRIPTOR$glEnable);
        HANDLE$glEnableVertexAttribArray = loader.apply("glEnableVertexAttribArray", DESCRIPTOR$glEnableVertexAttribArray);
        HANDLE$glFinish = loader.apply("glFinish", DESCRIPTOR$glFinish);
        HANDLE$glFlush = loader.apply("glFlush", DESCRIPTOR$glFlush);
        HANDLE$glFramebufferRenderbuffer = loader.apply("glFramebufferRenderbuffer", DESCRIPTOR$glFramebufferRenderbuffer);
        HANDLE$glFramebufferTexture2D = loader.apply("glFramebufferTexture2D", DESCRIPTOR$glFramebufferTexture2D);
        HANDLE$glFrontFace = loader.apply("glFrontFace", DESCRIPTOR$glFrontFace);
        HANDLE$glGenBuffers = loader.apply("glGenBuffers", DESCRIPTOR$glGenBuffers);
        HANDLE$glGenerateMipmap = loader.apply("glGenerateMipmap", DESCRIPTOR$glGenerateMipmap);
        HANDLE$glGenFramebuffers = loader.apply("glGenFramebuffers", DESCRIPTOR$glGenFramebuffers);
        HANDLE$glGenRenderbuffers = loader.apply("glGenRenderbuffers", DESCRIPTOR$glGenRenderbuffers);
        HANDLE$glGenTextures = loader.apply("glGenTextures", DESCRIPTOR$glGenTextures);
        HANDLE$glGetActiveAttrib = loader.apply("glGetActiveAttrib", DESCRIPTOR$glGetActiveAttrib);
        HANDLE$glGetActiveUniform = loader.apply("glGetActiveUniform", DESCRIPTOR$glGetActiveUniform);
        HANDLE$glGetAttachedShaders = loader.apply("glGetAttachedShaders", DESCRIPTOR$glGetAttachedShaders);
        HANDLE$glGetAttribLocation = loader.apply("glGetAttribLocation", DESCRIPTOR$glGetAttribLocation);
        HANDLE$glGetBooleanv = loader.apply("glGetBooleanv", DESCRIPTOR$glGetBooleanv);
        HANDLE$glGetBufferParameteriv = loader.apply("glGetBufferParameteriv", DESCRIPTOR$glGetBufferParameteriv);
        HANDLE$glGetError = loader.apply("glGetError", DESCRIPTOR$glGetError);
        HANDLE$glGetFloatv = loader.apply("glGetFloatv", DESCRIPTOR$glGetFloatv);
        HANDLE$glGetFramebufferAttachmentParameteriv = loader.apply("glGetFramebufferAttachmentParameteriv", DESCRIPTOR$glGetFramebufferAttachmentParameteriv);
        HANDLE$glGetIntegerv = loader.apply("glGetIntegerv", DESCRIPTOR$glGetIntegerv);
        HANDLE$glGetProgramiv = loader.apply("glGetProgramiv", DESCRIPTOR$glGetProgramiv);
        HANDLE$glGetProgramInfoLog = loader.apply("glGetProgramInfoLog", DESCRIPTOR$glGetProgramInfoLog);
        HANDLE$glGetRenderbufferParameteriv = loader.apply("glGetRenderbufferParameteriv", DESCRIPTOR$glGetRenderbufferParameteriv);
        HANDLE$glGetShaderiv = loader.apply("glGetShaderiv", DESCRIPTOR$glGetShaderiv);
        HANDLE$glGetShaderInfoLog = loader.apply("glGetShaderInfoLog", DESCRIPTOR$glGetShaderInfoLog);
        HANDLE$glGetShaderPrecisionFormat = loader.apply("glGetShaderPrecisionFormat", DESCRIPTOR$glGetShaderPrecisionFormat);
        HANDLE$glGetShaderSource = loader.apply("glGetShaderSource", DESCRIPTOR$glGetShaderSource);
        HANDLE$glGetString = loader.apply("glGetString", DESCRIPTOR$glGetString);
        HANDLE$glGetTexParameterfv = loader.apply("glGetTexParameterfv", DESCRIPTOR$glGetTexParameterfv);
        HANDLE$glGetTexParameteriv = loader.apply("glGetTexParameteriv", DESCRIPTOR$glGetTexParameteriv);
        HANDLE$glGetUniformfv = loader.apply("glGetUniformfv", DESCRIPTOR$glGetUniformfv);
        HANDLE$glGetUniformiv = loader.apply("glGetUniformiv", DESCRIPTOR$glGetUniformiv);
        HANDLE$glGetUniformLocation = loader.apply("glGetUniformLocation", DESCRIPTOR$glGetUniformLocation);
        HANDLE$glGetVertexAttribfv = loader.apply("glGetVertexAttribfv", DESCRIPTOR$glGetVertexAttribfv);
        HANDLE$glGetVertexAttribiv = loader.apply("glGetVertexAttribiv", DESCRIPTOR$glGetVertexAttribiv);
        HANDLE$glGetVertexAttribPointerv = loader.apply("glGetVertexAttribPointerv", DESCRIPTOR$glGetVertexAttribPointerv);
        HANDLE$glHint = loader.apply("glHint", DESCRIPTOR$glHint);
        HANDLE$glIsBuffer = loader.apply("glIsBuffer", DESCRIPTOR$glIsBuffer);
        HANDLE$glIsEnabled = loader.apply("glIsEnabled", DESCRIPTOR$glIsEnabled);
        HANDLE$glIsFramebuffer = loader.apply("glIsFramebuffer", DESCRIPTOR$glIsFramebuffer);
        HANDLE$glIsProgram = loader.apply("glIsProgram", DESCRIPTOR$glIsProgram);
        HANDLE$glIsRenderbuffer = loader.apply("glIsRenderbuffer", DESCRIPTOR$glIsRenderbuffer);
        HANDLE$glIsShader = loader.apply("glIsShader", DESCRIPTOR$glIsShader);
        HANDLE$glIsTexture = loader.apply("glIsTexture", DESCRIPTOR$glIsTexture);
        HANDLE$glLineWidth = loader.apply("glLineWidth", DESCRIPTOR$glLineWidth);
        HANDLE$glLinkProgram = loader.apply("glLinkProgram", DESCRIPTOR$glLinkProgram);
        HANDLE$glPixelStorei = loader.apply("glPixelStorei", DESCRIPTOR$glPixelStorei);
        HANDLE$glPolygonOffset = loader.apply("glPolygonOffset", DESCRIPTOR$glPolygonOffset);
        HANDLE$glReadPixels = loader.apply("glReadPixels", DESCRIPTOR$glReadPixels);
        HANDLE$glReleaseShaderCompiler = loader.apply("glReleaseShaderCompiler", DESCRIPTOR$glReleaseShaderCompiler);
        HANDLE$glRenderbufferStorage = loader.apply("glRenderbufferStorage", DESCRIPTOR$glRenderbufferStorage);
        HANDLE$glSampleCoverage = loader.apply("glSampleCoverage", DESCRIPTOR$glSampleCoverage);
        HANDLE$glScissor = loader.apply("glScissor", DESCRIPTOR$glScissor);
        HANDLE$glShaderBinary = loader.apply("glShaderBinary", DESCRIPTOR$glShaderBinary);
        HANDLE$glShaderSource = loader.apply("glShaderSource", DESCRIPTOR$glShaderSource);
        HANDLE$glStencilFunc = loader.apply("glStencilFunc", DESCRIPTOR$glStencilFunc);
        HANDLE$glStencilFuncSeparate = loader.apply("glStencilFuncSeparate", DESCRIPTOR$glStencilFuncSeparate);
        HANDLE$glStencilMask = loader.apply("glStencilMask", DESCRIPTOR$glStencilMask);
        HANDLE$glStencilMaskSeparate = loader.apply("glStencilMaskSeparate", DESCRIPTOR$glStencilMaskSeparate);
        HANDLE$glStencilOp = loader.apply("glStencilOp", DESCRIPTOR$glStencilOp);
        HANDLE$glStencilOpSeparate = loader.apply("glStencilOpSeparate", DESCRIPTOR$glStencilOpSeparate);
        HANDLE$glTexImage2D = loader.apply("glTexImage2D", DESCRIPTOR$glTexImage2D);
        HANDLE$glTexParameterf = loader.apply("glTexParameterf", DESCRIPTOR$glTexParameterf);
        HANDLE$glTexParameterfv = loader.apply("glTexParameterfv", DESCRIPTOR$glTexParameterfv);
        HANDLE$glTexParameteri = loader.apply("glTexParameteri", DESCRIPTOR$glTexParameteri);
        HANDLE$glTexParameteriv = loader.apply("glTexParameteriv", DESCRIPTOR$glTexParameteriv);
        HANDLE$glTexSubImage2D = loader.apply("glTexSubImage2D", DESCRIPTOR$glTexSubImage2D);
        HANDLE$glUniform1f = loader.apply("glUniform1f", DESCRIPTOR$glUniform1f);
        HANDLE$glUniform1fv = loader.apply("glUniform1fv", DESCRIPTOR$glUniform1fv);
        HANDLE$glUniform1i = loader.apply("glUniform1i", DESCRIPTOR$glUniform1i);
        HANDLE$glUniform1iv = loader.apply("glUniform1iv", DESCRIPTOR$glUniform1iv);
        HANDLE$glUniform2f = loader.apply("glUniform2f", DESCRIPTOR$glUniform2f);
        HANDLE$glUniform2fv = loader.apply("glUniform2fv", DESCRIPTOR$glUniform2fv);
        HANDLE$glUniform2i = loader.apply("glUniform2i", DESCRIPTOR$glUniform2i);
        HANDLE$glUniform2iv = loader.apply("glUniform2iv", DESCRIPTOR$glUniform2iv);
        HANDLE$glUniform3f = loader.apply("glUniform3f", DESCRIPTOR$glUniform3f);
        HANDLE$glUniform3fv = loader.apply("glUniform3fv", DESCRIPTOR$glUniform3fv);
        HANDLE$glUniform3i = loader.apply("glUniform3i", DESCRIPTOR$glUniform3i);
        HANDLE$glUniform3iv = loader.apply("glUniform3iv", DESCRIPTOR$glUniform3iv);
        HANDLE$glUniform4f = loader.apply("glUniform4f", DESCRIPTOR$glUniform4f);
        HANDLE$glUniform4fv = loader.apply("glUniform4fv", DESCRIPTOR$glUniform4fv);
        HANDLE$glUniform4i = loader.apply("glUniform4i", DESCRIPTOR$glUniform4i);
        HANDLE$glUniform4iv = loader.apply("glUniform4iv", DESCRIPTOR$glUniform4iv);
        HANDLE$glUniformMatrix2fv = loader.apply("glUniformMatrix2fv", DESCRIPTOR$glUniformMatrix2fv);
        HANDLE$glUniformMatrix3fv = loader.apply("glUniformMatrix3fv", DESCRIPTOR$glUniformMatrix3fv);
        HANDLE$glUniformMatrix4fv = loader.apply("glUniformMatrix4fv", DESCRIPTOR$glUniformMatrix4fv);
        HANDLE$glUseProgram = loader.apply("glUseProgram", DESCRIPTOR$glUseProgram);
        HANDLE$glValidateProgram = loader.apply("glValidateProgram", DESCRIPTOR$glValidateProgram);
        HANDLE$glVertexAttrib1f = loader.apply("glVertexAttrib1f", DESCRIPTOR$glVertexAttrib1f);
        HANDLE$glVertexAttrib1fv = loader.apply("glVertexAttrib1fv", DESCRIPTOR$glVertexAttrib1fv);
        HANDLE$glVertexAttrib2f = loader.apply("glVertexAttrib2f", DESCRIPTOR$glVertexAttrib2f);
        HANDLE$glVertexAttrib2fv = loader.apply("glVertexAttrib2fv", DESCRIPTOR$glVertexAttrib2fv);
        HANDLE$glVertexAttrib3f = loader.apply("glVertexAttrib3f", DESCRIPTOR$glVertexAttrib3f);
        HANDLE$glVertexAttrib3fv = loader.apply("glVertexAttrib3fv", DESCRIPTOR$glVertexAttrib3fv);
        HANDLE$glVertexAttrib4f = loader.apply("glVertexAttrib4f", DESCRIPTOR$glVertexAttrib4f);
        HANDLE$glVertexAttrib4fv = loader.apply("glVertexAttrib4fv", DESCRIPTOR$glVertexAttrib4fv);
        HANDLE$glVertexAttribPointer = loader.apply("glVertexAttribPointer", DESCRIPTOR$glVertexAttribPointer);
        HANDLE$glViewport = loader.apply("glViewport", DESCRIPTOR$glViewport);
    }
}
