package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataInteractionProfileChanged} and {@link XrEventDataInteractionProfileChanged.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataInteractionProfileChanged
    extends IPointer
    permits XrEventDataInteractionProfileChanged, XrEventDataInteractionProfileChanged.Ptr
{}
