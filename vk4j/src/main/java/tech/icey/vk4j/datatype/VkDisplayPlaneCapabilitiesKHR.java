package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDisplayPlaneCapabilitiesKHR {
///     VkDisplayPlaneAlphaFlagsKHR supportedAlpha;
///     VkOffset2D minSrcPosition;
///     VkOffset2D maxSrcPosition;
///     VkExtent2D minSrcExtent;
///     VkExtent2D maxSrcExtent;
///     VkOffset2D minDstPosition;
///     VkOffset2D maxDstPosition;
///     VkExtent2D minDstExtent;
///     VkExtent2D maxDstExtent;
/// } VkDisplayPlaneCapabilitiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplayPlaneCapabilitiesKHR.html">VkDisplayPlaneCapabilitiesKHR</a>
public record VkDisplayPlaneCapabilitiesKHR(MemorySegment segment) implements IPointer {
    public VkDisplayPlaneCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int supportedAlpha() {
        return segment.get(LAYOUT$supportedAlpha, OFFSET$supportedAlpha);
    }

    public void supportedAlpha(@enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedAlpha, OFFSET$supportedAlpha, value);
    }

    public VkOffset2D minSrcPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$minSrcPosition, LAYOUT$minSrcPosition));
    }

    public void minSrcPosition(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minSrcPosition, SIZE$minSrcPosition);
    }

    public VkOffset2D maxSrcPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$maxSrcPosition, LAYOUT$maxSrcPosition));
    }

    public void maxSrcPosition(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSrcPosition, SIZE$maxSrcPosition);
    }

    public VkExtent2D minSrcExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minSrcExtent, LAYOUT$minSrcExtent));
    }

    public void minSrcExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minSrcExtent, SIZE$minSrcExtent);
    }

    public VkExtent2D maxSrcExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxSrcExtent, LAYOUT$maxSrcExtent));
    }

    public void maxSrcExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSrcExtent, SIZE$maxSrcExtent);
    }

    public VkOffset2D minDstPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$minDstPosition, LAYOUT$minDstPosition));
    }

    public void minDstPosition(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minDstPosition, SIZE$minDstPosition);
    }

    public VkOffset2D maxDstPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$maxDstPosition, LAYOUT$maxDstPosition));
    }

    public void maxDstPosition(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxDstPosition, SIZE$maxDstPosition);
    }

    public VkExtent2D minDstExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minDstExtent, LAYOUT$minDstExtent));
    }

    public void minDstExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minDstExtent, SIZE$minDstExtent);
    }

    public VkExtent2D maxDstExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxDstExtent, LAYOUT$maxDstExtent));
    }

    public void maxDstExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxDstExtent, SIZE$maxDstExtent);
    }

    public static VkDisplayPlaneCapabilitiesKHR allocate(Arena arena) {
        return new VkDisplayPlaneCapabilitiesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkDisplayPlaneCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlaneCapabilitiesKHR[] ret = new VkDisplayPlaneCapabilitiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayPlaneCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayPlaneCapabilitiesKHR clone(Arena arena, VkDisplayPlaneCapabilitiesKHR src) {
        VkDisplayPlaneCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPlaneCapabilitiesKHR[] clone(Arena arena, VkDisplayPlaneCapabilitiesKHR[] src) {
        VkDisplayPlaneCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("supportedAlpha"),
        VkOffset2D.LAYOUT.withName("minSrcPosition"),
        VkOffset2D.LAYOUT.withName("maxSrcPosition"),
        VkExtent2D.LAYOUT.withName("minSrcExtent"),
        VkExtent2D.LAYOUT.withName("maxSrcExtent"),
        VkOffset2D.LAYOUT.withName("minDstPosition"),
        VkOffset2D.LAYOUT.withName("maxDstPosition"),
        VkExtent2D.LAYOUT.withName("minDstExtent"),
        VkExtent2D.LAYOUT.withName("maxDstExtent")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$supportedAlpha = PathElement.groupElement("supportedAlpha");
    public static final PathElement PATH$minSrcPosition = PathElement.groupElement("minSrcPosition");
    public static final PathElement PATH$maxSrcPosition = PathElement.groupElement("maxSrcPosition");
    public static final PathElement PATH$minSrcExtent = PathElement.groupElement("minSrcExtent");
    public static final PathElement PATH$maxSrcExtent = PathElement.groupElement("maxSrcExtent");
    public static final PathElement PATH$minDstPosition = PathElement.groupElement("minDstPosition");
    public static final PathElement PATH$maxDstPosition = PathElement.groupElement("maxDstPosition");
    public static final PathElement PATH$minDstExtent = PathElement.groupElement("minDstExtent");
    public static final PathElement PATH$maxDstExtent = PathElement.groupElement("maxDstExtent");

    public static final OfInt LAYOUT$supportedAlpha = (OfInt) LAYOUT.select(PATH$supportedAlpha);
    public static final StructLayout LAYOUT$minSrcPosition = (StructLayout) LAYOUT.select(PATH$minSrcPosition);
    public static final StructLayout LAYOUT$maxSrcPosition = (StructLayout) LAYOUT.select(PATH$maxSrcPosition);
    public static final StructLayout LAYOUT$minSrcExtent = (StructLayout) LAYOUT.select(PATH$minSrcExtent);
    public static final StructLayout LAYOUT$maxSrcExtent = (StructLayout) LAYOUT.select(PATH$maxSrcExtent);
    public static final StructLayout LAYOUT$minDstPosition = (StructLayout) LAYOUT.select(PATH$minDstPosition);
    public static final StructLayout LAYOUT$maxDstPosition = (StructLayout) LAYOUT.select(PATH$maxDstPosition);
    public static final StructLayout LAYOUT$minDstExtent = (StructLayout) LAYOUT.select(PATH$minDstExtent);
    public static final StructLayout LAYOUT$maxDstExtent = (StructLayout) LAYOUT.select(PATH$maxDstExtent);

    public static final long OFFSET$supportedAlpha = LAYOUT.byteOffset(PATH$supportedAlpha);
    public static final long OFFSET$minSrcPosition = LAYOUT.byteOffset(PATH$minSrcPosition);
    public static final long OFFSET$maxSrcPosition = LAYOUT.byteOffset(PATH$maxSrcPosition);
    public static final long OFFSET$minSrcExtent = LAYOUT.byteOffset(PATH$minSrcExtent);
    public static final long OFFSET$maxSrcExtent = LAYOUT.byteOffset(PATH$maxSrcExtent);
    public static final long OFFSET$minDstPosition = LAYOUT.byteOffset(PATH$minDstPosition);
    public static final long OFFSET$maxDstPosition = LAYOUT.byteOffset(PATH$maxDstPosition);
    public static final long OFFSET$minDstExtent = LAYOUT.byteOffset(PATH$minDstExtent);
    public static final long OFFSET$maxDstExtent = LAYOUT.byteOffset(PATH$maxDstExtent);

    public static final long SIZE$supportedAlpha = LAYOUT$supportedAlpha.byteSize();
    public static final long SIZE$minSrcPosition = LAYOUT$minSrcPosition.byteSize();
    public static final long SIZE$maxSrcPosition = LAYOUT$maxSrcPosition.byteSize();
    public static final long SIZE$minSrcExtent = LAYOUT$minSrcExtent.byteSize();
    public static final long SIZE$maxSrcExtent = LAYOUT$maxSrcExtent.byteSize();
    public static final long SIZE$minDstPosition = LAYOUT$minDstPosition.byteSize();
    public static final long SIZE$maxDstPosition = LAYOUT$maxDstPosition.byteSize();
    public static final long SIZE$minDstExtent = LAYOUT$minDstExtent.byteSize();
    public static final long SIZE$maxDstExtent = LAYOUT$maxDstExtent.byteSize();
}
