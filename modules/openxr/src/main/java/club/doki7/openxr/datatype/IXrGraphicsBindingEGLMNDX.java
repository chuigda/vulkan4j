package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingEGLMNDX} and {@link XrGraphicsBindingEGLMNDX.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingEGLMNDX
    extends IPointer
    permits XrGraphicsBindingEGLMNDX, XrGraphicsBindingEGLMNDX.Ptr
{}
