package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneCaptureInfoBD} and {@link XrSceneCaptureInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneCaptureInfoBD
    extends IPointer
    permits XrSceneCaptureInfoBD, XrSceneCaptureInfoBD.Ptr
{}
