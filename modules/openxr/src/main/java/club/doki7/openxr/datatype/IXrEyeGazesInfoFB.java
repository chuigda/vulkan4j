package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEyeGazesInfoFB} and {@link XrEyeGazesInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEyeGazesInfoFB
    extends IPointer
    permits XrEyeGazesInfoFB, XrEyeGazesInfoFB.Ptr
{}
