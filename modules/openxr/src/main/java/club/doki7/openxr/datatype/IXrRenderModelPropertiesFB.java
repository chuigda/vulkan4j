package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelPropertiesFB} and {@link XrRenderModelPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelPropertiesFB
    extends IPointer
    permits XrRenderModelPropertiesFB, XrRenderModelPropertiesFB.Ptr
{}
