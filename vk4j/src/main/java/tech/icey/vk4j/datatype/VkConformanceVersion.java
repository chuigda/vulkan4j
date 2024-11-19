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
/// typedef struct VkConformanceVersion {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// } VkConformanceVersion;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkConformanceVersion.html">VkConformanceVersion</a>
public record VkConformanceVersion(MemorySegment segment) implements IPointer {
    public VkConformanceVersion(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned byte major() {
        return segment.get(LAYOUT$major, OFFSET$major);
    }

    public void major(@unsigned byte value) {
        segment.set(LAYOUT$major, OFFSET$major, value);
    }

    public @unsigned byte minor() {
        return segment.get(LAYOUT$minor, OFFSET$minor);
    }

    public void minor(@unsigned byte value) {
        segment.set(LAYOUT$minor, OFFSET$minor, value);
    }

    public @unsigned byte subminor() {
        return segment.get(LAYOUT$subminor, OFFSET$subminor);
    }

    public void subminor(@unsigned byte value) {
        segment.set(LAYOUT$subminor, OFFSET$subminor, value);
    }

    public @unsigned byte patch() {
        return segment.get(LAYOUT$patch, OFFSET$patch);
    }

    public void patch(@unsigned byte value) {
        segment.set(LAYOUT$patch, OFFSET$patch, value);
    }

    public static VkConformanceVersion allocate(Arena arena) {
        return new VkConformanceVersion(arena.allocate(LAYOUT));
    }

    public static VkConformanceVersion[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkConformanceVersion[] ret = new VkConformanceVersion[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkConformanceVersion(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkConformanceVersion clone(Arena arena, VkConformanceVersion src) {
        VkConformanceVersion ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkConformanceVersion[] clone(Arena arena, VkConformanceVersion[] src) {
        VkConformanceVersion[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$major = PathElement.groupElement("major");
    public static final PathElement PATH$minor = PathElement.groupElement("minor");
    public static final PathElement PATH$subminor = PathElement.groupElement("subminor");
    public static final PathElement PATH$patch = PathElement.groupElement("patch");

    public static final OfByte LAYOUT$major = (OfByte) LAYOUT.select(PATH$major);
    public static final OfByte LAYOUT$minor = (OfByte) LAYOUT.select(PATH$minor);
    public static final OfByte LAYOUT$subminor = (OfByte) LAYOUT.select(PATH$subminor);
    public static final OfByte LAYOUT$patch = (OfByte) LAYOUT.select(PATH$patch);

    public static final long OFFSET$major = LAYOUT.byteOffset(PATH$major);
    public static final long OFFSET$minor = LAYOUT.byteOffset(PATH$minor);
    public static final long OFFSET$subminor = LAYOUT.byteOffset(PATH$subminor);
    public static final long OFFSET$patch = LAYOUT.byteOffset(PATH$patch);

    public static final long SIZE$major = LAYOUT$major.byteSize();
    public static final long SIZE$minor = LAYOUT$minor.byteSize();
    public static final long SIZE$subminor = LAYOUT$subminor.byteSize();
    public static final long SIZE$patch = LAYOUT$patch.byteSize();
}
