package club.doki7.webgpu;

import club.doki7.ffm.annotation.*;

public interface WGPUConstants {
    @Unsigned int ARRAY_LAYER_COUNT_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int COPY_STRIDE_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int DEPTH_SLICE_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int LIMIT_U32_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int MIP_LEVEL_COUNT_UNDEFINED = 0xFFFFFFFF;
    @Unsigned int QUERY_SET_INDEX_UNDEFINED = 0xFFFFFFFF;
    @Unsigned long LIMIT_U64_UNDEFINED = 0xFFFFFFFF_FFFFFFFFL;
    long WHOLE_MAP_SIZE = 0xFFFFFFFF_FFFFFFFFL;
    @Unsigned long WHOLE_SIZE = 0xFFFFFFFF_FFFFFFFFL;
}
