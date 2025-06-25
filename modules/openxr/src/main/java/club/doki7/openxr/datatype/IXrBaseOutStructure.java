package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBaseOutStructure} and {@link XrBaseOutStructure.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBaseOutStructure
    extends IPointer
    permits XrBaseOutStructure, XrBaseOutStructure.Ptr
{}
