package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceContainerFB} and {@link XrSpaceContainerFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceContainerFB
    extends IPointer
    permits XrSpaceContainerFB, XrSpaceContainerFB.Ptr
{}
