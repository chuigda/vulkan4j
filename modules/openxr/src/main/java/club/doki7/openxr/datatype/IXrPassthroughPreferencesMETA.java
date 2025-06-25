package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughPreferencesMETA} and {@link XrPassthroughPreferencesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughPreferencesMETA
    extends IPointer
    permits XrPassthroughPreferencesMETA, XrPassthroughPreferencesMETA.Ptr
{}
