package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSenseDataProviderStateChangedBD} and {@link XrEventDataSenseDataProviderStateChangedBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSenseDataProviderStateChangedBD
    extends IPointer
    permits XrEventDataSenseDataProviderStateChangedBD, XrEventDataSenseDataProviderStateChangedBD.Ptr
{}
