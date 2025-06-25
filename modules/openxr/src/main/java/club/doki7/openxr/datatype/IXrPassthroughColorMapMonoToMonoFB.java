package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorMapMonoToMonoFB} and {@link XrPassthroughColorMapMonoToMonoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorMapMonoToMonoFB
    extends IPointer
    permits XrPassthroughColorMapMonoToMonoFB, XrPassthroughColorMapMonoToMonoFB.Ptr
{}
