package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSenseDataFilterUuidBD} and {@link XrSenseDataFilterUuidBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSenseDataFilterUuidBD
    extends IPointer
    permits XrSenseDataFilterUuidBD, XrSenseDataFilterUuidBD.Ptr
{}
