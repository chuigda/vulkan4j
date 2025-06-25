package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataEyeCalibrationChangedML} and {@link XrEventDataEyeCalibrationChangedML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataEyeCalibrationChangedML
    extends IPointer
    permits XrEventDataEyeCalibrationChangedML, XrEventDataEyeCalibrationChangedML.Ptr
{}
