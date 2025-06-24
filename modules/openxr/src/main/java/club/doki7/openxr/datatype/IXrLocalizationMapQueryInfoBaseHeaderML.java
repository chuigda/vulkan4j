package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLocalizationMapQueryInfoBaseHeaderML} and {@link XrLocalizationMapQueryInfoBaseHeaderML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLocalizationMapQueryInfoBaseHeaderML
    extends IPointer
    permits XrLocalizationMapQueryInfoBaseHeaderML, XrLocalizationMapQueryInfoBaseHeaderML.Ptr
{}
