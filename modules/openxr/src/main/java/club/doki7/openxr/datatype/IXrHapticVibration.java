package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHapticVibration} and {@link XrHapticVibration.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHapticVibration
    extends IPointer
    permits XrHapticVibration, XrHapticVibration.Ptr
{}
