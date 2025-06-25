package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBaseInStructure} and {@link XrBaseInStructure.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBaseInStructure
    extends IPointer
    permits XrBaseInStructure, XrBaseInStructure.Ptr
{}
