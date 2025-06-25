package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialEntityComponentDataSemanticBD} and {@link XrSpatialEntityComponentDataSemanticBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialEntityComponentDataSemanticBD
    extends IPointer
    permits XrSpatialEntityComponentDataSemanticBD, XrSpatialEntityComponentDataSemanticBD.Ptr
{}
