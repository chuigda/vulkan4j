package club.doki7.webgpu;

import club.doki7.ffm.annotation.*;

public interface WGPUConstants {
    @Unsigned int WGPU_ARRAY_LAYER_COUNT_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int WGPU_COPY_STRIDE_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int WGPU_DEPTH_SLICE_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int WGPU_LIMIT_U32_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int WGPU_MIP_LEVEL_COUNT_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int WGPU_QUERY_SET_INDEX_UNDEFINED = 0xFFFFFFFF;
    @Unsigned long WGPU_LIMIT_U64_UNDEFINED = 0xFFFFFFFF_FFFFFFFFL;
    long WGPU_WHOLE_MAP_SIZE = 0xFFFFFFFF_FFFFFFFFL;
    @Unsigned long WGPU_WHOLE_SIZE = 0xFFFFFFFF_FFFFFFFFL;
}
