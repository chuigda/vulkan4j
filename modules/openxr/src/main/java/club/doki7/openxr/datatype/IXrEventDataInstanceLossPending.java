package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataInstanceLossPending} and {@link XrEventDataInstanceLossPending.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataInstanceLossPending
    extends IPointer
    permits XrEventDataInstanceLossPending, XrEventDataInstanceLossPending.Ptr
{}
