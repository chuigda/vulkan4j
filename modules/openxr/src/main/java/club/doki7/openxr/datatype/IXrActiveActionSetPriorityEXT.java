package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActiveActionSetPriorityEXT} and {@link XrActiveActionSetPriorityEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActiveActionSetPriorityEXT
    extends IPointer
    permits XrActiveActionSetPriorityEXT, XrActiveActionSetPriorityEXT.Ptr
{}
