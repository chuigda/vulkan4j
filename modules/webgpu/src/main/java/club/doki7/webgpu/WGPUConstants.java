package club.doki7.webgpu;

import club.doki7.ffm.annotation.*;

public interface WGPUConstants {
    @Unsigned int WGPU_ARRAY_LAYER_COUNT_UNDEFINED = NativeLayout.UINT32_MAX;
    @Unsigned int WGPU_COPY_STRIDE_UNDEFINED = NativeLayout.UINT32_MAX;
    @Unsigned int WGPU_DEPTH_SLICE_UNDEFINED = NativeLayout.UINT32_MAX;
    @Unsigned int WGPU_LIMIT_U32_UNDEFINED = NativeLayout.UINT32_MAX;
    @Unsigned long WGPU_LIMIT_U64_UNDEFINED = NativeLayout.UINT64_MAX;
    @Unsigned int WGPU_MIP_LEVEL_COUNT_UNDEFINED = NativeLayout.UINT32_MAX;
    @Unsigned int WGPU_QUERY_SET_INDEX_UNDEFINED = NativeLayout.UINT32_MAX;
    long WGPU_WHOLE_MAP_SIZE = NativeLayout.UINT64_MAX;
    @Unsigned long WGPU_WHOLE_SIZE = NativeLayout.UINT64_MAX;
}
