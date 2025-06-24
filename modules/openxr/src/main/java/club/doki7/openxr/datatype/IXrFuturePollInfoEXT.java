package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFuturePollInfoEXT} and {@link XrFuturePollInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFuturePollInfoEXT
    extends IPointer
    permits XrFuturePollInfoEXT, XrFuturePollInfoEXT.Ptr
{}
