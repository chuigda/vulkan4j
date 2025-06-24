package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSessionStateChanged} and {@link XrEventDataSessionStateChanged.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSessionStateChanged
    extends IPointer
    permits XrEventDataSessionStateChanged, XrEventDataSessionStateChanged.Ptr
{}
