package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBoundSourcesForActionEnumerateInfo} and {@link XrBoundSourcesForActionEnumerateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBoundSourcesForActionEnumerateInfo
    extends IPointer
    permits XrBoundSourcesForActionEnumerateInfo, XrBoundSourcesForActionEnumerateInfo.Ptr
{}
