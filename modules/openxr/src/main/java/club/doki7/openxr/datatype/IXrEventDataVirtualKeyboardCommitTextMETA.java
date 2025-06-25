package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataVirtualKeyboardCommitTextMETA} and {@link XrEventDataVirtualKeyboardCommitTextMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataVirtualKeyboardCommitTextMETA
    extends IPointer
    permits XrEventDataVirtualKeyboardCommitTextMETA, XrEventDataVirtualKeyboardCommitTextMETA.Ptr
{}
