package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemUserPresencePropertiesEXT} and {@link XrSystemUserPresencePropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemUserPresencePropertiesEXT
    extends IPointer
    permits XrSystemUserPresencePropertiesEXT, XrSystemUserPresencePropertiesEXT.Ptr
{}
