package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataProviderCreateInfoBD} and {@link XrSenseDataProviderCreateInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataProviderCreateInfoBD
    extends IPointer
    permits XrSenseDataProviderCreateInfoBD, XrSenseDataProviderCreateInfoBD.Ptr
{}
