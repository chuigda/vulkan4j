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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryKeysAndDataKHR.html"><code>VkPipelineBinaryKeysAndDataKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineBinaryKeysAndDataKHR {
///     uint32_t binaryCount;
///     VkPipelineBinaryKeyKHR const* pPipelineBinaryKeys;
///     VkPipelineBinaryDataKHR const* pPipelineBinaryData;
/// } VkPipelineBinaryKeysAndDataKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryKeysAndDataKHR.html"><code>VkPipelineBinaryKeysAndDataKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineBinaryKeysAndDataKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineBinaryKeysAndDataKHR allocate(Arena arena) {
        VkPipelineBinaryKeysAndDataKHR ret = new VkPipelineBinaryKeysAndDataKHR(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkPipelineBinaryKeysAndDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryKeysAndDataKHR[] ret = new VkPipelineBinaryKeysAndDataKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineBinaryKeysAndDataKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPipelineBinaryKeysAndDataKHR clone(Arena arena, VkPipelineBinaryKeysAndDataKHR src) {
        VkPipelineBinaryKeysAndDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryKeysAndDataKHR[] clone(Arena arena, VkPipelineBinaryKeysAndDataKHR[] src) {
        VkPipelineBinaryKeysAndDataKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int binaryCount() {
        return segment.get(LAYOUT$binaryCount, OFFSET$binaryCount);
    }

    public void binaryCount(@unsigned int value) {
        segment.set(LAYOUT$binaryCount, OFFSET$binaryCount, value);
    }

    public @pointer(comment="VkPipelineBinaryKeyKHR*") MemorySegment pPipelineBinaryKeysRaw() {
        return segment.get(LAYOUT$pPipelineBinaryKeys, OFFSET$pPipelineBinaryKeys);
    }

    public void pPipelineBinaryKeysRaw(@pointer(comment="VkPipelineBinaryKeyKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaryKeys, OFFSET$pPipelineBinaryKeys, value);
    }

    public @Nullable VkPipelineBinaryKeyKHR pPipelineBinaryKeys() {
        MemorySegment s = pPipelineBinaryKeysRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineBinaryKeyKHR(s);
    }

    public void pPipelineBinaryKeys(@Nullable VkPipelineBinaryKeyKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineBinaryKeysRaw(s);
    }

    @unsafe public @Nullable VkPipelineBinaryKeyKHR[] pPipelineBinaryKeys(int assumedCount) {
        MemorySegment s = pPipelineBinaryKeysRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineBinaryKeyKHR.SIZE);
        VkPipelineBinaryKeyKHR[] ret = new VkPipelineBinaryKeyKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineBinaryKeyKHR(s.asSlice(i * VkPipelineBinaryKeyKHR.SIZE, VkPipelineBinaryKeyKHR.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkPipelineBinaryDataKHR*") MemorySegment pPipelineBinaryDataRaw() {
        return segment.get(LAYOUT$pPipelineBinaryData, OFFSET$pPipelineBinaryData);
    }

    public void pPipelineBinaryDataRaw(@pointer(comment="VkPipelineBinaryDataKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaryData, OFFSET$pPipelineBinaryData, value);
    }

    public @Nullable VkPipelineBinaryDataKHR pPipelineBinaryData() {
        MemorySegment s = pPipelineBinaryDataRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineBinaryDataKHR(s);
    }

    public void pPipelineBinaryData(@Nullable VkPipelineBinaryDataKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineBinaryDataRaw(s);
    }

    @unsafe public @Nullable VkPipelineBinaryDataKHR[] pPipelineBinaryData(int assumedCount) {
        MemorySegment s = pPipelineBinaryDataRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPipelineBinaryDataKHR.SIZE);
        VkPipelineBinaryDataKHR[] ret = new VkPipelineBinaryDataKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPipelineBinaryDataKHR(s.asSlice(i * VkPipelineBinaryDataKHR.SIZE, VkPipelineBinaryDataKHR.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT).withName("pPipelineBinaryKeys"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryDataKHR.LAYOUT).withName("pPipelineBinaryData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$binaryCount = PathElement.groupElement("PATH$binaryCount");
    public static final PathElement PATH$pPipelineBinaryKeys = PathElement.groupElement("PATH$pPipelineBinaryKeys");
    public static final PathElement PATH$pPipelineBinaryData = PathElement.groupElement("PATH$pPipelineBinaryData");

    public static final OfInt LAYOUT$binaryCount = (OfInt) LAYOUT.select(PATH$binaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaryKeys = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaryKeys);
    public static final AddressLayout LAYOUT$pPipelineBinaryData = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaryData);

    public static final long SIZE$binaryCount = LAYOUT$binaryCount.byteSize();
    public static final long SIZE$pPipelineBinaryKeys = LAYOUT$pPipelineBinaryKeys.byteSize();
    public static final long SIZE$pPipelineBinaryData = LAYOUT$pPipelineBinaryData.byteSize();

    public static final long OFFSET$binaryCount = LAYOUT.byteOffset(PATH$binaryCount);
    public static final long OFFSET$pPipelineBinaryKeys = LAYOUT.byteOffset(PATH$pPipelineBinaryKeys);
    public static final long OFFSET$pPipelineBinaryData = LAYOUT.byteOffset(PATH$pPipelineBinaryData);
}
