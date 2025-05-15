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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsTokenDataEXT.html"><code>VkIndirectCommandsTokenDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsTokenDataEXT {
///     VkIndirectCommandsPushConstantTokenEXT const* pPushConstant;
///     VkIndirectCommandsVertexBufferTokenEXT const* pVertexBuffer;
///     VkIndirectCommandsIndexBufferTokenEXT const* pIndexBuffer;
///     VkIndirectCommandsExecutionSetTokenEXT const* pExecutionSet;
/// } VkIndirectCommandsTokenDataEXT;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsTokenDataEXT.html"><code>VkIndirectCommandsTokenDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsTokenDataEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkIndirectCommandsTokenDataEXT allocate(Arena arena) {
        VkIndirectCommandsTokenDataEXT ret = new VkIndirectCommandsTokenDataEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkIndirectCommandsTokenDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsTokenDataEXT[] ret = new VkIndirectCommandsTokenDataEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIndirectCommandsTokenDataEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkIndirectCommandsTokenDataEXT clone(Arena arena, VkIndirectCommandsTokenDataEXT src) {
        VkIndirectCommandsTokenDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIndirectCommandsTokenDataEXT[] clone(Arena arena, VkIndirectCommandsTokenDataEXT[] src) {
        VkIndirectCommandsTokenDataEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @pointer(comment="VkIndirectCommandsPushConstantTokenEXT*") MemorySegment pPushConstantRaw() {
        return segment.get(LAYOUT$pPushConstant, OFFSET$pPushConstant);
    }

    public void pPushConstantRaw(@pointer(comment="VkIndirectCommandsPushConstantTokenEXT*") MemorySegment value) {
        segment.set(LAYOUT$pPushConstant, OFFSET$pPushConstant, value);
    }

    public @Nullable VkIndirectCommandsPushConstantTokenEXT pPushConstant() {
        MemorySegment s = pPushConstantRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsPushConstantTokenEXT(s);
    }

    public void pPushConstant(@Nullable VkIndirectCommandsPushConstantTokenEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPushConstantRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsPushConstantTokenEXT[] pPushConstant(int assumedCount) {
        MemorySegment s = pPushConstantRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsPushConstantTokenEXT.BYTES);
        VkIndirectCommandsPushConstantTokenEXT[] ret = new VkIndirectCommandsPushConstantTokenEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsPushConstantTokenEXT(s.asSlice(i * VkIndirectCommandsPushConstantTokenEXT.BYTES, VkIndirectCommandsPushConstantTokenEXT.BYTES));
        }
        return ret;
    }

    public @pointer(comment="VkIndirectCommandsVertexBufferTokenEXT*") MemorySegment pVertexBufferRaw() {
        return segment.get(LAYOUT$pVertexBuffer, OFFSET$pVertexBuffer);
    }

    public void pVertexBufferRaw(@pointer(comment="VkIndirectCommandsVertexBufferTokenEXT*") MemorySegment value) {
        segment.set(LAYOUT$pVertexBuffer, OFFSET$pVertexBuffer, value);
    }

    public @Nullable VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer() {
        MemorySegment s = pVertexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsVertexBufferTokenEXT(s);
    }

    public void pVertexBuffer(@Nullable VkIndirectCommandsVertexBufferTokenEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBufferRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsVertexBufferTokenEXT[] pVertexBuffer(int assumedCount) {
        MemorySegment s = pVertexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsVertexBufferTokenEXT.BYTES);
        VkIndirectCommandsVertexBufferTokenEXT[] ret = new VkIndirectCommandsVertexBufferTokenEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsVertexBufferTokenEXT(s.asSlice(i * VkIndirectCommandsVertexBufferTokenEXT.BYTES, VkIndirectCommandsVertexBufferTokenEXT.BYTES));
        }
        return ret;
    }

    public @pointer(comment="VkIndirectCommandsIndexBufferTokenEXT*") MemorySegment pIndexBufferRaw() {
        return segment.get(LAYOUT$pIndexBuffer, OFFSET$pIndexBuffer);
    }

    public void pIndexBufferRaw(@pointer(comment="VkIndirectCommandsIndexBufferTokenEXT*") MemorySegment value) {
        segment.set(LAYOUT$pIndexBuffer, OFFSET$pIndexBuffer, value);
    }

    public @Nullable VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer() {
        MemorySegment s = pIndexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsIndexBufferTokenEXT(s);
    }

    public void pIndexBuffer(@Nullable VkIndirectCommandsIndexBufferTokenEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pIndexBufferRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsIndexBufferTokenEXT[] pIndexBuffer(int assumedCount) {
        MemorySegment s = pIndexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsIndexBufferTokenEXT.BYTES);
        VkIndirectCommandsIndexBufferTokenEXT[] ret = new VkIndirectCommandsIndexBufferTokenEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsIndexBufferTokenEXT(s.asSlice(i * VkIndirectCommandsIndexBufferTokenEXT.BYTES, VkIndirectCommandsIndexBufferTokenEXT.BYTES));
        }
        return ret;
    }

    public @pointer(comment="VkIndirectCommandsExecutionSetTokenEXT*") MemorySegment pExecutionSetRaw() {
        return segment.get(LAYOUT$pExecutionSet, OFFSET$pExecutionSet);
    }

    public void pExecutionSetRaw(@pointer(comment="VkIndirectCommandsExecutionSetTokenEXT*") MemorySegment value) {
        segment.set(LAYOUT$pExecutionSet, OFFSET$pExecutionSet, value);
    }

    public @Nullable VkIndirectCommandsExecutionSetTokenEXT pExecutionSet() {
        MemorySegment s = pExecutionSetRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkIndirectCommandsExecutionSetTokenEXT(s);
    }

    public void pExecutionSet(@Nullable VkIndirectCommandsExecutionSetTokenEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pExecutionSetRaw(s);
    }

    @unsafe public @Nullable VkIndirectCommandsExecutionSetTokenEXT[] pExecutionSet(int assumedCount) {
        MemorySegment s = pExecutionSetRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkIndirectCommandsExecutionSetTokenEXT.BYTES);
        VkIndirectCommandsExecutionSetTokenEXT[] ret = new VkIndirectCommandsExecutionSetTokenEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkIndirectCommandsExecutionSetTokenEXT(s.asSlice(i * VkIndirectCommandsExecutionSetTokenEXT.BYTES, VkIndirectCommandsExecutionSetTokenEXT.BYTES));
        }
        return ret;
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsPushConstantTokenEXT.LAYOUT).withName("pPushConstant"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsVertexBufferTokenEXT.LAYOUT).withName("pVertexBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsIndexBufferTokenEXT.LAYOUT).withName("pIndexBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkIndirectCommandsExecutionSetTokenEXT.LAYOUT).withName("pExecutionSet")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pPushConstant = PathElement.groupElement("PATH$pPushConstant");
    public static final PathElement PATH$pVertexBuffer = PathElement.groupElement("PATH$pVertexBuffer");
    public static final PathElement PATH$pIndexBuffer = PathElement.groupElement("PATH$pIndexBuffer");
    public static final PathElement PATH$pExecutionSet = PathElement.groupElement("PATH$pExecutionSet");

    public static final AddressLayout LAYOUT$pPushConstant = (AddressLayout) LAYOUT.select(PATH$pPushConstant);
    public static final AddressLayout LAYOUT$pVertexBuffer = (AddressLayout) LAYOUT.select(PATH$pVertexBuffer);
    public static final AddressLayout LAYOUT$pIndexBuffer = (AddressLayout) LAYOUT.select(PATH$pIndexBuffer);
    public static final AddressLayout LAYOUT$pExecutionSet = (AddressLayout) LAYOUT.select(PATH$pExecutionSet);

    public static final long SIZE$pPushConstant = LAYOUT$pPushConstant.byteSize();
    public static final long SIZE$pVertexBuffer = LAYOUT$pVertexBuffer.byteSize();
    public static final long SIZE$pIndexBuffer = LAYOUT$pIndexBuffer.byteSize();
    public static final long SIZE$pExecutionSet = LAYOUT$pExecutionSet.byteSize();

    public static final long OFFSET$pPushConstant = LAYOUT.byteOffset(PATH$pPushConstant);
    public static final long OFFSET$pVertexBuffer = LAYOUT.byteOffset(PATH$pVertexBuffer);
    public static final long OFFSET$pIndexBuffer = LAYOUT.byteOffset(PATH$pIndexBuffer);
    public static final long OFFSET$pExecutionSet = LAYOUT.byteOffset(PATH$pExecutionSet);
}
