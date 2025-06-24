package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLocalizationMapML} and {@link XrLocalizationMapML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLocalizationMapML
    extends IPointer
    permits XrLocalizationMapML, XrLocalizationMapML.Ptr
{}
