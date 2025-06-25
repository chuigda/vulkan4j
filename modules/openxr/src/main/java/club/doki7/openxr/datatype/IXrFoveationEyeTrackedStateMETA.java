package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveationEyeTrackedStateMETA} and {@link XrFoveationEyeTrackedStateMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveationEyeTrackedStateMETA
    extends IPointer
    permits XrFoveationEyeTrackedStateMETA, XrFoveationEyeTrackedStateMETA.Ptr
{}
