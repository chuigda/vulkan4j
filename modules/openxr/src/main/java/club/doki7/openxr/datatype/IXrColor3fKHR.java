package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColor3fKHR} and {@link XrColor3fKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColor3fKHR
    extends IPointer
    permits XrColor3fKHR, XrColor3fKHR.Ptr
{}
