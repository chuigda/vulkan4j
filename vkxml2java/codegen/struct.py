from ..entity import Structure, Member, Registry
from .datatype.common_accessor import *
from .datatype.ptr_accessor import generate_pointer_accessor

def generate_struct(registry: Registry, struct: Structure) -> str:
    member_types_lowered: list[CType | None] = []
    dependencies: set[str] = {
        JAVA_LANG_FOREIGN,
        JAVA_LANG_FOREIGN_VALUE_LAYOUT,
        TECH_ICEY_VK4J_CONSTANTS,
        TECH_ICEY_VK4J_NATIVE_LAYOUT
    }

    struct_layout = generate_struct_layout(
        registry,
        struct.members,
        member_types_lowered,
        dependencies
    )

    dep_list = list(dependencies)
    dep_list.sort()

    return f'''package tech.icey.vk4j.datatype;

{'\n'.join(dep_list)}

public record {struct.name}(MemorySegment segment) {{
    public static final MemoryLayout LAYOUT = {struct_layout};

{generate_struct_path_element(struct.members)}
{generate_struct_member_layout(struct.members, member_types_lowered)}
{generate_struct_member_offset(struct.members)}
    public {struct.name}(MemorySegment segment) {{
        this.segment = segment;{generate_member_init(struct.members)}
    }}

{generate_struct_member_accessor(struct.members, member_types_lowered)}
{generate_struct_factory(struct)}
}}
'''

def generate_struct_layout(
        registry: Registry,
        members: list[Member],
        member_types_lowered: list[CType | None],
        dependencies: set[str]
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
            ctype = lower_type(registry, current.type, dependencies)
            field_layouts.append(f'{ctype.java_layout()}.withName("{current.name}")')
            i = i + 1

            member_types_lowered.append(ctype)

    ret = 'NativeLayout.structLayout(\n'
    for (i, layout) in enumerate(field_layouts):
        if i == len(field_layouts) - 1:
            ret += f'        {layout}\n'
        else:
            ret += f'        {layout},\n'
    ret += '    )'
    return ret


def generate_struct_path_element(members: list[Member]) -> str:
    ret = ''
    group_element_idx = 0

    i = 0
    while i < len(members):
        current = members[i]
        if current.bits is not None:
            assert i + 1 < len(members)

            next_ = members[i + 1]
            assert current.bits is not None and current.bits == 24 and next_.bits == 8

            ret += f'    public static final PathElement PATH$bitfield${current.name}_{next_.name} = PathElement.groupElement({group_element_idx});\n'
            i = i + 2
        else:
            ret += f'    public static final PathElement PATH${current.name} = PathElement.groupElement({group_element_idx});\n'
            i = i + 1
        group_element_idx += 1

    return ret


def generate_struct_member_layout(members: list[Member], member_types_lowered: list[CType | None]) -> str:
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


def generate_struct_member_offset(members: list[Member]) -> str:
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


def generate_member_init(members: list[Member]) -> str:
    ret = ''

    for member in members:
        if member.values is not None:
            ret += f'\n        this.{member.name}({member.values});'

    return ret


def generate_struct_member_accessor(members: list[Member], member_types_lowered: list[CType | None]) -> str:
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
                ret += generate_platform_dependent_int_accessor(current)
            elif isinstance(ctype, CStructType) or isinstance(ctype, CUnionType):
                ret += generate_datatype_accessor(ctype, current)
            elif isinstance(ctype, CFixedIntType):
                ret += generate_fixed_int_type_accessor(ctype, current)
            elif isinstance(ctype, CEnumType):
                ret += generate_enum_accessor(ctype, current)
            elif isinstance(ctype, CPointerType):
                ret += generate_pointer_accessor(ctype, current)
            elif isinstance(ctype, CArrayType):
                if not isinstance(ctype.element, CFixedIntType) and not isinstance(ctype.element, CFloatType) and not isinstance(ctype.element, CEnumType):
                    # TODO: consider correctly supporting these things
                    print(f'Only fixed-size arrays of fixed-size primitive types are supported, provided {ctype.element} {current.name}')
                    i += 1
                    continue

                ret += f'''    public {ctype.java_type()} {current.name}() {{
        return segment.asSlice(OFFSET${current.name}, LAYOUT${current.name}).toArray({ctype.element.java_layout()});
    }}

    public void {current.name}({ctype.java_type()} value) {{
        MemorySegment.copy(MemorySegment.ofArray(value), 0, segment, OFFSET${current.name}, LAYOUT${current.name}.byteSize());
    }}

    public {ctype.element.java_type()} {current.name}At(int index) {{
        return segment.get({ctype.element.java_layout()}, OFFSET${current.name} + index * {ctype.element.java_layout()}.byteSize());
    }}

    public void {current.name}At(int index, {ctype.element.java_type()} value) {{
        segment.set({ctype.element.java_layout()}, OFFSET${current.name} + index * {ctype.element.java_layout()}.byteSize(), value);
    }}\n\n'''
            else:
                print(f'Unsupported member type {ctype} {current.name}')

            i += 1

    return ret


def generate_struct_factory(struct: Structure) -> str:
    return f'''    public static final class {struct.name}Factory implements IStructFactory<{struct.name}> {{
        @Override
        public Class<{struct.name}> clazz() {{
            return {struct.name}.class;
        }} 

        @Override
        public MemoryLayout layout() {{
            return {struct.name}.LAYOUT;
        }}

        @Override
        public {struct.name} create(MemorySegment segment) {{
            return new {struct.name}(segment);
        }}
    }}

    public static final {struct.name}Factory FACTORY = new {struct.name}Factory();'''
