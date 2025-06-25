package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataUserPresenceChangedEXT} and {@link XrEventDataUserPresenceChangedEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataUserPresenceChangedEXT
    extends IPointer
    permits XrEventDataUserPresenceChangedEXT, XrEventDataUserPresenceChangedEXT.Ptr
{}
