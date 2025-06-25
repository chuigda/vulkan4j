package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceSaveCompleteFB} and {@link XrEventDataSpaceSaveCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceSaveCompleteFB
    extends IPointer
    permits XrEventDataSpaceSaveCompleteFB, XrEventDataSpaceSaveCompleteFB.Ptr
{}
