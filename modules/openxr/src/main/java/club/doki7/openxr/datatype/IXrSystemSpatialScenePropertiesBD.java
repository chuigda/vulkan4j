package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpatialScenePropertiesBD} and {@link XrSystemSpatialScenePropertiesBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpatialScenePropertiesBD
    extends IPointer
    permits XrSystemSpatialScenePropertiesBD, XrSystemSpatialScenePropertiesBD.Ptr
{}
