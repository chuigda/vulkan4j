package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link LUID} and {@link LUID.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ILUID
    extends IPointer
    permits LUID, LUID.Ptr
{}
