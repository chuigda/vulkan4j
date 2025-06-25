package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBoxfKHR} and {@link XrBoxfKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBoxfKHR
    extends IPointer
    permits XrBoxfKHR, XrBoxfKHR.Ptr
{}
