package club.doki7.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vma.bitmask.*;
import club.doki7.vma.handle.*;
import club.doki7.vma.enumtype.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code VmaDeviceMemoryCallbacks} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaDeviceMemoryCallbacks {
///     PFN_vmaAllocateDeviceMemoryFunction pfnAllocate; // optional // @link substring="pfnAllocate" target="#pfnAllocate"
///     PFN_vmaFreeDeviceMemoryFunction pfnFree; // optional // @link substring="pfnFree" target="#pfnFree"
///     void* pUserData; // optional // @link substring="pUserData" target="#pUserData"
/// } VmaDeviceMemoryCallbacks;
/// }
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
/// <div class="doxygen">
///
/// ## Original doxygen documentation
///
/// Set of callbacks that the library will call for `vkAllocateMemory` and `vkFreeMemory`.
///
/// Provided for informative purpose, e.g. to gather statistics about number of
/// allocations or total amount of memory allocated in Vulkan.
///
/// Used in VmaAllocatorCreateInfo::pDeviceMemoryCallbacks.
///
/// ### Member documentation
///
/// <ul>
/// <li>{@link #pfnAllocate} Optional, can be null.</li>
/// <li>{@link #pfnFree} Optional, can be null.</li>
/// <li>{@link #pUserData} Optional, can be null.</li>
/// </ul>
///
/// </div>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaDeviceMemoryCallbacks(@NotNull MemorySegment segment) implements IVmaDeviceMemoryCallbacks {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaDeviceMemoryCallbacks}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaDeviceMemoryCallbacks to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaDeviceMemoryCallbacks.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaDeviceMemoryCallbacks {
        public long size() {
            return segment.byteSize() / VmaDeviceMemoryCallbacks.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaDeviceMemoryCallbacks at(long index) {
            return new VmaDeviceMemoryCallbacks(segment.asSlice(index * VmaDeviceMemoryCallbacks.BYTES, VmaDeviceMemoryCallbacks.BYTES));
        }

        public void write(long index, @NotNull VmaDeviceMemoryCallbacks value) {
            MemorySegment s = segment.asSlice(index * VmaDeviceMemoryCallbacks.BYTES, VmaDeviceMemoryCallbacks.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VmaDeviceMemoryCallbacks.BYTES, VmaDeviceMemoryCallbacks.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaDeviceMemoryCallbacks.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaDeviceMemoryCallbacks.BYTES,
                (end - start) * VmaDeviceMemoryCallbacks.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaDeviceMemoryCallbacks.BYTES));
        }

        public VmaDeviceMemoryCallbacks[] toArray() {
            VmaDeviceMemoryCallbacks[] ret = new VmaDeviceMemoryCallbacks[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VmaDeviceMemoryCallbacks allocate(Arena arena) {
        return new VmaDeviceMemoryCallbacks(arena.allocate(LAYOUT));
    }

    public static VmaDeviceMemoryCallbacks.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaDeviceMemoryCallbacks.Ptr(segment);
    }

    public static VmaDeviceMemoryCallbacks clone(Arena arena, VmaDeviceMemoryCallbacks src) {
        VmaDeviceMemoryCallbacks ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="PFN_vmaAllocateDeviceMemoryFunction") MemorySegment pfnAllocate() {
        return segment.get(LAYOUT$pfnAllocate, OFFSET$pfnAllocate);
    }

    public void pfnAllocate(@Pointer(comment="PFN_vmaAllocateDeviceMemoryFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnAllocate, OFFSET$pfnAllocate, value);
    }

    public void pfnAllocate(@Nullable IPointer pointer) {
        pfnAllocate(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="PFN_vmaFreeDeviceMemoryFunction") MemorySegment pfnFree() {
        return segment.get(LAYOUT$pfnFree, OFFSET$pfnFree);
    }

    public void pfnFree(@Pointer(comment="PFN_vmaFreeDeviceMemoryFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);
    }

    public void pfnFree(@Nullable IPointer pointer) {
        pfnFree(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(@Nullable IPointer pointer) {
        pUserData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("pfnAllocate"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pfnAllocate = PathElement.groupElement("pfnAllocate");
    public static final PathElement PATH$pfnFree = PathElement.groupElement("pfnFree");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");

    public static final AddressLayout LAYOUT$pfnAllocate = (AddressLayout) LAYOUT.select(PATH$pfnAllocate);
    public static final AddressLayout LAYOUT$pfnFree = (AddressLayout) LAYOUT.select(PATH$pfnFree);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long SIZE$pfnAllocate = LAYOUT$pfnAllocate.byteSize();
    public static final long SIZE$pfnFree = LAYOUT$pfnFree.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();

    public static final long OFFSET$pfnAllocate = LAYOUT.byteOffset(PATH$pfnAllocate);
    public static final long OFFSET$pfnFree = LAYOUT.byteOffset(PATH$pfnFree);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
}
