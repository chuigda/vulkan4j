package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemEyeGazeInteractionPropertiesEXT} and {@link XrSystemEyeGazeInteractionPropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemEyeGazeInteractionPropertiesEXT
    extends IPointer
    permits XrSystemEyeGazeInteractionPropertiesEXT, XrSystemEyeGazeInteractionPropertiesEXT.Ptr
{}
