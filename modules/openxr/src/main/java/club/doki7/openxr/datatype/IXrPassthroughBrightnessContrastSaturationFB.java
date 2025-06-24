package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughBrightnessContrastSaturationFB} and {@link XrPassthroughBrightnessContrastSaturationFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughBrightnessContrastSaturationFB
    extends IPointer
    permits XrPassthroughBrightnessContrastSaturationFB, XrPassthroughBrightnessContrastSaturationFB.Ptr
{}
