package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActiveActionSet} and {@link XrActiveActionSet.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActiveActionSet
    extends IPointer
    permits XrActiveActionSet, XrActiveActionSet.Ptr
{}
