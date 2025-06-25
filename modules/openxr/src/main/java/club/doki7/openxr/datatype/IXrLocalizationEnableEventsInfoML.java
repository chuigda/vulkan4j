package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLocalizationEnableEventsInfoML} and {@link XrLocalizationEnableEventsInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLocalizationEnableEventsInfoML
    extends IPointer
    permits XrLocalizationEnableEventsInfoML, XrLocalizationEnableEventsInfoML.Ptr
{}
