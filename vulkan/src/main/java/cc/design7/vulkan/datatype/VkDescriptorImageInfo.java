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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorImageInfo.html">VkDescriptorImageInfo</a>
@ValueBasedCandidate
public record VkDescriptorImageInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$sampler = ValueLayout.ADDRESS.withName("sampler");
    public static final AddressLayout LAYOUT$imageView = ValueLayout.ADDRESS.withName("imageView");
    public static final OfInt LAYOUT$imageLayout = ValueLayout.JAVA_INT.withName("imageLayout");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sampler, LAYOUT$imageView, LAYOUT$imageLayout);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorImageInfo allocate(Arena arena) {
        return new VkDescriptorImageInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorImageInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorImageInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorImageInfo clone(Arena arena, VkDescriptorImageInfo src) {
        VkDescriptorImageInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorImageInfo[] clone(Arena arena, VkDescriptorImageInfo[] src) {
        VkDescriptorImageInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sampler = PathElement.groupElement("PATH$sampler");
    public static final PathElement PATH$imageView = PathElement.groupElement("PATH$imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("PATH$imageLayout");

    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$imageLayout = LAYOUT$imageLayout.byteSize();

    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);

    public @Nullable VkSampler sampler() {
        MemorySegment s = segment.asSlice(OFFSET$sampler, SIZE$sampler);
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler(s);
    }

    public void sampler() {
        segment.set(LAYOUT$sampler, OFFSET$sampler, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkImageView imageView() {
        MemorySegment s = segment.asSlice(OFFSET$imageView, SIZE$imageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView() {
        segment.set(LAYOUT$imageView, OFFSET$imageView, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageLayout.class) int imageLayout() {
        return segment.get(LAYOUT$imageLayout, OFFSET$imageLayout);
    }

    public void imageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);
    }

}
