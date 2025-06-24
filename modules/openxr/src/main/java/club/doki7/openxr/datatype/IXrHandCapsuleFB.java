package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandCapsuleFB} and {@link XrHandCapsuleFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandCapsuleFB
    extends IPointer
    permits XrHandCapsuleFB, XrHandCapsuleFB.Ptr
{}
