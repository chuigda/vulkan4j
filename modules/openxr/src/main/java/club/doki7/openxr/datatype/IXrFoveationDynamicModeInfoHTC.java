package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveationDynamicModeInfoHTC} and {@link XrFoveationDynamicModeInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveationDynamicModeInfoHTC
    extends IPointer
    permits XrFoveationDynamicModeInfoHTC, XrFoveationDynamicModeInfoHTC.Ptr
{}
