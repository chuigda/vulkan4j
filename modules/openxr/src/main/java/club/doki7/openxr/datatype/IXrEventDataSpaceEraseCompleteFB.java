package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceEraseCompleteFB} and {@link XrEventDataSpaceEraseCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceEraseCompleteFB
    extends IPointer
    permits XrEventDataSpaceEraseCompleteFB, XrEventDataSpaceEraseCompleteFB.Ptr
{}
