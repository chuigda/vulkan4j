package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActiveActionSetPrioritiesEXT} and {@link XrActiveActionSetPrioritiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActiveActionSetPrioritiesEXT
    extends IPointer
    permits XrActiveActionSetPrioritiesEXT, XrActiveActionSetPrioritiesEXT.Ptr
{}
