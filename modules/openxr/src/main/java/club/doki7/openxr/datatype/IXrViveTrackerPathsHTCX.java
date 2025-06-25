package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViveTrackerPathsHTCX} and {@link XrViveTrackerPathsHTCX.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViveTrackerPathsHTCX
    extends IPointer
    permits XrViveTrackerPathsHTCX, XrViveTrackerPathsHTCX.Ptr
{}
