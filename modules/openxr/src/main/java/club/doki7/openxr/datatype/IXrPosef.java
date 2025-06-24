package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPosef} and {@link XrPosef.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPosef
    extends IPointer
    permits XrPosef, XrPosef.Ptr
{}
