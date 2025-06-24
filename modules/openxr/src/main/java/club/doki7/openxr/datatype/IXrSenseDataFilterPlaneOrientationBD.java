package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataFilterPlaneOrientationBD} and {@link XrSenseDataFilterPlaneOrientationBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataFilterPlaneOrientationBD
    extends IPointer
    permits XrSenseDataFilterPlaneOrientationBD, XrSenseDataFilterPlaneOrientationBD.Ptr
{}
