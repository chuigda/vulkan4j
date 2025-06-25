package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataEventsLost} and {@link XrEventDataEventsLost.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataEventsLost
    extends IPointer
    permits XrEventDataEventsLost, XrEventDataEventsLost.Ptr
{}
