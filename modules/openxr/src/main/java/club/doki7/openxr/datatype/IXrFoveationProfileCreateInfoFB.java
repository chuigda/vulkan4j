package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveationProfileCreateInfoFB} and {@link XrFoveationProfileCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveationProfileCreateInfoFB
    extends IPointer
    permits XrFoveationProfileCreateInfoFB, XrFoveationProfileCreateInfoFB.Ptr
{}
