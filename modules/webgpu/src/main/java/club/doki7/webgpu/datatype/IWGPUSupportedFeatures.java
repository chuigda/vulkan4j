package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSupportedFeatures} and {@link WGPUSupportedFeatures.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSupportedFeatures
    extends IPointer
    permits WGPUSupportedFeatures, WGPUSupportedFeatures.Ptr
{}
