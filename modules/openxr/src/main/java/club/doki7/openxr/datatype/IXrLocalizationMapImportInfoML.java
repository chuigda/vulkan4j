package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLocalizationMapImportInfoML} and {@link XrLocalizationMapImportInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLocalizationMapImportInfoML
    extends IPointer
    permits XrLocalizationMapImportInfoML, XrLocalizationMapImportInfoML.Ptr
{}
