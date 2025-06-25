package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrUuid} and {@link XrUuid.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrUuid
    extends IPointer
    permits XrUuid, XrUuid.Ptr
{}
