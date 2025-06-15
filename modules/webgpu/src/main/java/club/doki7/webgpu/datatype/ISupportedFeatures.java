package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SupportedFeatures} and {@link SupportedFeatures.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISupportedFeatures
    extends IPointer
    permits SupportedFeatures, SupportedFeatures.Ptr
{}
