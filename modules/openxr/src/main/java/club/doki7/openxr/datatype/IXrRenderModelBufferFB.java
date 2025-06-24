package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelBufferFB} and {@link XrRenderModelBufferFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelBufferFB
    extends IPointer
    permits XrRenderModelBufferFB, XrRenderModelBufferFB.Ptr
{}
