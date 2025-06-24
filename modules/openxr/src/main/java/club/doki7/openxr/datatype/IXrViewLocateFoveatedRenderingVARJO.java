package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViewLocateFoveatedRenderingVARJO} and {@link XrViewLocateFoveatedRenderingVARJO.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViewLocateFoveatedRenderingVARJO
    extends IPointer
    permits XrViewLocateFoveatedRenderingVARJO, XrViewLocateFoveatedRenderingVARJO.Ptr
{}
