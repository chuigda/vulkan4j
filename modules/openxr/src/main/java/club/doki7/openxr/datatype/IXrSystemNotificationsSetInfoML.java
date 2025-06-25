package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemNotificationsSetInfoML} and {@link XrSystemNotificationsSetInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemNotificationsSetInfoML
    extends IPointer
    permits XrSystemNotificationsSetInfoML, XrSystemNotificationsSetInfoML.Ptr
{}
