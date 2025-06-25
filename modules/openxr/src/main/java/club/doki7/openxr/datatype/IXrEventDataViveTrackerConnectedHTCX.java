package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataViveTrackerConnectedHTCX} and {@link XrEventDataViveTrackerConnectedHTCX.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataViveTrackerConnectedHTCX
    extends IPointer
    permits XrEventDataViveTrackerConnectedHTCX, XrEventDataViveTrackerConnectedHTCX.Ptr
{}
