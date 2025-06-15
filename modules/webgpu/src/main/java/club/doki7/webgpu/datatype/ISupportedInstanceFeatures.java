package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SupportedInstanceFeatures} and {@link SupportedInstanceFeatures.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISupportedInstanceFeatures
    extends IPointer
    permits SupportedInstanceFeatures, SupportedInstanceFeatures.Ptr
{}
