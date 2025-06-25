package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandTrackingDataSourceStateEXT} and {@link XrHandTrackingDataSourceStateEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandTrackingDataSourceStateEXT
    extends IPointer
    permits XrHandTrackingDataSourceStateEXT, XrHandTrackingDataSourceStateEXT.Ptr
{}
