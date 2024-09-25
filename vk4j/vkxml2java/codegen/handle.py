from ..entity import Registry, Handle


def generate_handle(handle: Handle) -> str:
    return f'''package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record {handle.name}(MemorySegment segment) {{
    public MemorySegment handle() {{
        return segment.get(ValueLayout.ADDRESS, 0);
    }}

    public static final class Factory implements IFactory<{handle.name}> {{
        @Override
        public Class<{handle.name}> clazz() {{
            return {handle.name}.class;
        }}

        @Override
        public MemoryLayout layout() {{
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }}

        @Override
        public {handle.name} create(MemorySegment segment) {{
            return createUninit(segment);
        }}

        @Override
        public {handle.name} createUninit(MemorySegment segment) {{
            return new {handle.name}(segment);
        }}
    }}

    public static final Factory FACTORY = new Factory();
}}'''
