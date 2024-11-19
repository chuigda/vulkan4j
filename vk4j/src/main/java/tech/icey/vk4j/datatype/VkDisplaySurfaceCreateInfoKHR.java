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
/// typedef struct VkDisplaySurfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDisplaySurfaceCreateFlagsKHR flags;
///     VkDisplayModeKHR displayMode;
///     uint32_t planeIndex;
///     uint32_t planeStackIndex;
///     VkSurfaceTransformFlagBitsKHR transform;
///     float globalAlpha;
///     VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
///     VkExtent2D imageExtent;
/// } VkDisplaySurfaceCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplaySurfaceCreateInfoKHR.html">VkDisplaySurfaceCreateInfoKHR</a>
public record VkDisplaySurfaceCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkDisplaySurfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkDisplaySurfaceCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDisplaySurfaceCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkDisplayModeKHR displayMode() {
        MemorySegment s = segment.get(LAYOUT$displayMode, OFFSET$displayMode);
        if (s.address() == 0) {
            return null;
        }
        return new VkDisplayModeKHR(s);
    }

    public void displayMode(@Nullable VkDisplayModeKHR value) {
        segment.set(
            LAYOUT$displayMode,
            OFFSET$displayMode,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int planeIndex() {
        return segment.get(LAYOUT$planeIndex, OFFSET$planeIndex);
    }

    public void planeIndex(@unsigned int value) {
        segment.set(LAYOUT$planeIndex, OFFSET$planeIndex, value);
    }

    public @unsigned int planeStackIndex() {
        return segment.get(LAYOUT$planeStackIndex, OFFSET$planeStackIndex);
    }

    public void planeStackIndex(@unsigned int value) {
        segment.set(LAYOUT$planeStackIndex, OFFSET$planeStackIndex, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int transform() {
        return segment.get(LAYOUT$transform, OFFSET$transform);
    }

    public void transform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$transform, OFFSET$transform, value);
    }

    public float globalAlpha() {
        return segment.get(LAYOUT$globalAlpha, OFFSET$globalAlpha);
    }

    public void globalAlpha(float value) {
        segment.set(LAYOUT$globalAlpha, OFFSET$globalAlpha, value);
    }

    public @enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int alphaMode() {
        return segment.get(LAYOUT$alphaMode, OFFSET$alphaMode);
    }

    public void alphaMode(@enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$alphaMode, OFFSET$alphaMode, value);
    }

    public VkExtent2D imageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, SIZE$imageExtent);
    }

    public static VkDisplaySurfaceCreateInfoKHR allocate(Arena arena) {
        return new VkDisplaySurfaceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplaySurfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplaySurfaceCreateInfoKHR[] ret = new VkDisplaySurfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplaySurfaceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplaySurfaceCreateInfoKHR clone(Arena arena, VkDisplaySurfaceCreateInfoKHR src) {
        VkDisplaySurfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplaySurfaceCreateInfoKHR[] clone(Arena arena, VkDisplaySurfaceCreateInfoKHR[] src) {
        VkDisplaySurfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("displayMode"),
        ValueLayout.JAVA_INT.withName("planeIndex"),
        ValueLayout.JAVA_INT.withName("planeStackIndex"),
        ValueLayout.JAVA_INT.withName("transform"),
        ValueLayout.JAVA_FLOAT.withName("globalAlpha"),
        ValueLayout.JAVA_INT.withName("alphaMode"),
        VkExtent2D.LAYOUT.withName("imageExtent")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$displayMode = PathElement.groupElement("displayMode");
    public static final PathElement PATH$planeIndex = PathElement.groupElement("planeIndex");
    public static final PathElement PATH$planeStackIndex = PathElement.groupElement("planeStackIndex");
    public static final PathElement PATH$transform = PathElement.groupElement("transform");
    public static final PathElement PATH$globalAlpha = PathElement.groupElement("globalAlpha");
    public static final PathElement PATH$alphaMode = PathElement.groupElement("alphaMode");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("imageExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$displayMode = (AddressLayout) LAYOUT.select(PATH$displayMode);
    public static final OfInt LAYOUT$planeIndex = (OfInt) LAYOUT.select(PATH$planeIndex);
    public static final OfInt LAYOUT$planeStackIndex = (OfInt) LAYOUT.select(PATH$planeStackIndex);
    public static final OfInt LAYOUT$transform = (OfInt) LAYOUT.select(PATH$transform);
    public static final OfFloat LAYOUT$globalAlpha = (OfFloat) LAYOUT.select(PATH$globalAlpha);
    public static final OfInt LAYOUT$alphaMode = (OfInt) LAYOUT.select(PATH$alphaMode);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$displayMode = LAYOUT.byteOffset(PATH$displayMode);
    public static final long OFFSET$planeIndex = LAYOUT.byteOffset(PATH$planeIndex);
    public static final long OFFSET$planeStackIndex = LAYOUT.byteOffset(PATH$planeStackIndex);
    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$globalAlpha = LAYOUT.byteOffset(PATH$globalAlpha);
    public static final long OFFSET$alphaMode = LAYOUT.byteOffset(PATH$alphaMode);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$displayMode = LAYOUT$displayMode.byteSize();
    public static final long SIZE$planeIndex = LAYOUT$planeIndex.byteSize();
    public static final long SIZE$planeStackIndex = LAYOUT$planeStackIndex.byteSize();
    public static final long SIZE$transform = LAYOUT$transform.byteSize();
    public static final long SIZE$globalAlpha = LAYOUT$globalAlpha.byteSize();
    public static final long SIZE$alphaMode = LAYOUT$alphaMode.byteSize();
    public static final long SIZE$imageExtent = LAYOUT$imageExtent.byteSize();
}
