package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetInfoEXT.html"><code>VkIndirectExecutionSetInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectExecutionSetInfoEXT {
///     VkIndirectExecutionSetPipelineInfoEXT const* pPipelineInfo; // @link substring="VkIndirectExecutionSetPipelineInfoEXT" target="VkIndirectExecutionSetPipelineInfoEXT" @link substring="pPipelineInfo" target="#pPipelineInfo"
///     VkIndirectExecutionSetShaderInfoEXT const* pShaderInfo; // @link substring="VkIndirectExecutionSetShaderInfoEXT" target="VkIndirectExecutionSetShaderInfoEXT" @link substring="pShaderInfo" target="#pShaderInfo"
/// } VkIndirectExecutionSetInfoEXT;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetInfoEXT.html"><code>VkIndirectExecutionSetInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectExecutionSetInfoEXT(@NotNull MemorySegment segment) implements IVkIndirectExecutionSetInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectExecutionSetInfoEXT.html"><code>VkIndirectExecutionSetInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkIndirectExecutionSetInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkIndirectExecutionSetInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkIndirectExecutionSetInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkIndirectExecutionSetInfoEXT {
        public long size() {
            return segment.byteSize() / VkIndirectExecutionSetInfoEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkIndirectExecutionSetInfoEXT at(long index) {
            return new VkIndirectExecutionSetInfoEXT(segment.asSlice(index * VkIndirectExecutionSetInfoEXT.BYTES, VkIndirectExecutionSetInfoEXT.BYTES));
        }
        public void write(long index, @NotNull VkIndirectExecutionSetInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkIndirectExecutionSetInfoEXT.BYTES, VkIndirectExecutionSetInfoEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkIndirectExecutionSetInfoEXT allocate(Arena arena) {
        return new VkIndirectExecutionSetInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectExecutionSetInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectExecutionSetInfoEXT.Ptr ret = new VkIndirectExecutionSetInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkIndirectExecutionSetInfoEXT clone(Arena arena, VkIndirectExecutionSetInfoEXT src) {
        VkIndirectExecutionSetInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() {
        MemorySegment s = pPipelineInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectExecutionSetPipelineInfoEXT(s);
    }

    public void pPipelineInfo(@Nullable VkIndirectExecutionSetPipelineInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineInfoRaw(s);
    }

    @unsafe public @Nullable VkIndirectExecutionSetPipelineInfoEXT[] pPipelineInfo(int assumedCount) {
        MemorySegment s = pPipelineInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetPipelineInfoEXT.BYTES);
        VkIndirectExecutionSetPipelineInfoEXT[] ret = new VkIndirectExecutionSetPipelineInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetPipelineInfoEXT(s.asSlice(i * VkIndirectExecutionSetPipelineInfoEXT.BYTES, VkIndirectExecutionSetPipelineInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkIndirectExecutionSetPipelineInfoEXT.class) MemorySegment pPipelineInfoRaw() {
        return segment.get(LAYOUT$pPipelineInfo, OFFSET$pPipelineInfo);
    }

    public void pPipelineInfoRaw(@pointer(target=VkIndirectExecutionSetPipelineInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pPipelineInfo, OFFSET$pPipelineInfo, value);
    }

    public @Nullable VkIndirectExecutionSetShaderInfoEXT pShaderInfo() {
        MemorySegment s = pShaderInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectExecutionSetShaderInfoEXT(s);
    }

    public void pShaderInfo(@Nullable VkIndirectExecutionSetShaderInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShaderInfoRaw(s);
    }

    @unsafe public @Nullable VkIndirectExecutionSetShaderInfoEXT[] pShaderInfo(int assumedCount) {
        MemorySegment s = pShaderInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectExecutionSetShaderInfoEXT.BYTES);
        VkIndirectExecutionSetShaderInfoEXT[] ret = new VkIndirectExecutionSetShaderInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectExecutionSetShaderInfoEXT(s.asSlice(i * VkIndirectExecutionSetShaderInfoEXT.BYTES, VkIndirectExecutionSetShaderInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkIndirectExecutionSetShaderInfoEXT.class) MemorySegment pShaderInfoRaw() {
        return segment.get(LAYOUT$pShaderInfo, OFFSET$pShaderInfo);
    }

    public void pShaderInfoRaw(@pointer(target=VkIndirectExecutionSetShaderInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pShaderInfo, OFFSET$pShaderInfo, value);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetPipelineInfoEXT.LAYOUT).withName("pPipelineInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectExecutionSetShaderInfoEXT.LAYOUT).withName("pShaderInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pPipelineInfo = PathElement.groupElement("pPipelineInfo");
    public static final PathElement PATH$pShaderInfo = PathElement.groupElement("pShaderInfo");

    public static final AddressLayout LAYOUT$pPipelineInfo = (AddressLayout) LAYOUT.select(PATH$pPipelineInfo);
    public static final AddressLayout LAYOUT$pShaderInfo = (AddressLayout) LAYOUT.select(PATH$pShaderInfo);

    public static final long SIZE$pPipelineInfo = LAYOUT$pPipelineInfo.byteSize();
    public static final long SIZE$pShaderInfo = LAYOUT$pShaderInfo.byteSize();

    public static final long OFFSET$pPipelineInfo = LAYOUT.byteOffset(PATH$pPipelineInfo);
    public static final long OFFSET$pShaderInfo = LAYOUT.byteOffset(PATH$pShaderInfo);
}
