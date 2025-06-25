package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataPlaneOrientationBD} and {@link XrSpatialEntityComponentDataPlaneOrientationBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataPlaneOrientationBD
    extends IPointer
    permits XrSpatialEntityComponentDataPlaneOrientationBD, XrSpatialEntityComponentDataPlaneOrientationBD.Ptr
{}
