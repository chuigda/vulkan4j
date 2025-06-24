package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEyeGazesFB} and {@link XrEyeGazesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEyeGazesFB
    extends IPointer
    permits XrEyeGazesFB, XrEyeGazesFB.Ptr
{}
