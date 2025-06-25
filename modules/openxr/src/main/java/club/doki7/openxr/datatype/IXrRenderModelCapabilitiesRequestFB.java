package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelCapabilitiesRequestFB} and {@link XrRenderModelCapabilitiesRequestFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelCapabilitiesRequestFB
    extends IPointer
    permits XrRenderModelCapabilitiesRequestFB, XrRenderModelCapabilitiesRequestFB.Ptr
{}
