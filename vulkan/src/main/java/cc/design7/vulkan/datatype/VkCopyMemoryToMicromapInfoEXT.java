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

/// Represents a pointer to a {@code VkCopyMemoryToMicromapInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyMemoryToMicromapInfoEXT.html">VkCopyMemoryToMicromapInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCopyMemoryToMicromapInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkCopyMemoryToMicromapInfoEXT {
        sType(VkStructureType.COPY_MEMORY_TO_MICROMAP_INFO_EXT);
    }

    public static VkCopyMemoryToMicromapInfoEXT allocate(Arena arena) {
        return new VkCopyMemoryToMicromapInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkCopyMemoryToMicromapInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyMemoryToMicromapInfoEXT[] ret = new VkCopyMemoryToMicromapInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyMemoryToMicromapInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyMemoryToMicromapInfoEXT clone(Arena arena, VkCopyMemoryToMicromapInfoEXT src) {
        VkCopyMemoryToMicromapInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyMemoryToMicromapInfoEXT[] clone(Arena arena, VkCopyMemoryToMicromapInfoEXT[] src) {
        VkCopyMemoryToMicromapInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
        ValueLayout.ADDRESS.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$src = PathElement.groupElement("PATH$src");
    public static final PathElement PATH$dst = PathElement.groupElement("PATH$dst");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$src = (StructLayout) LAYOUT.select(PATH$src);
    public static final AddressLayout LAYOUT$dst = (AddressLayout) LAYOUT.select(PATH$dst);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$src = LAYOUT$src.byteSize();
    public static final long SIZE$dst = LAYOUT$dst.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$src = LAYOUT.byteOffset(PATH$src);
    public static final long OFFSET$dst = LAYOUT.byteOffset(PATH$dst);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkDeviceOrHostAddressConstKHR src() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$src, LAYOUT$src));
    }

    public void src(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$src, SIZE$src);
    }

    public @Nullable VkMicromapEXT dst() {
        MemorySegment s = segment.asSlice(OFFSET$dst, SIZE$dst);
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void dst(@Nullable VkMicromapEXT value) {
        segment.set(LAYOUT$dst, OFFSET$dst, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkCopyMicromapModeEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkCopyMicromapModeEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

}
