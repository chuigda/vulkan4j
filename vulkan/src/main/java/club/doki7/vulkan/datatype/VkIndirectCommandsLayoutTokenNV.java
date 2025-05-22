package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsLayoutTokenNV.html"><code>VkIndirectCommandsLayoutTokenNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsLayoutTokenNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkIndirectCommandsTokenTypeNV tokenType; // @link substring="VkIndirectCommandsTokenTypeNV" target="VkIndirectCommandsTokenTypeNV" @link substring="tokenType" target="#tokenType"
///     uint32_t stream; // @link substring="stream" target="#stream"
///     uint32_t offset; // @link substring="offset" target="#offset"
///     uint32_t vertexBindingUnit; // @link substring="vertexBindingUnit" target="#vertexBindingUnit"
///     VkBool32 vertexDynamicStride; // @link substring="vertexDynamicStride" target="#vertexDynamicStride"
///     VkPipelineLayout pushconstantPipelineLayout; // optional // @link substring="VkPipelineLayout" target="VkPipelineLayout" @link substring="pushconstantPipelineLayout" target="#pushconstantPipelineLayout"
///     VkShaderStageFlags pushconstantShaderStageFlags; // optional // @link substring="VkShaderStageFlags" target="VkShaderStageFlags" @link substring="pushconstantShaderStageFlags" target="#pushconstantShaderStageFlags"
///     uint32_t pushconstantOffset; // @link substring="pushconstantOffset" target="#pushconstantOffset"
///     uint32_t pushconstantSize; // @link substring="pushconstantSize" target="#pushconstantSize"
///     VkIndirectStateFlagsNV indirectStateFlags; // optional // @link substring="VkIndirectStateFlagsNV" target="VkIndirectStateFlagsNV" @link substring="indirectStateFlags" target="#indirectStateFlags"
///     uint32_t indexTypeCount; // optional // @link substring="indexTypeCount" target="#indexTypeCount"
///     VkIndexType const* pIndexTypes; // @link substring="VkIndexType" target="VkIndexType" @link substring="pIndexTypes" target="#pIndexTypes"
///     uint32_t const* pIndexTypeValues; // @link substring="pIndexTypeValues" target="#pIndexTypeValues"
/// } VkIndirectCommandsLayoutTokenNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV`
///
/// The {@code allocate} ({@link VkIndirectCommandsLayoutTokenNV#allocate(Arena)}, {@link VkIndirectCommandsLayoutTokenNV#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkIndirectCommandsLayoutTokenNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsLayoutTokenNV.html"><code>VkIndirectCommandsLayoutTokenNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsLayoutTokenNV(@NotNull MemorySegment segment) implements IVkIndirectCommandsLayoutTokenNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsLayoutTokenNV.html"><code>VkIndirectCommandsLayoutTokenNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkIndirectCommandsLayoutTokenNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkIndirectCommandsLayoutTokenNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkIndirectCommandsLayoutTokenNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkIndirectCommandsLayoutTokenNV {
        public long size() {
            return segment.byteSize() / VkIndirectCommandsLayoutTokenNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkIndirectCommandsLayoutTokenNV at(long index) {
            return new VkIndirectCommandsLayoutTokenNV(segment.asSlice(index * VkIndirectCommandsLayoutTokenNV.BYTES, VkIndirectCommandsLayoutTokenNV.BYTES));
        }

        public void write(long index, @NotNull VkIndirectCommandsLayoutTokenNV value) {
            MemorySegment s = segment.asSlice(index * VkIndirectCommandsLayoutTokenNV.BYTES, VkIndirectCommandsLayoutTokenNV.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkIndirectCommandsLayoutTokenNV.BYTES, VkIndirectCommandsLayoutTokenNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkIndirectCommandsLayoutTokenNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkIndirectCommandsLayoutTokenNV.BYTES,
                (end - start) * VkIndirectCommandsLayoutTokenNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkIndirectCommandsLayoutTokenNV.BYTES));
        }

        public VkIndirectCommandsLayoutTokenNV[] toArray() {
            VkIndirectCommandsLayoutTokenNV[] ret = new VkIndirectCommandsLayoutTokenNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkIndirectCommandsLayoutTokenNV allocate(Arena arena) {
        VkIndirectCommandsLayoutTokenNV ret = new VkIndirectCommandsLayoutTokenNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
        return ret;
    }

    public static VkIndirectCommandsLayoutTokenNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsLayoutTokenNV.Ptr ret = new VkIndirectCommandsLayoutTokenNV.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
        }
        return ret;
    }

    public static VkIndirectCommandsLayoutTokenNV clone(Arena arena, VkIndirectCommandsLayoutTokenNV src) {
        VkIndirectCommandsLayoutTokenNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkIndirectCommandsTokenTypeNV.class) int tokenType() {
        return segment.get(LAYOUT$tokenType, OFFSET$tokenType);
    }

    public void tokenType(@enumtype(VkIndirectCommandsTokenTypeNV.class) int value) {
        segment.set(LAYOUT$tokenType, OFFSET$tokenType, value);
    }

    public @unsigned int stream() {
        return segment.get(LAYOUT$stream, OFFSET$stream);
    }

    public void stream(@unsigned int value) {
        segment.set(LAYOUT$stream, OFFSET$stream, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned int vertexBindingUnit() {
        return segment.get(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit);
    }

    public void vertexBindingUnit(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingUnit, OFFSET$vertexBindingUnit, value);
    }

    public @unsigned int vertexDynamicStride() {
        return segment.get(LAYOUT$vertexDynamicStride, OFFSET$vertexDynamicStride);
    }

    public void vertexDynamicStride(@unsigned int value) {
        segment.set(LAYOUT$vertexDynamicStride, OFFSET$vertexDynamicStride, value);
    }

    public @Nullable VkPipelineLayout pushconstantPipelineLayout() {
        MemorySegment s = segment.asSlice(OFFSET$pushconstantPipelineLayout, SIZE$pushconstantPipelineLayout);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void pushconstantPipelineLayout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$pushconstantPipelineLayout, OFFSET$pushconstantPipelineLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkShaderStageFlags.class) int pushconstantShaderStageFlags() {
        return segment.get(LAYOUT$pushconstantShaderStageFlags, OFFSET$pushconstantShaderStageFlags);
    }

    public void pushconstantShaderStageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$pushconstantShaderStageFlags, OFFSET$pushconstantShaderStageFlags, value);
    }

    public @unsigned int pushconstantOffset() {
        return segment.get(LAYOUT$pushconstantOffset, OFFSET$pushconstantOffset);
    }

    public void pushconstantOffset(@unsigned int value) {
        segment.set(LAYOUT$pushconstantOffset, OFFSET$pushconstantOffset, value);
    }

    public @unsigned int pushconstantSize() {
        return segment.get(LAYOUT$pushconstantSize, OFFSET$pushconstantSize);
    }

    public void pushconstantSize(@unsigned int value) {
        segment.set(LAYOUT$pushconstantSize, OFFSET$pushconstantSize, value);
    }

    public @enumtype(VkIndirectStateFlagsNV.class) int indirectStateFlags() {
        return segment.get(LAYOUT$indirectStateFlags, OFFSET$indirectStateFlags);
    }

    public void indirectStateFlags(@enumtype(VkIndirectStateFlagsNV.class) int value) {
        segment.set(LAYOUT$indirectStateFlags, OFFSET$indirectStateFlags, value);
    }

    public @unsigned int indexTypeCount() {
        return segment.get(LAYOUT$indexTypeCount, OFFSET$indexTypeCount);
    }

    public void indexTypeCount(@unsigned int value) {
        segment.set(LAYOUT$indexTypeCount, OFFSET$indexTypeCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkIndexType.class) IntPtr pIndexTypes() {
        MemorySegment s = pIndexTypesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pIndexTypes(@Nullable @enumtype(VkIndexType.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypesRaw(s);
    }

    public @pointer(target=VkIndexType.class) MemorySegment pIndexTypesRaw() {
        return segment.get(LAYOUT$pIndexTypes, OFFSET$pIndexTypes);
    }

    public void pIndexTypesRaw(@pointer(target=VkIndexType.class) MemorySegment value) {
        segment.set(LAYOUT$pIndexTypes, OFFSET$pIndexTypes, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pIndexTypeValues() {
        MemorySegment s = pIndexTypeValuesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pIndexTypeValues(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexTypeValuesRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pIndexTypeValuesRaw() {
        return segment.get(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues);
    }

    public void pIndexTypeValuesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pIndexTypeValues, OFFSET$pIndexTypeValues, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tokenType"),
        ValueLayout.JAVA_INT.withName("stream"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("vertexBindingUnit"),
        ValueLayout.JAVA_INT.withName("vertexDynamicStride"),
        ValueLayout.ADDRESS.withName("pushconstantPipelineLayout"),
        ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags"),
        ValueLayout.JAVA_INT.withName("pushconstantOffset"),
        ValueLayout.JAVA_INT.withName("pushconstantSize"),
        ValueLayout.JAVA_INT.withName("indirectStateFlags"),
        ValueLayout.JAVA_INT.withName("indexTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pIndexTypes"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pIndexTypeValues")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$tokenType = PathElement.groupElement("tokenType");
    public static final PathElement PATH$stream = PathElement.groupElement("stream");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$vertexBindingUnit = PathElement.groupElement("vertexBindingUnit");
    public static final PathElement PATH$vertexDynamicStride = PathElement.groupElement("vertexDynamicStride");
    public static final PathElement PATH$pushconstantPipelineLayout = PathElement.groupElement("pushconstantPipelineLayout");
    public static final PathElement PATH$pushconstantShaderStageFlags = PathElement.groupElement("pushconstantShaderStageFlags");
    public static final PathElement PATH$pushconstantOffset = PathElement.groupElement("pushconstantOffset");
    public static final PathElement PATH$pushconstantSize = PathElement.groupElement("pushconstantSize");
    public static final PathElement PATH$indirectStateFlags = PathElement.groupElement("indirectStateFlags");
    public static final PathElement PATH$indexTypeCount = PathElement.groupElement("indexTypeCount");
    public static final PathElement PATH$pIndexTypes = PathElement.groupElement("pIndexTypes");
    public static final PathElement PATH$pIndexTypeValues = PathElement.groupElement("pIndexTypeValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$tokenType = (OfInt) LAYOUT.select(PATH$tokenType);
    public static final OfInt LAYOUT$stream = (OfInt) LAYOUT.select(PATH$stream);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);
    public static final OfInt LAYOUT$vertexBindingUnit = (OfInt) LAYOUT.select(PATH$vertexBindingUnit);
    public static final OfInt LAYOUT$vertexDynamicStride = (OfInt) LAYOUT.select(PATH$vertexDynamicStride);
    public static final AddressLayout LAYOUT$pushconstantPipelineLayout = (AddressLayout) LAYOUT.select(PATH$pushconstantPipelineLayout);
    public static final OfInt LAYOUT$pushconstantShaderStageFlags = (OfInt) LAYOUT.select(PATH$pushconstantShaderStageFlags);
    public static final OfInt LAYOUT$pushconstantOffset = (OfInt) LAYOUT.select(PATH$pushconstantOffset);
    public static final OfInt LAYOUT$pushconstantSize = (OfInt) LAYOUT.select(PATH$pushconstantSize);
    public static final OfInt LAYOUT$indirectStateFlags = (OfInt) LAYOUT.select(PATH$indirectStateFlags);
    public static final OfInt LAYOUT$indexTypeCount = (OfInt) LAYOUT.select(PATH$indexTypeCount);
    public static final AddressLayout LAYOUT$pIndexTypes = (AddressLayout) LAYOUT.select(PATH$pIndexTypes);
    public static final AddressLayout LAYOUT$pIndexTypeValues = (AddressLayout) LAYOUT.select(PATH$pIndexTypeValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tokenType = LAYOUT$tokenType.byteSize();
    public static final long SIZE$stream = LAYOUT$stream.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$vertexBindingUnit = LAYOUT$vertexBindingUnit.byteSize();
    public static final long SIZE$vertexDynamicStride = LAYOUT$vertexDynamicStride.byteSize();
    public static final long SIZE$pushconstantPipelineLayout = LAYOUT$pushconstantPipelineLayout.byteSize();
    public static final long SIZE$pushconstantShaderStageFlags = LAYOUT$pushconstantShaderStageFlags.byteSize();
    public static final long SIZE$pushconstantOffset = LAYOUT$pushconstantOffset.byteSize();
    public static final long SIZE$pushconstantSize = LAYOUT$pushconstantSize.byteSize();
    public static final long SIZE$indirectStateFlags = LAYOUT$indirectStateFlags.byteSize();
    public static final long SIZE$indexTypeCount = LAYOUT$indexTypeCount.byteSize();
    public static final long SIZE$pIndexTypes = LAYOUT$pIndexTypes.byteSize();
    public static final long SIZE$pIndexTypeValues = LAYOUT$pIndexTypeValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tokenType = LAYOUT.byteOffset(PATH$tokenType);
    public static final long OFFSET$stream = LAYOUT.byteOffset(PATH$stream);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$vertexBindingUnit = LAYOUT.byteOffset(PATH$vertexBindingUnit);
    public static final long OFFSET$vertexDynamicStride = LAYOUT.byteOffset(PATH$vertexDynamicStride);
    public static final long OFFSET$pushconstantPipelineLayout = LAYOUT.byteOffset(PATH$pushconstantPipelineLayout);
    public static final long OFFSET$pushconstantShaderStageFlags = LAYOUT.byteOffset(PATH$pushconstantShaderStageFlags);
    public static final long OFFSET$pushconstantOffset = LAYOUT.byteOffset(PATH$pushconstantOffset);
    public static final long OFFSET$pushconstantSize = LAYOUT.byteOffset(PATH$pushconstantSize);
    public static final long OFFSET$indirectStateFlags = LAYOUT.byteOffset(PATH$indirectStateFlags);
    public static final long OFFSET$indexTypeCount = LAYOUT.byteOffset(PATH$indexTypeCount);
    public static final long OFFSET$pIndexTypes = LAYOUT.byteOffset(PATH$pIndexTypes);
    public static final long OFFSET$pIndexTypeValues = LAYOUT.byteOffset(PATH$pIndexTypeValues);
}
