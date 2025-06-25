package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVirtualKeyboardTextContextChangeInfoMETA} and {@link XrVirtualKeyboardTextContextChangeInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVirtualKeyboardTextContextChangeInfoMETA
    extends IPointer
    permits XrVirtualKeyboardTextContextChangeInfoMETA, XrVirtualKeyboardTextContextChangeInfoMETA.Ptr
{}
