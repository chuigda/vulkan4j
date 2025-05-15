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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBaseOutStructure.html"><code>VkBaseOutStructure</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBaseOutStructure {
///     VkStructureType sType;
///     VkBaseOutStructure* pNext;
/// } VkBaseOutStructure;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBaseOutStructure.html"><code>VkBaseOutStructure</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBaseOutStructure(@NotNull MemorySegment segment) implements IPointer {
    public static VkBaseOutStructure allocate(Arena arena) {
        VkBaseOutStructure ret = new VkBaseOutStructure(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkBaseOutStructure[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBaseOutStructure[] ret = new VkBaseOutStructure[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBaseOutStructure(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkBaseOutStructure clone(Arena arena, VkBaseOutStructure src) {
        VkBaseOutStructure ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBaseOutStructure[] clone(Arena arena, VkBaseOutStructure[] src) {
        VkBaseOutStructure[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="VkBaseOutStructure*") MemorySegment pNextRaw() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNextRaw(@pointer(comment="VkBaseOutStructure*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @Nullable VkBaseOutStructure pNext() {
        MemorySegment s = pNextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBaseOutStructure(s);
    }

    public void pNext(@Nullable VkBaseOutStructure value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNextRaw(s);
    }

    @unsafe public @Nullable VkBaseOutStructure[] pNext(int assumedCount) {
        MemorySegment s = pNextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBaseOutStructure.SIZE);
        VkBaseOutStructure[] ret = new VkBaseOutStructure[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBaseOutStructure(s.asSlice(i * VkBaseOutStructure.SIZE, VkBaseOutStructure.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withTargetLayout(VkBaseOutStructure.LAYOUT).withName("pNext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
}
