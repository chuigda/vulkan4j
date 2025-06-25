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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceCreateInfo.html"><code>VkDeviceCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDeviceCreateFlags flags; // optional // @link substring="VkDeviceCreateFlags" target="VkDeviceCreateFlags" @link substring="flags" target="#flags"
///     uint32_t queueCreateInfoCount; // @link substring="queueCreateInfoCount" target="#queueCreateInfoCount"
///     VkDeviceQueueCreateInfo const* pQueueCreateInfos; // @link substring="VkDeviceQueueCreateInfo" target="VkDeviceQueueCreateInfo" @link substring="pQueueCreateInfos" target="#pQueueCreateInfos"
///     uint32_t enabledLayerCount; // optional // @link substring="enabledLayerCount" target="#enabledLayerCount"
///     char const* const* ppEnabledLayerNames; // optional // @link substring="ppEnabledLayerNames" target="#ppEnabledLayerNames"
///     uint32_t enabledExtensionCount; // optional // @link substring="enabledExtensionCount" target="#enabledExtensionCount"
///     char const* const* ppEnabledExtensionNames; // optional // @link substring="ppEnabledExtensionNames" target="#ppEnabledExtensionNames"
///     VkPhysicalDeviceFeatures const* pEnabledFeatures; // optional // @link substring="VkPhysicalDeviceFeatures" target="VkPhysicalDeviceFeatures" @link substring="pEnabledFeatures" target="#pEnabledFeatures"
/// } VkDeviceCreateInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkDeviceCreateInfo#allocate(Arena)}, {@link VkDeviceCreateInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkDeviceCreateInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceCreateInfo.html"><code>VkDeviceCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceCreateInfo(@NotNull MemorySegment segment) implements IVkDeviceCreateInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceCreateInfo.html"><code>VkDeviceCreateInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDeviceCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDeviceCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDeviceCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDeviceCreateInfo, Iterable<VkDeviceCreateInfo> {
        public long size() {
            return segment.byteSize() / VkDeviceCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDeviceCreateInfo at(long index) {
            return new VkDeviceCreateInfo(segment.asSlice(index * VkDeviceCreateInfo.BYTES, VkDeviceCreateInfo.BYTES));
        }

        public VkDeviceCreateInfo.Ptr at(long index, @NotNull Consumer<@NotNull VkDeviceCreateInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull VkDeviceCreateInfo value) {
            MemorySegment s = segment.asSlice(index * VkDeviceCreateInfo.BYTES, VkDeviceCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkDeviceCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDeviceCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDeviceCreateInfo.BYTES,
                (end - start) * VkDeviceCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDeviceCreateInfo.BYTES));
        }

        public VkDeviceCreateInfo[] toArray() {
            VkDeviceCreateInfo[] ret = new VkDeviceCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkDeviceCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkDeviceCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkDeviceCreateInfo.BYTES;
            }

            @Override
            public VkDeviceCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkDeviceCreateInfo ret = new VkDeviceCreateInfo(segment.asSlice(0, VkDeviceCreateInfo.BYTES));
                segment = segment.asSlice(VkDeviceCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkDeviceCreateInfo allocate(Arena arena) {
        VkDeviceCreateInfo ret = new VkDeviceCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_CREATE_INFO);
        return ret;
    }

    public static VkDeviceCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceCreateInfo.Ptr ret = new VkDeviceCreateInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.DEVICE_CREATE_INFO);
        }
        return ret;
    }

    public static VkDeviceCreateInfo clone(Arena arena, VkDeviceCreateInfo src) {
        VkDeviceCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_CREATE_INFO);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkDeviceCreateInfo sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public VkDeviceCreateInfo pNext(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
        return this;
    }

    public VkDeviceCreateInfo pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(VkDeviceCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public VkDeviceCreateInfo flags(@Bitmask(VkDeviceCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Unsigned int queueCreateInfoCount() {
        return segment.get(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount);
    }

    public VkDeviceCreateInfo queueCreateInfoCount(@Unsigned int value) {
        segment.set(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount, value);
        return this;
    }

    public VkDeviceCreateInfo pQueueCreateInfos(@Nullable IVkDeviceQueueCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueCreateInfosRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkDeviceQueueCreateInfo.Ptr pQueueCreateInfos(int assumedCount) {
        MemorySegment s = pQueueCreateInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceQueueCreateInfo.BYTES);
        return new VkDeviceQueueCreateInfo.Ptr(s);
    }

    public @Nullable VkDeviceQueueCreateInfo pQueueCreateInfos() {
        MemorySegment s = pQueueCreateInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceQueueCreateInfo(s);
    }

    public @Pointer(target=VkDeviceQueueCreateInfo.class) @NotNull MemorySegment pQueueCreateInfosRaw() {
        return segment.get(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos);
    }

    public void pQueueCreateInfosRaw(@Pointer(target=VkDeviceQueueCreateInfo.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos, value);
    }

    public @Unsigned int enabledLayerCount() {
        return segment.get(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount);
    }

    public VkDeviceCreateInfo enabledLayerCount(@Unsigned int value) {
        segment.set(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppEnabledLayerNames() {
        MemorySegment s = ppEnabledLayerNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public VkDeviceCreateInfo ppEnabledLayerNames(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppEnabledLayerNamesRaw(s);
        return this;
    }

    public @Pointer(comment="void**") @NotNull MemorySegment ppEnabledLayerNamesRaw() {
        return segment.get(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames);
    }

    public void ppEnabledLayerNamesRaw(@Pointer(comment="void**") @NotNull MemorySegment value) {
        segment.set(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames, value);
    }

    public @Unsigned int enabledExtensionCount() {
        return segment.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);
    }

    public VkDeviceCreateInfo enabledExtensionCount(@Unsigned int value) {
        segment.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppEnabledExtensionNames() {
        MemorySegment s = ppEnabledExtensionNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public VkDeviceCreateInfo ppEnabledExtensionNames(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppEnabledExtensionNamesRaw(s);
        return this;
    }

    public @Pointer(comment="void**") @NotNull MemorySegment ppEnabledExtensionNamesRaw() {
        return segment.get(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames);
    }

    public void ppEnabledExtensionNamesRaw(@Pointer(comment="void**") @NotNull MemorySegment value) {
        segment.set(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames, value);
    }

    public VkDeviceCreateInfo pEnabledFeatures(@Nullable IVkPhysicalDeviceFeatures value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pEnabledFeaturesRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkPhysicalDeviceFeatures.Ptr pEnabledFeatures(int assumedCount) {
        MemorySegment s = pEnabledFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPhysicalDeviceFeatures.BYTES);
        return new VkPhysicalDeviceFeatures.Ptr(s);
    }

    public @Nullable VkPhysicalDeviceFeatures pEnabledFeatures() {
        MemorySegment s = pEnabledFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDeviceFeatures(s);
    }

    public @Pointer(target=VkPhysicalDeviceFeatures.class) @NotNull MemorySegment pEnabledFeaturesRaw() {
        return segment.get(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures);
    }

    public void pEnabledFeaturesRaw(@Pointer(target=VkPhysicalDeviceFeatures.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueCreateInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceQueueCreateInfo.LAYOUT).withName("pQueueCreateInfos"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledExtensionNames"),
        ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceFeatures.LAYOUT).withName("pEnabledFeatures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$queueCreateInfoCount = PathElement.groupElement("queueCreateInfoCount");
    public static final PathElement PATH$pQueueCreateInfos = PathElement.groupElement("pQueueCreateInfos");
    public static final PathElement PATH$enabledLayerCount = PathElement.groupElement("enabledLayerCount");
    public static final PathElement PATH$ppEnabledLayerNames = PathElement.groupElement("ppEnabledLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("enabledExtensionCount");
    public static final PathElement PATH$ppEnabledExtensionNames = PathElement.groupElement("ppEnabledExtensionNames");
    public static final PathElement PATH$pEnabledFeatures = PathElement.groupElement("pEnabledFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queueCreateInfoCount = (OfInt) LAYOUT.select(PATH$queueCreateInfoCount);
    public static final AddressLayout LAYOUT$pQueueCreateInfos = (AddressLayout) LAYOUT.select(PATH$pQueueCreateInfos);
    public static final OfInt LAYOUT$enabledLayerCount = (OfInt) LAYOUT.select(PATH$enabledLayerCount);
    public static final AddressLayout LAYOUT$ppEnabledLayerNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledLayerNames);
    public static final OfInt LAYOUT$enabledExtensionCount = (OfInt) LAYOUT.select(PATH$enabledExtensionCount);
    public static final AddressLayout LAYOUT$ppEnabledExtensionNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledExtensionNames);
    public static final AddressLayout LAYOUT$pEnabledFeatures = (AddressLayout) LAYOUT.select(PATH$pEnabledFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$queueCreateInfoCount = LAYOUT$queueCreateInfoCount.byteSize();
    public static final long SIZE$pQueueCreateInfos = LAYOUT$pQueueCreateInfos.byteSize();
    public static final long SIZE$enabledLayerCount = LAYOUT$enabledLayerCount.byteSize();
    public static final long SIZE$ppEnabledLayerNames = LAYOUT$ppEnabledLayerNames.byteSize();
    public static final long SIZE$enabledExtensionCount = LAYOUT$enabledExtensionCount.byteSize();
    public static final long SIZE$ppEnabledExtensionNames = LAYOUT$ppEnabledExtensionNames.byteSize();
    public static final long SIZE$pEnabledFeatures = LAYOUT$pEnabledFeatures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queueCreateInfoCount = LAYOUT.byteOffset(PATH$queueCreateInfoCount);
    public static final long OFFSET$pQueueCreateInfos = LAYOUT.byteOffset(PATH$pQueueCreateInfos);
    public static final long OFFSET$enabledLayerCount = LAYOUT.byteOffset(PATH$enabledLayerCount);
    public static final long OFFSET$ppEnabledLayerNames = LAYOUT.byteOffset(PATH$ppEnabledLayerNames);
    public static final long OFFSET$enabledExtensionCount = LAYOUT.byteOffset(PATH$enabledExtensionCount);
    public static final long OFFSET$ppEnabledExtensionNames = LAYOUT.byteOffset(PATH$ppEnabledExtensionNames);
    public static final long OFFSET$pEnabledFeatures = LAYOUT.byteOffset(PATH$pEnabledFeatures);
}
