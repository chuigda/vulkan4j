package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFutureCancelInfoEXT} and {@link XrFutureCancelInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFutureCancelInfoEXT
    extends IPointer
    permits XrFutureCancelInfoEXT, XrFutureCancelInfoEXT.Ptr
{}
