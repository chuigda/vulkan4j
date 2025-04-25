package tech.icey.creg;

import tech.icey.creg.entity.*;
import tech.icey.creg.entity.Enum;

import java.util.HashMap;

public final class Registry {
    public final String registryName;

    public final HashMap<String, Constant> constants;
    public final HashMap<String, Function> functions;
    public final HashMap<String, OpaqueTypedef> opaqueTypedefs;
    public final HashMap<String, OpaqueHandle> opaqueHandles;
    public final HashMap<String, Structure> structures;
    public final HashMap<String, Bitmask> bitmasks;
    public final HashMap<String, tech.icey.creg.entity.Enum> enums;

    public Registry(
            String registryName,
            HashMap<String, Constant> constants,
            HashMap<String, Function> functions,
            HashMap<String, OpaqueTypedef> opaqueTypedefs,
            HashMap<String, OpaqueHandle> opaqueHandles,
            HashMap<String, Structure> structures,
            HashMap<String, Bitmask> bitmasks,
            HashMap<String, tech.icey.creg.entity.Enum> enums
    ) {
        this.registryName = registryName;
        this.constants = constants;
        this.functions = functions;
        this.opaqueTypedefs = opaqueTypedefs;
        this.opaqueHandles = opaqueHandles;
        this.structures = structures;
        this.bitmasks = bitmasks;
        this.enums = enums;
    }

    public static Registry mergeRegistry(String mergedRegistryName, Registry ...registries) {
        HashMap <String, Constant> constants = new HashMap<>();
        HashMap <String, Function> functions = new HashMap<>();
        HashMap <String, OpaqueTypedef> opaqueTypedefs = new HashMap<>();
        HashMap <String, OpaqueHandle> opaqueHandles = new HashMap<>();
        HashMap <String, Structure> structures = new HashMap<>();
        HashMap <String, Bitmask> bitmasks = new HashMap<>();
        HashMap <String, Enum> enums = new HashMap<>();

        for (Registry registry : registries) {
            constants.putAll(registry.constants);
            functions.putAll(registry.functions);
            opaqueTypedefs.putAll(registry.opaqueTypedefs);
            opaqueHandles.putAll(registry.opaqueHandles);
            structures.putAll(registry.structures);
            bitmasks.putAll(registry.bitmasks);
            enums.putAll(registry.enums);
        }

        return new Registry(
                mergedRegistryName,
                constants,
                functions,
                opaqueTypedefs,
                opaqueHandles,
                structures,
                bitmasks,
                enums
        );
    }
}
