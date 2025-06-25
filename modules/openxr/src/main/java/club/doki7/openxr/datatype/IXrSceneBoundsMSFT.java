package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneBoundsMSFT} and {@link XrSceneBoundsMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneBoundsMSFT
    extends IPointer
    permits XrSceneBoundsMSFT, XrSceneBoundsMSFT.Ptr
{}
