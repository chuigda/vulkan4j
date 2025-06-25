package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataSpaceSetStatusCompleteFB} and {@link XrEventDataSpaceSetStatusCompleteFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataSpaceSetStatusCompleteFB
    extends IPointer
    permits XrEventDataSpaceSetStatusCompleteFB, XrEventDataSpaceSetStatusCompleteFB.Ptr
{}
