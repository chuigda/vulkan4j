package club.doki7.shaderc.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ShadercIncludeResult} and {@link ShadercIncludeResult.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IShadercIncludeResult
    extends IPointer
    permits ShadercIncludeResult, ShadercIncludeResult.Ptr
{}
