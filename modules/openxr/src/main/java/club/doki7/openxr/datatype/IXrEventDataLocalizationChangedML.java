package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataLocalizationChangedML} and {@link XrEventDataLocalizationChangedML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataLocalizationChangedML
    extends IPointer
    permits XrEventDataLocalizationChangedML, XrEventDataLocalizationChangedML.Ptr
{}
