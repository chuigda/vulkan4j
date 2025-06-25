package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceShareCompleteFB} and {@link XrEventDataSpaceShareCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceShareCompleteFB
    extends IPointer
    permits XrEventDataSpaceShareCompleteFB, XrEventDataSpaceShareCompleteFB.Ptr
{}
