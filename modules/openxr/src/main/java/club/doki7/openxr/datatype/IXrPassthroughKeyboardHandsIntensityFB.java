package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughKeyboardHandsIntensityFB} and {@link XrPassthroughKeyboardHandsIntensityFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughKeyboardHandsIntensityFB
    extends IPointer
    permits XrPassthroughKeyboardHandsIntensityFB, XrPassthroughKeyboardHandsIntensityFB.Ptr
{}
