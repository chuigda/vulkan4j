package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataHeadsetFitChangedML} and {@link XrEventDataHeadsetFitChangedML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataHeadsetFitChangedML
    extends IPointer
    permits XrEventDataHeadsetFitChangedML, XrEventDataHeadsetFitChangedML.Ptr
{}
