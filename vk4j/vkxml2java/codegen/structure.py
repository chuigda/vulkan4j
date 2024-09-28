from ..entity import Structure
from .datatype.common_accessor import *
from .datatype.ptr_accessor import generate_pointer_accessor
from .datatype.array_accessor import generate_array_accessor


def generate_structure(registry: Registry, structure: Structure) -> str:
    member_types_lowered: list[CType | None] = []
    verbatim = '\n'.join(map(lambda v: f'///     {v};', structure.verbatim))

    struct_layout = generate_structure_layout(
        registry,
        structure,
        structure.members,
        member_types_lowered
    )

    return f'''package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {{@snippet lang=c :
/// typedef struct {structure.name} {{
{verbatim}
/// }} {structure.name};}}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/{structure.name}.html">{structure.name}</a>
public record {structure.name}(MemorySegment segment) implements IPointer {{
    public static final MemoryLayout LAYOUT = {struct_layout};
    public static final long SIZE = LAYOUT.byteSize();

{generate_structure_path_element(structure.members)}
{generate_structure_member_layout(structure.members, member_types_lowered)}
{generate_structure_member_offset(structure.members)}
{generate_structure_member_size(structure.members, member_types_lowered)}
    public {structure.name}(MemorySegment segment) {{
        this.segment = segment;{generate_member_init(structure.members)}
    }}

{generate_structure_member_accessor(structure.members, member_types_lowered)}    public static {structure.name} allocate(Arena arena) {{
        return new {structure.name}(arena.allocate(LAYOUT));
    }}
    
    public static {structure.name}[] allocate(Arena arena, int count) {{
        MemorySegment segment = arena.allocate(LAYOUT, count);
        {structure.name}[] ret = new {structure.name}[count];
        for (int i = 0; i < count; i++) {{
            ret[i] = new {structure.name}(segment.asSlice(i * SIZE, SIZE));
        }}
        return ret;
    }}
}}
'''

def generate_structure_layout(
        registry: Registry,
        structure: Structure,
        members: list[Member],
        member_types_lowered: list[CType | None]
) -> str:
    field_layouts = []

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            field_layouts.append(f'ValueLayout.JAVA_INT.withName("bitfield${current.name}_{next_.name}")')
            i = i + 2

            member_types_lowered.append(None)
            member_types_lowered.append(None)
        else:
            ctype = lower_type(registry, current.type)
            field_layouts.append(f'{ctype.java_layout()}.withName("{current.name}")')
            i = i + 1

            member_types_lowered.append(ctype)

    layout_creator = 'NativeLayout.unionLayout' if structure.is_union else 'NativeLayout.structLayout'

    ret = f'{layout_creator}(\n'
    for (i, layout) in enumerate(field_layouts):
        if i == len(field_layouts) - 1:
            ret += f'        {layout}\n'
        else:
            ret += f'        {layout},\n'
    ret += '    )'
    return ret


def generate_structure_path_element(members: list[Member]) -> str:
    ret = ''
    group_element_idx = 0

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            ret += f'    public static final PathElement PATH$bitfield${current.name}_{next_.name} = PathElement.groupElement("bitfield${current.name}_{next_.name}");\n'
            i = i + 2
        else:
            ret += f'    public static final PathElement PATH${current.name} = PathElement.groupElement("{current.name}");\n'
            i = i + 1
        group_element_idx += 1

    return ret


def generate_structure_member_layout(members: list[Member], member_types_lowered: list[CType | None]) -> str:
    ret = ''

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            ret += f'    public static final OfInt LAYOUT$bitfield${current.name}_{next_.name} = (OfInt) LAYOUT.select(PATH$bitfield${current.name}_{next_.name});\n'
            i += 2
        else:
            ctype = member_types_lowered[i]
            if isinstance(ctype, CPlatformDependentIntType):
                pass
            else:
                ret += f'    public static final {ctype.java_layout_type()} LAYOUT${current.name} = ({ctype.java_layout_type()}) LAYOUT.select(PATH${current.name});\n'
            i += 1

    return ret


def generate_structure_member_offset(members: list[Member]) -> str:
    ret = ''

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            ret += f'    public static final long OFFSET$bitfield${current.name}_{next_.name} = LAYOUT.byteOffset(PATH$bitfield${current.name}_{next_.name});\n'
            i += 2
        else:
            ret += f'    public static final long OFFSET${current.name} = LAYOUT.byteOffset(PATH${current.name});\n'
            i += 1

    return ret


def generate_structure_member_size(members: list[Member], member_types_lowered: list[CType | None]) -> str:
    ret = ''

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            ret += f'    public static final long SIZE$bitfield${current.name}_{next_.name} = LAYOUT$bitfield${current.name}_{next_.name}.byteSize();\n'
            i += 2
        else:
            ctype = member_types_lowered[i]
            if isinstance(ctype, CPlatformDependentIntType):
                pass
            else:
                ret += f'    public static final long SIZE${current.name} = LAYOUT${current.name}.byteSize();\n'
            i += 1

    return ret


def generate_member_init(members: list[Member]) -> str:
    ret = ''

    for member in members:
        if member.values is not None:
            ret += f'\n        this.{member.name}({member.values});'

    return ret


def generate_structure_member_accessor(members: list[Member], member_types_lowered: list[CType | None]) -> str:
    ret = ''

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            ret += generate_bitfield_accessor(current, next_)
            i += 2
        else:
            ctype = member_types_lowered[i]
            if isinstance(ctype, CPlatformDependentIntType):
                ret += generate_platform_dependent_int_accessor(ctype, current)
            elif isinstance(ctype, CStructType) or isinstance(ctype, CUnionType):
                ret += generate_ref_type_accessor(ctype, current)
            elif isinstance(ctype, CHandleType):
                ret += generate_handle_type_accessor(ctype, current)
            elif isinstance(ctype, CFixedIntType) or isinstance(ctype, CFloatType):
                ret += generate_fixed_type_accessor(ctype, current)
            elif isinstance(ctype, CEnumType):
                ret += generate_enum_accessor(ctype, current)
            elif isinstance(ctype, CPointerType):
                ret += generate_pointer_accessor(ctype, current)
            elif isinstance(ctype, CArrayType):
                ret += generate_array_accessor(ctype, current)
            else:
                raise ValueError(f'Unsupported type: {ctype}')
            i += 1

    return ret
