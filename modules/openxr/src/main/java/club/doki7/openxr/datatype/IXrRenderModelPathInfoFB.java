package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelPathInfoFB} and {@link XrRenderModelPathInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelPathInfoFB
    extends IPointer
    permits XrRenderModelPathInfoFB, XrRenderModelPathInfoFB.Ptr
{}
