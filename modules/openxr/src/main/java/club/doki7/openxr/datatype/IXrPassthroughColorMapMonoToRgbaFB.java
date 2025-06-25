package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorMapMonoToRgbaFB} and {@link XrPassthroughColorMapMonoToRgbaFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorMapMonoToRgbaFB
    extends IPointer
    permits XrPassthroughColorMapMonoToRgbaFB, XrPassthroughColorMapMonoToRgbaFB.Ptr
{}
