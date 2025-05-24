package club.doki7.gles2;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;

public final class GLES2 {
    public GLES2(RawFunctionLoader loader) {
        SEGMENT$glActiveTexture = loader.apply("glActiveTexture");
        HANDLE$glActiveTexture = RawFunctionLoader.link(SEGMENT$glActiveTexture, Descriptors.DESCRIPTOR$glActiveTexture);
        SEGMENT$glAttachShader = loader.apply("glAttachShader");
        HANDLE$glAttachShader = RawFunctionLoader.link(SEGMENT$glAttachShader, Descriptors.DESCRIPTOR$glAttachShader);
        SEGMENT$glBindAttribLocation = loader.apply("glBindAttribLocation");
        HANDLE$glBindAttribLocation = RawFunctionLoader.link(SEGMENT$glBindAttribLocation, Descriptors.DESCRIPTOR$glBindAttribLocation);
        SEGMENT$glBindBuffer = loader.apply("glBindBuffer");
        HANDLE$glBindBuffer = RawFunctionLoader.link(SEGMENT$glBindBuffer, Descriptors.DESCRIPTOR$glBindBuffer);
        SEGMENT$glBindFramebuffer = loader.apply("glBindFramebuffer");
        HANDLE$glBindFramebuffer = RawFunctionLoader.link(SEGMENT$glBindFramebuffer, Descriptors.DESCRIPTOR$glBindFramebuffer);
        SEGMENT$glBindRenderbuffer = loader.apply("glBindRenderbuffer");
        HANDLE$glBindRenderbuffer = RawFunctionLoader.link(SEGMENT$glBindRenderbuffer, Descriptors.DESCRIPTOR$glBindRenderbuffer);
        SEGMENT$glBindTexture = loader.apply("glBindTexture");
        HANDLE$glBindTexture = RawFunctionLoader.link(SEGMENT$glBindTexture, Descriptors.DESCRIPTOR$glBindTexture);
        SEGMENT$glBlendColor = loader.apply("glBlendColor");
        HANDLE$glBlendColor = RawFunctionLoader.link(SEGMENT$glBlendColor, Descriptors.DESCRIPTOR$glBlendColor);
        SEGMENT$glBlendEquation = loader.apply("glBlendEquation");
        HANDLE$glBlendEquation = RawFunctionLoader.link(SEGMENT$glBlendEquation, Descriptors.DESCRIPTOR$glBlendEquation);
        SEGMENT$glBlendEquationSeparate = loader.apply("glBlendEquationSeparate");
        HANDLE$glBlendEquationSeparate = RawFunctionLoader.link(SEGMENT$glBlendEquationSeparate, Descriptors.DESCRIPTOR$glBlendEquationSeparate);
        SEGMENT$glBlendFunc = loader.apply("glBlendFunc");
        HANDLE$glBlendFunc = RawFunctionLoader.link(SEGMENT$glBlendFunc, Descriptors.DESCRIPTOR$glBlendFunc);
        SEGMENT$glBlendFuncSeparate = loader.apply("glBlendFuncSeparate");
        HANDLE$glBlendFuncSeparate = RawFunctionLoader.link(SEGMENT$glBlendFuncSeparate, Descriptors.DESCRIPTOR$glBlendFuncSeparate);
        SEGMENT$glBufferData = loader.apply("glBufferData");
        HANDLE$glBufferData = RawFunctionLoader.link(SEGMENT$glBufferData, Descriptors.DESCRIPTOR$glBufferData);
        SEGMENT$glBufferSubData = loader.apply("glBufferSubData");
        HANDLE$glBufferSubData = RawFunctionLoader.link(SEGMENT$glBufferSubData, Descriptors.DESCRIPTOR$glBufferSubData);
        SEGMENT$glCheckFramebufferStatus = loader.apply("glCheckFramebufferStatus");
        HANDLE$glCheckFramebufferStatus = RawFunctionLoader.link(SEGMENT$glCheckFramebufferStatus, Descriptors.DESCRIPTOR$glCheckFramebufferStatus);
        SEGMENT$glClear = loader.apply("glClear");
        HANDLE$glClear = RawFunctionLoader.link(SEGMENT$glClear, Descriptors.DESCRIPTOR$glClear);
        SEGMENT$glClearColor = loader.apply("glClearColor");
        HANDLE$glClearColor = RawFunctionLoader.link(SEGMENT$glClearColor, Descriptors.DESCRIPTOR$glClearColor);
        SEGMENT$glClearDepthf = loader.apply("glClearDepthf");
        HANDLE$glClearDepthf = RawFunctionLoader.link(SEGMENT$glClearDepthf, Descriptors.DESCRIPTOR$glClearDepthf);
        SEGMENT$glClearStencil = loader.apply("glClearStencil");
        HANDLE$glClearStencil = RawFunctionLoader.link(SEGMENT$glClearStencil, Descriptors.DESCRIPTOR$glClearStencil);
        SEGMENT$glColorMask = loader.apply("glColorMask");
        HANDLE$glColorMask = RawFunctionLoader.link(SEGMENT$glColorMask, Descriptors.DESCRIPTOR$glColorMask);
        SEGMENT$glCompileShader = loader.apply("glCompileShader");
        HANDLE$glCompileShader = RawFunctionLoader.link(SEGMENT$glCompileShader, Descriptors.DESCRIPTOR$glCompileShader);
        SEGMENT$glCompressedTexImage2D = loader.apply("glCompressedTexImage2D");
        HANDLE$glCompressedTexImage2D = RawFunctionLoader.link(SEGMENT$glCompressedTexImage2D, Descriptors.DESCRIPTOR$glCompressedTexImage2D);
        SEGMENT$glCompressedTexSubImage2D = loader.apply("glCompressedTexSubImage2D");
        HANDLE$glCompressedTexSubImage2D = RawFunctionLoader.link(SEGMENT$glCompressedTexSubImage2D, Descriptors.DESCRIPTOR$glCompressedTexSubImage2D);
        SEGMENT$glCopyTexImage2D = loader.apply("glCopyTexImage2D");
        HANDLE$glCopyTexImage2D = RawFunctionLoader.link(SEGMENT$glCopyTexImage2D, Descriptors.DESCRIPTOR$glCopyTexImage2D);
        SEGMENT$glCopyTexSubImage2D = loader.apply("glCopyTexSubImage2D");
        HANDLE$glCopyTexSubImage2D = RawFunctionLoader.link(SEGMENT$glCopyTexSubImage2D, Descriptors.DESCRIPTOR$glCopyTexSubImage2D);
        SEGMENT$glCreateProgram = loader.apply("glCreateProgram");
        HANDLE$glCreateProgram = RawFunctionLoader.link(SEGMENT$glCreateProgram, Descriptors.DESCRIPTOR$glCreateProgram);
        SEGMENT$glCreateShader = loader.apply("glCreateShader");
        HANDLE$glCreateShader = RawFunctionLoader.link(SEGMENT$glCreateShader, Descriptors.DESCRIPTOR$glCreateShader);
        SEGMENT$glCullFace = loader.apply("glCullFace");
        HANDLE$glCullFace = RawFunctionLoader.link(SEGMENT$glCullFace, Descriptors.DESCRIPTOR$glCullFace);
        SEGMENT$glDeleteBuffers = loader.apply("glDeleteBuffers");
        HANDLE$glDeleteBuffers = RawFunctionLoader.link(SEGMENT$glDeleteBuffers, Descriptors.DESCRIPTOR$glDeleteBuffers);
        SEGMENT$glDeleteFramebuffers = loader.apply("glDeleteFramebuffers");
        HANDLE$glDeleteFramebuffers = RawFunctionLoader.link(SEGMENT$glDeleteFramebuffers, Descriptors.DESCRIPTOR$glDeleteFramebuffers);
        SEGMENT$glDeleteProgram = loader.apply("glDeleteProgram");
        HANDLE$glDeleteProgram = RawFunctionLoader.link(SEGMENT$glDeleteProgram, Descriptors.DESCRIPTOR$glDeleteProgram);
        SEGMENT$glDeleteRenderbuffers = loader.apply("glDeleteRenderbuffers");
        HANDLE$glDeleteRenderbuffers = RawFunctionLoader.link(SEGMENT$glDeleteRenderbuffers, Descriptors.DESCRIPTOR$glDeleteRenderbuffers);
        SEGMENT$glDeleteShader = loader.apply("glDeleteShader");
        HANDLE$glDeleteShader = RawFunctionLoader.link(SEGMENT$glDeleteShader, Descriptors.DESCRIPTOR$glDeleteShader);
        SEGMENT$glDeleteTextures = loader.apply("glDeleteTextures");
        HANDLE$glDeleteTextures = RawFunctionLoader.link(SEGMENT$glDeleteTextures, Descriptors.DESCRIPTOR$glDeleteTextures);
        SEGMENT$glDepthFunc = loader.apply("glDepthFunc");
        HANDLE$glDepthFunc = RawFunctionLoader.link(SEGMENT$glDepthFunc, Descriptors.DESCRIPTOR$glDepthFunc);
        SEGMENT$glDepthMask = loader.apply("glDepthMask");
        HANDLE$glDepthMask = RawFunctionLoader.link(SEGMENT$glDepthMask, Descriptors.DESCRIPTOR$glDepthMask);
        SEGMENT$glDepthRangef = loader.apply("glDepthRangef");
        HANDLE$glDepthRangef = RawFunctionLoader.link(SEGMENT$glDepthRangef, Descriptors.DESCRIPTOR$glDepthRangef);
        SEGMENT$glDetachShader = loader.apply("glDetachShader");
        HANDLE$glDetachShader = RawFunctionLoader.link(SEGMENT$glDetachShader, Descriptors.DESCRIPTOR$glDetachShader);
        SEGMENT$glDisable = loader.apply("glDisable");
        HANDLE$glDisable = RawFunctionLoader.link(SEGMENT$glDisable, Descriptors.DESCRIPTOR$glDisable);
        SEGMENT$glDisableVertexAttribArray = loader.apply("glDisableVertexAttribArray");
        HANDLE$glDisableVertexAttribArray = RawFunctionLoader.link(SEGMENT$glDisableVertexAttribArray, Descriptors.DESCRIPTOR$glDisableVertexAttribArray);
        SEGMENT$glDrawArrays = loader.apply("glDrawArrays");
        HANDLE$glDrawArrays = RawFunctionLoader.link(SEGMENT$glDrawArrays, Descriptors.DESCRIPTOR$glDrawArrays);
        SEGMENT$glDrawElements = loader.apply("glDrawElements");
        HANDLE$glDrawElements = RawFunctionLoader.link(SEGMENT$glDrawElements, Descriptors.DESCRIPTOR$glDrawElements);
        SEGMENT$glEnable = loader.apply("glEnable");
        HANDLE$glEnable = RawFunctionLoader.link(SEGMENT$glEnable, Descriptors.DESCRIPTOR$glEnable);
        SEGMENT$glEnableVertexAttribArray = loader.apply("glEnableVertexAttribArray");
        HANDLE$glEnableVertexAttribArray = RawFunctionLoader.link(SEGMENT$glEnableVertexAttribArray, Descriptors.DESCRIPTOR$glEnableVertexAttribArray);
        SEGMENT$glFinish = loader.apply("glFinish");
        HANDLE$glFinish = RawFunctionLoader.link(SEGMENT$glFinish, Descriptors.DESCRIPTOR$glFinish);
        SEGMENT$glFlush = loader.apply("glFlush");
        HANDLE$glFlush = RawFunctionLoader.link(SEGMENT$glFlush, Descriptors.DESCRIPTOR$glFlush);
        SEGMENT$glFramebufferRenderbuffer = loader.apply("glFramebufferRenderbuffer");
        HANDLE$glFramebufferRenderbuffer = RawFunctionLoader.link(SEGMENT$glFramebufferRenderbuffer, Descriptors.DESCRIPTOR$glFramebufferRenderbuffer);
        SEGMENT$glFramebufferTexture2D = loader.apply("glFramebufferTexture2D");
        HANDLE$glFramebufferTexture2D = RawFunctionLoader.link(SEGMENT$glFramebufferTexture2D, Descriptors.DESCRIPTOR$glFramebufferTexture2D);
        SEGMENT$glFrontFace = loader.apply("glFrontFace");
        HANDLE$glFrontFace = RawFunctionLoader.link(SEGMENT$glFrontFace, Descriptors.DESCRIPTOR$glFrontFace);
        SEGMENT$glGenBuffers = loader.apply("glGenBuffers");
        HANDLE$glGenBuffers = RawFunctionLoader.link(SEGMENT$glGenBuffers, Descriptors.DESCRIPTOR$glGenBuffers);
        SEGMENT$glGenFramebuffers = loader.apply("glGenFramebuffers");
        HANDLE$glGenFramebuffers = RawFunctionLoader.link(SEGMENT$glGenFramebuffers, Descriptors.DESCRIPTOR$glGenFramebuffers);
        SEGMENT$glGenRenderbuffers = loader.apply("glGenRenderbuffers");
        HANDLE$glGenRenderbuffers = RawFunctionLoader.link(SEGMENT$glGenRenderbuffers, Descriptors.DESCRIPTOR$glGenRenderbuffers);
        SEGMENT$glGenTextures = loader.apply("glGenTextures");
        HANDLE$glGenTextures = RawFunctionLoader.link(SEGMENT$glGenTextures, Descriptors.DESCRIPTOR$glGenTextures);
        SEGMENT$glGenerateMipmap = loader.apply("glGenerateMipmap");
        HANDLE$glGenerateMipmap = RawFunctionLoader.link(SEGMENT$glGenerateMipmap, Descriptors.DESCRIPTOR$glGenerateMipmap);
        SEGMENT$glGetActiveAttrib = loader.apply("glGetActiveAttrib");
        HANDLE$glGetActiveAttrib = RawFunctionLoader.link(SEGMENT$glGetActiveAttrib, Descriptors.DESCRIPTOR$glGetActiveAttrib);
        SEGMENT$glGetActiveUniform = loader.apply("glGetActiveUniform");
        HANDLE$glGetActiveUniform = RawFunctionLoader.link(SEGMENT$glGetActiveUniform, Descriptors.DESCRIPTOR$glGetActiveUniform);
        SEGMENT$glGetAttachedShaders = loader.apply("glGetAttachedShaders");
        HANDLE$glGetAttachedShaders = RawFunctionLoader.link(SEGMENT$glGetAttachedShaders, Descriptors.DESCRIPTOR$glGetAttachedShaders);
        SEGMENT$glGetAttribLocation = loader.apply("glGetAttribLocation");
        HANDLE$glGetAttribLocation = RawFunctionLoader.link(SEGMENT$glGetAttribLocation, Descriptors.DESCRIPTOR$glGetAttribLocation);
        SEGMENT$glGetBooleanv = loader.apply("glGetBooleanv");
        HANDLE$glGetBooleanv = RawFunctionLoader.link(SEGMENT$glGetBooleanv, Descriptors.DESCRIPTOR$glGetBooleanv);
        SEGMENT$glGetBufferParameteriv = loader.apply("glGetBufferParameteriv");
        HANDLE$glGetBufferParameteriv = RawFunctionLoader.link(SEGMENT$glGetBufferParameteriv, Descriptors.DESCRIPTOR$glGetBufferParameteriv);
        SEGMENT$glGetError = loader.apply("glGetError");
        HANDLE$glGetError = RawFunctionLoader.link(SEGMENT$glGetError, Descriptors.DESCRIPTOR$glGetError);
        SEGMENT$glGetFloatv = loader.apply("glGetFloatv");
        HANDLE$glGetFloatv = RawFunctionLoader.link(SEGMENT$glGetFloatv, Descriptors.DESCRIPTOR$glGetFloatv);
        SEGMENT$glGetFramebufferAttachmentParameteriv = loader.apply("glGetFramebufferAttachmentParameteriv");
        HANDLE$glGetFramebufferAttachmentParameteriv = RawFunctionLoader.link(SEGMENT$glGetFramebufferAttachmentParameteriv, Descriptors.DESCRIPTOR$glGetFramebufferAttachmentParameteriv);
        SEGMENT$glGetIntegerv = loader.apply("glGetIntegerv");
        HANDLE$glGetIntegerv = RawFunctionLoader.link(SEGMENT$glGetIntegerv, Descriptors.DESCRIPTOR$glGetIntegerv);
        SEGMENT$glGetProgramInfoLog = loader.apply("glGetProgramInfoLog");
        HANDLE$glGetProgramInfoLog = RawFunctionLoader.link(SEGMENT$glGetProgramInfoLog, Descriptors.DESCRIPTOR$glGetProgramInfoLog);
        SEGMENT$glGetProgramiv = loader.apply("glGetProgramiv");
        HANDLE$glGetProgramiv = RawFunctionLoader.link(SEGMENT$glGetProgramiv, Descriptors.DESCRIPTOR$glGetProgramiv);
        SEGMENT$glGetRenderbufferParameteriv = loader.apply("glGetRenderbufferParameteriv");
        HANDLE$glGetRenderbufferParameteriv = RawFunctionLoader.link(SEGMENT$glGetRenderbufferParameteriv, Descriptors.DESCRIPTOR$glGetRenderbufferParameteriv);
        SEGMENT$glGetShaderInfoLog = loader.apply("glGetShaderInfoLog");
        HANDLE$glGetShaderInfoLog = RawFunctionLoader.link(SEGMENT$glGetShaderInfoLog, Descriptors.DESCRIPTOR$glGetShaderInfoLog);
        SEGMENT$glGetShaderPrecisionFormat = loader.apply("glGetShaderPrecisionFormat");
        HANDLE$glGetShaderPrecisionFormat = RawFunctionLoader.link(SEGMENT$glGetShaderPrecisionFormat, Descriptors.DESCRIPTOR$glGetShaderPrecisionFormat);
        SEGMENT$glGetShaderSource = loader.apply("glGetShaderSource");
        HANDLE$glGetShaderSource = RawFunctionLoader.link(SEGMENT$glGetShaderSource, Descriptors.DESCRIPTOR$glGetShaderSource);
        SEGMENT$glGetShaderiv = loader.apply("glGetShaderiv");
        HANDLE$glGetShaderiv = RawFunctionLoader.link(SEGMENT$glGetShaderiv, Descriptors.DESCRIPTOR$glGetShaderiv);
        SEGMENT$glGetString = loader.apply("glGetString");
        HANDLE$glGetString = RawFunctionLoader.link(SEGMENT$glGetString, Descriptors.DESCRIPTOR$glGetString);
        SEGMENT$glGetTexParameterfv = loader.apply("glGetTexParameterfv");
        HANDLE$glGetTexParameterfv = RawFunctionLoader.link(SEGMENT$glGetTexParameterfv, Descriptors.DESCRIPTOR$glGetTexParameterfv);
        SEGMENT$glGetTexParameteriv = loader.apply("glGetTexParameteriv");
        HANDLE$glGetTexParameteriv = RawFunctionLoader.link(SEGMENT$glGetTexParameteriv, Descriptors.DESCRIPTOR$glGetTexParameteriv);
        SEGMENT$glGetUniformLocation = loader.apply("glGetUniformLocation");
        HANDLE$glGetUniformLocation = RawFunctionLoader.link(SEGMENT$glGetUniformLocation, Descriptors.DESCRIPTOR$glGetUniformLocation);
        SEGMENT$glGetUniformfv = loader.apply("glGetUniformfv");
        HANDLE$glGetUniformfv = RawFunctionLoader.link(SEGMENT$glGetUniformfv, Descriptors.DESCRIPTOR$glGetUniformfv);
        SEGMENT$glGetUniformiv = loader.apply("glGetUniformiv");
        HANDLE$glGetUniformiv = RawFunctionLoader.link(SEGMENT$glGetUniformiv, Descriptors.DESCRIPTOR$glGetUniformiv);
        SEGMENT$glGetVertexAttribPointerv = loader.apply("glGetVertexAttribPointerv");
        HANDLE$glGetVertexAttribPointerv = RawFunctionLoader.link(SEGMENT$glGetVertexAttribPointerv, Descriptors.DESCRIPTOR$glGetVertexAttribPointerv);
        SEGMENT$glGetVertexAttribfv = loader.apply("glGetVertexAttribfv");
        HANDLE$glGetVertexAttribfv = RawFunctionLoader.link(SEGMENT$glGetVertexAttribfv, Descriptors.DESCRIPTOR$glGetVertexAttribfv);
        SEGMENT$glGetVertexAttribiv = loader.apply("glGetVertexAttribiv");
        HANDLE$glGetVertexAttribiv = RawFunctionLoader.link(SEGMENT$glGetVertexAttribiv, Descriptors.DESCRIPTOR$glGetVertexAttribiv);
        SEGMENT$glHint = loader.apply("glHint");
        HANDLE$glHint = RawFunctionLoader.link(SEGMENT$glHint, Descriptors.DESCRIPTOR$glHint);
        SEGMENT$glIsBuffer = loader.apply("glIsBuffer");
        HANDLE$glIsBuffer = RawFunctionLoader.link(SEGMENT$glIsBuffer, Descriptors.DESCRIPTOR$glIsBuffer);
        SEGMENT$glIsEnabled = loader.apply("glIsEnabled");
        HANDLE$glIsEnabled = RawFunctionLoader.link(SEGMENT$glIsEnabled, Descriptors.DESCRIPTOR$glIsEnabled);
        SEGMENT$glIsFramebuffer = loader.apply("glIsFramebuffer");
        HANDLE$glIsFramebuffer = RawFunctionLoader.link(SEGMENT$glIsFramebuffer, Descriptors.DESCRIPTOR$glIsFramebuffer);
        SEGMENT$glIsProgram = loader.apply("glIsProgram");
        HANDLE$glIsProgram = RawFunctionLoader.link(SEGMENT$glIsProgram, Descriptors.DESCRIPTOR$glIsProgram);
        SEGMENT$glIsRenderbuffer = loader.apply("glIsRenderbuffer");
        HANDLE$glIsRenderbuffer = RawFunctionLoader.link(SEGMENT$glIsRenderbuffer, Descriptors.DESCRIPTOR$glIsRenderbuffer);
        SEGMENT$glIsShader = loader.apply("glIsShader");
        HANDLE$glIsShader = RawFunctionLoader.link(SEGMENT$glIsShader, Descriptors.DESCRIPTOR$glIsShader);
        SEGMENT$glIsTexture = loader.apply("glIsTexture");
        HANDLE$glIsTexture = RawFunctionLoader.link(SEGMENT$glIsTexture, Descriptors.DESCRIPTOR$glIsTexture);
        SEGMENT$glLineWidth = loader.apply("glLineWidth");
        HANDLE$glLineWidth = RawFunctionLoader.link(SEGMENT$glLineWidth, Descriptors.DESCRIPTOR$glLineWidth);
        SEGMENT$glLinkProgram = loader.apply("glLinkProgram");
        HANDLE$glLinkProgram = RawFunctionLoader.link(SEGMENT$glLinkProgram, Descriptors.DESCRIPTOR$glLinkProgram);
        SEGMENT$glPixelStorei = loader.apply("glPixelStorei");
        HANDLE$glPixelStorei = RawFunctionLoader.link(SEGMENT$glPixelStorei, Descriptors.DESCRIPTOR$glPixelStorei);
        SEGMENT$glPolygonOffset = loader.apply("glPolygonOffset");
        HANDLE$glPolygonOffset = RawFunctionLoader.link(SEGMENT$glPolygonOffset, Descriptors.DESCRIPTOR$glPolygonOffset);
        SEGMENT$glReadPixels = loader.apply("glReadPixels");
        HANDLE$glReadPixels = RawFunctionLoader.link(SEGMENT$glReadPixels, Descriptors.DESCRIPTOR$glReadPixels);
        SEGMENT$glReleaseShaderCompiler = loader.apply("glReleaseShaderCompiler");
        HANDLE$glReleaseShaderCompiler = RawFunctionLoader.link(SEGMENT$glReleaseShaderCompiler, Descriptors.DESCRIPTOR$glReleaseShaderCompiler);
        SEGMENT$glRenderbufferStorage = loader.apply("glRenderbufferStorage");
        HANDLE$glRenderbufferStorage = RawFunctionLoader.link(SEGMENT$glRenderbufferStorage, Descriptors.DESCRIPTOR$glRenderbufferStorage);
        SEGMENT$glSampleCoverage = loader.apply("glSampleCoverage");
        HANDLE$glSampleCoverage = RawFunctionLoader.link(SEGMENT$glSampleCoverage, Descriptors.DESCRIPTOR$glSampleCoverage);
        SEGMENT$glScissor = loader.apply("glScissor");
        HANDLE$glScissor = RawFunctionLoader.link(SEGMENT$glScissor, Descriptors.DESCRIPTOR$glScissor);
        SEGMENT$glShaderBinary = loader.apply("glShaderBinary");
        HANDLE$glShaderBinary = RawFunctionLoader.link(SEGMENT$glShaderBinary, Descriptors.DESCRIPTOR$glShaderBinary);
        SEGMENT$glShaderSource = loader.apply("glShaderSource");
        HANDLE$glShaderSource = RawFunctionLoader.link(SEGMENT$glShaderSource, Descriptors.DESCRIPTOR$glShaderSource);
        SEGMENT$glStencilFunc = loader.apply("glStencilFunc");
        HANDLE$glStencilFunc = RawFunctionLoader.link(SEGMENT$glStencilFunc, Descriptors.DESCRIPTOR$glStencilFunc);
        SEGMENT$glStencilFuncSeparate = loader.apply("glStencilFuncSeparate");
        HANDLE$glStencilFuncSeparate = RawFunctionLoader.link(SEGMENT$glStencilFuncSeparate, Descriptors.DESCRIPTOR$glStencilFuncSeparate);
        SEGMENT$glStencilMask = loader.apply("glStencilMask");
        HANDLE$glStencilMask = RawFunctionLoader.link(SEGMENT$glStencilMask, Descriptors.DESCRIPTOR$glStencilMask);
        SEGMENT$glStencilMaskSeparate = loader.apply("glStencilMaskSeparate");
        HANDLE$glStencilMaskSeparate = RawFunctionLoader.link(SEGMENT$glStencilMaskSeparate, Descriptors.DESCRIPTOR$glStencilMaskSeparate);
        SEGMENT$glStencilOp = loader.apply("glStencilOp");
        HANDLE$glStencilOp = RawFunctionLoader.link(SEGMENT$glStencilOp, Descriptors.DESCRIPTOR$glStencilOp);
        SEGMENT$glStencilOpSeparate = loader.apply("glStencilOpSeparate");
        HANDLE$glStencilOpSeparate = RawFunctionLoader.link(SEGMENT$glStencilOpSeparate, Descriptors.DESCRIPTOR$glStencilOpSeparate);
        SEGMENT$glTexImage2D = loader.apply("glTexImage2D");
        HANDLE$glTexImage2D = RawFunctionLoader.link(SEGMENT$glTexImage2D, Descriptors.DESCRIPTOR$glTexImage2D);
        SEGMENT$glTexParameterf = loader.apply("glTexParameterf");
        HANDLE$glTexParameterf = RawFunctionLoader.link(SEGMENT$glTexParameterf, Descriptors.DESCRIPTOR$glTexParameterf);
        SEGMENT$glTexParameterfv = loader.apply("glTexParameterfv");
        HANDLE$glTexParameterfv = RawFunctionLoader.link(SEGMENT$glTexParameterfv, Descriptors.DESCRIPTOR$glTexParameterfv);
        SEGMENT$glTexParameteri = loader.apply("glTexParameteri");
        HANDLE$glTexParameteri = RawFunctionLoader.link(SEGMENT$glTexParameteri, Descriptors.DESCRIPTOR$glTexParameteri);
        SEGMENT$glTexParameteriv = loader.apply("glTexParameteriv");
        HANDLE$glTexParameteriv = RawFunctionLoader.link(SEGMENT$glTexParameteriv, Descriptors.DESCRIPTOR$glTexParameteriv);
        SEGMENT$glTexSubImage2D = loader.apply("glTexSubImage2D");
        HANDLE$glTexSubImage2D = RawFunctionLoader.link(SEGMENT$glTexSubImage2D, Descriptors.DESCRIPTOR$glTexSubImage2D);
        SEGMENT$glUniform1f = loader.apply("glUniform1f");
        HANDLE$glUniform1f = RawFunctionLoader.link(SEGMENT$glUniform1f, Descriptors.DESCRIPTOR$glUniform1f);
        SEGMENT$glUniform1fv = loader.apply("glUniform1fv");
        HANDLE$glUniform1fv = RawFunctionLoader.link(SEGMENT$glUniform1fv, Descriptors.DESCRIPTOR$glUniform1fv);
        SEGMENT$glUniform1i = loader.apply("glUniform1i");
        HANDLE$glUniform1i = RawFunctionLoader.link(SEGMENT$glUniform1i, Descriptors.DESCRIPTOR$glUniform1i);
        SEGMENT$glUniform1iv = loader.apply("glUniform1iv");
        HANDLE$glUniform1iv = RawFunctionLoader.link(SEGMENT$glUniform1iv, Descriptors.DESCRIPTOR$glUniform1iv);
        SEGMENT$glUniform2f = loader.apply("glUniform2f");
        HANDLE$glUniform2f = RawFunctionLoader.link(SEGMENT$glUniform2f, Descriptors.DESCRIPTOR$glUniform2f);
        SEGMENT$glUniform2fv = loader.apply("glUniform2fv");
        HANDLE$glUniform2fv = RawFunctionLoader.link(SEGMENT$glUniform2fv, Descriptors.DESCRIPTOR$glUniform2fv);
        SEGMENT$glUniform2i = loader.apply("glUniform2i");
        HANDLE$glUniform2i = RawFunctionLoader.link(SEGMENT$glUniform2i, Descriptors.DESCRIPTOR$glUniform2i);
        SEGMENT$glUniform2iv = loader.apply("glUniform2iv");
        HANDLE$glUniform2iv = RawFunctionLoader.link(SEGMENT$glUniform2iv, Descriptors.DESCRIPTOR$glUniform2iv);
        SEGMENT$glUniform3f = loader.apply("glUniform3f");
        HANDLE$glUniform3f = RawFunctionLoader.link(SEGMENT$glUniform3f, Descriptors.DESCRIPTOR$glUniform3f);
        SEGMENT$glUniform3fv = loader.apply("glUniform3fv");
        HANDLE$glUniform3fv = RawFunctionLoader.link(SEGMENT$glUniform3fv, Descriptors.DESCRIPTOR$glUniform3fv);
        SEGMENT$glUniform3i = loader.apply("glUniform3i");
        HANDLE$glUniform3i = RawFunctionLoader.link(SEGMENT$glUniform3i, Descriptors.DESCRIPTOR$glUniform3i);
        SEGMENT$glUniform3iv = loader.apply("glUniform3iv");
        HANDLE$glUniform3iv = RawFunctionLoader.link(SEGMENT$glUniform3iv, Descriptors.DESCRIPTOR$glUniform3iv);
        SEGMENT$glUniform4f = loader.apply("glUniform4f");
        HANDLE$glUniform4f = RawFunctionLoader.link(SEGMENT$glUniform4f, Descriptors.DESCRIPTOR$glUniform4f);
        SEGMENT$glUniform4fv = loader.apply("glUniform4fv");
        HANDLE$glUniform4fv = RawFunctionLoader.link(SEGMENT$glUniform4fv, Descriptors.DESCRIPTOR$glUniform4fv);
        SEGMENT$glUniform4i = loader.apply("glUniform4i");
        HANDLE$glUniform4i = RawFunctionLoader.link(SEGMENT$glUniform4i, Descriptors.DESCRIPTOR$glUniform4i);
        SEGMENT$glUniform4iv = loader.apply("glUniform4iv");
        HANDLE$glUniform4iv = RawFunctionLoader.link(SEGMENT$glUniform4iv, Descriptors.DESCRIPTOR$glUniform4iv);
        SEGMENT$glUniformMatrix2fv = loader.apply("glUniformMatrix2fv");
        HANDLE$glUniformMatrix2fv = RawFunctionLoader.link(SEGMENT$glUniformMatrix2fv, Descriptors.DESCRIPTOR$glUniformMatrix2fv);
        SEGMENT$glUniformMatrix3fv = loader.apply("glUniformMatrix3fv");
        HANDLE$glUniformMatrix3fv = RawFunctionLoader.link(SEGMENT$glUniformMatrix3fv, Descriptors.DESCRIPTOR$glUniformMatrix3fv);
        SEGMENT$glUniformMatrix4fv = loader.apply("glUniformMatrix4fv");
        HANDLE$glUniformMatrix4fv = RawFunctionLoader.link(SEGMENT$glUniformMatrix4fv, Descriptors.DESCRIPTOR$glUniformMatrix4fv);
        SEGMENT$glUseProgram = loader.apply("glUseProgram");
        HANDLE$glUseProgram = RawFunctionLoader.link(SEGMENT$glUseProgram, Descriptors.DESCRIPTOR$glUseProgram);
        SEGMENT$glValidateProgram = loader.apply("glValidateProgram");
        HANDLE$glValidateProgram = RawFunctionLoader.link(SEGMENT$glValidateProgram, Descriptors.DESCRIPTOR$glValidateProgram);
        SEGMENT$glVertexAttrib1f = loader.apply("glVertexAttrib1f");
        HANDLE$glVertexAttrib1f = RawFunctionLoader.link(SEGMENT$glVertexAttrib1f, Descriptors.DESCRIPTOR$glVertexAttrib1f);
        SEGMENT$glVertexAttrib1fv = loader.apply("glVertexAttrib1fv");
        HANDLE$glVertexAttrib1fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib1fv, Descriptors.DESCRIPTOR$glVertexAttrib1fv);
        SEGMENT$glVertexAttrib2f = loader.apply("glVertexAttrib2f");
        HANDLE$glVertexAttrib2f = RawFunctionLoader.link(SEGMENT$glVertexAttrib2f, Descriptors.DESCRIPTOR$glVertexAttrib2f);
        SEGMENT$glVertexAttrib2fv = loader.apply("glVertexAttrib2fv");
        HANDLE$glVertexAttrib2fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib2fv, Descriptors.DESCRIPTOR$glVertexAttrib2fv);
        SEGMENT$glVertexAttrib3f = loader.apply("glVertexAttrib3f");
        HANDLE$glVertexAttrib3f = RawFunctionLoader.link(SEGMENT$glVertexAttrib3f, Descriptors.DESCRIPTOR$glVertexAttrib3f);
        SEGMENT$glVertexAttrib3fv = loader.apply("glVertexAttrib3fv");
        HANDLE$glVertexAttrib3fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib3fv, Descriptors.DESCRIPTOR$glVertexAttrib3fv);
        SEGMENT$glVertexAttrib4f = loader.apply("glVertexAttrib4f");
        HANDLE$glVertexAttrib4f = RawFunctionLoader.link(SEGMENT$glVertexAttrib4f, Descriptors.DESCRIPTOR$glVertexAttrib4f);
        SEGMENT$glVertexAttrib4fv = loader.apply("glVertexAttrib4fv");
        HANDLE$glVertexAttrib4fv = RawFunctionLoader.link(SEGMENT$glVertexAttrib4fv, Descriptors.DESCRIPTOR$glVertexAttrib4fv);
        SEGMENT$glVertexAttribPointer = loader.apply("glVertexAttribPointer");
        HANDLE$glVertexAttribPointer = RawFunctionLoader.link(SEGMENT$glVertexAttribPointer, Descriptors.DESCRIPTOR$glVertexAttribPointer);
        SEGMENT$glViewport = loader.apply("glViewport");
        HANDLE$glViewport = RawFunctionLoader.link(SEGMENT$glViewport, Descriptors.DESCRIPTOR$glViewport);
    }

    // region command wrappers
    /// @see <a href="https://docs.gl/es2/glActiveTexture"><code>glActiveTexture</code></a>
    public void activeTexture(
        int texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glActiveTexture);
        try {
            hFunction.invokeExact(
                texture
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glAttachShader"><code>glAttachShader</code></a>
    public void attachShader(
        @unsigned int program,
        @unsigned int shader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glAttachShader);
        try {
            hFunction.invokeExact(
                program,
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBindAttribLocation"><code>glBindAttribLocation</code></a>
    public void bindAttribLocation(
        @unsigned int program,
        @unsigned int index,
        @Nullable BytePtr name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBindAttribLocation);
        try {
            hFunction.invokeExact(
                program,
                index,
                (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBindBuffer"><code>glBindBuffer</code></a>
    public void bindBuffer(
        int target,
        @unsigned int buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBindBuffer);
        try {
            hFunction.invokeExact(
                target,
                buffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBindFramebuffer"><code>glBindFramebuffer</code></a>
    public void bindFramebuffer(
        int target,
        @unsigned int framebuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBindFramebuffer);
        try {
            hFunction.invokeExact(
                target,
                framebuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBindRenderbuffer"><code>glBindRenderbuffer</code></a>
    public void bindRenderbuffer(
        int target,
        @unsigned int renderbuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBindRenderbuffer);
        try {
            hFunction.invokeExact(
                target,
                renderbuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBindTexture"><code>glBindTexture</code></a>
    public void bindTexture(
        int target,
        @unsigned int texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBindTexture);
        try {
            hFunction.invokeExact(
                target,
                texture
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBlendColor"><code>glBlendColor</code></a>
    public void blendColor(
        float red,
        float green,
        float blue,
        float alpha
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBlendColor);
        try {
            hFunction.invokeExact(
                red,
                green,
                blue,
                alpha
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBlendEquation"><code>glBlendEquation</code></a>
    public void blendEquation(
        int mode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBlendEquation);
        try {
            hFunction.invokeExact(
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBlendEquationSeparate"><code>glBlendEquationSeparate</code></a>
    public void blendEquationSeparate(
        int modeRGB,
        int modeAlpha
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBlendEquationSeparate);
        try {
            hFunction.invokeExact(
                modeRGB,
                modeAlpha
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBlendFunc"><code>glBlendFunc</code></a>
    public void blendFunc(
        int sfactor,
        int dfactor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBlendFunc);
        try {
            hFunction.invokeExact(
                sfactor,
                dfactor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBlendFuncSeparate"><code>glBlendFuncSeparate</code></a>
    public void blendFuncSeparate(
        int sfactorRGB,
        int dfactorRGB,
        int sfactorAlpha,
        int dfactorAlpha
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBlendFuncSeparate);
        try {
            hFunction.invokeExact(
                sfactorRGB,
                dfactorRGB,
                sfactorAlpha,
                dfactorAlpha
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBufferData"><code>glBufferData</code></a>
    public void bufferData(
        int target,
        long size,
        @Pointer(comment="void*") MemorySegment data,
        int usage
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBufferData);
        try {
            hFunction.invokeExact(
                target,
                MemorySegment.ofAddress(size),
                data,
                usage
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glBufferSubData"><code>glBufferSubData</code></a>
    public void bufferSubData(
        int target,
        long offset,
        long size,
        @Pointer(comment="void*") MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glBufferSubData);
        try {
            hFunction.invokeExact(
                target,
                MemorySegment.ofAddress(offset),
                MemorySegment.ofAddress(size),
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCheckFramebufferStatus"><code>glCheckFramebufferStatus</code></a>
    public int checkFramebufferStatus(
        int target
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCheckFramebufferStatus);
        try {
            return (int) hFunction.invokeExact(
                target
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glClear"><code>glClear</code></a>
    public void clear(
        @unsigned int mask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glClear);
        try {
            hFunction.invokeExact(
                mask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glClearColor"><code>glClearColor</code></a>
    public void clearColor(
        float red,
        float green,
        float blue,
        float alpha
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glClearColor);
        try {
            hFunction.invokeExact(
                red,
                green,
                blue,
                alpha
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glClearDepthf"><code>glClearDepthf</code></a>
    public void clearDepthf(
        float d
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glClearDepthf);
        try {
            hFunction.invokeExact(
                d
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glClearStencil"><code>glClearStencil</code></a>
    public void clearStencil(
        int s
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glClearStencil);
        try {
            hFunction.invokeExact(
                s
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glColorMask"><code>glColorMask</code></a>
    public void colorMask(
        @unsigned byte red,
        @unsigned byte green,
        @unsigned byte blue,
        @unsigned byte alpha
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glColorMask);
        try {
            hFunction.invokeExact(
                red,
                green,
                blue,
                alpha
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCompileShader"><code>glCompileShader</code></a>
    public void compileShader(
        @unsigned int shader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCompileShader);
        try {
            hFunction.invokeExact(
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCompressedTexImage2D"><code>glCompressedTexImage2D</code></a>
    public void compressedTexImage2D(
        int target,
        int level,
        int internalformat,
        int width,
        int height,
        int border,
        int imageSize,
        @Pointer(comment="void*") MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCompressedTexImage2D);
        try {
            hFunction.invokeExact(
                target,
                level,
                internalformat,
                width,
                height,
                border,
                imageSize,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCompressedTexSubImage2D"><code>glCompressedTexSubImage2D</code></a>
    public void compressedTexSubImage2D(
        int target,
        int level,
        int xoffset,
        int yoffset,
        int width,
        int height,
        int format,
        int imageSize,
        @Pointer(comment="void*") MemorySegment data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCompressedTexSubImage2D);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCopyTexImage2D"><code>glCopyTexImage2D</code></a>
    public void copyTexImage2D(
        int target,
        int level,
        int internalformat,
        int x,
        int y,
        int width,
        int height,
        int border
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCopyTexImage2D);
        try {
            hFunction.invokeExact(
                target,
                level,
                internalformat,
                x,
                y,
                width,
                height,
                border
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCopyTexSubImage2D"><code>glCopyTexSubImage2D</code></a>
    public void copyTexSubImage2D(
        int target,
        int level,
        int xoffset,
        int yoffset,
        int x,
        int y,
        int width,
        int height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCopyTexSubImage2D);
        try {
            hFunction.invokeExact(
                target,
                level,
                xoffset,
                yoffset,
                x,
                y,
                width,
                height
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCreateProgram"><code>glCreateProgram</code></a>
    public @unsigned int createProgram() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCreateProgram);
        try {
            return (int) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCreateShader"><code>glCreateShader</code></a>
    public @unsigned int createShader(
        int type
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCreateShader);
        try {
            return (int) hFunction.invokeExact(
                type
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glCullFace"><code>glCullFace</code></a>
    public void cullFace(
        int mode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glCullFace);
        try {
            hFunction.invokeExact(
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDeleteBuffers"><code>glDeleteBuffers</code></a>
    public void deleteBuffers(
        int n,
        @Nullable @unsigned IntPtr buffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDeleteBuffers);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (buffers != null ? buffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDeleteFramebuffers"><code>glDeleteFramebuffers</code></a>
    public void deleteFramebuffers(
        int n,
        @Nullable @unsigned IntPtr framebuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDeleteFramebuffers);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (framebuffers != null ? framebuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDeleteProgram"><code>glDeleteProgram</code></a>
    public void deleteProgram(
        @unsigned int program
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDeleteProgram);
        try {
            hFunction.invokeExact(
                program
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDeleteRenderbuffers"><code>glDeleteRenderbuffers</code></a>
    public void deleteRenderbuffers(
        int n,
        @Nullable @unsigned IntPtr renderbuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDeleteRenderbuffers);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (renderbuffers != null ? renderbuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDeleteShader"><code>glDeleteShader</code></a>
    public void deleteShader(
        @unsigned int shader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDeleteShader);
        try {
            hFunction.invokeExact(
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDeleteTextures"><code>glDeleteTextures</code></a>
    public void deleteTextures(
        int n,
        @Nullable @unsigned IntPtr textures
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDeleteTextures);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (textures != null ? textures.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDepthFunc"><code>glDepthFunc</code></a>
    public void depthFunc(
        int func
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDepthFunc);
        try {
            hFunction.invokeExact(
                func
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDepthMask"><code>glDepthMask</code></a>
    public void depthMask(
        @unsigned byte flag
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDepthMask);
        try {
            hFunction.invokeExact(
                flag
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDepthRangef"><code>glDepthRangef</code></a>
    public void depthRangef(
        float n,
        float f
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDepthRangef);
        try {
            hFunction.invokeExact(
                n,
                f
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDetachShader"><code>glDetachShader</code></a>
    public void detachShader(
        @unsigned int program,
        @unsigned int shader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDetachShader);
        try {
            hFunction.invokeExact(
                program,
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDisable"><code>glDisable</code></a>
    public void disable(
        int cap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDisable);
        try {
            hFunction.invokeExact(
                cap
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDisableVertexAttribArray"><code>glDisableVertexAttribArray</code></a>
    public void disableVertexAttribArray(
        @unsigned int index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDisableVertexAttribArray);
        try {
            hFunction.invokeExact(
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDrawArrays"><code>glDrawArrays</code></a>
    public void drawArrays(
        int mode,
        int first,
        int count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDrawArrays);
        try {
            hFunction.invokeExact(
                mode,
                first,
                count
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glDrawElements"><code>glDrawElements</code></a>
    public void drawElements(
        int mode,
        int count,
        int type,
        @Pointer(comment="void*") MemorySegment indices
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glDrawElements);
        try {
            hFunction.invokeExact(
                mode,
                count,
                type,
                indices
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glEnable"><code>glEnable</code></a>
    public void enable(
        int cap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glEnable);
        try {
            hFunction.invokeExact(
                cap
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glEnableVertexAttribArray"><code>glEnableVertexAttribArray</code></a>
    public void enableVertexAttribArray(
        @unsigned int index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glEnableVertexAttribArray);
        try {
            hFunction.invokeExact(
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glFinish"><code>glFinish</code></a>
    public void finish() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glFinish);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glFlush"><code>glFlush</code></a>
    public void flush() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glFlush);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glFramebufferRenderbuffer"><code>glFramebufferRenderbuffer</code></a>
    public void framebufferRenderbuffer(
        int target,
        int attachment,
        int renderbuffertarget,
        @unsigned int renderbuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glFramebufferRenderbuffer);
        try {
            hFunction.invokeExact(
                target,
                attachment,
                renderbuffertarget,
                renderbuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glFramebufferTexture2D"><code>glFramebufferTexture2D</code></a>
    public void framebufferTexture2D(
        int target,
        int attachment,
        int textarget,
        @unsigned int texture,
        int level
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glFramebufferTexture2D);
        try {
            hFunction.invokeExact(
                target,
                attachment,
                textarget,
                texture,
                level
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glFrontFace"><code>glFrontFace</code></a>
    public void frontFace(
        int mode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glFrontFace);
        try {
            hFunction.invokeExact(
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGenBuffers"><code>glGenBuffers</code></a>
    public void genBuffers(
        int n,
        @Nullable @unsigned IntPtr buffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGenBuffers);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (buffers != null ? buffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGenFramebuffers"><code>glGenFramebuffers</code></a>
    public void genFramebuffers(
        int n,
        @Nullable @unsigned IntPtr framebuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGenFramebuffers);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (framebuffers != null ? framebuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGenRenderbuffers"><code>glGenRenderbuffers</code></a>
    public void genRenderbuffers(
        int n,
        @Nullable @unsigned IntPtr renderbuffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGenRenderbuffers);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (renderbuffers != null ? renderbuffers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGenTextures"><code>glGenTextures</code></a>
    public void genTextures(
        int n,
        @Nullable @unsigned IntPtr textures
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGenTextures);
        try {
            hFunction.invokeExact(
                n,
                (MemorySegment) (textures != null ? textures.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGenerateMipmap"><code>glGenerateMipmap</code></a>
    public void generateMipmap(
        int target
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGenerateMipmap);
        try {
            hFunction.invokeExact(
                target
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetActiveAttrib"><code>glGetActiveAttrib</code></a>
    public void getActiveAttrib(
        @unsigned int program,
        @unsigned int index,
        int bufSize,
        @Nullable IntPtr length,
        @Nullable IntPtr size,
        @Nullable IntPtr type,
        @Nullable BytePtr name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetActiveAttrib);
        try {
            hFunction.invokeExact(
                program,
                index,
                bufSize,
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                (MemorySegment) (size != null ? size.segment() : MemorySegment.NULL),
                (MemorySegment) (type != null ? type.segment() : MemorySegment.NULL),
                (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetActiveUniform"><code>glGetActiveUniform</code></a>
    public void getActiveUniform(
        @unsigned int program,
        @unsigned int index,
        int bufSize,
        @Nullable IntPtr length,
        @Nullable IntPtr size,
        @Nullable IntPtr type,
        @Nullable BytePtr name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetActiveUniform);
        try {
            hFunction.invokeExact(
                program,
                index,
                bufSize,
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                (MemorySegment) (size != null ? size.segment() : MemorySegment.NULL),
                (MemorySegment) (type != null ? type.segment() : MemorySegment.NULL),
                (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetAttachedShaders"><code>glGetAttachedShaders</code></a>
    public void getAttachedShaders(
        @unsigned int program,
        int maxCount,
        @Nullable IntPtr count,
        @Nullable @unsigned IntPtr shaders
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetAttachedShaders);
        try {
            hFunction.invokeExact(
                program,
                maxCount,
                (MemorySegment) (count != null ? count.segment() : MemorySegment.NULL),
                (MemorySegment) (shaders != null ? shaders.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetAttribLocation"><code>glGetAttribLocation</code></a>
    public int getAttribLocation(
        @unsigned int program,
        @Nullable BytePtr name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetAttribLocation);
        try {
            return (int) hFunction.invokeExact(
                program,
                (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetBooleanv"><code>glGetBooleanv</code></a>
    public void getBooleanv(
        int pname,
        @Nullable @unsigned BytePtr data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetBooleanv);
        try {
            hFunction.invokeExact(
                pname,
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetBufferParameteriv"><code>glGetBufferParameteriv</code></a>
    public void getBufferParameteriv(
        int target,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetBufferParameteriv);
        try {
            hFunction.invokeExact(
                target,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetError"><code>glGetError</code></a>
    public int getError() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetError);
        try {
            return (int) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetFloatv"><code>glGetFloatv</code></a>
    public void getFloatv(
        int pname,
        @Nullable FloatPtr data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetFloatv);
        try {
            hFunction.invokeExact(
                pname,
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetFramebufferAttachmentParameteriv"><code>glGetFramebufferAttachmentParameteriv</code></a>
    public void getFramebufferAttachmentParameteriv(
        int target,
        int attachment,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetFramebufferAttachmentParameteriv);
        try {
            hFunction.invokeExact(
                target,
                attachment,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetIntegerv"><code>glGetIntegerv</code></a>
    public void getIntegerv(
        int pname,
        @Nullable IntPtr data
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetIntegerv);
        try {
            hFunction.invokeExact(
                pname,
                (MemorySegment) (data != null ? data.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetProgramInfoLog"><code>glGetProgramInfoLog</code></a>
    public void getProgramInfoLog(
        @unsigned int program,
        int bufSize,
        @Nullable IntPtr length,
        @Nullable BytePtr infoLog
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetProgramInfoLog);
        try {
            hFunction.invokeExact(
                program,
                bufSize,
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                (MemorySegment) (infoLog != null ? infoLog.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetProgramiv"><code>glGetProgramiv</code></a>
    public void getProgramiv(
        @unsigned int program,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetProgramiv);
        try {
            hFunction.invokeExact(
                program,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetRenderbufferParameteriv"><code>glGetRenderbufferParameteriv</code></a>
    public void getRenderbufferParameteriv(
        int target,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetRenderbufferParameteriv);
        try {
            hFunction.invokeExact(
                target,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetShaderInfoLog"><code>glGetShaderInfoLog</code></a>
    public void getShaderInfoLog(
        @unsigned int shader,
        int bufSize,
        @Nullable IntPtr length,
        @Nullable BytePtr infoLog
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetShaderInfoLog);
        try {
            hFunction.invokeExact(
                shader,
                bufSize,
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                (MemorySegment) (infoLog != null ? infoLog.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetShaderPrecisionFormat"><code>glGetShaderPrecisionFormat</code></a>
    public void getShaderPrecisionFormat(
        int shadertype,
        int precisiontype,
        @Nullable IntPtr range,
        @Nullable IntPtr precision
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetShaderPrecisionFormat);
        try {
            hFunction.invokeExact(
                shadertype,
                precisiontype,
                (MemorySegment) (range != null ? range.segment() : MemorySegment.NULL),
                (MemorySegment) (precision != null ? precision.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetShaderSource"><code>glGetShaderSource</code></a>
    public void getShaderSource(
        @unsigned int shader,
        int bufSize,
        @Nullable IntPtr length,
        @Nullable BytePtr source
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetShaderSource);
        try {
            hFunction.invokeExact(
                shader,
                bufSize,
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL),
                (MemorySegment) (source != null ? source.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetShaderiv"><code>glGetShaderiv</code></a>
    public void getShaderiv(
        @unsigned int shader,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetShaderiv);
        try {
            hFunction.invokeExact(
                shader,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetString"><code>glGetString</code></a>
    public @unsigned BytePtr getString(
        int name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetString);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                name
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetTexParameterfv"><code>glGetTexParameterfv</code></a>
    public void getTexParameterfv(
        int target,
        int pname,
        @Nullable FloatPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetTexParameterfv);
        try {
            hFunction.invokeExact(
                target,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetTexParameteriv"><code>glGetTexParameteriv</code></a>
    public void getTexParameteriv(
        int target,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetTexParameteriv);
        try {
            hFunction.invokeExact(
                target,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetUniformLocation"><code>glGetUniformLocation</code></a>
    public int getUniformLocation(
        @unsigned int program,
        @Nullable BytePtr name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetUniformLocation);
        try {
            return (int) hFunction.invokeExact(
                program,
                (MemorySegment) (name != null ? name.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetUniformfv"><code>glGetUniformfv</code></a>
    public void getUniformfv(
        @unsigned int program,
        int location,
        @Nullable FloatPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetUniformfv);
        try {
            hFunction.invokeExact(
                program,
                location,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetUniformiv"><code>glGetUniformiv</code></a>
    public void getUniformiv(
        @unsigned int program,
        int location,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetUniformiv);
        try {
            hFunction.invokeExact(
                program,
                location,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetVertexAttribPointerv"><code>glGetVertexAttribPointerv</code></a>
    public void getVertexAttribPointerv(
        @unsigned int index,
        int pname,
        @Nullable PointerPtr pointer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetVertexAttribPointerv);
        try {
            hFunction.invokeExact(
                index,
                pname,
                (MemorySegment) (pointer != null ? pointer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetVertexAttribfv"><code>glGetVertexAttribfv</code></a>
    public void getVertexAttribfv(
        @unsigned int index,
        int pname,
        @Nullable FloatPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetVertexAttribfv);
        try {
            hFunction.invokeExact(
                index,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glGetVertexAttribiv"><code>glGetVertexAttribiv</code></a>
    public void getVertexAttribiv(
        @unsigned int index,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glGetVertexAttribiv);
        try {
            hFunction.invokeExact(
                index,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glHint"><code>glHint</code></a>
    public void hint(
        int target,
        int mode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glHint);
        try {
            hFunction.invokeExact(
                target,
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsBuffer"><code>glIsBuffer</code></a>
    public @unsigned byte isBuffer(
        @unsigned int buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsBuffer);
        try {
            return (byte) hFunction.invokeExact(
                buffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsEnabled"><code>glIsEnabled</code></a>
    public @unsigned byte isEnabled(
        int cap
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsEnabled);
        try {
            return (byte) hFunction.invokeExact(
                cap
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsFramebuffer"><code>glIsFramebuffer</code></a>
    public @unsigned byte isFramebuffer(
        @unsigned int framebuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsFramebuffer);
        try {
            return (byte) hFunction.invokeExact(
                framebuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsProgram"><code>glIsProgram</code></a>
    public @unsigned byte isProgram(
        @unsigned int program
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsProgram);
        try {
            return (byte) hFunction.invokeExact(
                program
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsRenderbuffer"><code>glIsRenderbuffer</code></a>
    public @unsigned byte isRenderbuffer(
        @unsigned int renderbuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsRenderbuffer);
        try {
            return (byte) hFunction.invokeExact(
                renderbuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsShader"><code>glIsShader</code></a>
    public @unsigned byte isShader(
        @unsigned int shader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsShader);
        try {
            return (byte) hFunction.invokeExact(
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glIsTexture"><code>glIsTexture</code></a>
    public @unsigned byte isTexture(
        @unsigned int texture
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glIsTexture);
        try {
            return (byte) hFunction.invokeExact(
                texture
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glLineWidth"><code>glLineWidth</code></a>
    public void lineWidth(
        float width
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glLineWidth);
        try {
            hFunction.invokeExact(
                width
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glLinkProgram"><code>glLinkProgram</code></a>
    public void linkProgram(
        @unsigned int program
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glLinkProgram);
        try {
            hFunction.invokeExact(
                program
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glPixelStorei"><code>glPixelStorei</code></a>
    public void pixelStorei(
        int pname,
        int param
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glPixelStorei);
        try {
            hFunction.invokeExact(
                pname,
                param
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glPolygonOffset"><code>glPolygonOffset</code></a>
    public void polygonOffset(
        float factor,
        float units
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glPolygonOffset);
        try {
            hFunction.invokeExact(
                factor,
                units
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glReadPixels"><code>glReadPixels</code></a>
    public void readPixels(
        int x,
        int y,
        int width,
        int height,
        int format,
        int type,
        @Pointer(comment="void*") MemorySegment pixels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glReadPixels);
        try {
            hFunction.invokeExact(
                x,
                y,
                width,
                height,
                format,
                type,
                pixels
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glReleaseShaderCompiler"><code>glReleaseShaderCompiler</code></a>
    public void releaseShaderCompiler() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glReleaseShaderCompiler);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glRenderbufferStorage"><code>glRenderbufferStorage</code></a>
    public void renderbufferStorage(
        int target,
        int internalformat,
        int width,
        int height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glRenderbufferStorage);
        try {
            hFunction.invokeExact(
                target,
                internalformat,
                width,
                height
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glSampleCoverage"><code>glSampleCoverage</code></a>
    public void sampleCoverage(
        float value,
        @unsigned byte invert
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glSampleCoverage);
        try {
            hFunction.invokeExact(
                value,
                invert
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glScissor"><code>glScissor</code></a>
    public void scissor(
        int x,
        int y,
        int width,
        int height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glScissor);
        try {
            hFunction.invokeExact(
                x,
                y,
                width,
                height
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glShaderBinary"><code>glShaderBinary</code></a>
    public void shaderBinary(
        int count,
        @Nullable @unsigned IntPtr shaders,
        int binaryFormat,
        @Pointer(comment="void*") MemorySegment binary,
        int length
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glShaderBinary);
        try {
            hFunction.invokeExact(
                count,
                (MemorySegment) (shaders != null ? shaders.segment() : MemorySegment.NULL),
                binaryFormat,
                binary,
                length
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glShaderSource"><code>glShaderSource</code></a>
    public void shaderSource(
        @unsigned int shader,
        int count,
        @Nullable PointerPtr string,
        @Nullable IntPtr length
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glShaderSource);
        try {
            hFunction.invokeExact(
                shader,
                count,
                (MemorySegment) (string != null ? string.segment() : MemorySegment.NULL),
                (MemorySegment) (length != null ? length.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glStencilFunc"><code>glStencilFunc</code></a>
    public void stencilFunc(
        int func,
        int ref,
        @unsigned int mask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glStencilFunc);
        try {
            hFunction.invokeExact(
                func,
                ref,
                mask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glStencilFuncSeparate"><code>glStencilFuncSeparate</code></a>
    public void stencilFuncSeparate(
        int face,
        int func,
        int ref,
        @unsigned int mask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glStencilFuncSeparate);
        try {
            hFunction.invokeExact(
                face,
                func,
                ref,
                mask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glStencilMask"><code>glStencilMask</code></a>
    public void stencilMask(
        @unsigned int mask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glStencilMask);
        try {
            hFunction.invokeExact(
                mask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glStencilMaskSeparate"><code>glStencilMaskSeparate</code></a>
    public void stencilMaskSeparate(
        int face,
        @unsigned int mask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glStencilMaskSeparate);
        try {
            hFunction.invokeExact(
                face,
                mask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glStencilOp"><code>glStencilOp</code></a>
    public void stencilOp(
        int fail,
        int zfail,
        int zpass
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glStencilOp);
        try {
            hFunction.invokeExact(
                fail,
                zfail,
                zpass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glStencilOpSeparate"><code>glStencilOpSeparate</code></a>
    public void stencilOpSeparate(
        int face,
        int sfail,
        int dpfail,
        int dppass
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glStencilOpSeparate);
        try {
            hFunction.invokeExact(
                face,
                sfail,
                dpfail,
                dppass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glTexImage2D"><code>glTexImage2D</code></a>
    public void texImage2D(
        int target,
        int level,
        int internalformat,
        int width,
        int height,
        int border,
        int format,
        int type,
        @Pointer(comment="void*") MemorySegment pixels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glTexImage2D);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glTexParameterf"><code>glTexParameterf</code></a>
    public void texParameterf(
        int target,
        int pname,
        float param
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glTexParameterf);
        try {
            hFunction.invokeExact(
                target,
                pname,
                param
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glTexParameterfv"><code>glTexParameterfv</code></a>
    public void texParameterfv(
        int target,
        int pname,
        @Nullable FloatPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glTexParameterfv);
        try {
            hFunction.invokeExact(
                target,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glTexParameteri"><code>glTexParameteri</code></a>
    public void texParameteri(
        int target,
        int pname,
        int param
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glTexParameteri);
        try {
            hFunction.invokeExact(
                target,
                pname,
                param
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glTexParameteriv"><code>glTexParameteriv</code></a>
    public void texParameteriv(
        int target,
        int pname,
        @Nullable IntPtr params
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glTexParameteriv);
        try {
            hFunction.invokeExact(
                target,
                pname,
                (MemorySegment) (params != null ? params.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glTexSubImage2D"><code>glTexSubImage2D</code></a>
    public void texSubImage2D(
        int target,
        int level,
        int xoffset,
        int yoffset,
        int width,
        int height,
        int format,
        int type,
        @Pointer(comment="void*") MemorySegment pixels
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glTexSubImage2D);
        try {
            hFunction.invokeExact(
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
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform1f"><code>glUniform1f</code></a>
    public void uniform1f(
        int location,
        float v0
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform1f);
        try {
            hFunction.invokeExact(
                location,
                v0
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform1fv"><code>glUniform1fv</code></a>
    public void uniform1fv(
        int location,
        int count,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform1fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform1i"><code>glUniform1i</code></a>
    public void uniform1i(
        int location,
        int v0
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform1i);
        try {
            hFunction.invokeExact(
                location,
                v0
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform1iv"><code>glUniform1iv</code></a>
    public void uniform1iv(
        int location,
        int count,
        @Nullable IntPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform1iv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform2f"><code>glUniform2f</code></a>
    public void uniform2f(
        int location,
        float v0,
        float v1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform2f);
        try {
            hFunction.invokeExact(
                location,
                v0,
                v1
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform2fv"><code>glUniform2fv</code></a>
    public void uniform2fv(
        int location,
        int count,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform2fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform2i"><code>glUniform2i</code></a>
    public void uniform2i(
        int location,
        int v0,
        int v1
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform2i);
        try {
            hFunction.invokeExact(
                location,
                v0,
                v1
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform2iv"><code>glUniform2iv</code></a>
    public void uniform2iv(
        int location,
        int count,
        @Nullable IntPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform2iv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform3f"><code>glUniform3f</code></a>
    public void uniform3f(
        int location,
        float v0,
        float v1,
        float v2
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform3f);
        try {
            hFunction.invokeExact(
                location,
                v0,
                v1,
                v2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform3fv"><code>glUniform3fv</code></a>
    public void uniform3fv(
        int location,
        int count,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform3fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform3i"><code>glUniform3i</code></a>
    public void uniform3i(
        int location,
        int v0,
        int v1,
        int v2
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform3i);
        try {
            hFunction.invokeExact(
                location,
                v0,
                v1,
                v2
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform3iv"><code>glUniform3iv</code></a>
    public void uniform3iv(
        int location,
        int count,
        @Nullable IntPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform3iv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform4f"><code>glUniform4f</code></a>
    public void uniform4f(
        int location,
        float v0,
        float v1,
        float v2,
        float v3
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform4f);
        try {
            hFunction.invokeExact(
                location,
                v0,
                v1,
                v2,
                v3
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform4fv"><code>glUniform4fv</code></a>
    public void uniform4fv(
        int location,
        int count,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform4fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform4i"><code>glUniform4i</code></a>
    public void uniform4i(
        int location,
        int v0,
        int v1,
        int v2,
        int v3
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform4i);
        try {
            hFunction.invokeExact(
                location,
                v0,
                v1,
                v2,
                v3
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniform4iv"><code>glUniform4iv</code></a>
    public void uniform4iv(
        int location,
        int count,
        @Nullable IntPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniform4iv);
        try {
            hFunction.invokeExact(
                location,
                count,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniformMatrix2fv"><code>glUniformMatrix2fv</code></a>
    public void uniformMatrix2fv(
        int location,
        int count,
        @unsigned byte transpose,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniformMatrix2fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                transpose,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniformMatrix3fv"><code>glUniformMatrix3fv</code></a>
    public void uniformMatrix3fv(
        int location,
        int count,
        @unsigned byte transpose,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniformMatrix3fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                transpose,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUniformMatrix4fv"><code>glUniformMatrix4fv</code></a>
    public void uniformMatrix4fv(
        int location,
        int count,
        @unsigned byte transpose,
        @Nullable FloatPtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUniformMatrix4fv);
        try {
            hFunction.invokeExact(
                location,
                count,
                transpose,
                (MemorySegment) (value != null ? value.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glUseProgram"><code>glUseProgram</code></a>
    public void useProgram(
        @unsigned int program
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glUseProgram);
        try {
            hFunction.invokeExact(
                program
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glValidateProgram"><code>glValidateProgram</code></a>
    public void validateProgram(
        @unsigned int program
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glValidateProgram);
        try {
            hFunction.invokeExact(
                program
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib1f"><code>glVertexAttrib1f</code></a>
    public void vertexAttrib1f(
        @unsigned int index,
        float x
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib1f);
        try {
            hFunction.invokeExact(
                index,
                x
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib1fv"><code>glVertexAttrib1fv</code></a>
    public void vertexAttrib1fv(
        @unsigned int index,
        @Nullable FloatPtr v
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib1fv);
        try {
            hFunction.invokeExact(
                index,
                (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib2f"><code>glVertexAttrib2f</code></a>
    public void vertexAttrib2f(
        @unsigned int index,
        float x,
        float y
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib2f);
        try {
            hFunction.invokeExact(
                index,
                x,
                y
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib2fv"><code>glVertexAttrib2fv</code></a>
    public void vertexAttrib2fv(
        @unsigned int index,
        @Nullable FloatPtr v
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib2fv);
        try {
            hFunction.invokeExact(
                index,
                (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib3f"><code>glVertexAttrib3f</code></a>
    public void vertexAttrib3f(
        @unsigned int index,
        float x,
        float y,
        float z
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib3f);
        try {
            hFunction.invokeExact(
                index,
                x,
                y,
                z
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib3fv"><code>glVertexAttrib3fv</code></a>
    public void vertexAttrib3fv(
        @unsigned int index,
        @Nullable FloatPtr v
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib3fv);
        try {
            hFunction.invokeExact(
                index,
                (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib4f"><code>glVertexAttrib4f</code></a>
    public void vertexAttrib4f(
        @unsigned int index,
        float x,
        float y,
        float z,
        float w
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib4f);
        try {
            hFunction.invokeExact(
                index,
                x,
                y,
                z,
                w
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttrib4fv"><code>glVertexAttrib4fv</code></a>
    public void vertexAttrib4fv(
        @unsigned int index,
        @Nullable FloatPtr v
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttrib4fv);
        try {
            hFunction.invokeExact(
                index,
                (MemorySegment) (v != null ? v.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glVertexAttribPointer"><code>glVertexAttribPointer</code></a>
    public void vertexAttribPointer(
        @unsigned int index,
        int size,
        int type,
        @unsigned byte normalized,
        int stride,
        @Pointer(comment="void*") MemorySegment pointer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glVertexAttribPointer);
        try {
            hFunction.invokeExact(
                index,
                size,
                type,
                normalized,
                stride,
                pointer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://docs.gl/es2/glViewport"><code>glViewport</code></a>
    public void viewport(
        int x,
        int y,
        int width,
        int height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glViewport);
        try {
            hFunction.invokeExact(
                x,
                y,
                width,
                height
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
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
    public final @Nullable MemorySegment SEGMENT$glGenFramebuffers;
    public final @Nullable MemorySegment SEGMENT$glGenRenderbuffers;
    public final @Nullable MemorySegment SEGMENT$glGenTextures;
    public final @Nullable MemorySegment SEGMENT$glGenerateMipmap;
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
    public final @Nullable MemorySegment SEGMENT$glGetProgramInfoLog;
    public final @Nullable MemorySegment SEGMENT$glGetProgramiv;
    public final @Nullable MemorySegment SEGMENT$glGetRenderbufferParameteriv;
    public final @Nullable MemorySegment SEGMENT$glGetShaderInfoLog;
    public final @Nullable MemorySegment SEGMENT$glGetShaderPrecisionFormat;
    public final @Nullable MemorySegment SEGMENT$glGetShaderSource;
    public final @Nullable MemorySegment SEGMENT$glGetShaderiv;
    public final @Nullable MemorySegment SEGMENT$glGetString;
    public final @Nullable MemorySegment SEGMENT$glGetTexParameterfv;
    public final @Nullable MemorySegment SEGMENT$glGetTexParameteriv;
    public final @Nullable MemorySegment SEGMENT$glGetUniformLocation;
    public final @Nullable MemorySegment SEGMENT$glGetUniformfv;
    public final @Nullable MemorySegment SEGMENT$glGetUniformiv;
    public final @Nullable MemorySegment SEGMENT$glGetVertexAttribPointerv;
    public final @Nullable MemorySegment SEGMENT$glGetVertexAttribfv;
    public final @Nullable MemorySegment SEGMENT$glGetVertexAttribiv;
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
    public final @Nullable MethodHandle HANDLE$glGenFramebuffers;
    public final @Nullable MethodHandle HANDLE$glGenRenderbuffers;
    public final @Nullable MethodHandle HANDLE$glGenTextures;
    public final @Nullable MethodHandle HANDLE$glGenerateMipmap;
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
    public final @Nullable MethodHandle HANDLE$glGetProgramInfoLog;
    public final @Nullable MethodHandle HANDLE$glGetProgramiv;
    public final @Nullable MethodHandle HANDLE$glGetRenderbufferParameteriv;
    public final @Nullable MethodHandle HANDLE$glGetShaderInfoLog;
    public final @Nullable MethodHandle HANDLE$glGetShaderPrecisionFormat;
    public final @Nullable MethodHandle HANDLE$glGetShaderSource;
    public final @Nullable MethodHandle HANDLE$glGetShaderiv;
    public final @Nullable MethodHandle HANDLE$glGetString;
    public final @Nullable MethodHandle HANDLE$glGetTexParameterfv;
    public final @Nullable MethodHandle HANDLE$glGetTexParameteriv;
    public final @Nullable MethodHandle HANDLE$glGetUniformLocation;
    public final @Nullable MethodHandle HANDLE$glGetUniformfv;
    public final @Nullable MethodHandle HANDLE$glGetUniformiv;
    public final @Nullable MethodHandle HANDLE$glGetVertexAttribPointerv;
    public final @Nullable MethodHandle HANDLE$glGetVertexAttribfv;
    public final @Nullable MethodHandle HANDLE$glGetVertexAttribiv;
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
    // endregion

    public static final class Descriptors {
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

        public static final FunctionDescriptor DESCRIPTOR$glFinish = FunctionDescriptor.ofVoid(
        );

        public static final FunctionDescriptor DESCRIPTOR$glFlush = FunctionDescriptor.ofVoid(
        );

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

        public static final FunctionDescriptor DESCRIPTOR$glGenerateMipmap = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
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

        public static final FunctionDescriptor DESCRIPTOR$glGetProgramInfoLog = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glGetProgramiv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glGetRenderbufferParameteriv = FunctionDescriptor.ofVoid(
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

        public static final FunctionDescriptor DESCRIPTOR$glGetShaderiv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
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

        public static final FunctionDescriptor DESCRIPTOR$glGetUniformLocation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
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

        public static final FunctionDescriptor DESCRIPTOR$glGetVertexAttribPointerv = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
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

        public static final FunctionDescriptor DESCRIPTOR$glReleaseShaderCompiler = FunctionDescriptor.ofVoid(
        );

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

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
