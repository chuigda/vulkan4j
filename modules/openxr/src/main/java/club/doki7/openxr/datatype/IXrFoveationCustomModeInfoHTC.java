package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveationCustomModeInfoHTC} and {@link XrFoveationCustomModeInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveationCustomModeInfoHTC
    extends IPointer
    permits XrFoveationCustomModeInfoHTC, XrFoveationCustomModeInfoHTC.Ptr
{}
