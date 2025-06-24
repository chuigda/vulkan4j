package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveationLevelProfileCreateInfoFB} and {@link XrFoveationLevelProfileCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveationLevelProfileCreateInfoFB
    extends IPointer
    permits XrFoveationLevelProfileCreateInfoFB, XrFoveationLevelProfileCreateInfoFB.Ptr
{}
