package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataFilterSemanticBD} and {@link XrSenseDataFilterSemanticBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataFilterSemanticBD
    extends IPointer
    permits XrSenseDataFilterSemanticBD, XrSenseDataFilterSemanticBD.Ptr
{}
