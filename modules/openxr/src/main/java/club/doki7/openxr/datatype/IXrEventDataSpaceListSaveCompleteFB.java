package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceListSaveCompleteFB} and {@link XrEventDataSpaceListSaveCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceListSaveCompleteFB
    extends IPointer
    permits XrEventDataSpaceListSaveCompleteFB, XrEventDataSpaceListSaveCompleteFB.Ptr
{}
