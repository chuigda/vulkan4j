package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDescriptorImageInfo {
///     VkSampler sampler;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
/// } VkDescriptorImageInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorImageInfo.html">VkDescriptorImageInfo</a>
public record VkDescriptorImageInfo(MemorySegment segment) implements IPointer {
    public VkDescriptorImageInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public @Nullable VkSampler sampler() {
        MemorySegment s = segment.get(LAYOUT$sampler, OFFSET$sampler);
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler(s);
    }

    public void sampler(@Nullable VkSampler value) {
        segment.set(
            LAYOUT$sampler,
            OFFSET$sampler,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkImageView imageView() {
        MemorySegment s = segment.get(LAYOUT$imageView, OFFSET$imageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@Nullable VkImageView value) {
        segment.set(
            LAYOUT$imageView,
            OFFSET$imageView,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkImageLayout.class) int imageLayout() {
        return segment.get(LAYOUT$imageLayout, OFFSET$imageLayout);
    }

    public void imageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);
    }

    public static VkDescriptorImageInfo allocate(Arena arena) {
        return new VkDescriptorImageInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorImageInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("sampler"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("imageLayout");

    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$imageLayout = (OfInt) LAYOUT.select(PATH$imageLayout);

    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);

    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$imageLayout = LAYOUT$imageLayout.byteSize();
}
