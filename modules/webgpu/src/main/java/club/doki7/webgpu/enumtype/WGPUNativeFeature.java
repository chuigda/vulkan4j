package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUNativeFeature {
    public static final int PushConstants = 0x30001;
    public static final int TextureAdapterSpecificFormatFeatures = 0x30002;
    public static final int MultiDrawIndirect = 0x30003;
    public static final int MultiDrawIndirectCount = 0x30004;
    public static final int VertexWritableStorage = 0x30005;
    public static final int TextureBindingArray = 0x30006;
    public static final int SampledTextureAndStorageBufferArrayNonUniformIndexing = 0x30007;
    public static final int PipelineStatisticsQuery = 0x30008;
    public static final int StorageResourceBindingArray = 0x30009;
    public static final int PartiallyBoundBindingArray = 0x3000a;
    public static final int TextureFormat16bitNorm = 0x3000b;
    public static final int TextureCompressionAstcHdr = 0x3000c;
    public static final int MappablePrimaryBuffers = 0x3000e;
    public static final int BufferBindingArray = 0x3000f;
    public static final int UniformBufferAndStorageTextureArrayNonUniformIndexing = 0x30010;
    public static final int SpirvShaderPassthrough = 0x30017;
    public static final int VertexAttribute64bit = 0x30019;
    public static final int TextureFormatNv12 = 0x3001a;
    public static final int RayTracingAccelerationStructure = 0x3001b;
    public static final int RayQuery = 0x3001c;
    public static final int ShaderF64 = 0x3001d;
    public static final int ShaderI16 = 0x3001e;
    public static final int ShaderPrimitiveIndex = 0x3001f;
    public static final int ShaderEarlyDepthTest = 0x30020;
    public static final int Subgroup = 0x30021;
    public static final int SubgroupVertex = 0x30022;
    public static final int SubgroupBarrier = 0x30023;
    public static final int TimestampQueryInsideEncoders = 0x30024;
    public static final int TimestampQueryInsidePasses = 0x30025;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUNativeFeature.class) int value) {
        return switch (value) {
            case WGPUNativeFeature.BufferBindingArray -> "BufferBindingArray";
            case WGPUNativeFeature.Force32 -> "Force32";
            case WGPUNativeFeature.MappablePrimaryBuffers -> "MappablePrimaryBuffers";
            case WGPUNativeFeature.MultiDrawIndirect -> "MultiDrawIndirect";
            case WGPUNativeFeature.MultiDrawIndirectCount -> "MultiDrawIndirectCount";
            case WGPUNativeFeature.PartiallyBoundBindingArray -> "PartiallyBoundBindingArray";
            case WGPUNativeFeature.PipelineStatisticsQuery -> "PipelineStatisticsQuery";
            case WGPUNativeFeature.PushConstants -> "PushConstants";
            case WGPUNativeFeature.RayQuery -> "RayQuery";
            case WGPUNativeFeature.RayTracingAccelerationStructure -> "RayTracingAccelerationStructure";
            case WGPUNativeFeature.SampledTextureAndStorageBufferArrayNonUniformIndexing -> "SampledTextureAndStorageBufferArrayNonUniformIndexing";
            case WGPUNativeFeature.ShaderEarlyDepthTest -> "ShaderEarlyDepthTest";
            case WGPUNativeFeature.ShaderF64 -> "ShaderF64";
            case WGPUNativeFeature.ShaderI16 -> "ShaderI16";
            case WGPUNativeFeature.ShaderPrimitiveIndex -> "ShaderPrimitiveIndex";
            case WGPUNativeFeature.SpirvShaderPassthrough -> "SpirvShaderPassthrough";
            case WGPUNativeFeature.StorageResourceBindingArray -> "StorageResourceBindingArray";
            case WGPUNativeFeature.Subgroup -> "Subgroup";
            case WGPUNativeFeature.SubgroupBarrier -> "SubgroupBarrier";
            case WGPUNativeFeature.SubgroupVertex -> "SubgroupVertex";
            case WGPUNativeFeature.TextureAdapterSpecificFormatFeatures -> "TextureAdapterSpecificFormatFeatures";
            case WGPUNativeFeature.TextureBindingArray -> "TextureBindingArray";
            case WGPUNativeFeature.TextureCompressionAstcHdr -> "TextureCompressionAstcHdr";
            case WGPUNativeFeature.TextureFormat16bitNorm -> "TextureFormat16bitNorm";
            case WGPUNativeFeature.TextureFormatNv12 -> "TextureFormatNv12";
            case WGPUNativeFeature.TimestampQueryInsideEncoders -> "TimestampQueryInsideEncoders";
            case WGPUNativeFeature.TimestampQueryInsidePasses -> "TimestampQueryInsidePasses";
            case WGPUNativeFeature.UniformBufferAndStorageTextureArrayNonUniformIndexing -> "UniformBufferAndStorageTextureArrayNonUniformIndexing";
            case WGPUNativeFeature.VertexAttribute64bit -> "VertexAttribute64bit";
            case WGPUNativeFeature.VertexWritableStorage -> "VertexWritableStorage";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUNativeFeature() {}
}
