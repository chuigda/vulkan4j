package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemColorSpacePropertiesFB} and {@link XrSystemColorSpacePropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemColorSpacePropertiesFB
    extends IPointer
    permits XrSystemColorSpacePropertiesFB, XrSystemColorSpacePropertiesFB.Ptr
{}
