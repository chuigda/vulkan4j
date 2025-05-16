package cc.design7.vulkan.handle;

import java.lang.foreign.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.*;

/// Represents an opaque handle type <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorPool.html"><code>VkDescriptorPool</code></a>.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorPool.html"><code>VkDescriptorPool</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorPool(@NotNull MemorySegment segment) implements IPointer {
    /// Represents a pointer to <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorPool.html"><code>VkDescriptorPool</code></a> handle(s) in native memory.
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
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IPointer {
        public long size() {
            return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
        }

        public @Nullable VkDescriptorPool read() {
            MemorySegment s = readRaw();
            if (s.equals(MemorySegment.NULL)) {
                return null;
            }
            return new VkDescriptorPool(s);
        }

        public void write(@Nullable VkDescriptorPool value) {
            writeRaw(value == null ? MemorySegment.NULL : value.segment());
        }

        public @Nullable VkDescriptorPool read(long index) {
            MemorySegment s = readRaw(index);
            if (s.equals(MemorySegment.NULL)) {
                return null;
            }
            return new VkDescriptorPool(s);
        }

        public void write(long index, @Nullable VkDescriptorPool value) {
            writeRaw(index, value == null ? MemorySegment.NULL : value.segment());
        }

        public MemorySegment readRaw() {
            return segment.get(ValueLayout.ADDRESS, 0);
        }

        public MemorySegment readRaw(long index) {
            return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
        }

        public void writeRaw(@NotNull MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, 0, value);
        }

        public void writeRaw(long index, @NotNull MemorySegment value) {
            segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} handles,
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
        public Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
        }
        public Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * ValueLayout.ADDRESS.byteSize()));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * ValueLayout.ADDRESS.byteSize(),
                (end - start) * ValueLayout.ADDRESS.byteSize()
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * ValueLayout.ADDRESS.byteSize()));
        }

        public Ptr allocate(Arena arena) {
            return new Ptr(arena.allocate(ValueLayout.ADDRESS));
        }

        public Ptr allocate(Arena arena, long size) {
            return new Ptr(arena.allocate(ValueLayout.ADDRESS, size));
        }
    }
}
