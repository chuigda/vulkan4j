package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemRenderModelPropertiesFB} and {@link XrSystemRenderModelPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemRenderModelPropertiesFB
    extends IPointer
    permits XrSystemRenderModelPropertiesFB, XrSystemRenderModelPropertiesFB.Ptr
{}
