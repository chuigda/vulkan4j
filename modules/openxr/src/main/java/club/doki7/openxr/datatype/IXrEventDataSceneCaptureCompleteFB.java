package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSceneCaptureCompleteFB} and {@link XrEventDataSceneCaptureCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSceneCaptureCompleteFB
    extends IPointer
    permits XrEventDataSceneCaptureCompleteFB, XrEventDataSceneCaptureCompleteFB.Ptr
{}
