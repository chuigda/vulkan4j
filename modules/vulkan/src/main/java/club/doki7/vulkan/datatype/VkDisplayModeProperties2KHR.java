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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModeProperties2KHR.html"><code>VkDisplayModeProperties2KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayModeProperties2KHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDisplayModePropertiesKHR displayModeProperties; // @link substring="VkDisplayModePropertiesKHR" target="VkDisplayModePropertiesKHR" @link substring="displayModeProperties" target="#displayModeProperties"
/// } VkDisplayModeProperties2KHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR`
///
/// The {@code allocate} ({@link VkDisplayModeProperties2KHR#allocate(Arena)}, {@link VkDisplayModeProperties2KHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDisplayModeProperties2KHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModeProperties2KHR.html"><code>VkDisplayModeProperties2KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayModeProperties2KHR(@NotNull MemorySegment segment) implements IVkDisplayModeProperties2KHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayModeProperties2KHR.html"><code>VkDisplayModeProperties2KHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDisplayModeProperties2KHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDisplayModeProperties2KHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDisplayModeProperties2KHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDisplayModeProperties2KHR, Iterable<VkDisplayModeProperties2KHR> {
        public long size() {
            return segment.byteSize() / VkDisplayModeProperties2KHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDisplayModeProperties2KHR at(long index) {
            return new VkDisplayModeProperties2KHR(segment.asSlice(index * VkDisplayModeProperties2KHR.BYTES, VkDisplayModeProperties2KHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VkDisplayModeProperties2KHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VkDisplayModeProperties2KHR value) {
            MemorySegment s = segment.asSlice(index * VkDisplayModeProperties2KHR.BYTES, VkDisplayModeProperties2KHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkDisplayModeProperties2KHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDisplayModeProperties2KHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDisplayModeProperties2KHR.BYTES,
                (end - start) * VkDisplayModeProperties2KHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDisplayModeProperties2KHR.BYTES));
        }

        public VkDisplayModeProperties2KHR[] toArray() {
            VkDisplayModeProperties2KHR[] ret = new VkDisplayModeProperties2KHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkDisplayModeProperties2KHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkDisplayModeProperties2KHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkDisplayModeProperties2KHR.BYTES;
            }

            @Override
            public VkDisplayModeProperties2KHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkDisplayModeProperties2KHR ret = new VkDisplayModeProperties2KHR(segment.asSlice(0, VkDisplayModeProperties2KHR.BYTES));
                segment = segment.asSlice(VkDisplayModeProperties2KHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkDisplayModeProperties2KHR allocate(Arena arena) {
        VkDisplayModeProperties2KHR ret = new VkDisplayModeProperties2KHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DISPLAY_MODE_PROPERTIES_2_KHR);
        return ret;
    }

    public static VkDisplayModeProperties2KHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModeProperties2KHR.Ptr ret = new VkDisplayModeProperties2KHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.DISPLAY_MODE_PROPERTIES_2_KHR);
        }
        return ret;
    }

    public static VkDisplayModeProperties2KHR clone(Arena arena, VkDisplayModeProperties2KHR src) {
        VkDisplayModeProperties2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DISPLAY_MODE_PROPERTIES_2_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkDisplayModeProperties2KHR sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public VkDisplayModeProperties2KHR pNext(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
        return this;
    }

    public VkDisplayModeProperties2KHR pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull VkDisplayModePropertiesKHR displayModeProperties() {
        return new VkDisplayModePropertiesKHR(segment.asSlice(OFFSET$displayModeProperties, LAYOUT$displayModeProperties));
    }

    public VkDisplayModeProperties2KHR displayModeProperties(@NotNull VkDisplayModePropertiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayModeProperties, SIZE$displayModeProperties);
        return this;
    }

    public VkDisplayModeProperties2KHR displayModeProperties(Consumer<@NotNull VkDisplayModePropertiesKHR> consumer) {
        consumer.accept(displayModeProperties());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayModePropertiesKHR.LAYOUT.withName("displayModeProperties")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$displayModeProperties = PathElement.groupElement("displayModeProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayModeProperties = (StructLayout) LAYOUT.select(PATH$displayModeProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$displayModeProperties = LAYOUT$displayModeProperties.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayModeProperties = LAYOUT.byteOffset(PATH$displayModeProperties);
}
