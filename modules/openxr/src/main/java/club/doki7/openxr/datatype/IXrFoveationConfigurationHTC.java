package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveationConfigurationHTC} and {@link XrFoveationConfigurationHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveationConfigurationHTC
    extends IPointer
    permits XrFoveationConfigurationHTC, XrFoveationConfigurationHTC.Ptr
{}
