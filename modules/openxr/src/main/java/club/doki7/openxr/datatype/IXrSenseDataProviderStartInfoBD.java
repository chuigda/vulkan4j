package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataProviderStartInfoBD} and {@link XrSenseDataProviderStartInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataProviderStartInfoBD
    extends IPointer
    permits XrSenseDataProviderStartInfoBD, XrSenseDataProviderStartInfoBD.Ptr
{}
