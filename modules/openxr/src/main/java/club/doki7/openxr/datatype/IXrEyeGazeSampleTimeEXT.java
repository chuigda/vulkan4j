package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEyeGazeSampleTimeEXT} and {@link XrEyeGazeSampleTimeEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEyeGazeSampleTimeEXT
    extends IPointer
    permits XrEyeGazeSampleTimeEXT, XrEyeGazeSampleTimeEXT.Ptr
{}
