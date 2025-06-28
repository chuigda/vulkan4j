package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSupportedWgslLanguageFeatures} and {@link WGPUSupportedWgslLanguageFeatures.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSupportedWgslLanguageFeatures
    extends IPointer
    permits WGPUSupportedWgslLanguageFeatures, WGPUSupportedWgslLanguageFeatures.Ptr
{}
