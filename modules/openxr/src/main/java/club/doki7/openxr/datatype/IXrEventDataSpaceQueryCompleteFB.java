package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceQueryCompleteFB} and {@link XrEventDataSpaceQueryCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceQueryCompleteFB
    extends IPointer
    permits XrEventDataSpaceQueryCompleteFB, XrEventDataSpaceQueryCompleteFB.Ptr
{}
