package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataPerfSettingsEXT} and {@link XrEventDataPerfSettingsEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataPerfSettingsEXT
    extends IPointer
    permits XrEventDataPerfSettingsEXT, XrEventDataPerfSettingsEXT.Ptr
{}
