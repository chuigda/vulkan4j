package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEyeGazeFB} and {@link XrEyeGazeFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEyeGazeFB
    extends IPointer
    permits XrEyeGazeFB, XrEyeGazeFB.Ptr
{}
