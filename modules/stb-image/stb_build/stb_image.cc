void (*g_JavaTrace)(void);

#include <stdio.h>
#include <stdlib.h>

#define STBI_ASSERT(CONDITION) \
    do {if (!(CONDITION)) { \
        fprintf(stderr, "VMA_ASSERT failed: %s\n", #CONDITION); \
        if (g_JavaTrace) { \
            g_JavaTrace(); \
        } \
        abort(); \
    }} while (false);

#define STB_IMAGE_IMPLEMENTATION
extern "C" {
    #include "stb_image.h"
}
