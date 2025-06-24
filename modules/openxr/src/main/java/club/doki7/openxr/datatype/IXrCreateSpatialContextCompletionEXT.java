package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCreateSpatialContextCompletionEXT} and {@link XrCreateSpatialContextCompletionEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCreateSpatialContextCompletionEXT
    extends IPointer
    permits XrCreateSpatialContextCompletionEXT, XrCreateSpatialContextCompletionEXT.Ptr
{}
