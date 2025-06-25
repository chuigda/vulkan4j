package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMapLocalizationRequestInfoML} and {@link XrMapLocalizationRequestInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMapLocalizationRequestInfoML
    extends IPointer
    permits XrMapLocalizationRequestInfoML, XrMapLocalizationRequestInfoML.Ptr
{}
