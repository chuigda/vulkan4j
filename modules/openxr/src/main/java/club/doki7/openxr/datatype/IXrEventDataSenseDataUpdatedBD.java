package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSenseDataUpdatedBD} and {@link XrEventDataSenseDataUpdatedBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSenseDataUpdatedBD
    extends IPointer
    permits XrEventDataSenseDataUpdatedBD, XrEventDataSenseDataUpdatedBD.Ptr
{}
