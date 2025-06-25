package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleIdentifierEXT.html"><code>VkShaderModuleIdentifierEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkShaderModuleIdentifierEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t identifierSize; // @link substring="identifierSize" target="#identifierSize"
///     uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT] identifier; // @link substring="identifier" target="#identifier"
/// } VkShaderModuleIdentifierEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT`
///
/// The {@code allocate} ({@link VkShaderModuleIdentifierEXT#allocate(Arena)}, {@link VkShaderModuleIdentifierEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkShaderModuleIdentifierEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleIdentifierEXT.html"><code>VkShaderModuleIdentifierEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkShaderModuleIdentifierEXT(@NotNull MemorySegment segment) implements IVkShaderModuleIdentifierEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderModuleIdentifierEXT.html"><code>VkShaderModuleIdentifierEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkShaderModuleIdentifierEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkShaderModuleIdentifierEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkShaderModuleIdentifierEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkShaderModuleIdentifierEXT, Iterable<VkShaderModuleIdentifierEXT> {
        public long size() {
            return segment.byteSize() / VkShaderModuleIdentifierEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkShaderModuleIdentifierEXT at(long index) {
            return new VkShaderModuleIdentifierEXT(segment.asSlice(index * VkShaderModuleIdentifierEXT.BYTES, VkShaderModuleIdentifierEXT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VkShaderModuleIdentifierEXT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VkShaderModuleIdentifierEXT value) {
            MemorySegment s = segment.asSlice(index * VkShaderModuleIdentifierEXT.BYTES, VkShaderModuleIdentifierEXT.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkShaderModuleIdentifierEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkShaderModuleIdentifierEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkShaderModuleIdentifierEXT.BYTES,
                (end - start) * VkShaderModuleIdentifierEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkShaderModuleIdentifierEXT.BYTES));
        }

        public VkShaderModuleIdentifierEXT[] toArray() {
            VkShaderModuleIdentifierEXT[] ret = new VkShaderModuleIdentifierEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkShaderModuleIdentifierEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkShaderModuleIdentifierEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkShaderModuleIdentifierEXT.BYTES;
            }

            @Override
            public VkShaderModuleIdentifierEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkShaderModuleIdentifierEXT ret = new VkShaderModuleIdentifierEXT(segment.asSlice(0, VkShaderModuleIdentifierEXT.BYTES));
                segment = segment.asSlice(VkShaderModuleIdentifierEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkShaderModuleIdentifierEXT allocate(Arena arena) {
        VkShaderModuleIdentifierEXT ret = new VkShaderModuleIdentifierEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SHADER_MODULE_IDENTIFIER_EXT);
        return ret;
    }

    public static VkShaderModuleIdentifierEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderModuleIdentifierEXT.Ptr ret = new VkShaderModuleIdentifierEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.SHADER_MODULE_IDENTIFIER_EXT);
        }
        return ret;
    }

    public static VkShaderModuleIdentifierEXT clone(Arena arena, VkShaderModuleIdentifierEXT src) {
        VkShaderModuleIdentifierEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SHADER_MODULE_IDENTIFIER_EXT);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkShaderModuleIdentifierEXT sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public VkShaderModuleIdentifierEXT pNext(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
        return this;
    }

    public VkShaderModuleIdentifierEXT pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int identifierSize() {
        return segment.get(LAYOUT$identifierSize, OFFSET$identifierSize);
    }

    public VkShaderModuleIdentifierEXT identifierSize(@Unsigned int value) {
        segment.set(LAYOUT$identifierSize, OFFSET$identifierSize, value);
        return this;
    }

    public @Unsigned BytePtr identifier() {
        return new BytePtr(identifierRaw());
    }

    public VkShaderModuleIdentifierEXT identifier(@NotNull Consumer<BytePtr> consumer) {
        @Unsigned BytePtr ptr = identifier();
        consumer.accept(ptr);
        return this;
    }

    public VkShaderModuleIdentifierEXT identifier(@Unsigned BytePtr value) {
        MemorySegment s = identifierRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment identifierRaw() {
        return segment.asSlice(OFFSET$identifier, SIZE$identifier);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        MemoryLayout.sequenceLayout(MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT, ValueLayout.JAVA_BYTE).withName("identifier")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$identifierSize = PathElement.groupElement("identifierSize");
    public static final PathElement PATH$identifier = PathElement.groupElement("identifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$identifierSize = (OfInt) LAYOUT.select(PATH$identifierSize);
    public static final SequenceLayout LAYOUT$identifier = (SequenceLayout) LAYOUT.select(PATH$identifier);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$identifierSize = LAYOUT$identifierSize.byteSize();
    public static final long SIZE$identifier = LAYOUT$identifier.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$identifierSize = LAYOUT.byteOffset(PATH$identifierSize);
    public static final long OFFSET$identifier = LAYOUT.byteOffset(PATH$identifier);
}
