package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLocalDimmingFrameEndInfoMETA} and {@link XrLocalDimmingFrameEndInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLocalDimmingFrameEndInfoMETA
    extends IPointer
    permits XrLocalDimmingFrameEndInfoMETA, XrLocalDimmingFrameEndInfoMETA.Ptr
{}
