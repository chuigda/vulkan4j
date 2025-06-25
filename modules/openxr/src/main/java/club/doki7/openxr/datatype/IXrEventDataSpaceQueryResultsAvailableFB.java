package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceQueryResultsAvailableFB} and {@link XrEventDataSpaceQueryResultsAvailableFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceQueryResultsAvailableFB
    extends IPointer
    permits XrEventDataSpaceQueryResultsAvailableFB, XrEventDataSpaceQueryResultsAvailableFB.Ptr
{}
