package club.doki7.openxr.datatype;

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
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVulkanInstanceCreateInfoKHR.html"><code>XrVulkanInstanceCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrVulkanInstanceCreateInfoKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSystemId systemId; // @link substring="systemId" target="#systemId"
///     XrVulkanInstanceCreateFlagsKHR createFlags; // optional // @link substring="XrVulkanInstanceCreateFlagsKHR" target="XrVulkanInstanceCreateFlagsKHR" @link substring="createFlags" target="#createFlags"
///     PFN_vkGetInstanceProcAddr pfnGetInstanceProcAddr; // @link substring="pfnGetInstanceProcAddr" target="#pfnGetInstanceProcAddr"
///     VkInstanceCreateInfo const* vulkanCreateInfo; // @link substring="VkInstanceCreateInfo" target="VkInstanceCreateInfo" @link substring="vulkanCreateInfo" target="#vulkanCreateInfo"
///     VkAllocationCallbacks const* vulkanAllocator; // optional // @link substring="VkAllocationCallbacks" target="VkAllocationCallbacks" @link substring="vulkanAllocator" target="#vulkanAllocator"
/// } XrVulkanInstanceCreateInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link XrVulkanInstanceCreateInfoKHR#allocate(Arena)}, {@link XrVulkanInstanceCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrVulkanInstanceCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVulkanInstanceCreateInfoKHR.html"><code>XrVulkanInstanceCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrVulkanInstanceCreateInfoKHR(@NotNull MemorySegment segment) implements IXrVulkanInstanceCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVulkanInstanceCreateInfoKHR.html"><code>XrVulkanInstanceCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrVulkanInstanceCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrVulkanInstanceCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrVulkanInstanceCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrVulkanInstanceCreateInfoKHR, Iterable<XrVulkanInstanceCreateInfoKHR> {
        public long size() {
            return segment.byteSize() / XrVulkanInstanceCreateInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrVulkanInstanceCreateInfoKHR at(long index) {
            return new XrVulkanInstanceCreateInfoKHR(segment.asSlice(index * XrVulkanInstanceCreateInfoKHR.BYTES, XrVulkanInstanceCreateInfoKHR.BYTES));
        }

        public XrVulkanInstanceCreateInfoKHR.Ptr at(long index, @NotNull Consumer<@NotNull XrVulkanInstanceCreateInfoKHR> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrVulkanInstanceCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * XrVulkanInstanceCreateInfoKHR.BYTES, XrVulkanInstanceCreateInfoKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrVulkanInstanceCreateInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrVulkanInstanceCreateInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrVulkanInstanceCreateInfoKHR.BYTES,
                (end - start) * XrVulkanInstanceCreateInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrVulkanInstanceCreateInfoKHR.BYTES));
        }

        public XrVulkanInstanceCreateInfoKHR[] toArray() {
            XrVulkanInstanceCreateInfoKHR[] ret = new XrVulkanInstanceCreateInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrVulkanInstanceCreateInfoKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrVulkanInstanceCreateInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrVulkanInstanceCreateInfoKHR.BYTES;
            }

            @Override
            public XrVulkanInstanceCreateInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrVulkanInstanceCreateInfoKHR ret = new XrVulkanInstanceCreateInfoKHR(segment.asSlice(0, XrVulkanInstanceCreateInfoKHR.BYTES));
                segment = segment.asSlice(XrVulkanInstanceCreateInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrVulkanInstanceCreateInfoKHR allocate(Arena arena) {
        XrVulkanInstanceCreateInfoKHR ret = new XrVulkanInstanceCreateInfoKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.VULKAN_INSTANCE_CREATE_INFO_KHR);
        return ret;
    }

    public static XrVulkanInstanceCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrVulkanInstanceCreateInfoKHR.Ptr ret = new XrVulkanInstanceCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.VULKAN_INSTANCE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static XrVulkanInstanceCreateInfoKHR clone(Arena arena, XrVulkanInstanceCreateInfoKHR src) {
        XrVulkanInstanceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.VULKAN_INSTANCE_CREATE_INFO_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrVulkanInstanceCreateInfoKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrVulkanInstanceCreateInfoKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrVulkanInstanceCreateInfoKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrSystemId") @Unsigned long systemId() {
        return segment.get(LAYOUT$systemId, OFFSET$systemId);
    }

    public XrVulkanInstanceCreateInfoKHR systemId(@NativeType("XrSystemId") @Unsigned long value) {
        segment.set(LAYOUT$systemId, OFFSET$systemId, value);
        return this;
    }

    public @Bitmask(XrVulkanInstanceCreateFlagsKHR.class) long createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public XrVulkanInstanceCreateInfoKHR createFlags(@Bitmask(XrVulkanInstanceCreateFlagsKHR.class) long value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
        return this;
    }

    public @Pointer(comment="PFN_vkGetInstanceProcAddr") @NotNull MemorySegment pfnGetInstanceProcAddr() {
        return segment.get(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr);
    }

    public XrVulkanInstanceCreateInfoKHR pfnGetInstanceProcAddr(@Pointer(comment="PFN_vkGetInstanceProcAddr") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr, value);
        return this;
    }

    public XrVulkanInstanceCreateInfoKHR pfnGetInstanceProcAddr(@Nullable IPointer pointer) {
        pfnGetInstanceProcAddr(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public XrVulkanInstanceCreateInfoKHR vulkanCreateInfo(@Nullable IVkInstanceCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vulkanCreateInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkInstanceCreateInfo.Ptr vulkanCreateInfo(int assumedCount) {
        MemorySegment s = vulkanCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkInstanceCreateInfo.BYTES);
        return new VkInstanceCreateInfo.Ptr(s);
    }

    public @Nullable VkInstanceCreateInfo vulkanCreateInfo() {
        MemorySegment s = vulkanCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkInstanceCreateInfo(s);
    }

    public @Pointer(target=VkInstanceCreateInfo.class) @NotNull MemorySegment vulkanCreateInfoRaw() {
        return segment.get(LAYOUT$vulkanCreateInfo, OFFSET$vulkanCreateInfo);
    }

    public void vulkanCreateInfoRaw(@Pointer(target=VkInstanceCreateInfo.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vulkanCreateInfo, OFFSET$vulkanCreateInfo, value);
    }

    public XrVulkanInstanceCreateInfoKHR vulkanAllocator(@Nullable IVkAllocationCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vulkanAllocatorRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkAllocationCallbacks.Ptr vulkanAllocator(int assumedCount) {
        MemorySegment s = vulkanAllocatorRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAllocationCallbacks.BYTES);
        return new VkAllocationCallbacks.Ptr(s);
    }

    public @Nullable VkAllocationCallbacks vulkanAllocator() {
        MemorySegment s = vulkanAllocatorRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAllocationCallbacks(s);
    }

    public @Pointer(target=VkAllocationCallbacks.class) @NotNull MemorySegment vulkanAllocatorRaw() {
        return segment.get(LAYOUT$vulkanAllocator, OFFSET$vulkanAllocator);
    }

    public void vulkanAllocatorRaw(@Pointer(target=VkAllocationCallbacks.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vulkanAllocator, OFFSET$vulkanAllocator, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("systemId"),
        ValueLayout.JAVA_LONG.withName("createFlags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr"),
        ValueLayout.ADDRESS.withTargetLayout(VkInstanceCreateInfo.LAYOUT).withName("vulkanCreateInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT).withName("vulkanAllocator")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$systemId = PathElement.groupElement("systemId");
    public static final PathElement PATH$createFlags = PathElement.groupElement("createFlags");
    public static final PathElement PATH$pfnGetInstanceProcAddr = PathElement.groupElement("pfnGetInstanceProcAddr");
    public static final PathElement PATH$vulkanCreateInfo = PathElement.groupElement("vulkanCreateInfo");
    public static final PathElement PATH$vulkanAllocator = PathElement.groupElement("vulkanAllocator");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$systemId = (OfLong) LAYOUT.select(PATH$systemId);
    public static final OfLong LAYOUT$createFlags = (OfLong) LAYOUT.select(PATH$createFlags);
    public static final AddressLayout LAYOUT$pfnGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$pfnGetInstanceProcAddr);
    public static final AddressLayout LAYOUT$vulkanCreateInfo = (AddressLayout) LAYOUT.select(PATH$vulkanCreateInfo);
    public static final AddressLayout LAYOUT$vulkanAllocator = (AddressLayout) LAYOUT.select(PATH$vulkanAllocator);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$systemId = LAYOUT$systemId.byteSize();
    public static final long SIZE$createFlags = LAYOUT$createFlags.byteSize();
    public static final long SIZE$pfnGetInstanceProcAddr = LAYOUT$pfnGetInstanceProcAddr.byteSize();
    public static final long SIZE$vulkanCreateInfo = LAYOUT$vulkanCreateInfo.byteSize();
    public static final long SIZE$vulkanAllocator = LAYOUT$vulkanAllocator.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$systemId = LAYOUT.byteOffset(PATH$systemId);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$pfnGetInstanceProcAddr = LAYOUT.byteOffset(PATH$pfnGetInstanceProcAddr);
    public static final long OFFSET$vulkanCreateInfo = LAYOUT.byteOffset(PATH$vulkanCreateInfo);
    public static final long OFFSET$vulkanAllocator = LAYOUT.byteOffset(PATH$vulkanAllocator);
}
