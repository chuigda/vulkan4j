package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264MemMgmtControlOp.html">StdVideoH264MemMgmtControlOp</a>
public final class StdVideoH264MemMgmtControlOp {
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_END = 0;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM = 1;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM = 2;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM = 3;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX = 4;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL = 5;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM = 6;
    public static final int STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264MemMgmtControlOp.class) int value) {
        return switch (value) {
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_END -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_END";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM";
            case StdVideoH264MemMgmtControlOp.STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM -> "STD_VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM";
            default -> "Unknown StdVideoH264MemMgmtControlOp: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264MemMgmtControlOp() {}
}
