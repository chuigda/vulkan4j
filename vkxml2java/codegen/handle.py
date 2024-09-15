from ..entity import Registry, Handle


def generate_handle(handle: Handle) -> str:
    return f'''package tech.icey.vk4j.handle;

import java.lang.foreign.MemorySegment;

public record {handle.name}(MemorySegment segment) {{}}
'''
