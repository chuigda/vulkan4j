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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRobustness2FeaturesEXT.html"><code>VkPhysicalDeviceRobustness2FeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRobustness2FeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 robustBufferAccess2; // @link substring="robustBufferAccess2" target="#robustBufferAccess2"
///     VkBool32 robustImageAccess2; // @link substring="robustImageAccess2" target="#robustImageAccess2"
///     VkBool32 nullDescriptor; // @link substring="nullDescriptor" target="#nullDescriptor"
/// } VkPhysicalDeviceRobustness2FeaturesEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceRobustness2FeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceRobustness2FeaturesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceRobustness2FeaturesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRobustness2FeaturesEXT.html"><code>VkPhysicalDeviceRobustness2FeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRobustness2FeaturesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceRobustness2FeaturesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRobustness2FeaturesEXT.html"><code>VkPhysicalDeviceRobustness2FeaturesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceRobustness2FeaturesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceRobustness2FeaturesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceRobustness2FeaturesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceRobustness2FeaturesEXT, Iterable<VkPhysicalDeviceRobustness2FeaturesEXT> {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceRobustness2FeaturesEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceRobustness2FeaturesEXT at(long index) {
            return new VkPhysicalDeviceRobustness2FeaturesEXT(segment.asSlice(index * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES, VkPhysicalDeviceRobustness2FeaturesEXT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VkPhysicalDeviceRobustness2FeaturesEXT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VkPhysicalDeviceRobustness2FeaturesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES, VkPhysicalDeviceRobustness2FeaturesEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES,
                (end - start) * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceRobustness2FeaturesEXT.BYTES));
        }

        public VkPhysicalDeviceRobustness2FeaturesEXT[] toArray() {
            VkPhysicalDeviceRobustness2FeaturesEXT[] ret = new VkPhysicalDeviceRobustness2FeaturesEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkPhysicalDeviceRobustness2FeaturesEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkPhysicalDeviceRobustness2FeaturesEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkPhysicalDeviceRobustness2FeaturesEXT.BYTES;
            }

            @Override
            public VkPhysicalDeviceRobustness2FeaturesEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkPhysicalDeviceRobustness2FeaturesEXT ret = new VkPhysicalDeviceRobustness2FeaturesEXT(segment.asSlice(0, VkPhysicalDeviceRobustness2FeaturesEXT.BYTES));
                segment = segment.asSlice(VkPhysicalDeviceRobustness2FeaturesEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceRobustness2FeaturesEXT ret = new VkPhysicalDeviceRobustness2FeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRobustness2FeaturesEXT.Ptr ret = new VkPhysicalDeviceRobustness2FeaturesEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT clone(Arena arena, VkPhysicalDeviceRobustness2FeaturesEXT src) {
        VkPhysicalDeviceRobustness2FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
        return this;
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int robustBufferAccess2() {
        return segment.get(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2);
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int robustImageAccess2() {
        return segment.get(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2);
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int nullDescriptor() {
        return segment.get(LAYOUT$nullDescriptor, OFFSET$nullDescriptor);
    }

    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptor(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$nullDescriptor, OFFSET$nullDescriptor, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustBufferAccess2"),
        ValueLayout.JAVA_INT.withName("robustImageAccess2"),
        ValueLayout.JAVA_INT.withName("nullDescriptor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustBufferAccess2 = PathElement.groupElement("robustBufferAccess2");
    public static final PathElement PATH$robustImageAccess2 = PathElement.groupElement("robustImageAccess2");
    public static final PathElement PATH$nullDescriptor = PathElement.groupElement("nullDescriptor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$robustBufferAccess2 = (OfInt) LAYOUT.select(PATH$robustBufferAccess2);
    public static final OfInt LAYOUT$robustImageAccess2 = (OfInt) LAYOUT.select(PATH$robustImageAccess2);
    public static final OfInt LAYOUT$nullDescriptor = (OfInt) LAYOUT.select(PATH$nullDescriptor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$robustBufferAccess2 = LAYOUT$robustBufferAccess2.byteSize();
    public static final long SIZE$robustImageAccess2 = LAYOUT$robustImageAccess2.byteSize();
    public static final long SIZE$nullDescriptor = LAYOUT$nullDescriptor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustBufferAccess2 = LAYOUT.byteOffset(PATH$robustBufferAccess2);
    public static final long OFFSET$robustImageAccess2 = LAYOUT.byteOffset(PATH$robustImageAccess2);
    public static final long OFFSET$nullDescriptor = LAYOUT.byteOffset(PATH$nullDescriptor);
}
