package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelLoadInfoFB} and {@link XrRenderModelLoadInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelLoadInfoFB
    extends IPointer
    permits XrRenderModelLoadInfoFB, XrRenderModelLoadInfoFB.Ptr
{}
