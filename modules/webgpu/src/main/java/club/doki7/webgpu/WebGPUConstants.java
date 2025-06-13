package club.doki7.webgpu;

import club.doki7.ffm.annotation.*;

public interface WebGPUConstants {
    int FALSE = 0x0;
    int TRUE = 0x1;
    long ARRAY_LAYER_COUNT_UNDEFINED = 0xFFFFFFFFL;
    long COPY_STRIDE_UNDEFINED = 0xFFFFFFFFL;
    float DEPTH_CLEAR_VALUE_UNDEFINED = Float.NaN;
    long DEPTH_SLICE_UNDEFINED = 0xFFFFFFFFL;
    long LIMIT_U32_UNDEFINED = 0xFFFFFFFFL;
    long LIMIT_U64_UNDEFINED = new BigInteger("FFFFFFFFFFFFFFFF", 16);
    long MIP_LEVEL_COUNT_UNDEFINED = 0xFFFFFFFFL;
    long QUERY_SET_INDEX_UNDEFINED = 0xFFFFFFFFL;
    long STRLEN = new BigInteger("FFFFFFFFFFFFFFFF", 16);
    long WHOLE_MAP_SIZE = new BigInteger("FFFFFFFFFFFFFFFF", 16);
    long WHOLE_SIZE = new BigInteger("FFFFFFFFFFFFFFFF", 16);
}
