package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataQueryInfoBD} and {@link XrSenseDataQueryInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataQueryInfoBD
    extends IPointer
    permits XrSenseDataQueryInfoBD, XrSenseDataQueryInfoBD.Ptr
{}
