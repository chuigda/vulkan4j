package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkIndirectCommandsExecutionSetTokenEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$shaderStages = ValueLayout.JAVA_INT.withName("shaderStages");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$type, LAYOUT$shaderStages);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkIndirectCommandsExecutionSetTokenEXT allocate(Arena arena) {
        return new VkIndirectCommandsExecutionSetTokenEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsExecutionSetTokenEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsExecutionSetTokenEXT[] ret = new VkIndirectCommandsExecutionSetTokenEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsExecutionSetTokenEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIndirectCommandsExecutionSetTokenEXT clone(Arena arena, VkIndirectCommandsExecutionSetTokenEXT src) {
        VkIndirectCommandsExecutionSetTokenEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsExecutionSetTokenEXT[] clone(Arena arena, VkIndirectCommandsExecutionSetTokenEXT[] src) {
        VkIndirectCommandsExecutionSetTokenEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$shaderStages = PathElement.groupElement("PATH$shaderStages");

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$shaderStages = LAYOUT$shaderStages.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$shaderStages = LAYOUT.byteOffset(PATH$shaderStages);

    public @enumtype(VkIndirectExecutionSetInfoTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkIndirectExecutionSetInfoTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkShaderStageFlags.class) int shaderStages() {
        return segment.get(LAYOUT$shaderStages, OFFSET$shaderStages);
    }

    public void shaderStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$shaderStages, OFFSET$shaderStages, value);
    }

}
/// dummy, not implemented yet
