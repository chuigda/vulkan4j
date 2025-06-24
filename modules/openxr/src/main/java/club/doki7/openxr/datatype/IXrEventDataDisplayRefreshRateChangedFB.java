package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataDisplayRefreshRateChangedFB} and {@link XrEventDataDisplayRefreshRateChangedFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataDisplayRefreshRateChangedFB
    extends IPointer
    permits XrEventDataDisplayRefreshRateChangedFB, XrEventDataDisplayRefreshRateChangedFB.Ptr
{}
