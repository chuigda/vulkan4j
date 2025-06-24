package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandTrackingDataSourceInfoEXT} and {@link XrHandTrackingDataSourceInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandTrackingDataSourceInfoEXT
    extends IPointer
    permits XrHandTrackingDataSourceInfoEXT, XrHandTrackingDataSourceInfoEXT.Ptr
{}
